package run;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utils.PCIUtils.Masks;

import core.ParametrosPL;
import core.ParametrosPLPCI;
import core.ThreadEjemplo;

import bo.Cliente;
import core.Cajera;
import core.CajeraRunnable;

public class Principal {

	private static final int numCajeras = 2;
	
	public static void main(String[] args) {

		String s = "B4655842116372017^HERNANDEZ PASCUAL/MARIA   ^2312201000000020000000122000000";
		Pattern pattern = Pattern.compile("^B\\d{12,16}\\^");
		
		if (args.length > 0) {
	        for (String arrI: args) {
	            System.out.println(arrI);
	        }
	        
			if (args[0].equals("HILOS")) {
				System.out.println("Arranca la aplicacion.");
				new ThreadEjemplo("Pepe").start();
				new ThreadEjemplo("Juan").start();
				System.out.println("Finaliza la aplicacion.");
			}
			
			/* 
			 * Buscar por expresiones regulares
			 */
			if (args[0].equals("BuscarPorRegex")) {
				
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
			}			

			/* 
			 Uso clase Parametros PL
			 */
			if (args[0].equals("ParametrosPL")) {
				System.out.println("********** Parametros PL ********** ");
				ParametrosPL par = new ParametrosPL();
				par.addInput("p_mov_id", "123456789");
				par.addInput("p_pista_1", s);

				String pan = "5351200656424041";
				par.addInput("p_pan", pan);

				String var = par.toStringPCI();
				System.out.println("Parametros PL --> Valor Cadena:" +  var);
			}

			/* 
			 Uso clase Parametros PLPCI + mask
			 */
			if (args[0].equals("ParametrosPLPCI")) {
			
				String p_mov_pan = "4857200013010105";
				System.out.println("********** Parametros PLPCI ********** ");
				ParametrosPLPCI parametros = new ParametrosPLPCI();
				parametros.addInput("p_mov_id", "123456789");
				parametros.addInput("p_pista_1", s);
				// Solucion: MOV.get_preaut_data_conf
				parametros.addInput("p_mov_pan",p_mov_pan, Masks.PAN6_4);;
				
				String valorCadena = parametros.toStringPCI();
				System.out.println("Parametros PCI --> Valor Cadena:" +  valorCadena);
			}
			
			if (args[0].equals("HilosEnPool")) {
				
				// Como funciona sin hilos.... secuencial.
				
				Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
				Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

				Cajera cajera1 = new Cajera("Cajera 1");
				Cajera cajera2 = new Cajera("Cajera 2");

				// Tiempo inicial de referencia
				long initialTime = System.currentTimeMillis();

				cajera1.procesarCompra(cliente1, initialTime);
				cajera2.procesarCompra(cliente2, initialTime);
				
				// Con Hilos en POOL.
				
			       ArrayList<Cliente>clientes = new ArrayList<Cliente>();
			        clientes.add(new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2 })); // 12 Seg
			        clientes.add(new Cliente("Cliente 2", new int[] { 1, 1, 5, 1, 1 })); //  9 Seg
			        clientes.add(new Cliente("Cliente 3", new int[] { 5, 3, 1, 5, 2 })); // 16 Seg
			        clientes.add(new Cliente("Cliente 4", new int[] { 2, 4, 3, 2, 5 })); // 16 Seg
			        clientes.add(new Cliente("Cliente 5", new int[] { 1, 3, 2, 2, 3 })); // 11 Seg
			        clientes.add(new Cliente("Cliente 6", new int[] { 4, 2, 1, 3, 1 })); // 11 Seg
			        clientes.add(new Cliente("Cliente 7", new int[] { 3, 3, 2, 4, 7 })); // 19 Seg
			        clientes.add(new Cliente("Cliente 8", new int[] { 6, 1, 3, 1, 3 })); // 14 Seg
			        // Tiempo total en procesar todos los pedidos = 108 segundos
			        
			        long init = System.currentTimeMillis();  // Instante inicial del procesamiento
			        
			        ExecutorService executor = Executors.newFixedThreadPool(numCajeras);
			        for (Cliente cliente: clientes) {
			            Runnable cajera = new CajeraRunnable(cliente, init);
			            executor.execute(cajera);
			        }
			        executor.shutdown();	// Cierro el Executor
			        while (!executor.isTerminated()) {
			        	// Espero a que terminen de ejecutarse todos los procesos 
			        	// para pasar a las siguientes instrucciones 
			        }
			        
			        long fin = System.currentTimeMillis();	// Instante final del procesamiento
			        System.out.println("Tiempo total de procesamiento: "+(fin-init)/1000+" Segundos");
				
			}
		}
		else{
			System.out.println("Indica lo que quieres ejecutar.");
			System.out.println("...............................");
			System.out.println("HILOS -> para ejecutar prueba Hilos en java.");
			System.out.println("PARAM_FUNCIONA -> para cualquier otra cosa.... ");
			System.out.println("ParametrosPL -> para probar Params");
			System.out.println("____________________________________________");
			System.out.println("Finaliza la aplicacion.");
			System.exit(1);
		}
	}


}
