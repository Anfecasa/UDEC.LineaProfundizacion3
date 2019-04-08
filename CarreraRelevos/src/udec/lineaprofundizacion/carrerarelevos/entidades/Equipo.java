/**
 * 
 */
package udec.lineaprofundizacion.carrerarelevos.entidades;

import udec.lineaprofundizacion.carrerarelevos.procesamiento.MonitorCarreraEquipo;

/**
 * clase que representa al objeto equipo
 * 
 * @author Andres Cadena
 *
 */
public class Equipo {

	private String idEquipo;
	
	private Atleta atleta1;
	private Atleta atleta2;
	private Atleta atleta3;
	
	private MonitorCarreraEquipo monitorCarreraEquipo;
	
	private Integer PasosEquipo = 0;


	/**
	 * constructor parametrico de la clase
	 */
	public Equipo(String idEquipo) {

		this.idEquipo = idEquipo;
		
		monitorCarreraEquipo = new MonitorCarreraEquipo();
		
		atleta1 = new Atleta("A1", 0,this, monitorCarreraEquipo);
		atleta3 = new Atleta("A3", 0,this, monitorCarreraEquipo);
		atleta2 = new Atleta("A2", 0,this, monitorCarreraEquipo);		
		
	}
	
	/**
	 * metodo que inicializa cada uno de los hilos (atletas)
	 */
	
	public void iniciarCorrerEquipo() {
		
//		atleta1.start();		
//		atleta2.start();		
//		atleta3.start();
		
		try {
			
			atleta1.start();
			Thread.sleep(1000);
			
			atleta2.start();
			Thread.sleep(1000);
			
			atleta3.start();
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		
		}
		
	}
	
	/**
	 * metodo que imprime por consola los pasos del equipo
	 */
	
	public void imprimirEquipo() {
		
		System.out.println(this.atleta1.imprimirAtleta() + this.atleta2.imprimirAtleta() + this.atleta3.imprimirAtleta());
		
	}
	
	/**
	 * setter y getters de las variables de la clase
	 * @return
	 */
	
	public String getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(String idEquipo) {
		this.idEquipo = idEquipo;
	}

	public Integer getPasosEquipo() {
		return PasosEquipo;
	}

	public void setPasosEquipo(Integer pasosEquipo) {
		PasosEquipo = pasosEquipo;
	}

	public Atleta getAtleta1() {
		return atleta1;
	}

	public void setAtleta1(Atleta atleta1) {
		this.atleta1 = atleta1;
	}

	public Atleta getAtleta2() {
		return atleta2;
	}

	public void setAtleta2(Atleta atleta2) {
		this.atleta2 = atleta2;
	}

	public Atleta getAtleta3() {
		return atleta3;
	}

	public void setAtleta3(Atleta atleta3) {
		this.atleta3 = atleta3;
	}
	
}
