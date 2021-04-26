package utils;

import java.text.ParseException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang.StringUtils;

public class TlvUtil
{	
    private static final int SUBCODELENGTHHEX = 4; //4 en lugar de 2 dado que tratamos cadenas en hexadecimal(dobladas)
	private static final int DATASUBCODELENGTHHEX = 6; //6 en lugar de 3 dado que tratamos cadenas en hexadecimal(dobladas)
	private static final int TAG_TOPLEVEL = 0xFFFF; 
    private byte[] m_Value;
    private int m_Index;
    private int m_Length;
    private int m_Tag;
    private List<TlvUtil> m_Children;

    public static final Integer OFF_SET_TAG     = 8;
    public static final Integer OFF_SET_LENGTH  = 10;
    public static final Integer OFF_SET_INICIO  = 0;
    
    public TlvUtil(byte[] value) 
    {
        this(value, 0, value.length, TAG_TOPLEVEL);
    }

    private TlvUtil(byte[] value, int index, int length, int tag) 
    {
        if (value == null)
            throw new IllegalArgumentException("value must not be null");

        m_Value = value;
        m_Index = index;
        m_Length = length;
        m_Tag = tag;
        m_Children = new LinkedList<TlvUtil>();

        if (isConstructed())
        {
            parse();
        }
                
    }

    public TreeMap<String, String> getHashMap()
    {
    	TreeMap<String, String> result = new TreeMap<String, String>();
    	for (TlvUtil child : m_Children) {    		
			result.put(child.getTagHex().toUpperCase(),HexUtil.bytesToHex(child.getValue()));
		}
    	return result;
    }

	public byte[] getTagValue(String dTag)
    {
		int tag = Integer.decode(dTag);
		return getTagValue(tag);
    }
    
    public byte[] getTagValue(int dTag)
    {
    	byte bReturn[] = new byte[128];
    	boolean bEncontrado = false;
    	int dInd = 0;
    	
    	while (!bEncontrado && dInd < m_Children.size())
    	{
    		if(m_Children.get(dInd).getTag() == dTag)
    		{
    			bEncontrado = true;
    			bReturn = m_Children.get(dInd).getValue();
    		}
    		
    		dInd++;
    	}
    	
    	return bReturn;
    }

    public int getTag()
    {
        return m_Tag;
    }
    public String getTagHex()
    {
        return Integer.toHexString(m_Tag);
    }

    public byte[] getValue()
    {
        byte[] newArray = new byte[m_Length];
        System.arraycopy(m_Value, m_Index, newArray, 0, m_Length);
        return newArray;
    }

    public List<TlvUtil> getChildren()
    {
        return m_Children;
    }

    public boolean isConstructed()
    {
        final int CONSTRUCTED_BIT = 0x20;
        return (getFirstTagByte(m_Tag) & CONSTRUCTED_BIT) != 0;
    }

    private void parse() 
    {
        int index = m_Index;
        int endIndex = m_Index + m_Length;

        while (index < endIndex)
        {
            int tag = getNext(index++);

            if (tag == 0x00 || tag == 0xFF)
                continue;

            if (tagHasMultipleBytes(tag))
            {
                tag <<= 8;
                tag |= getNext(index++);

                if (tagHasAnotherByte(tag))
                {
                    tag <<= 8;
                    tag |= getNext(index++);
                }

            }

            int length = getNext(index++);

            if (length >= 0x80)
            {
                int numLengthBytes = (length & 0x7F);

                length = 0;

                for (int i = 0; i < numLengthBytes; i++)
                {
                    length <<= 8;
                    length |= getNext(index++);
                }
            }

            TlvUtil tlv = new TlvUtil(m_Value, index, length, tag);
            m_Children.add(tlv);
            index += tlv.getLength();
        }
    }

    private int getLength()
    {
        return m_Length;
    }

    private int getNext(int index) 
    {
        return (m_Value[index] & 0xFF);
    }

    private static int getFirstTagByte(int tag)
    {
        while (tag > 0xFF)
            tag >>= 8;

        return tag;
    }

    private static boolean tagHasMultipleBytes(int tag)
    {
        final int MULTIBYTE_TAG_MASK = 0x1F;
        return (tag & MULTIBYTE_TAG_MASK) == MULTIBYTE_TAG_MASK;
    }

    private static boolean tagHasAnotherByte(int tag)
    {
        final int NEXT_BYTE = 0x80;
        return (tag & NEXT_BYTE) != 0;
    }
    
    
/**
 * Obtener los Subcode y Tag Data de un formato LTV
 * @param string cadena en formato hexadecimal representando cadena ascii ejemplo: 3030353135303034303432313630303038303231313239373031303438343037303931333039313330303030313131000000313630 donde 30 es 0 en ascii
 * @return mapa clave valor, clave es el subcode transformado a cadena y valor es el tag data sin transformar
 * @throws ParseException 
 * @deprecated: Genera confusion porque la clase es para TLV no LTV: ver LTVUtil.java
 */
	public static TreeMap<String, String> transformToLTV(String data) throws ParseException {
		
		TreeMap<String, String> retorno=new TreeMap<String, String>();
		int length;
		String subcodeData;
		String subcode;
		String tagData;
		String lenValue;
		String resto;
		
		resto=data; //Inicializamos resto al total
		
		while (resto.length()>0) {
			lenValue=resto.substring(0, DATASUBCODELENGTHHEX);// DATA SUBCODE LENGTH
			lenValue=Util.hexaToString(lenValue);
			length=Integer.parseInt(lenValue); // DATA SUBCODE LENGTH en entero
			
			resto=resto.substring(DATASUBCODELENGTHHEX);//coge resto
			length=length*2;// se multiplica por dos dado que la cadena esta doblada en hexadecimal 
			
			subcodeData=resto.substring(0, length); //Tomamos clave valor
			subcode=subcodeData.substring(0, SUBCODELENGTHHEX); //SUBCODE 2 Bytes
			tagData=subcodeData.substring(SUBCODELENGTHHEX);	//TAGDATA	
			
			retorno.put(Util.hexaToString(subcode), tagData); //aniade el par subcode:dagdata 
			
			resto=resto.substring(length); //Incrementa resto para pasar a la siguiente transformacion
		}
		return retorno;
	}
	

		/**
		 * Genera un {@link Map} con los tag/value del campo TLV pasado por parametro
		 * 
		 * @param tagSize tamanyo de los campos tag
		 * @param lengthSize tamanyo de los campos length
		 * @param data TLV a parsear
		 * @return 
		 * @throws ParseException si el campo TLV no es valido
		 */
		public static Map<String, String> parseTLV(int tagSize, int lengthSize, String data) {
			
			Map<String, String> retorno=new TreeMap<String, String>();
		
			String dataAux = data;
		
			String tag;
			
			int valueLength;
			String value;			
			
			while (dataAux != null && dataAux.length() != 0){
				tag = dataAux.substring( 0, tagSize);
				dataAux = dataAux.substring( tagSize );
				
				valueLength = Integer.valueOf(dataAux.substring( 0, lengthSize));
				dataAux = dataAux.substring( lengthSize );
				
				value = dataAux.substring( 0, valueLength );
				dataAux = dataAux.substring( valueLength );
				
				retorno.put( tag, value );
			}
			return retorno;	
		}
		
	/**
	 * Devuelve los tag/valor pasando el valor ya convertido desde hexadecimal
	 * @param strS111
	 * @return
	 */
	public static HashMap<String, String> DecodeTLV(String strS111)
    {
        HashMap<String, String> tagsMap = new HashMap<String,String>();
        try
        {
            String strAux = strS111;
            while(strAux!=null && strAux.length() > 0)
            {
                String strTag;
                String strLength;
                String strValue;
                //Tratamiento TAG              
                strTag      = strAux.substring(OFF_SET_INICIO,OFF_SET_TAG);
                String strTagDecoded = new String(HexUtil.hexToByteArr(strTag));
                strAux      = strAux.substring(OFF_SET_TAG,strAux.length());            
                //Tratamiento LENGTH
                strLength   = strAux.substring(OFF_SET_INICIO,OFF_SET_LENGTH);
                String strLengthDecoded = new String(HexUtil.hexToByteArr(strLength));
                Integer dLength = Integer.parseInt(strLengthDecoded);            
                strAux      = strAux.substring(OFF_SET_LENGTH, strAux.length());            
                //Tratamiento VALUE                
                strValue    = strAux.substring(OFF_SET_INICIO,dLength*2 );            
                String strValueDecoded = new String(HexUtil.hexToByteArr(strValue));
                strAux      = strAux.substring(dLength*2, strAux.length());
                tagsMap.put(strTagDecoded, strValueDecoded);
                if(strAux == null || strAux.length() == 0)
                {
                    break;
                }                   
            }
        }
        catch (Exception exc)
        {
             throw new ClassCastException("Error al Parsear el campo TLV");
        }
        return tagsMap;
    }
	
	/**
	 * Devuelve los tag/valor pasando el valor en hexadecimal
	 * @param strS111
	 * @return
	 */
	public static HashMap<String, String> DecodeTLV_hex(String strS111)
    {
        HashMap<String, String> tagsMap = new HashMap<String,String>();
        try
        {
            String strAux = strS111;
            while(strAux!=null && strAux.length() > 0)
            {
                String strTag;
                String strLength;
                String strValue;
                //Tratamiento TAG              
                strTag      = strAux.substring(OFF_SET_INICIO,OFF_SET_TAG);
                String strTagDecoded = new String(HexUtil.hexToByteArr(strTag));
                strAux      = strAux.substring(OFF_SET_TAG,strAux.length());            
                //Tratamiento LENGTH
                strLength   = strAux.substring(OFF_SET_INICIO,OFF_SET_LENGTH);
                String strLengthDecoded = new String(HexUtil.hexToByteArr(strLength));
                Integer dLength = Integer.parseInt(strLengthDecoded);            
                strAux      = strAux.substring(OFF_SET_LENGTH, strAux.length());            
                //Tratamiento VALUE                
                strValue    = strAux.substring(OFF_SET_INICIO,dLength*2 );                            
                strAux      = strAux.substring(dLength*2, strAux.length());
                
                tagsMap.put(strTagDecoded, strValue);
                
                if(strAux == null || strAux.length() == 0)
                {
                    break;
                }                   
            }
        }
        catch (Exception exc)
        {
             throw new ClassCastException("Error al Parsear el campo TLV");
        }
        return tagsMap;
    }
	
	/**
	 * Inserta los valores de una cadena en formato TLV en un TreeMap
	 * 
	 * @param cadenaTLV la cadena a decodificar
	 * @param tagSize tamanyo de los campos codigo
	 * @param valueSize tamanyo de los campos valor
	 * @return null si cadenaTLV no tiene un formato TLV valido
	 */
	public static Map<String, String> decodeTLV_hex( String cadenaTLV , int tagSize, int valueSize)
	{
		Map<String, String> tagsMap = new TreeMap<String, String>();
		try
		{
			String strAux = cadenaTLV;
			while ( strAux != null && strAux.length() > 0 )
			{
				String strTag;
				String strLength;
				String strValue;
				//Tratamiento TAG              
				strTag = strAux.substring( 0, tagSize );
				String strTagDecoded = new String( HexUtil.hexToByteArr( strTag ) );
				strAux = strAux.substring( tagSize, strAux.length() );
				//Tratamiento LENGTH
				strLength = strAux.substring( 0, valueSize );
				String strLengthDecoded = new String( HexUtil.hexToByteArr( strLength ) );
				Integer dLength = Integer.parseInt( strLengthDecoded );
				strAux = strAux.substring( valueSize, strAux.length() );
				//Tratamiento VALUE                
				strValue = strAux.substring( 0, dLength * 2 );
				strAux = strAux.substring( dLength * 2, strAux.length() );
				
				tagsMap.put( strTagDecoded, strValue );
				
			}
		}
		catch ( Exception exc )
		{
			return null;
		}
		return tagsMap;
	}
	
	
	/**
	 * Devuelve una cadena en Hexadecimal representado el listado de tags/length/values en formato TLV
	 * Los tags han de venir de la longitud correcta
	 * @param tags: listao de tags y valores a traducir
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static String ObtieneTLV(HashMap<String, String> tags){
		String sResultado = "";
		StringBuilder sbResultadoTemp = new StringBuilder();
		
		if (tags != null){
			Iterator it = tags.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        sbResultadoTemp.append(pair.getKey());
		        sbResultadoTemp.append(UtilLog.lpad(""+((String)pair.getValue()).length(), '0', 5));
		        sbResultadoTemp.append(pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		}
		sResultado = HexUtil.bytesToHex(sbResultadoTemp.toString().getBytes());
		return sResultado;
	}
	/**
	 * Devuelve una cadena en Hexadecimal representado el listado de tags/values en formato TLV
	 * Los tags han de venir de la longitud correcta
	 * @param tags
	 * @return
	 */
	public static String ObtieneTLV(TreeMap<String, String> tags){
		HashMap<String, String> hmTags= new HashMap<String, String>(tags.size()); 
		//Hace una copia, son listas pequenias y no tiene impacto
		for(Map.Entry<String, String> tag : tags.entrySet()){
			hmTags.put(tag.getKey(), tag.getValue());
		}
		return TlvUtil.ObtieneTLV(hmTags);
	}
	
	/**  
	 * @author lorena.alvarez
	 * Devuelve el valor del tag indicado (Segundo parametro) del p55 (primer parametro)
	 * @throws Exception
	 *
	 */
	public static String getTagP55(String EVM, String numTag) throws Exception {
		TreeMap<String, String> resultado= new TreeMap<String, String>(new TagEMVComparator<Object>());
		byte[] mValue =HexUtil.hexToByteArr(EVM);

		TlvUtil oTLV = new TlvUtil(mValue);
		resultado=oTLV.getHashMap();
		resultado.get(numTag);

		String texto =  resultado.get(numTag);

		//Se pasa de Hex a String
		return HexUtil.hextoString(texto);
	}
	
	/**  
	 * Devuelve el tag del P55 sin convertir
	 * @throws Exception
	 *
	 */
	public static String getTagP55raw(String EVM, String numTag) throws Exception {
		TreeMap<String, String> resultado= new TreeMap<String, String>(new TagEMVComparator<Object>());
		byte[] mValue =HexUtil.hexToByteArr(EVM);

		TlvUtil oTLV = new TlvUtil(mValue);
		resultado=oTLV.getHashMap();
		resultado.get(numTag);

		String texto =  resultado.get(numTag);
		return texto;
	}
	
	/**  
	 * @author lorena.alvarez
	 * cambia el texto del tag indicado (Segundo parametro) del p55 (tercer parametro)
	 * @throws Exception
	 *
	 */
	public static String setTagP55(String EMV, String numTag, String cardLabel) throws Exception {
		TreeMap<String, String> resultado= new TreeMap<String, String>(new TagEMVComparator<Object>());
		byte[] mValue = HexUtil.hexToByteArr(EMV);

		TlvUtil oTLV = new TlvUtil(mValue);
		resultado=oTLV.getHashMap();
		resultado.put(numTag, cardLabel);
		
		String sResultado = ObtieneTLV2 (resultado);
		return sResultado;
	}
	
	/**
	 * Devuelve una cadena en Hexadecimal representado el listado de tags/values en formato TLV
	 * Los tags han de venir de la longitud correcta
	 * @param tags
	 * @return
	 */
	public static String ObtieneTLV2(TreeMap<String, String> tags){
		HashMap<String, String> hmTags= new HashMap<String, String>(tags.size()); 
		//Hace una copia, son listas pequenias y no tiene impacto
		for(Map.Entry<String, String> tag : tags.entrySet()){
			hmTags.put(tag.getKey(), tag.getValue());
		}
		return TlvUtil.ObtieneTLV2(hmTags);
	}
	
	/**
	 * Devuelve una cadena en Hexadecimal representado el listado de tags/length/values en formato TLV
	 * Los tags han de venir de la longitud correcta
	 * @param tags: listao de tags y valores a traducir
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static String ObtieneTLV2(HashMap<String, String> tags){
		String sResultado = "";
		StringBuilder sbResultadoTemp = new StringBuilder();
		
		if (tags != null){
			Iterator it = tags.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        sbResultadoTemp.append(pair.getKey());
		        sbResultadoTemp.append(UtilLog.lpad(""+((String)pair.getValue()).length()/2, '0', 2));
		        sbResultadoTemp.append(pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		}
		sResultado = sbResultadoTemp.toString();
		return sResultado;
	}
	
	/**
	 * Genera una cadena con formato TLV a partir de las claves-valor obtenidas del mapa pasado por parametro.
	 * El TLV generado contiene los tama
	 * 
	 * @param mapaValores 
	 * @param tagLength tamanyo de los campos tag
	 * @param sizeLength tamanyo de los campos size (los que indican el tamanyo del valor almacenado)
	 * @return
	 */
	public static String obtieneTLV( Map<String, String> mapaValores, int tagLength, int sizeLength )
	{
		String tlv = null;
		if (mapaValores != null && !mapaValores.isEmpty())
		{
			StringBuilder sb = new StringBuilder();
			for (Map.Entry<String, String> entrada : mapaValores.entrySet())
			{
				sb.append( StringUtils.leftPad( entrada.getKey(), tagLength, '0' ) );
				String tamanyo = StringUtils.leftPad( String.valueOf( entrada.getValue().length() ),
				                                      sizeLength,
				                                      '0');
				sb.append( tamanyo );
				sb.append( entrada.getValue() );
			}
			tlv = sb.toString();
		}
		return tlv;
	}

	/**
	 * @author ivan.barreno
	 * @param ltv
	 * @param bit
	 * @return devuelve el bit indicado de un datos LTV
	 * @throws ParseException
	 */
public static String dameValdeBit(String ltv,String bit) throws ParseException {
		
		String value=null;
		TreeMap<String, String> retorno=TlvUtil.transformToLTV(ltv);
		if (retorno.containsKey(bit))
		{
			value=retorno.get(bit);
		}
		return value;
	}
}

/**
 * Modificacion PUC_EMV
 * Autor: FCOTO
 * Fecha: 20070419
 * Descripcion: Clase interna de comparacion necesaria para mandar a 4b los datos chip de manera
 *              ordenada, siguiendo su propio criterio.
 */
class TagEMVComparator<T> implements Comparator<T> {

	public int compare(Object o1, Object o2) {
		if (o1 instanceof String && o2 instanceof String){
			String s1=(String) o1;
			String s2=(String) o2;
			if (s1.length()==s2.length()){
				return s1.compareTo(s2);
			}
			return s1.length()-s2.length();
		}
		if (o1 instanceof String){
			return -1;
		}
		if (o2 instanceof String){
			return 1; 
		}
		return 0;
	}

	
}//end class TagEMVComparator
