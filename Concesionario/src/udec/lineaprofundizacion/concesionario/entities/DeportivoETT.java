/**
 * 
 */
package udec.lineaprofundizacion.concesionario.entities;

/**
 * @author Andres Cadena
 * @since 03/03/2019
 * clase hija que representa al vehiculo deportivo
 */
public class DeportivoETT extends VehiculoETT {

	private int convertible;
	
	/**
	 * constructor de la clase
	 */
	
	public DeportivoETT() {
		super.setTipo(1);
	}

	/**
	 * metodo get para la variable convertible
	 * @return convertible
	 */
	
	public int getConvertible() {
		return convertible;
	}
	
	/**
	 * metodo set para la variable convertible
	 * @param convertible
	 */

	public void setConvertible(int convertible) {
		this.convertible = convertible;
	}

}
