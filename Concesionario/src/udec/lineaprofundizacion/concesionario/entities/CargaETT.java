/**
 * 
 */
package udec.lineaprofundizacion.concesionario.entities;

/**
 * @author Andres Cadena
 * @since 03/03/2019
 * clase hija de vehiculos que representa al vehiculo de carga
 */
public class CargaETT extends VehiculoETT {
	
	private int capacidadCarga;
	
	/**
	 * constructor de la clase
	 */
	
	public CargaETT() {
		super.setTipo(3);
	}
	
	/**
	 * metodo get para la variable capacidadCarga
	 * @return capacidadCarga
	 */
	
	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	
	/**
	 * metodo set para la variable capacidadCarga
	 * @param capacidadCarga
	 */
	
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

}
