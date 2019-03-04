package udec.lineaprofundizacion.concesionario.view;

import java.util.Scanner;
/**
 * 
 * @author Andres Cadena
 * @since 03/03/2019
 * 
 * clase padre de todas las vistas de la aplicacion
 */
public abstract class BaseVW {
	
	private Scanner scanner = new Scanner(System.in);
	private int flagMenu = 0;
	private String seleccionMenu;
	
	/**
	 * cosntructor de la clase
	 */
	
	public BaseVW() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * metodos set y get de la clase
	 */
	
	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scannerEntrada) {
		this.scanner = scannerEntrada;
	}

	public int getFlagMenu() {
		return flagMenu;
	}

	public void setFlagMenu(int flagMenu) {
		this.flagMenu = flagMenu;
	}

	public String getSeleccionMenu() {
		return seleccionMenu;
	}

	public void setSeleccionMenu(String seleccionMenu) {
		this.seleccionMenu = seleccionMenu;
	}

}
