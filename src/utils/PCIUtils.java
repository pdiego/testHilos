package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang.StringUtils;

import core.constansts.AuthConstants;
import core.constansts.TransitConstantes;

/**
 * Alberga metodos para enmascarar datos segun la normativa PCI
 * @author jorge.puig
 *	
 */
public class PCIUtils
{
	
	public static final String FORMATO_TLV_DATOS_CHIP_TAG_PAN = "5A";
	public static final String FORMATO_TLV_DATOS_CHIP_TAG_TRACK2 = "57";
	public static final String FORMATO_TLV_DATOS_CHIP_TAG_TRACK1 = "9F1F";
	public static final String FORMATO_TLV_DATOS_CHIP_TAG_PIN_BLOCK_CIFRADO = "9F62";
	
	/**
	 * Enmascara la cadena pasada por parametro segun la mascara proporcionada.
	 * 
	 * @param cadena la cadena que contiene el dato a enmascarar
	 * @param mascara debe ser el adecuado para el dato a enmascarar ( por ejemplo
	 * si se pasa una pista2 no se usa la misma mascara que si se pasa directamente
	 * el PAN o los datos chip )
	 * @return la cadena original con el dato enmascarado
	 */
	public static String mask(String cadena, Masks mascara) 
	{
		String resultado = null;

		if (cadena != null)
		{
			switch (mascara){
				case TRACK1: 
				case TRACK1_HEXADECIMAL:
					resultado = enmascararPista1( cadena, mascara);
					break;
				case TRACK2:
				case TRACK2_HEXADECIMAL:
					resultado = enmascararPista2( cadena, mascara );
					break;
				case DATOS_CHIP:
				case DATOS_CHIP_HEXADECIMAL:
					//TODO MMR: Provisional
					if (   !cadena.startsWith( AuthConstants.BLOQUE_EMV )  
					    && !cadena.startsWith( AuthConstants.BLOQUE_CONTACTLESS )  
					    && !cadena.startsWith( AuthConstants.BLOQUE_DCC ) )
					{
						resultado = enmascararDatosChipP55( cadena, mascara );		
					}
					else
					{
						resultado = cadena;
					}
					break;
				case CVV_P48_TRANSIT:
					resultado = enmascararTLV( cadena, 
					                           TransitConstantes.FORMATO_TLV_P48_TAG_CVV, 
					                           TransitConstantes.FORMATO_TLV_P48_TAG_LENGTH,
					                           TransitConstantes.FORMATO_TLV_P48_SIZE_LENGTH,
					                           mascara );
					break;
				default:
					resultado = enmascarar(cadena, mascara);
					break;
			}
		}	
		
		
		return resultado;		
	}
		
	/**
	 * Enmascara la cadena pasada por parametro unicamente comprobando que 
	 * no sea nula y que tenga el tamanyo necesario para
	 * aplicar la mascara pasada por parametro.
	 * 
	 * @param cadena la cadena a enmascarar. Tiene que ser el dato concreto, 
	 * no entiende de tipo de mascara. Por ejemplo no extraera el PAN de una pista2 
	 * @param mascara
	 * @return null si la cadena pasada por parametro es null
	 */
	private static String enmascarar(String cadena, Masks mascara) 
	{
		String resultado = null;
		if (cadena != null && cadena.length() >= mascara.charEnClaroInicio + mascara.charEnClaroFinal)
		{
			String inicio = cadena.substring( 0, mascara.charEnClaroInicio );
			String fin = cadena.substring(cadena.length() - mascara.charEnClaroFinal);
			String relleno = StringUtils.leftPad( new String(""), 
			                                      cadena.length() - (mascara.charEnClaroFinal + mascara.charEnClaroInicio), 
			                                      mascara.charMask );
			resultado = inicio + relleno + fin;
		}
		else if (cadena != null && cadena.length() < mascara.charEnClaroInicio + mascara.charEnClaroFinal)
		{
			resultado = StringUtils.leftPad( new String(""), 
			                                 cadena.length(), 
		                                     mascara.charMask );
		}
		
		return resultado;
	}

	/**
	 * Enmascara el PAN y los datos sensibles de la pista 1 pasada por parametro.
	 * 
	 * @param pista1
	 * @param mascaraPAN mascara para aplicar al PAN
	 * @return
	 */
	private static String enmascararPista1( String pista2, Masks mascaraPAN ) 
	{
		String aux = pista2;
		String resultado = null;
		boolean esMascaraHexadecimal = mascaraPAN.charMask.equals('F');
		try
		{
			if (aux != null && !aux.isEmpty())
			{
				StringBuilder sb = new StringBuilder();
				//Format Code (FC) indicates de card type (credit, debit, etc) 1 character
				sb.append( aux.charAt( 0 ) );
				
				aux = aux.substring( 1 );
				
				//PAN up to 19 digits + FieldSeparator "^"
				int indexSeparador = aux.indexOf( '^' );
				String pan = aux.substring( 0, indexSeparador );
				sb.append( enmascarar( pan, mascaraPAN ) );
				aux = aux.substring( indexSeparador + 1 );
				
				Masks maskAll = esMascaraHexadecimal ? Masks.MASKALL_HEXADECIMAL : Masks.MASKALL;
								
				//name 2-26 characters + FieldSeparator "^"
				indexSeparador = aux.indexOf( '^' );
				String nombre = aux.substring( 0, indexSeparador );
				sb.append( enmascarar( nombre, maskAll ) );
				aux = aux.substring( indexSeparador + 1 );
				
				//Expiration Date (4 digits YYMM) + Service Code (3 digits)
				sb.append( aux.substring( 0, 7 ) );
				aux = aux.substring( 7 );
				
				//Discretionary Data (variable) 
				sb.append( enmascarar( aux, maskAll ) );
				
				resultado = sb.toString();
			}
		}
		catch (Exception ex)
		{
			 
		}
		return resultado;		
	}
	
	/**
	 * Enmascara el PAN y los datos sensibles de la segunda parte de la pista 2
	 * pasdada por parametro.
	 * 
	 * @param pista2
	 * @param mascaraPAN mascara para aplicar al PAN
	 * @return
	 * 
	 */
	private static String enmascararPista2( String pista2, Masks mascaraPAN ) 
	{
		boolean esMascaraHexadecimal = mascaraPAN.charMask.equals('F');
		
		String separadorPista2 = separadorPista2(pista2);
		
		List<String> pista2Dividida = dividirPista2( pista2, separadorPista2 );
		
		String panEnmascarado = enmascarar( pista2Dividida.get( 0 ), mascaraPAN );
		
		String finalPista2Enmascarado = enmascarar( pista2Dividida.get( 1 ), 
													esMascaraHexadecimal ? Masks.TRACK2_END_HEXADECIMAL : Masks.TRACK2_END);  

		return panEnmascarado + separadorPista2+ finalPista2Enmascarado;
	}
	
	/**
	 * Obtiene el separador de la pista2 pasada por parametro
	 * @param pista2
	 * @return el separador o null si la cadena pasada por parametro es null
	 * 
	 */
	private static String separadorPista2(String pista2) 
	{
		String separador = null;
		
		if ( pista2 != null )
		{
			if( pista2.contains( "=" ) )
			{
				separador = "=";
			}
			else if ( pista2.contains( "D" ) )
			{
				separador = "D";
			}
			else
			{
			}
		}
		
		return separador;
	}
	
	/**
	 * 
	 * Enmascara un dato del TLV pasado por parametro,
	 * y segun la mascara pasada por parametro
	 * 
	 * @param tlv
	 * @param tag tag del dato a enmascarar
	 * @param tagLength tamanyo de los campos Tag del TLV
	 * @param sizeLength tamanyo de los campos Length del TLV
	 * @param mascara
	 * @return
	 * 
	 */
	private static String enmascararTLV(String tlv, String tag, int tagLength, int sizeLength, Masks mascara) 
	{
		String resultado = tlv;
		if (tlv != null)
		{
			try
			{
				Map<String, String> tlvMap = TlvUtil.parseTLV( tagLength, sizeLength, tlv );
				String cadenaAEnmascarar = tlvMap.get( tag );
				if (cadenaAEnmascarar != null)
				{
					tlvMap.put( tag, enmascarar(cadenaAEnmascarar, mascara) );
					resultado = TlvUtil.obtieneTLV( tlvMap, tagLength, sizeLength );
				}
			}
			catch (Exception pe)
			{
			}
		}
		return resultado;		
	}
	
	/**
	 * retorna la cadena de datos chip pasada por parametro con el pan, pista 1 y pista 2 enmascarados.
	 * Para enmascarar el PAN se utiliza la mascara pasada por parametro, para el resto de datos (final de 
	 * pista 2
	 * 
	 * @param p55
	 * @param mascara mascara que se usara para enmascarar el PAN
	 * @return null si la cadena pasada por parametro es null o si los datos chip no contienen el PAN
	 * 
	 */
	private static String enmascararDatosChipP55( String p55, Masks mascara ) 
	{
		String resultado = p55;
	
		if ( p55 != null )
		{
			try
			{
				TreeMap<String, String> mapaDatosChip = new TreeMap<String, String>(new TagEMVComparator<String>());
				
				byte[] mValue = HexUtil.hexToByteArr(p55);

				TlvUtil oTLV = new TlvUtil(mValue);
				mapaDatosChip = oTLV.getHashMap();
				
				String pista2_57 = mapaDatosChip.get( FORMATO_TLV_DATOS_CHIP_TAG_TRACK2 );
				String pan_5A = mapaDatosChip.get( FORMATO_TLV_DATOS_CHIP_TAG_PAN );
				String pista1 = mapaDatosChip.get( FORMATO_TLV_DATOS_CHIP_TAG_TRACK1 );
				
				//Se tiene que enmascarar primero la pista 2
				if ( pista2_57 != null )
				{
					String pista2Enmascarada = enmascararPista2 ( pista2_57, 
													              mascara );
					resultado = resultado.replaceAll( pista2_57, pista2Enmascarada );
					
				}
				//Despues el pan suelto
				if ( pan_5A != null)
				{
					String panEnmascarado = enmascarar( pan_5A, 
												  		mascara );
					resultado = resultado.replaceAll( pan_5A, panEnmascarado );
				}
				
				if ( pista1 != null)
				{
					resultado = resultado.replaceAll( pista1, enmascararPista1( pista1, mascara ) );
				}
				
			}
			catch (Exception ex)
			{
			}
			
		}
		return resultado;
	}
		
	/**
	 * divide la pista 2 pasada por parametro en dos cadenas, una con el PAN y otra con el resto
	 * de la pista 2 (sin incluir ninguna de las dos cadenas el separador)
	 * 
	 * @param pista2 pista2 a dividir
	 * @param separador separador de las dos partes de la pista2 ('=' o 'D')
	 * @return una lista de cadenas cuyo primer valor es el pan y el segundo el resto de la pista 2
	 * 
	 */
	private static List<String> dividirPista2( String pista2, String separador ) 
	{
		List<String> resultado = null;
		
		if ( pista2 != null )
		{
			int indexOfSeparator = 0;
			if ( pista2 != null )
			{
				if ( pista2.indexOf( separador ) > -1 )
				{
					indexOfSeparator = pista2.indexOf( separador );
				}
				else
				{
				}
				resultado = new ArrayList<String>();
				resultado.add( pista2.substring( 0, indexOfSeparator ) );
				resultado.add( pista2.substring( indexOfSeparator + 1 ) );
			}
			return resultado;
		}
		
		return resultado;
	}



	/**
	 * Especifica los datos para enmascarar un dato concreto, de tal forma que se indica 
	 * cuantos caracteres deben mostrarse en claro al inicio y al final de la cadena
	 * y el caracter que debe usarse para enmascarar el resto de caracteres de la cadena
	 * <ul>
	 * <li><b>charMask</b>: caracter que se usara para tapar los datos a enmascarar </li>
	 * <li><b>charEnClaroInicio</b>: numero de caracteres a mostrar en claro al inicio de la cadena </li>
	 * <li><b>charEnClaroFinal</b>: numero de caracteres a mostrar en claro al final de la cadena</li>
	 * </ul>
	 * Actualmente los enumerados posibles son los siguientes
	 * <ul>
	 * <li><b>PAN6_4</b>: PAN suelto, se muestran los 6 primeros caracteres y los 4 ultimos </li>
	 * <li><b>PAN4_4</b>: PAN suelto, se muestran los 4 primeros caracteres y los 4 ultimos </li>
	 * <li><b>DATOS_CHIP</b>: PAN, pista2 y pista1 contenidos en el campo p55 (datos chip EMV) </li>
	 * <li><b>TRACK2</b>: PAN en pista 2 (con separador '?' o 'D')  </li>
	 * <li><b>TRACK2_END</b>: Parte final de la pista 2 incluyendo el separador '?' o 'D'. Muestra el separador,
	 * 						  la fecha de caducidad y el codigo de servicio y enmascara el resto </li>
	 * <li><b>CVV_P48_TRANSIT</b>: CVV en el TLV p48 tal y como se recibe en TransitDispatcher (tag "11") </li>
	 * <li><b>MASKALL</b>: Enmascara todo el texto </li>
	 * <li><b>TRACK1</b>: PAN, CVV y similares y nombre en pista 1 </li>
	 * <li><b>HTTP_AUTHENTICATION</b>: Cabecera de mensaje HTTP con la autenticacion</li>
	 * </ul>
	 * 
	 * 
	 */
	public enum Masks
	{
		PAN6_4 			('*', 6, 4),
		PAN4_4 			('*', 4, 4),
		TRACK2 			('*', 6, 4), 
		TRACK2_END		('*', 8, 0),
		DATOS_CHIP 					('*', 6, 4), 
		DATOS_CHIP_HEXADECIMAL		('F', 6, 4), 
		TRACK2_HEXADECIMAL 			('F', 6, 4),
		TRACK2_END_HEXADECIMAL		('F', 8, 0),
		TRACK1_HEXADECIMAL			('F', 6, 4),
		MASKALL_HEXADECIMAL			('F', 0, 0),
		P48_MASK_HEXADECIMAL		('F', 0, 6),
		CVV_P48_TRANSIT	('*', 0, 0),
		MASKALL			('*', 0, 0),
		TRACK1			('*', 6, 4),
		HTTP_AUTHENTICATION('*', 10, 0);

		
		
		public final Character charMask;
		public final Integer charEnClaroInicio;
		public final Integer charEnClaroFinal;
		
		private Masks(Character charMask, Integer charEnClaroInicio, Integer charEnClaroFinal)
		{
			this.charMask = charMask;
			this.charEnClaroInicio = charEnClaroInicio;
			this.charEnClaroFinal = charEnClaroFinal;
		}
	}
}
