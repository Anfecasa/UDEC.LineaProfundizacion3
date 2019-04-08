package udec.lineaprofundizacion.carrerarelevos.procesamiento;

import udec.lineaprofundizacion.carrerarelevos.entidades.Equipo;

/**
 * clase que procesa el menu mostrado en pantalla
 * @author Andres Cadena
 *
 */

public class MenuPrincipalCore {
	
	private Equipo equipo1;
	private Equipo equipo2;
	private Equipo equipo3;
	
	/**
	 * constructor de la clase
	 */
	
	public MenuPrincipalCore() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * metodo que crea los equipos
	 */
	
	public void crearEquipos() {

		equipo1 = new Equipo("E1");
		equipo2 = new Equipo("E2");
		equipo3 = new Equipo("E3");
		
	}
	
	/**
	 * metodo que inicia a correr los equipos
	 */
	
	public void iniciarEquipo() {

		equipo1.iniciarCorrerEquipo();
		equipo2.iniciarCorrerEquipo();
		equipo3.iniciarCorrerEquipo();

	}

	/**
	 * setters y getters de las variable de la clase
	 */
	
	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public Equipo getEquipo3() {
		return equipo3;
	}

	public void setEquipo3(Equipo equipo3) {
		this.equipo3 = equipo3;
	}

}
