package core.constansts;

import java.util.ArrayList;
import java.util.List;

public abstract class TransitConstantes
{
    public static final String FORMATO_FECHA_CADUCIDAD = "yyMM";
	
	/**
	 * Variables obtenidas de BBDD de la tabla CONFIG_CFG. Cualquier nueva variable debe
	 * configurarse en {@link LoadTransitApplication.DBProperties} para que se cargue automaticamente en el despliegue
	 * @author jorge.puig
	 */
	public static class TransitDBConstants
	{
		public static		Boolean EJECUTAR_CONTROLES_OPERATIVA 					= null;
		public static 		Boolean SIEMPRE_AUTORIZAR_VERIFICACION_TARJETA 			= null;
		public static 		Boolean SIEMPRE_AUTORIZAR_ALTA_TARJETA 					= null;
		/** Milisegundos maximos desde la ultima validacion para poder validar localmente, 
			 * tambien es el tiempo maximo que se pueden mantener los datos PCI sin borrarlos */
		public static 		Long TIEMPO_ENTRE_AVS;
		public static		Long TIEMPO_ENTRE_PREAUT_MAESTRO;
		public static		Long TIEMPO_ENTRE_PREAUT_MASTERCARD;
		/** Rango de tiempo de busqueda de operaciones en vuelo para evitar situaciones de carrera */
		public static		Long TIEMPO_PREVENCION_SITUACIONES_CARRERA;
		/** Delay base de insercion en cola en situaciones de carrera */
		public static		Integer TIEMPO_DELAY_INSERCION_COLA_CARRERA;
		/** Incremento del delay de insercion en cola en situaciones de carrera por cada otra operacion en vuelo con preferencia sobre esta */
		public static		Integer TIEMPO_INCREMENTO_DELAY_INSERCION_COLA_CARRERA;
		public static 		String  WS_79_BACKOFFICE_URL_PETICION 					= null;
		public static 		String  WS_79_BACKOFFICE_URL_NOTIFICACION 				= null;
		public static		Integer WS_79_BACKOFFICE_TIMEOUT_CONEXION 				= null;
		public static		Integer WS_79_BACKOFFICE_TIMEOUT_LECTURA 				= null;
		public static		Integer WS_79_DELAY_INSERCION_COLA 						= null;
		public static		Integer WS_79_BASE_MULTIPLICADOR_DELAY_INSERCION_COLA 	= null;
		/** Variable que indica el tiempo maximo de insercion en la cola JMS de notificacion a Backloffice de la EMT */
		public static		Integer WS_79_MAXIMO_DELAY_INSERCION_COLA 				= null;
		public static		Integer WS_79_INTENTOS_NOTIFICACION_BACKOFFICE 			= null;
		public static		Integer WS_79_MODO_INSERCION_MSG_COLA					= null; //PERSISTENT: 	2 (se encarga weblogic de mantener la persistencia en disco duro) 
		//NON_PERSISTENT: 1 (se encarga CSACT de mantener la persistencia en BBDD)
		/** Sal para calcular el hash de PAN (proporcionada por EMT). En formato ASCII (caracteres imprimibles, no Hexadecimal)*/
		public static 		String HASH_SALT 										= null;
		public static 		String IMPORTE_MAXIMO_PREAUT_MAESTRO 					= null;
		public static		String IMPORTE_MINIMO_PREAUT_MASTERCARD 				= null;
		public static 		List<String> AID_VISA									= null;
		public static 		List<String> AID_MAESTRO 								= null;
		public static 		List<String> AID_MASTERCARD 							= null;
		public static		List<String> AID_AMERICAN_EXPRESS						= null;
		public static		String 	GTS_SERVICE_INGENICO_PLATFORM_ID				= null;
		public static		String 	GTS_SERVICE_PLATFORM_MERCHANT_ID				= null;
		public static		String 	GTS_SERVICE_USUARIO								= null;
		public static		String 	GTS_SERVICE_CONTRASENYA							= null;
		public static 		Integer TOKENIZATION_SERVICE_REINTENTOS	    			= null;
		public static		Integer TOKENIZATION_SERVICE_RETRY_DELAY				= null;
		public static		Integer GTS_SERVICE_CONNECT_TIMEOUT						= null;
		public static		Integer GTS_SERVICE_RESPONSE_TIMEOUT					= null;
	}
	
	/**
	 * Variables obtenidas del archivo transit.properties
	 * Son propiedades exclusivas de la instancia concreta del servidor de aplicaciones (actualmente Weblogic)
	 * Cualquier nueva variable debe configurarse en {@link LoadTransitApplication.FileProperties} para que se cargue 
	 * automaticamente en el despliegue
	 * @author jorge.puig
	 *
	 */
	public static class TransitPropertiesConstants
	{
		public static		String NOMBRE_NODO_WEBLOGIC 							= null;
	}
	
	
	
	// FIN VARIABLES RECOGIDAS DE BBDD O DEL FICHERO transit.properties #########################################
	
	public static final String IDENTIFICADOR_OPERATIVA 				 = "TRANSIT";
	
	/** ML_DESTINO_DEST.DEST_VALUE del servicio GTS */
	public static final String IDENTIFICADOR_DESTINO_GTS			= "SERVICIO_GTS";
	
	public static final String ERROR_EXTERNO_ERR_SISTEMA 			 = "998";
	public static final String ERROR_EXTERNO_ERR_SISTEMA_DESCRIPCION = "Error Interno en la Pasarela de Pago al tratar la peticion. Debe solicitarse la anulacion";

	/** Sal para realizar cifrado XOR sobre la sal del hash de PAN*/
	public static final String HASH_SALT_CIFRADO_XOR 				= "hGQZAdnvUrTiIFag9yr12EYZWGcWYVrn"; 

	public static final int PAN_MAX_SIZE 							= 19;
	
	public static final int FORMATO_TLV_P48_TAG_LENGTH 				= 2;
	public static final int FORMATO_TLV_P48_SIZE_LENGTH 			= 3;
	public static final String FORMATO_TLV_P48_TAG_CVV 				= "11";
	
	public static final String SOURCE_BACKOFFICE 					= "98";
	public static final String SOURCE_FORMULARIO 					= "99";
	public static final String SOURCE_PSP 		 					= "97";
	
	/** Codigo que se inserta en BBDD en tabla TRANSIT_OPERATION_DATA_TOD.TOD_RESPUESTA_BO 
	 * cuando se ha entregado correctamente la comunicacion a BackOffice de la EMT */
	public static final String CODIGO_COMUNICACION_BACKOFFICE_ENTREGADA = "200";
	
	public static final String	MODO_DIFERIDO						= "DIFERIDA";
	public static final String	MODO_DIRECTO						= "DIRECTA";

	public static final String NOMBRE_MARCA_MAESTRO 				= "MAESTRO";
	public static final String NOMBRE_MARCA_MASTERCARD 				= "MASTERCARD";
	public static final String NOMBRE_MARCA_VISA 					= "VISA";
	public static final String NOMBRE_MARCA_AMERICAN_EXPRESS		= "AMERICAN EXPRESS";
	
	public static final String COD_SPAIN = "724";
	
	public static final String TAG_DATO_EXTRA_OP_AID 				= "aidTarjeta";
	public static final String TAG_DATO_EXTRA_OP_COUNTRY_CODE 		= "paisTarjeta";
    public static final String TAG_DATO_EXTRA_OP_BIN 				= "binTarjeta";
    public static final String TAG_DATO_EXTRA_OP_CURRENCY_CODE		= "monedaTarjeta";
    public static final String TAG_DATO_EXTRA_OP_BIC 				= "bancoEmisor";
    public static final String TAG_DATO_EXTRA_CSB_EMISOR 			= "csbEmisor";
    public static final String TAG_DATO_EXTRA_NOMBRE_EMISOR 		= "nombreEmisor";
	
	public static final String TAG_EMV_AID 							= "9F06";//Antes estaba a 84
	public static final String TAG_EMV_ISSUER_COUNTRY_CODE 			= "5F28";
	public static final String TAG_EMV_APPLICATION_CURRENCY_CODE	= "9F42";
	public static final String TAG_EMV_BANK_IDENTIFIER_CODE 		= "5F54";
	
	public static final String TAG_DATO_EXTRA_AUTH_NUM_REINTENTOS   = "PSP_NUM_REINTENTOS";
	public static final String TAG_DATO_EXTRA_AUTH_NEMO_TRJ			= "PSP_NEMO_TARJETA";
	public static final String TAG_DATO_EXTRA_AUTH_TID_REDSYS 		= "tid_redsys";
	public static final String TAG_DATO_EXTRA_AUTH_TAP_INI_REDSYS	= "tap_inicial";
	public static final String TAG_DATO_EXTRA_AUTH_TAP_FIN_REDSYS	= "tap_final";
	public static final String TAG_DATO_EXTRA_AUTH_P1 				= "P01";
	public static final String TAG_DATO_EXTRA_AUTH_P3 				= "P03";
	public static final String TAG_DATO_EXTRA_AUTH_P22 				= "P22";
	public static final String TAG_DATO_EXTRA_AUTH_P48 				= "P48";
	public static final String TAG_DATO_EXTRA_AUTH_PAN 				= "PAN";
	public static final String TAG_DATO_EXTRA_AUTH_PISTA2 			= "PISTA2";
	
	public static final	String	TAG_RES_P04 						= "PSP_RESPONSE_P04";
	public static final	String	TAG_RES_P11 						= "PSP_RESPONSE_P11";
	public static final	String	TAG_RES_P12 						= "PSP_RESPONSE_P12";
	public static final	String 	TAG_RES_P32 						= "PSP_RESPONSE_P32";
	public static final	String 	TAG_RES_P38 						= "PSP_RESPONSE_P38";
	public static final	String 	TAG_RES_P39 						= "PSP_RESPONSE_P39";
	public static final	String 	TAG_RES_P41 						= "PSP_RESPONSE_P41";
	public static final	String 	TAG_RES_P42 						= "PSP_RESPONSE_P42";
	public static final	String	TAG_RES_TIEMPO_PROXY			    = "PSP_RESPONSE_TIEMPO_PROXY";

	public static final String TAG_TRUE								= "1";
	public static final String TAG_FALSE							= "0";
	public static final String TAG_SEPARADOR_LIST				= "#";

	
	
	public enum MarcaTarjeta 
	{
		VISA(TransitDBConstants.AID_VISA, NOMBRE_MARCA_VISA),
		MASTERCARD(TransitDBConstants.AID_MASTERCARD, NOMBRE_MARCA_MASTERCARD),
		MAESTRO(TransitDBConstants.AID_MAESTRO, NOMBRE_MARCA_MAESTRO),
		AMEX(TransitDBConstants.AID_AMERICAN_EXPRESS, NOMBRE_MARCA_AMERICAN_EXPRESS);
		
		private List<String> aid;
		private String nombre;
		
		private MarcaTarjeta( List<String> aid, String nombre )
		{
			this.aid = new ArrayList<String>( aid );
			this.nombre = nombre;
		}
		
		/**
		 * Retorna la {@link MarcaTarjeta} cuyo AID coincide con el 
		 * pasado por parametro
		 *  
		 * @param aid el AID a buscar
		 * @return VISA si no se encuentra el AID proporcionado
		 */
		public static MarcaTarjeta getByAID( String aid )
		{
			MarcaTarjeta resultado = VISA;
			for ( MarcaTarjeta marca : MarcaTarjeta.values() )
			{
				for( String aidMarca : marca.getAid() )
				{
					if (aidMarca.equals( aid ) )
					{
						resultado = marca;
						break;
					}
				}
			}
			return resultado;
		}
		
		/** Retorna la MarcaTarjeta cuyo nemo se pasa por parametro
		 * 
		 * @param nombre
		 * @return VISA si el nemo no se corresponde con ninguno de los declarados en MarcaTarjeta
		 */
		public static MarcaTarjeta getByNombre( String nombre )
		{
			MarcaTarjeta resultado = VISA;
			for ( MarcaTarjeta marca : MarcaTarjeta.values() )
			{
				if (marca.getMarca().equals( nombre ) )
				{
					resultado = marca;
					break;
				}
			}
			return resultado;
		}
		
		public List<String> getAid()
		{
			return this.aid;
		}
		
		public String getMarca()
		{
			return this.nombre;
		}
		
		public void setListaAIDs( List<String> lista )
		{
			this.aid = new ArrayList<String>( lista );
		}
	}
		
}