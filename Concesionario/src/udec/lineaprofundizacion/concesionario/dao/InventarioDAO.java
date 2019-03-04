package udec.lineaprofundizacion.concesionario.dao;

import java.util.List;

import udec.lineaprofundizacion.concesionario.entities.InventarioETT;
import udec.lineaprofundizacion.concesionario.entities.OrdenCompraETT;
import udec.lineaprofundizacion.concesionario.utils.Constantes;
/**
 * @author Andres Cadena
 * @since 03/03/2019
 * clase para acceder a la lista de objetos inventariosETT
 */
public class InventarioDAO {
	
	public int cantidadActual;
	public int cantidadDespues;
	public InventarioDAO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * metodo para adicionar objetos a la lista listInventario
	 * @param inventarioETT
	 */
	
	public void adicionarInventario(InventarioETT inventarioETT) {
		Constantes.listInventario.add(inventarioETT);
	}
	
	/**
	 * metodo para consultar obtener la lista listInventario
	 * @return Constantes.listInventario
	 */
	
	public List<InventarioETT> consultarInventario() {
		return Constantes.listInventario;
	}
	
	/**
	 * metodo para quitar el numero de vahiculos disponibles en la lista listInventario
	 * @param listOrdenCompraETT
	 */
	
	public void quitarInventario(List<OrdenCompraETT> listOrdenCompraETT) {
		
		for (OrdenCompraETT ordenCompraETT : listOrdenCompraETT) {
			cantidadActual = Constantes.listInventario.get(ordenCompraETT.getIdVehiculo() - 1).getCantidad();
			cantidadDespues = cantidadActual - ordenCompraETT.getCantidadVehiculo();
			Constantes.listInventario.get(ordenCompraETT.getIdVehiculo() - 1).setCantidad(cantidadDespues);
		}
		
	}

}
