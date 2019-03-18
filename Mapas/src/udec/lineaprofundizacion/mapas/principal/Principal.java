package udec.lineaprofundizacion.mapas.principal;

import udec.lineaprofundizacion.mapas.vista.MenuPrincipal;
/**
 * clase principal de la aplicacion que reliza la ejecucion del aplicativo
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
	 * metodo main por el cual se realiza la ejecucion de la aplicacion
	 * @param args
	 */
	
	public static void main(String[] args) {
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.mostrarMenu();
	}

}
