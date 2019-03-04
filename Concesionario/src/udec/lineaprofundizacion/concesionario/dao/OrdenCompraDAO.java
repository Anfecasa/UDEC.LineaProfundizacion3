package udec.lineaprofundizacion.concesionario.dao;

import java.util.List;

import udec.lineaprofundizacion.concesionario.entities.OrdenCompraETT;
import udec.lineaprofundizacion.concesionario.utils.Constantes;
/**
 * 
 * @author Andres Cadena
 * @since 03/03/2019
 * clase para acceder a la lista de ordenes de compra
 */
public class OrdenCompraDAO {
	
	/**
	 * constructor de la clase
	 */
	
	public OrdenCompraDAO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * metodo para adicionar obejtos a la lista listOrdenesCompra
	 * @param listOrdenCompraETT
	 */
	
	public void guardarOrdenCompra(List<OrdenCompraETT> listOrdenCompraETT) {
		for (OrdenCompraETT ordenCompraETT : listOrdenCompraETT) {
			Constantes.listOrdenesCompra.add(ordenCompraETT);
		}		
	}
	
	/**
	 * metodo para obtener las listas de compra
	 * @return OrdenCompraETT
	 */
	
	public List<OrdenCompraETT> obtenerOrdenesCompra() {
		return Constantes.listOrdenesCompra;
	}
	
}
