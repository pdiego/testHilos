package utils;


import java.io.UnsupportedEncodingException;

import javax.xml.bind.DatatypeConverter;

/**
 * 
 * Clase de utilidades para expandir arrays de bytes a strings en hexadecimal
 *  y viceversa.
 * 
 * @author janieto
 */
public class HexUtil {

	private HexUtil() {
	}	
	
	static public String bytesToHex(byte[] b) {
		if (b==null)
			return "";
		// Returns hex String representation of byte b
		String result = new String();
		for(int i = 0; i< b.length; i++){
			result = result + byteToHex(b[i]);
		}
		return result;
	}

	static public String byteToHex(byte b) {
		// Returns hex String representation of byte b
		char hexDigit[] = {
				'0', '1', '2', '3', '4', '5', '6', '7',
				'8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
		};
		char[] array = { hexDigit[(b >> 4) & 0x0f], hexDigit[b & 0x0f] };
		return new String(array);
	}

	static public byte[] hexToByteArr(String hex) throws NumberFormatException {
		if(hex.length() % 2 > 0)
			throw new NumberFormatException("Odd number of digits: "+hex);

		byte[] b = new byte[hex.length() / 2];
		for(int i=0; i<b.length; i++) {
			int i1 = digit(hex.charAt(i*2));
			int i2 = digit(hex.charAt(i*2+1));
			if(i1 < 0 || i2 < 0)
				throw new NumberFormatException("Invalid digit");
			b[i] = (byte)(i1 * 16 + i2);
		}
		// b[i] = (byte)Integer.parseInt(hex.substring(i*2, i*2 + 2), 16);
		// Have to use parseInt: parseByte doesn't like
		// too large values, e.g. 0x81 since that is supposed
		// to be negative.

		return b;
	}


	/**
	 * 
	 * DPPEREZ : PUC-EMV [20070213]
	 * 
	 * Pasa de hexadecimal a array de byte, pero da la opcion de completar en caso de no tener un numero de 
	 * caracteres par.
	 */
	static public byte[] hexToByteArr(String hex, boolean complete)  {

		if ( (hex.length() % 2 > 0) && (complete))
			hex+="0"+hex;

		if ( (hex.length() % 2 > 0) && (!complete))
			throw new NumberFormatException("Odd number of digits: "+hex);

		byte[] b = new byte[hex.length() / 2];
		for(int i=0; i<b.length; i++) {
			int i1 = digit(hex.charAt(i*2));
			int i2 = digit(hex.charAt(i*2+1));
			if(i1 < 0 || i2 < 0)
				throw new NumberFormatException("Invalid digit");
			b[i] = (byte)(i1 * 16 + i2);
		}
		// b[i] = (byte)Integer.parseInt(hex.substring(i*2, i*2 + 2), 16);
		// Have to use parseInt: parseByte doesn't like
		// too large values, e.g. 0x81 since that is supposed
		// to be negative.

		return b;
	}


	static int digit(int ch) {
		if(ch >= '0' && ch <= '9')
			return ch - '0';
		if(ch >= 'A' && ch <= 'F')
			return ch - 'A' + 10;
		if(ch >= 'a' && ch <= 'f')
			return ch - 'a' + 10;
		throw new NumberFormatException("Not a hexadecimal digit: "+((char)ch));
	}

	static char character(int digit) {
		if(digit >= 0 && digit <= 9)
			return (char)(digit + '0');
		else if(digit >= 10 && digit <= 15)
			return (char)(digit + 'A' - 10);
		throw new Error("DigitToChar!");
	}
   /**
    * Convert the byte array to an int starting from the given offset.
    *
    * @param b The byte array
    * @param offset The array offset
    * @return The integer
    */
	public static int byteArrayToInt(byte[] b) {

		int aux = 0;
		if ((b!=null) && (b.length !=0)) {
			if (b.length>2 ) {
				throw new NumberFormatException("To Much Digits to convert (max 2): "+b.length);
			} else if (b.length==2){
				short aux1 = (short) (b[1] & 0xff);
				short aux2 = (short) (b[0] & 0xff);
				aux = (int) ((aux2 << 8) | aux1);
			} else if (b.length==1) {
				short aux1 = (short) (b[0] & 0xff);
				short aux2 = (short) (0x00 & 0xff);
				aux = (int) ((aux2 << 8) | aux1);
			}
		} else {
			throw new NumberFormatException("No Bytes to convert.");
		}

		return aux;
	}
	public static byte[] xor(byte [] a, byte [] b) throws IllegalArgumentException
	{
		if(b.length<a.length) throw new IllegalArgumentException("length of byte [] b must be >= byte [] a");
		byte [] c = new byte[a.length];
		for(int i =0;i< a.length;i++)
		{
			c[i] = (byte)(a[i] ^ b[i]);
		}
		return c;
	}
	
    /**
     * Metodo que convierte una cadena en otra cadena compuesta por los bytes en hexadecimal que componen la cadena origen
     * Ej: "012" --> 303132
     * @param string
     * @return
     */
	public static String stringToHex(String string) 
    {
        StringBuilder buf = new StringBuilder(200);
        for (char ch: string.toCharArray()) 
        {
            buf.append(String.format("%02X", (int) ch)); //Cambiado %02x por %02X pra que las letras del hexadecimal salgan en mayusculas
        }
        return buf.toString();
    }	
	
	/**
	 * @author lorena.alvarez
	 * @param arg
	 * Pasa de Hexadecimal a String
	 */
	public static String hextoString(String arg) {        
		String str = "";
		for(int i=0;i<arg.length();i+=2)
		{
			String s = arg.substring(i, (i + 2));
			int decimal = Integer.parseInt(s, 16);
			str = str + (char) decimal;
		}       
		return str;
	}
	
	public static String fromHex(String hex) {
	    hex = hex.replaceAll("^(00)+", "");
	    byte[] bytes = DatatypeConverter.parseHexBinary(hex);
	    try {
			return new String(bytes, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}

