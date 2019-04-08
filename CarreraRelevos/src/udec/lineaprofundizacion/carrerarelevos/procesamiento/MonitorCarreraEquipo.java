/**
 * 
 */
package udec.lineaprofundizacion.carrerarelevos.procesamiento;

import udec.lineaprofundizacion.carrerarelevos.entidades.Atleta;
import udec.lineaprofundizacion.carrerarelevos.utilitarios.Constantes;

/**
 * clase que controla la ejecucion de los hilos (atletas)
 * 
 * @author Andres Cadena
 *
 */
public class MonitorCarreraEquipo {
	
	private boolean estadoAtleta1;
	private boolean estadoAtleta2;
	private boolean estadoAtleta3;
	
	private int totalEquipo;
	
	/**
	 * metodo que realiza las acciones del los hilos (atletas)
	 * 
	 * @param corriendo
	 * @param atleta
	 */
	
	public synchronized void correrAtleta(boolean corriendo, Atleta atleta) {
		
		switch (atleta.getIdAtleta()) {
		case "A1":
			
			if (estadoAtleta2 == true || estadoAtleta3 == true) {
				
				try {
					
					wait();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
				}
				
			}else {
				
				while (atleta.getPasosAtleta() < Constantes.NUMERO_PASOS_TOTAL_ATLETA) {
					atleta.correr();
					estadoAtleta1 = true;
					atleta.getEquipo().imprimirEquipo();
					
				}
				
				estadoAtleta1 = false;
				notify();
				
			}
			
			break;

		case "A2":
									
			if (estadoAtleta1 == true || estadoAtleta3 == true) {
				
				try {
					
					wait();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
				}
				
			}else {
				
				while (atleta.getPasosAtleta() < Constantes.NUMERO_PASOS_TOTAL_ATLETA) {
					atleta.correr();
					estadoAtleta2 = true;
					atleta.getEquipo().imprimirEquipo();
					
				}
				
				estadoAtleta2 = false;
				notify();
				
			}
			
			break;
			
		case "A3":
			
			if (estadoAtleta1 == true || estadoAtleta2 == true) {
				
				try {
					
					wait();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
				}
				
			}else {
				
				while (atleta.getPasosAtleta() < Constantes.NUMERO_PASOS_TOTAL_ATLETA) {
					atleta.correr();
					estadoAtleta3 = true;
					atleta.getEquipo().imprimirEquipo();
					
				}
				
				estadoAtleta3 = false;
				notify();
				
			}
			
			break;
			
		}
		
	}
	
	/**
	 * setters y getters de las variables de la clase
	 */
	
	public int getTotalEquipo() {
		return totalEquipo;
	}

	public void setTotalEquipo(int totalEquipo) {
		this.totalEquipo = totalEquipo;
	}
	
	public boolean isEstadoAtleta1() {
		return estadoAtleta1;
	}

	public void setEstadoAtleta1(boolean estadoAtleta1) {
		this.estadoAtleta1 = estadoAtleta1;
	}

	public boolean isEstadoAtleta2() {
		return estadoAtleta2;
	}

	public void setEstadoAtleta2(boolean estadoAtleta2) {
		this.estadoAtleta2 = estadoAtleta2;
	}

	public boolean isEstadoAtleta3() {
		return estadoAtleta3;
	}

	public void setEstadoAtleta3(boolean estadoAtleta3) {
		this.estadoAtleta3 = estadoAtleta3;
	}
	
}
