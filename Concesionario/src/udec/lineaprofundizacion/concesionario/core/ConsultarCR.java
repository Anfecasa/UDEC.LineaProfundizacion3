/**
 * 
 */
package udec.lineaprofundizacion.concesionario.core;

import java.util.ArrayList;
import java.util.List;

import udec.lineaprofundizacion.concesionario.dao.InventarioDAO;
import udec.lineaprofundizacion.concesionario.entities.InventarioETT;

/**
 * @author Andres Cadena
 * @since 03/03/2019
 * clase para procesar los requerimientos de la vista ConsultarVW
 */
public class ConsultarCR {

	private List<InventarioETT> listaConsulta;
	private InventarioDAO inventarioDAO;

	/**
	 * constructor de la clase
	 */
	public ConsultarCR() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * metodo que hace uso de consultarInventario para obtener la lista de vehiculos
	 * @return inventarioDAO.consultarInventario()
	 */
	
	public List<InventarioETT> consultarInventario() {
		inventarioDAO = new InventarioDAO();
		return inventarioDAO.consultarInventario();
	}
	
	/**
	 * metodo que hace uso de consultarInventario para obtener la lista de vehiculos filtrada por un 
	 * tipo de vehiculo
	 * @param buscar
	 * @return listaConsulta
	 */
	
	public List<InventarioETT> consultarInventario(int buscar) {
		inventarioDAO = new InventarioDAO();
		listaConsulta = new ArrayList<InventarioETT>();

		for (InventarioETT inventarioETT : inventarioDAO.consultarInventario()) {

			if (inventarioETT.getVehiculosETT().getTipo() == buscar) {
				listaConsulta.add(inventarioETT);
			}
		}

		return listaConsulta;
	}

	/**
	 * metodo get para obtener la lista de vehiculos
	 * @return listaConsulta
	 */

	public List<InventarioETT> getListaConsulta() {
		return listaConsulta;
	}
	
	/**
	 * metodo para asignar la lista de vehiculos
	 * @param listaConsulta
	 */
	
	public void setListaConsulta(List<InventarioETT> listaConsulta) {
		this.listaConsulta = listaConsulta;
	}

}
