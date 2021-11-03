package core;

import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;


/**
 * Clase para encapsular los parametros pasados a la ejecucion dinamica de 
 * Procedimientos almacenados.
 * 
 * @author MGalan
 *
 */
@SuppressWarnings("rawtypes")
public class ParametrosPL {

	public static final char IO_INPUT = 'I';
	public static final char IO_OUTPUT = 'O';
	public static final char IO_INPUT_OUTPUT = 'X';
	
	public static final int PARAM_TYPE_BIGDECIMAL = 0;
	public static final int PARAM_TYPE_STRING = 1;
	public static final int PARAM_TYPE_CHAR = 2;
	public static final int PARAM_TYPE_BOOLEAN = 3;
	public static final int PARAM_TYPE_TIMESTAMP = 4;
	public static final int PARAM_TYPE_RESULTSET = 5;
	public static final int PARAM_TYPE_INTEGER = 6;
	public static final int PARAM_TYPE_CLOB = 11;
	public static final int PARAM_TYPE_BYTE_ARRAY = 12;
	public static final int PARAM_TYPE_SERIAL_CLOB = 13; //CSACT-4208: Se cambia a CLOB el campo para guardar el mensaje

	private ArrayList lNames;
	private ArrayList lValues;
	private ArrayList lTypes;
	private ArrayList lIOTypes;
	private int iNumeroParametros;
	
	
	public ParametrosPL () {
		lNames = new ArrayList ();
		lValues = new ArrayList ();
		lTypes = new ArrayList ();
		lIOTypes = new ArrayList ();
		iNumeroParametros = 0;
	}
	
	
	/**
	 * Metodo para aniadir un nuevo parametro BigDecimal de entrada
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInput (String name, BigDecimal value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_BIGDECIMAL));
		lIOTypes.add (new Character(IO_INPUT));
		iNumeroParametros ++;
	}
	
	/**
	 * Metodo para aniadir un nuevo parametro BigDecimal de entrada
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInput (String name, Integer value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_INTEGER));
		lIOTypes.add (new Character(IO_INPUT));
		iNumeroParametros ++;
	}
	
	/**
	 * Metodo para aniadir un nuevo parametro String de entrada
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInput (String name, String value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_STRING));
		lIOTypes.add (new Character(IO_INPUT));
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Timestamp de entrada
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInput (String name, Timestamp value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_TIMESTAMP));
		lIOTypes.add (new Character(IO_INPUT));
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Clob de entrada
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInput (String name, Clob value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_CLOB));
		lIOTypes.add (new Character(IO_INPUT));
		iNumeroParametros ++;
	}

	//CSACT-4208: Se cambia a CLOB el campo para guardar el mensaje
	/**
	 * Metodo para aniadir un nuevo parametro Clob de entrada
	 * @param name
	 * @param value
	 * @throws SerialException 
	 */
	@SuppressWarnings("unchecked")
	public void addInput (String name, SerialClob value) throws SerialException {

		lNames.add(name);
		lValues.add(value.getSubString(1, (int)value.length()));
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_SERIAL_CLOB));
		lIOTypes.add (new Character(IO_INPUT));
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Boolean de entrada
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInput (String name, Boolean value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_BOOLEAN));
		lIOTypes.add (new Character(IO_INPUT));
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro array de bytes de entrada
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInput (String name, byte [] value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_BYTE_ARRAY));
		lIOTypes.add (new Character(IO_INPUT));
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro de entrada sin valor
	 * @param name
	 * @param type
	 */
	@SuppressWarnings("unchecked")
	public void addNullInput (String name, int type) {
		lNames.add(name);
		lValues.add(null);
		lTypes.add(new Integer(type));
		lIOTypes.add (new Character(IO_INPUT));
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro BigDecimal de entrada y salida
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInputOutput (String name, BigDecimal value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_BIGDECIMAL));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		iNumeroParametros ++;
	}
	
	/**
	 * Metodo para aniadir un nuevo parametro String de entrada y salida
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInputOutput (String name, String value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_STRING));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Timestamp de entrada y salida
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInputOutput (String name, Timestamp value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(PARAM_TYPE_TIMESTAMP));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Clob de entrada y salida
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInputOutput (String name, Clob value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(PARAM_TYPE_CLOB));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Boolean de entrada y salida
	 * @param name
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	public void addInputOutput (String name, Boolean value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(PARAM_TYPE_BOOLEAN));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro de entrada y salida sin valor.
	 * @param name
	 * @param type
	 */
	@SuppressWarnings("unchecked")
	public void addNullInputOutput (String name, int type) {
		lNames.add(name);
		lValues.add(null);
		lTypes.add(new Integer(type));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro de salida de un tipo soportado
	 * @param name
	 * @param type
	 */
	@SuppressWarnings("unchecked")
	public void addOutput (String name,int type) {
		lNames.add(name);
		lValues.add(null);
		lTypes.add(new Integer(type));
		lIOTypes.add (new Character(IO_OUTPUT));
		iNumeroParametros ++;
	}

	public Iterator getNameList () {
		return lNames.iterator();
	}

	public int getNumeroParametros() {
		return iNumeroParametros;
	}


	public Iterator getValueList () {
		return lValues.iterator();
	}

	public Iterator getTypeList () {
		return lTypes.iterator();
	}

	public Iterator getIOTypeList () {
		return lIOTypes.iterator();
	}
	
	public String toString () {
		return "[Names:["+lNames+"],Values:["+lValues+"],Types:["+lTypes+"],IOTypes:["+lIOTypes+"]]";
	}
	
	@SuppressWarnings("unchecked")
	public String toStringPCI () {
		
		ArrayList lValuesPCI = new ArrayList();
		String panPCI = "";
		
		lValuesPCI = lValues;
		
		System.out.println("Parametros PL --> Antes FOR... ");
		for (int i = 0; i < lValues.size(); i++) {
			
			//Pista 2
			if ( ((String)lNames.get(i)).indexOf("pista2")!= -1  ||
				 ((String)lNames.get(i)).indexOf("pista_2")!= -1 ||
				 ((String)lNames.get(i)).indexOf("pista_completa")!= -1 ) {
				
				if ((String)lValues.get(i)!=null && !((String)lValues.get(i)).equals("") ) {
				
					if (((String)lValues.get(i)).indexOf("?*") != -1) {
						// Vienen los datos de las pistas completos. Miramos ahora si viene la pista 2 solamente o pista1 y pista 2
						if (((String)lValues.get(i)).startsWith("?*?*")) {
							panPCI = ((String)lValues.get(i)).substring(4,10) 
							  + "********" + 
							 ((String)lValues.get(i)).substring(((String)lValues.get(i)).indexOf("=")-4,((String)lValues.get(i)).indexOf("="));
						} else { // existe Pista1
							panPCI = ((String)lValues.get(i)).substring(3,9) 
							  + "********" + 
							 ((String)lValues.get(i)).substring(((String)lValues.get(i)).indexOf("=")-4,((String)lValues.get(i)).indexOf("="));							
						}
					}else {
						panPCI = ((String)lValues.get(i)).substring(0,6) 
						  + "********" + 
						 ((String)lValues.get(i)).substring(((String)lValues.get(i)).indexOf("=")-4,((String)lValues.get(i)).indexOf("="));
					}
					
					lValuesPCI.set(i, panPCI);
				}
			}
			
			//Pan
			if (((String)lNames.get(i)).indexOf("pan") != -1 || ((String)lNames.get(i)).indexOf("p_pan") != -1) {
				
				if ((String)lValues.get(i)!=null && !((String)lValues.get(i)).equals("") ) {
			
					panPCI = ((String)lValues.get(i)).substring(0,6) 
							  + "********" + 
							 ((String)lValues.get(i)).substring(((String)lValues.get(i)).length()-4,((String)lValues.get(i)).length() );
				}
				
				lValuesPCI.set(i, panPCI);
			}
			
			//Mensaje de Envio
			if (((String)lNames.get(i)).indexOf("p_mer_mensaje") != -1) {
				if ((String)lValues.get(i)!=null && !((String)lValues.get(i)).equals("") && (((String)lValues.get(i)).length() > 4)) 
				{
					panPCI = ((String)lValues.get(i)).substring(0,4)+ "****************....";
					lValuesPCI.set(i, panPCI);
				}
			}
			
			if (((String)lNames.get(i)).indexOf("p_pista_1") != -1) {
				if ((String)lValues.get(i)!=null && !((String)lValues.get(i)).equals("") && (((String)lValues.get(i)).length() > 4)) 
				{
					String s ="";
					System.out.println("Parametros PL --> ESTAMOS ");
					Pattern pattern = Pattern.compile("^B\\d{12,19}\\^");
					s = (String)lValues.get(i);
					Matcher matcher = pattern.matcher(s);
					System.out.println("Parametros --> " + s);
					if (matcher.find()) 
					{
						s = s.substring(0,7) + "*****" + s.substring( s.indexOf("^")  - 4 , s.length());	 
					} 
					lValuesPCI.set(i, s);
				}
			}
			
		}
		
		return "[Names:["+lNames+"],Values:["+lValuesPCI+"],Types:["+lTypes+"],IOTypes:["+lIOTypes+"]]";
	}
}


