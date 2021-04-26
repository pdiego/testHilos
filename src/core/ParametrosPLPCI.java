package core;

import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;

import utils.PCIUtils;
import utils.PCIUtils.Masks;

/**
 * Clase para encapsular los parametros pasados a la ejecucion dinamica de Procedimientos almacenados y mostrar
 * parametros enmascarados
 * 
 * @author slopez
 *
 */
public class ParametrosPLPCI extends ParametrosPL
{
	
	
	private ArrayList<String> lNames;
	private ArrayList<Object> lValues;
	private ArrayList<Integer> lTypes;
	private ArrayList<Character> lIOTypes;
			
	private ArrayList<Masks> lMasks;
	
	private int iNumeroParametros;
	
	public ParametrosPLPCI () {
		lNames = new ArrayList<String> ();
		lValues = new ArrayList<Object> ();
		lTypes = new ArrayList<Integer> ();
		lIOTypes = new ArrayList<Character> ();
		lMasks = new ArrayList<Masks>();
		iNumeroParametros = 0;
	}
	
	
	/**
	 * Metodo para aniadir un nuevo parametro BigDecimal de entrada
	 * @param name
	 * @param value
	 */
	@Override
	public void addInput (String name, BigDecimal value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_BIGDECIMAL));
		lIOTypes.add (new Character(IO_INPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}
	
	/**
	 * Metodo para aniadir un nuevo parametro BigDecimal de entrada
	 * @param name
	 * @param value
	 */
	@Override
	public void addInput (String name, Integer value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_INTEGER));
		lIOTypes.add (new Character(IO_INPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}
	
	/**
	 * Metodo para aniadir un nuevo parametro BigDecimal de entrada con mascara
	 * @param name
	 * @param value
	 */
	public void addInput (String name, Integer value, Masks mask) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_INTEGER));
		lIOTypes.add (new Character(IO_INPUT));
		lMasks.add( mask );
		iNumeroParametros ++;
	}
	
	/**
	 * Metodo para aniadir un nuevo parametro String de entrada
	 * @param name
	 * @param value
	 */
	@Override
	public void addInput (String name, String value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_STRING));
		lIOTypes.add (new Character(IO_INPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}
	
	/**
	 * Metodo para aniadir un nuevo parametro String de entrada con mascara
	 * @param name
	 * @param value
	 */
	public void addInput (String name, String value, Masks mask) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_STRING));
		lIOTypes.add (new Character(IO_INPUT));
		lMasks.add( mask );
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Timestamp de entrada
	 * @param name
	 * @param value
	 */
	@Override
	public void addInput (String name, Timestamp value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_TIMESTAMP));
		lIOTypes.add (new Character(IO_INPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Clob de entrada
	 * @param name
	 * @param value
	 */
	@Override
	public void addInput (String name, Clob value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_CLOB));
		lIOTypes.add (new Character(IO_INPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Boolean de entrada
	 * @param name
	 * @param value
	 */
	@Override
	public void addInput (String name, Boolean value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_BOOLEAN));
		lIOTypes.add (new Character(IO_INPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro array de bytes de entrada
	 * @param name
	 * @param value
	 */
	@Override
	public void addInput (String name, byte [] value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_BYTE_ARRAY));
		lIOTypes.add (new Character(IO_INPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro de entrada sin valor
	 * @param name
	 * @param type
	 */
	@Override
	public void addNullInput (String name, int type) {
		lNames.add(name);
		lValues.add(null);
		lTypes.add(new Integer(type));
		lIOTypes.add (new Character(IO_INPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro BigDecimal de entrada y salida
	 * @param name
	 * @param value
	 */
	@Override
	public void addInputOutput (String name, BigDecimal value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_BIGDECIMAL));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}
	
	/**
	 * Metodo para aniadir un nuevo parametro String de entrada y salida
	 * @param name
	 * @param value
	 */
	@Override
	public void addInputOutput (String name, String value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_STRING));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}
	
	/**
	 * Metodo para aniadir un nuevo parametro String de entrada y salida
	 * @param name
	 * @param value
	 */
	public void addInputOutput (String name, String value, Masks masks) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(ParametrosPL.PARAM_TYPE_STRING));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		lMasks.add( masks );
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Timestamp de entrada y salida
	 * @param name
	 * @param value
	 */
	@Override
	public void addInputOutput (String name, Timestamp value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(PARAM_TYPE_TIMESTAMP));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Clob de entrada y salida
	 * @param name
	 * @param value
	 */
	@Override
	public void addInputOutput (String name, Clob value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(PARAM_TYPE_CLOB));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro Boolean de entrada y salida
	 * @param name
	 * @param value
	 */
	@Override
	public void addInputOutput (String name, Boolean value) {
		lNames.add(name);
		lValues.add(value);
		lTypes.add(new Integer(PARAM_TYPE_BOOLEAN));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro de entrada y salida sin valor.
	 * @param name
	 * @param type
	 */
	@Override
	public void addNullInputOutput (String name, int type) {
		lNames.add(name);
		lValues.add(null);
		lTypes.add(new Integer(type));
		lIOTypes.add (new Character(IO_INPUT_OUTPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}

	/**
	 * Metodo para aniadir un nuevo parametro de salida de un tipo soportado
	 * @param name
	 * @param type
	 */
	@Override
	public void addOutput (String name,int type) {
		lNames.add(name);
		lValues.add(null);
		lTypes.add(new Integer(type));
		lIOTypes.add (new Character(IO_OUTPUT));
		lMasks.add( null );
		iNumeroParametros ++;
	}

	@Override
	public Iterator<String> getNameList () {
		return lNames.iterator();
	}

	@Override
	public int getNumeroParametros() {
		return iNumeroParametros;
	}

	@Override
	public Iterator<Object> getValueList () {
		return lValues.iterator();
	}

	@Override
	public Iterator<Integer> getTypeList () {
		return lTypes.iterator();
	}

	@Override
	public Iterator<Character> getIOTypeList () {
		return lIOTypes.iterator();
	}
	
	@Override
	public String toString () {
		return "[Names:["+lNames+"],Values:["+lValues+"],Types:["+lTypes+"],IOTypes:["+lIOTypes+"]]";
	}
	
	@Override
	public String toStringPCI () {
		
		ArrayList<Object> lValuesPCI = new ArrayList<Object>(lValues);

		System.out.println("Parametros PCI *** --> Entramos a procesar");
		for (int i = 0; i < lValues.size(); i++) 
		{
			
			//Add el valor PCI a la lista
			if(lMasks.get(i) != null && lValues.get(i) != null)
			{		
				System.out.println("Parametros PCI --> Valor lMasks:" + lMasks.get(i) );
				System.out.println("Parametros PCI --> Valor lValues:" + lValues.get(i) );
				try
				{
					lValuesPCI.set( i,  PCIUtils.mask( (String) lValues.get( i ), lMasks.get( i )) );
				}
				catch ( Exception e )
				{
					System.out.println("Parametros PCI --> Exception" + e.getMessage());
				}

			}
			else
			{
				lValuesPCI.set(i, lValues.get( i ) );
				System.out.println("Parametros PCI --> En :" + i + " Metemos: "  + lValues.get(i) );
			}
		}
		
		return "[Names:["+lNames+"],Values:["+lValuesPCI+"],Types:["+lTypes+"],IOTypes:["+lIOTypes+"]]";
		
	}
	

}
