package udec.lineaprofundizacion.codigocesar.core;

import udec.lineaprofundizacion.codigocesar.utils.Constantes;

public class Desencriptar {
	
	private static int posicion;
	private static String textoDesencriptado = "";
	
	public Desencriptar() {
		// TODO Auto-generated constructor stub
	}
	
	public static String desencriptarTexto(String texto) {		
		texto = texto.toUpperCase();
		for (int i = 0; i < texto.length(); i++) {
			for (int j = 0; j < Constantes.ABECEDARIO.length; j++) {
				if (Constantes.ABECEDARIO[j].equals(String.valueOf(texto.charAt(i)))) {
					posicion = j - Constantes.POSICIONES;
					
					if (posicion < 0) {
						posicion += Constantes.ABECEDARIO.length;
					} 
					
					textoDesencriptado = textoDesencriptado + Constantes.ABECEDARIO[posicion];
					
				}
			}
		}
		return textoDesencriptado;
		
	}
	
}
