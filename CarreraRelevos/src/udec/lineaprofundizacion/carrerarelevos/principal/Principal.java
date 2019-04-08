/**
 * 
 */
package udec.lineaprofundizacion.carrerarelevos.principal;

import udec.lineaprofundizacion.carrerarelevos.vista.MenuPrincipalView;

/**
 * clase que inicializa la aplicacion
 * 
 * @author Andres Cadena
 *
 */
public class Principal {

	/**
	 * constructor de la clase
	 */
	public Principal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * metodo de inicio de la aplicacion
	 * @param args
	 */
	public static void main(String[] args) {
		
		MenuPrincipalView menuPrincipal = new MenuPrincipalView();
		menuPrincipal.mostrarMenu();

	}

}
