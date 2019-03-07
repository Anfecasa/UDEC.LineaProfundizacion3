package udec.lineaprofundizacion.codigocesar.vista;

import java.util.Scanner;

import udec.lineaprofundizacion.codigocesar.core.Desencriptar;
import udec.lineaprofundizacion.codigocesar.core.Encriptar;

public class MenuPrincipal {

	private Scanner scanner = new Scanner(System.in);
	private int flagMenu = 0;
	private String texto;

	/**
	 * constructor de la clase
	 */

	public MenuPrincipal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * metodo que muestra el menu principal
	 */

	public void mostrarMenu() {
		while (getFlagMenu() == 0) {
			System.out.println("*****************************************************");
			System.out.println("******************** CODIGO CESAR *******************");
			System.out.println("*****************************************************");
			System.out.println("* 1) Encriptar                                      *");
			System.out.println("* 2) Desencriptar                                   *");
			System.out.println("* 3) Salir                                          *");
			System.out.println("*****************************************************");
			procesarSeleccion(scanner.next());
		}
	}

	private void procesarSeleccion(String seleccion) {
		switch (seleccion) {
		case "1":
			imprimirResultado(Encriptar.encriptarTexto(solicitarTexto()));
			setFlagMenu(0);
			break;
		case "2":
			imprimirResultado(Desencriptar.desencriptarTexto(solicitarTexto()));
			setFlagMenu(0);
			break;
		case "3":
			System.out.println("*****************************************************");
			System.out.println("**************** FIN DEL PROGRAMA *******************");
			System.out.println("*****************************************************");
			setFlagMenu(1);
			break;
		default:
			System.out.println("*****************************************************");
			System.out.println("*** ALERTA *** Seleccione una opcion valida         *");
			System.out.println("*****************************************************");
			setFlagMenu(0);
			break;
		}
	}
	
	private String solicitarTexto() {
		System.out.println("*****************************************************");
		System.out.println("* Digite el texto que desea procesar                *");
		System.out.println("*****************************************************");
		return scanner.next();		
	}
	
	private void imprimirResultado(String resultado) {
		System.out.println("*****************************************************");
		System.out.println("* El resultado de la operacion es:                  *");
		System.out.println("*****************************************************");
		System.out.println("* " + resultado);
	}
	
	/**
	 * Setters y Getters de las valiables de la clase
	 */

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public int getFlagMenu() {
		return flagMenu;
	}

	public void setFlagMenu(int flagMenu) {
		this.flagMenu = flagMenu;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
