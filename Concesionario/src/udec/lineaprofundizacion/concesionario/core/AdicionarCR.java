package udec.lineaprofundizacion.concesionario.core;

import udec.lineaprofundizacion.concesionario.dao.InventarioDAO;
import udec.lineaprofundizacion.concesionario.entities.InventarioETT;
import udec.lineaprofundizacion.concesionario.entities.VehiculoETT;
import udec.lineaprofundizacion.concesionario.utils.Constantes;

/**
 * @author Andres Cadena
 * @since 03/03/2019
 * 
 * clase para procesar los requerimientos de la vista AdicionarVW
 */
public class AdicionarCR {
	
	private InventarioDAO inventarioDAO;
	private InventarioETT inventarioETT;
	private int idSiguiente;
	
	/**
	 *  Constructor de la clase de AdicionarCR 
	 */
	
	public AdicionarCR() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo que hace uso de adiccionarInventario para crear vehiculos en el inventario
	 * @param vehiculoETT
	 * @param cantidad
	 * @return nada
	 */
	
	public void crearVehiculo(VehiculoETT vehiculoETT, int cantidad) {
		inventarioDAO =  new InventarioDAO();
		if (Constantes.listInventario.size() == 0) {
			idSiguiente = 1;
		} else {
			idSiguiente = Constantes.listInventario.get(Constantes.listInventario.size() -1 ).getId() + 1;
		}
		inventarioETT = new InventarioETT(idSiguiente, cantidad, vehiculoETT);
		inventarioDAO.adicionarInventario(inventarioETT);
	}
}
