package run;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.ParametrosPL;
import core.ParametrosPLPCI;
import core.ThreadEjemplo;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Arranca la aplicacion.");
		new ThreadEjemplo("Pepe").start();
		new ThreadEjemplo("Juan").start();
		System.out.println("Finaliza la aplicacion.");


		
		String s = "B4655842116372017^HERNANDEZ PASCUAL/MARIA   ^2312201000000020000000122000000";
		Pattern pattern = Pattern.compile("^B\\d{12,16}\\^");
		
		
		ParametrosPL parametros = new ParametrosPL();
		parametros.addInput("p_mov_id", "123456789");
		parametros.addInput("p_pista_1", s);
		
		String valorCadena = parametros.toStringPCI();
		System.out.println("Valor Cadena:" + valorCadena);
		
		Matcher matcher = pattern.matcher(s);
		if (matcher.find()) 
		{
			System.out.println("Encontrado");
			System.out.println(s.substring(0,7) + "*****" + s.substring( s.indexOf("^")  - 4 , s.length()));	 
		} 
		else
		{
			System.out.println("******************* NO....");
		}
		
		
		
		System.out.println("********** Parametros PCI ********** ");
		ParametrosPLPCI par = new ParametrosPLPCI();
		par.addInput("p_mov_id", "123456789");
		par.addInput("p_pista_1", s);
		
		String var = par.toStringPCI();
		System.out.println("Parametros PCI --> Valor Cadena:" + var);
		
		
	}


}
