/**
 * 
 */
package udec.lineaprofundizacion.carrerarelevos.entidades;

import udec.lineaprofundizacion.carrerarelevos.procesamiento.MonitorCarreraEquipo;
import udec.lineaprofundizacion.carrerarelevos.utilitarios.Utilitarios;

/**
 * clase que reprsenta al objeto persona
 * 
 * @author Andres Cadena
 *
 */
public class Atleta extends Thread{
	
	private String idAtleta;
	private Integer posicionInicial;
	private Integer pasosAtleta = 0;
	private Equipo equipo;
	
	private MonitorCarreraEquipo monitorCarreraEquipo;
	
	
	/**
	 * constructor parametrico de la clase
	 */
	
	public Atleta(String idAtleta, Integer posicionInicial,Equipo equipo, MonitorCarreraEquipo monitorCarreraEquipo) {
		
		this.idAtleta = idAtleta;
		this.posicionInicial = posicionInicial;
		this.equipo = equipo;
		this.monitorCarreraEquipo = monitorCarreraEquipo;
		
	}
	
	/**
	 * metodo sobreescrito de la clase thread
	 */
	
	@Override
	public void run() {
		
		monitorCarreraEquipo.correrAtleta(true, this);

	}
	
	/**
	 * metodo que aumenta los pasos del atleta
	 */
	
	public void correr() {
		
		pasosAtleta += Utilitarios.obtenerPasos();
		
		equipo.imprimirEquipo();
		
	}
	
	/**
	 * metodo que imprime los pasos del atleta
	 * @return string de los pasos del atleta
	 */
	
	public String imprimirAtleta() {
		
		String imprimir = "";
		
		for (int i = 0; i < pasosAtleta; i++) {
			
			imprimir += "-";
			
		}
		
		imprimir += "(" + equipo.getIdEquipo() + "-" + idAtleta + ")";
		
		if (pasosAtleta < 33) {
			
			for (int i = 0; i < 33 - pasosAtleta; i++) {
				
				imprimir += " ";
				
			}
			
		}
		
		return imprimir;
		
	}
	
	/**
	 * getters y setter de las variables de la clase
	 */
	
	public String getIdAtleta() {
		return idAtleta;
	}

	public void setIdAtleta(String idAtleta) {
		this.idAtleta = idAtleta;
	}

	public Integer getPasosAtleta() {
		return pasosAtleta;
	}

	public void setPasosAtleta(Integer pasosAtleta) {
		this.pasosAtleta = pasosAtleta;
	}

	public Integer getPosicionInicial() {
		return posicionInicial;
	}

	public void setPosicionInicial(Integer posicionInicial) {
		this.posicionInicial = posicionInicial;
	}

	public MonitorCarreraEquipo getMonitorCarreraEquipo() {
		return monitorCarreraEquipo;
	}

	public void setMonitorCarreraEquipo(MonitorCarreraEquipo monitorCarreraEquipo) {
		this.monitorCarreraEquipo = monitorCarreraEquipo;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
}
