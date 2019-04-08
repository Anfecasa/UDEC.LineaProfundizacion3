/**
 * 
 */
package udec.lineaprofundizacion.carrerarelevos.vista;

import java.util.Scanner;

import udec.lineaprofundizacion.carrerarelevos.procesamiento.MenuPrincipalCore;

/**
 * clase que muestra el menu de la aplicacion
 * 
 * @author Andres Cadena
 *
 */
public class MenuPrincipalView {

	private boolean flagMenu = true;
	private Scanner scanner;

	/**
	 * constructor de la clase
	 */
	
	public MenuPrincipalView() {

		scanner = new Scanner(System.in);

	}
	
	/**
	 * metodo que muestra el menu de la clase
	 */
	
	public void mostrarMenu() {
		
		while (flagMenu) {

			System.out.println("************************************************************************************************************************");
			System.out.println("******************************************* MENU PRINCIPAL CARRERAS DE RELEVOS *****************************************");
			System.out.println("************************************************************************************************************************");
			System.out.println("* 1) Iniciar competencia                                                                                               *");
			System.out.println("* 2) Salir                                                                                                             *");
			System.out.println("************************************************************************************************************************");

			procesarSeleccion(scanner.next());

		}

	}
	
	/**
	 * metodo que procesa la seleccion del menu
	 * @param seleccion
	 */
	
	private void procesarSeleccion(String seleccion) {
		
		switch (seleccion) {
		case "1":
			
			MenuPrincipalCore menuPrincipalCore = new MenuPrincipalCore();
			menuPrincipalCore.crearEquipos();
			
			menuPrincipalCore.iniciarEquipo();
			
			break;

		case "2":
			
			flagMenu = false;
			
			break;

		default:
			
			System.out.println("************************************************************************************************************************");
			System.out.println("* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! SELECCIONE UNA OPCION VALIDA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! *");
			System.out.println("************************************************************************************************************************");
			
		}

	}
	


}
