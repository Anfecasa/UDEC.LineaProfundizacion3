package udec.lineaprofundizacion.mapas.entidades;

import java.util.HashMap;
import java.util.Map;

/**
 * CLase que representa a una persona
 * @author Andres Cadena
 *
 */
public class Persona {
	
	private int id;
	private String nombre;
	private Map<Integer, Persona> mapFamilia = new HashMap<Integer, Persona>();
	
	
	/**
	 * constructor de la clase persona
	 */
	
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * getters y setters de la varibles de la aplicacion
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<Integer, Persona> getMapFamilia() {
		return mapFamilia;
	}

	public void setMapFamilia(Map<Integer, Persona> mapFamilia) {
		this.mapFamilia = mapFamilia;
	}
	
}
