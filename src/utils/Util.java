package utils;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

	private static String FORMATO_HORA_LOCAL = "yyyy-MM-dd HH:mm:ss";
	protected transient String idTx = "";

	public Util(String idtx) {
		this.idTx = idtx;
		// logger = LoggerWrapper.getInstance(idTx);
	}


	/**
	 * Llama al metodo toString() de un objeto si no es nulo. Se utiliza para facilitar las l?neas de
	 * logs (evita tener que ver si el objeto es nulo o no).
	 * 
	 * @param o
	 *           Objeto
	 * @return Salida de o.toString() si no es nulo
	 */
	public static String toString(Object o) {
		return (o != null) ? o.toString() : "";
	}

	/**
	 * Devuelve la hora local para la fecha y zona horaria que se le pasa usando TimeZone
	 * 
	 * @param fecha
	 * @param zonaHoraria
	 * @return hora local
	 * @see TimeZone
	 */
	public static String horaLocal(java.util.Date fecha, String zonaHoraria) {
		TimeZone tz = TimeZone.getTimeZone(zonaHoraria);
		GregorianCalendar calendar = new GregorianCalendar(tz);

		/*
		 * Modificacion (29-Marzo-2004): se quita el control de los cambios de hora por ahorro
		 * energetico ya que vendra cambiado desde el sistema operativo
		 */
		// Si la zona horaria tiene ahorro energetico (Daylight saving) en uso, sumamos los segundos
		// que correspondan.
		/*
		 * if ( tz.inDaylightTime(fecha) ) { fecha.setTime(fecha.getTime() + tz.getDSTSavings()); }
		 */

		calendar.setTime(fecha);

		SimpleDateFormat sdf = new java.text.SimpleDateFormat(FORMATO_HORA_LOCAL);
		sdf.setCalendar(calendar);

		return sdf.format(calendar.getTime());
	}

	/**
	 * Convierte la fecha local del tpv de formato String a formato Date
	 * 
	 * @param fechaLocal
	 * @return
	 * @throws ParseException
	 */
	public static Date horaLocalToDate(String fechaLocal) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat(FORMATO_HORA_LOCAL);
		return sdf.parse(fechaLocal);
	}
	/**
	 * Transformar cadenas de hexadecimal a alfanumericas
	 * @param input
	 * @return
	 * @throws ParseException
	 */
	public static String hexaToString(String input) throws ParseException {
		StringBuilder output = new StringBuilder();
	    for (int i = 0; i < input.length(); i+=2) {
	        String str = input.substring(i, i+2);
	        output.append((char)Integer.parseInt(str, 16));
	    }
	    return output.toString();
	}

	public static Date dateFromString(String fechaStr) throws ParseException {
		DateFormat sdf = new SimpleDateFormat(FORMATO_HORA_LOCAL);
		return sdf.parse(fechaStr);
	}

	/**
	 * Obtiene el PAN enmascarado de la pista 2
	 * @param pista2 pista 2 de la tarjeta
	 * @return pan enmascarado
	 */
	public static String sacaPanEnmascaradoDePista2(String pista2)
	{
	      String pan = null;
	      String maskedPan = "";
	 
	      try 
	      {
	    	  if (pista2 != null)
	    	  {	    		  
	    		  Pattern patronPan = Pattern.compile("\\D*(\\d+).*$");
	    		  Matcher matcher = patronPan.matcher(pista2);
	    		  if (matcher.find())
	    		  {
	    			  pan = matcher.group(1); 
	    		  
	    			  if (pan.length() <= 10)
	    			  {
	    				  maskedPan = pan;
	    			  }else 
	    			  {
	    				  maskedPan = pan.substring(0,6) + "*******************".substring(0,pan.length() - 10) + pan.substring( pan.length() - 4);
	    			  }
	    		  }
	    	  }
	      }
	      catch(Exception e)
	      {
	    	  //logger.warn("Error recuperando pan enmaascarado a partir de pista2 : " + e.getMessage());
	      }
	      
	      return maskedPan;
	}
	
}
