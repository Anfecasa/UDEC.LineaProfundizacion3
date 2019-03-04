/**
 * 
 */
package udec.lineaprofundizacion.concesionario.main;

import udec.lineaprofundizacion.concesionario.view.PrincipalVW;

/**
 * @author Andres Cadena
 * @since 03/03/2019
 * clase ejecutora de la aplicacion
 */
public class Principal {
	
	/**
	 * metodo principal que ejecuta la aplicacion
	 * @param args
	 */
	public static void main(String[] args) {
		PrincipalVW principalvw = new PrincipalVW();
		principalvw.mostrarMenu();
	}

}
