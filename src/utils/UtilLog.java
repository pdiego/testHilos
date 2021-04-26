package utils;

public class UtilLog {
	
		public static String obtienePistasTrunC(String datosPista) {
		String panCDC;
		String pistaTrunc="[VACIO]";
		
		if  ((datosPista!= null) && (!datosPista.equals("[VACIO]")) ) {
			
			int primerIndex = datosPista.indexOf("?*");
	
			if (primerIndex == -1) {
				return pistaTrunc;
			}
			int segundoIndex = datosPista.indexOf("?*", primerIndex+1);
			if (segundoIndex == -1) {
				return pistaTrunc;
			}
	
			int igualIndex = datosPista.indexOf('=', segundoIndex);
	
			if (igualIndex != -1) {
				panCDC = datosPista.substring(segundoIndex+2, igualIndex);
			}
			else 
			{
				return pistaTrunc;
			}
			int tercerIndex = datosPista.indexOf("?*", segundoIndex+1);
			
			if (panCDC.length()>10) {
				String panTrunc = obtienePANTrunC(panCDC);	
				pistaTrunc = datosPista.substring(0,segundoIndex+2) +
								 panTrunc + 
								 datosPista.substring(igualIndex,igualIndex+5) +
								 datosPista.substring(tercerIndex);
				
				pistaTrunc = pistaTrunc.replaceAll(panCDC, obtienePANTrunC(panCDC));
				
			} else {
				
				pistaTrunc = datosPista;
			}
		}
		return pistaTrunc;
	}
	public static String obtienePistas2(String datosPista) {
		String pista2= "";
		
		if  ((datosPista!= null) && (!datosPista.equals("[VACIO]")) ) {
			
			int primerIndex = datosPista.indexOf("?*");
	
			if (primerIndex == -1) {
				return pista2;
			}
			int segundoIndex = datosPista.indexOf("?*", primerIndex+1);
			if (segundoIndex == -1) {
				return pista2;
			}
	
			int igualIndex = datosPista.indexOf('=', segundoIndex);
	
			if (igualIndex != -1) {
				
			}
			else 
			{
				return pista2;
			}
			int tercerIndex = datosPista.indexOf("?*", segundoIndex+1);
			
			pista2 = datosPista.substring(segundoIndex+2, tercerIndex);
		}
		return pista2;
	}
	public static String obtienePANTrunC(String pan) {
		
		String pantrunc = "[VACIO]";
		
		if  ((pan!= null) && (!pan.equals("[VACIO]"))  ) {
			if (pan.length()>10){
				pantrunc = rpad(pan.substring(0, 6),'*',(pan.length()-4)) + pan.substring(pan.length()-4);
			} else {
				pantrunc = pan;
			}
		}

		return pantrunc;
	}	
	
	public static Object printDato(Object obj) {
		
		return ( obj != null ? obj : new String("[VACIO]") );
	}
	/**
	 * Rellena por la izquierda una cadena del caracter especificado hasta completar la longitud indicada 
	 * @param src
	 * @param cpad
	 * @param leng
	 * @return
	 */
	public static String lpad (String src, char cpad, int leng){
		while (src.length() < leng) {
			src = cpad + src;    
		}
		return src;
	}

	/**
	 * Rellena por la derecha una cadena del caracter especificado
	 */
	public static String rpad (String src, char cpad, int leng){
		while (src.length() < leng) {
			src = src + cpad ;    
		}
		return src;
	}
	
	public static byte[] ofuscatePCI(byte[] data, int posIni, int posFin) {
		byte ofchar = (byte)0xff;
		int pos = posIni;
		while (pos < posFin) {
			data[pos] = ofchar;
			pos++;
		}
		
		return data;
	}

}
