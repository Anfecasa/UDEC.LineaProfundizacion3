package udec.lineaprofundizacion.concesionario.entities;
/**
 * 
 * @author Andres Cadena
 * @since 03/03/2019
 * clase que representa el objeto orden de compra
 *
 */
public class OrdenCompraETT {
	
	private int idVehiculo;
	private int cantidadVehiculo;
		
	/**
	 * constructor de la clase 
	 */
	
	public OrdenCompraETT() {
		
	}
	
	/**
	 * metodos set y get para la variables de la clase
	 */
	
	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public int getCantidadVehiculo() {
		return cantidadVehiculo;
	}

	public void setCantidadVehiculo(int cantidadVehiculo) {
		this.cantidadVehiculo = cantidadVehiculo;
	}

}
