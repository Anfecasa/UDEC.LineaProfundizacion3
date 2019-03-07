/**
 * 
 */
package com.udec.linea.codigocesar.core;

import com.udec.linea.codigocesar.utilitarios.Constantes;

/**
 * @author 57320
 *
 */
public class Encriptar {
	
	private static String textoEncriptado;
	private static int posicionTemporal;
	
	public static String EncriptarTexto(String textoEncriptar) {
		
		for (int i = 0; i < textoEncriptar.length(); i++) {
			for (int j = 0; j < Constantes.ABECEDARIO.length; j++) {
				if (Constantes.ABECEDARIO[j].equals(String.valueOf(textoEncriptar.charAt(i)))) {
					posicionTemporal = j + Constantes.NUMERO_POSICIONES;
					if (posicionTemporal > Constantes.ABECEDARIO.length) {
						posicionTemporal -= Constantes.ABECEDARIO.length;
					}					
					textoEncriptado = textoEncriptado + Constantes.ABECEDARIO[posicionTemporal];
				}
			}
		}
		return textoEncriptado;
		
	}

	public String getTextoEncriptado() {
		return textoEncriptado;
	}

	public void setTextoEncriptado(String textoEncriptado) {
		Encriptar.textoEncriptado = textoEncriptado;
	}

	public int getPosicionTemporal() {
		return posicionTemporal;
	}

	public void setPosicionTemporal(int posicionTemporal) {
		Encriptar.posicionTemporal = posicionTemporal;
	}
	
	

}
