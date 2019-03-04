package udec.lineaprofundizacion.concesionario.core;

import java.util.List;

import udec.lineaprofundizacion.concesionario.dao.OrdenCompraDAO;
import udec.lineaprofundizacion.concesionario.entities.OrdenCompraETT;
import udec.lineaprofundizacion.concesionario.entities.VehiculoETT;

/**
 * 
 * @author Andres Cadena
 * @since 03/03/2019
 * 
 *        clase que procesa la informacion de vuelta por la clase dao y la
 *        retorna a la vista
 *
 */
public class ReporteCR {
	
	private List<OrdenCompraETT> listOrdenCompraETT;
	private OrdenCompraDAO ordenCompraDao;
	
	
	/**
	 * constructor de la clase
	 */

	public ReporteCR() {
		obtenerOrdenesCompra();
	}

	public VehiculoETT obtenerVehiculoMasVendido() {
		
		
		return null;
		
	}

	public VehiculoETT obtenerVehiculoMenosVendido() {
		
		return null;

	}
	
	public void obtenerOrdenesCompra() {
		ordenCompraDao = new OrdenCompraDAO();
		listOrdenCompraETT = ordenCompraDao.obtenerOrdenesCompra();

		
	}

}
