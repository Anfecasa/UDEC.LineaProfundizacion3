package udec.lineaprofundizacion.carrerarelevos.utilitarios;

import java.util.Random;

/**
 * clase que contiene metodos utilitarios
 * @author Andres Cadena
 *
 */

public class Utilitarios {
	
	/**
	 * metodo que devuelve un numero random de 0 a 3
	 * @return
	 */
	
	public static Integer obtenerPasos() {
		
		Random random = new Random();
				
		return random.nextInt(3);
		
	}
	
}
