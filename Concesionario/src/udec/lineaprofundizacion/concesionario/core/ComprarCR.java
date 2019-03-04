/**
 * 
 */
package udec.lineaprofundizacion.concesionario.core;

import java.util.List;

import udec.lineaprofundizacion.concesionario.dao.InventarioDAO;
import udec.lineaprofundizacion.concesionario.dao.OrdenCompraDAO;
import udec.lineaprofundizacion.concesionario.entities.OrdenCompraETT;

/**
 * @author Andres Cadena
 * @since 03/03/2019
 * clase para procesar los requerimientos de la vista ComprarVW
 */
public class ComprarCR {
	public InventarioDAO inventarioDAO;
	public OrdenCompraDAO ordenCompraDAO;
	
	/**
	 * constructor de la clase
	 */
	public ComprarCR() {
		
	}
	
	/**
	 * metodo que hace uso de quitarInventario y GuardarOrdenCompra
	 * para procesar la lista de vehiculos comprados 
	 * @param ordenCompraETT
	 * @return nada
	 */
	
	public void comprarVehiculo(List<OrdenCompraETT> ordenCompraETT) {
		inventarioDAO = new InventarioDAO();
		inventarioDAO.quitarInventario(ordenCompraETT);
		ordenCompraDAO = new OrdenCompraDAO();
		ordenCompraDAO.guardarOrdenCompra(ordenCompraETT);
	}

}
