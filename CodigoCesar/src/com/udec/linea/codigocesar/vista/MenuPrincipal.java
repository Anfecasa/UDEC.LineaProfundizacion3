/**
 * 
 */
package com.udec.linea.codigocesar.vista;

import java.util.Scanner;

import com.udec.linea.codigocesar.core.Desencriptar;
import com.udec.linea.codigocesar.core.Encriptar;

/**
 * @author 57320
 *
 */
public class MenuPrincipal {

	private Scanner entrada = new Scanner(System.in);
	private int flagMenu = 0;
	private int opcion;
	private String texto;

	public void MostrarMenu() {
		while (flagMenu == 0) {
			System.out.println("*************************************************************");
			System.out.println("******************** PROGRAMA CODIGO CESAR ******************");
			System.out.println("*************************************************************");
			System.out.println("* 1) ENCRIPTAR                                              *");
			System.out.println("* 2) DESENCRIPTAR                                           *");
			System.out.println("* 3) SALIR                                                  *");
			System.out.println("*************************************************************");
			System.out.println("Seleccione una opcion...								     ");
			ProcesarOpcion(entrada.next());
		}

	}

	public void ProcesarOpcion(String opcion) {
		switch (opcion) {
		case "1":
			Encriptar.EncriptarTexto(ObtenerTexto());
			setFlagMenu(0);
			break;
		case "2":
			Desencriptar.DesencriptarTexto(ObtenerTexto());
			setFlagMenu(0);
			break;
		case "3":
			setFlagMenu(1);
			break;
		default:
			setFlagMenu(0);
			break;
		}

	}

	/**
	 * metodo que obtiene el texto digitado
	 * 
	 * @return texto
	 */

	public String ObtenerTexto() {
		System.out.println("Digite el texto que desea procesar...");
		texto = entrada.nextLine().toUpperCase();
		return texto;
	}

	/**
	 * obtiene el objeto entrada
	 * 
	 * @return entrada
	 */

	public Scanner getEntrada() {
		return entrada;
	}

	/**
	 * asigna el objeto entrada
	 * 
	 * @param entrada
	 */

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}

	/**
	 * obtiene el flag del menu
	 * 
	 * @return flagMenu
	 */

	public int getFlagMenu() {
		return flagMenu;
	}

	/**
	 * asigan el flag del menu
	 * 
	 * @param flagMenu
	 */

	public void setFlagMenu(int flagMenu) {
		this.flagMenu = flagMenu;
	}

	/**
	 * obtiene le valor de la variable opcion
	 * 
	 * @return opcion
	 */

	public int getOpcion() {
		return opcion;
	}

	/**
	 * asiganel valor a la variable opcion
	 * 
	 * @param opcion
	 */

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	/**
	 * obtiene el valor de la variable texto
	 * 
	 * @return texto
	 */

	public String getTexto() {
		return texto;
	}

	/**
	 * asigna el valor de la variable texto
	 * 
	 * @param texto
	 */

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
