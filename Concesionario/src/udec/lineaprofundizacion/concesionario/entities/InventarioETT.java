/**
 * 
 */
package udec.lineaprofundizacion.concesionario.entities;

/**
 * @author Andres Cadena
 * @since 03/03/2019
 * clase que representa al objeto inventario
 */
public class InventarioETT {
	
	private int id;
	private int cantidad;
	private VehiculoETT vehiculosETT;
	
	/**
	 * constructor de la clase
	 * @param id - id del stock
	 * @param cantidad - cantidad de stock
	 * @param vehiculoETT - objeto vehiculo en stock
	 */
	
	public InventarioETT(int id, int cantidad, VehiculoETT vehiculoETT) {
		this.id = id;
		this.cantidad = cantidad;
		this.vehiculosETT = vehiculoETT;
	}
	
	/**
	 * metodos get y set para las variables de la clase
	 * @return id
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public VehiculoETT getVehiculosETT() {
		return vehiculosETT;
	}

	public void setVehiculosETT(VehiculoETT vehiculosETT) {
		this.vehiculosETT = vehiculosETT;
	}

}
