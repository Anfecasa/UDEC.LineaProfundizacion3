package udec.lineaprofundizacion.codigocesar.core;

import udec.lineaprofundizacion.codigocesar.utils.Constantes;

public class Encriptar {
	
	private static int posicion;
	private static String textoEncriptado = "";
	
	public Encriptar() {
		// TODO Auto-generated constructor stub
	}
	
	public static String encriptarTexto(String texto) {
		texto = texto.toUpperCase();
		for (int i = 0; i < texto.length(); i++) {
			for (int j = 0; j < Constantes.ABECEDARIO.length; j++) {
				if (Constantes.ABECEDARIO[j].equals(String.valueOf(texto.charAt(i)))) {
					posicion = j + Constantes.POSICIONES;
					
					if (posicion > Constantes.ABECEDARIO.length) {
						posicion -= Constantes.ABECEDARIO.length;
					} 
					
					textoEncriptado = textoEncriptado + Constantes.ABECEDARIO[posicion];
					
				}
			}
		}
		
		return textoEncriptado;		
	}
}
