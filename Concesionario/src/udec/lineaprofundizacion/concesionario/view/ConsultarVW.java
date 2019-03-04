package udec.lineaprofundizacion.concesionario.view;

import java.util.List;

import udec.lineaprofundizacion.concesionario.core.ConsultarCR;
import udec.lineaprofundizacion.concesionario.entities.CargaETT;
import udec.lineaprofundizacion.concesionario.entities.DeportivoETT;
import udec.lineaprofundizacion.concesionario.entities.InventarioETT;
import udec.lineaprofundizacion.concesionario.facade.FacadeVW;
import udec.lineaprofundizacion.concesionario.utils.Constantes;
/**
 * 
 * @author Andres Cadena
 * @since 03/03/2019
 * 
 * Clase que hace de vista para consultar el inventario de carros
 *
 */
public class ConsultarVW extends BaseVW implements FacadeVW {

	private ConsultarCR consultarCR;
	private List<InventarioETT> listInventario;
	
	/**
	 * constrctor de la clase
	 */
	
	public ConsultarVW() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarMenu() {
		while (super.getFlagMenu() == 0) {
			System.out.println("**************************************************************");
			System.out.println("****************** CONSULTAR INVENARIO LDP2 ******************");
			System.out.println("**************************************************************");
			System.out.println("* Seleccione la opcion que desea consultar                   *");
			System.out.println("* 1) Deportivos                                              *");
			System.out.println("* 2) Estandar                                                *");
			System.out.println("* 3) Carga                                                   *");
			System.out.println("* 4) Personaliza                                             *");
			System.out.println("* 5) Todos                                                   *");
			System.out.println("* 6) Volver al menu anterior                                 *");
			System.out.println("**************************************************************");
			super.setSeleccionMenu(super.getScanner().next());
			procesarSeleccion(super.getSeleccionMenu());
			Constantes.limpiarPantalla();
		}
	}

	@Override
	public void procesarSeleccion(String seleccion) {
		consultarCR = new ConsultarCR();
		switch (seleccion) {
		case "1":
			listInventario = consultarCR.consultarInventario(Integer.parseInt(seleccion));
			setFlagMenu(0);
			break;
		case "2":
			listInventario = consultarCR.consultarInventario(Integer.parseInt(seleccion));
			setFlagMenu(0);
			break;
		case "3":
			listInventario = consultarCR.consultarInventario(Integer.parseInt(seleccion));
			setFlagMenu(0);
			break;
		case "4":
			listInventario = consultarCR.consultarInventario(Integer.parseInt(seleccion));
			setFlagMenu(0);
			break;
		case "5":
			listInventario = consultarCR.consultarInventario();
			setFlagMenu(0);
			break;
		case "6":
			setFlagMenu(1);
			break;
		default:
			System.out.println("ELIJA UNA OPCIN VALIDA");
			setFlagMenu(0);
			break;
		}
		mostrarVehiculos(listInventario);

	}
	
	/**
	 * metodo que a partir de una lista muestra todos los objetos de la lista en la pantalla
	 * @param listInventarioETT
	 */
	
	public static void mostrarVehiculos(List<InventarioETT> listInventarioETT) {

		if (listInventarioETT.size() == 0) {
			System.out.println("**************************************************************");
			System.out.println("*************** NO HAY DATOS QUE MOSTRAR *********************");
			System.out.println("**************************************************************");
		} else {
			System.out.println("**************************************************************");
			System.out.println("******************** LISTA DE INVENTARIO *********************");
			System.out.println("**************************************************************");
			for (InventarioETT inventarioETT : listInventarioETT) {
				System.out.println("**************************************************************");
				System.out.println("* Id del vehiculo       : " + inventarioETT.getId());
				System.out.println("* Cantidad de vehiculos : " + inventarioETT.getCantidad());
				System.out.println("**************************************************************");
				System.out.println("* Modelo                : " + inventarioETT.getVehiculosETT().getModelo());
				System.out.println("* Marca                 : " + inventarioETT.getVehiculosETT().getMarca());
				System.out.println("* Tipo                  : " + inventarioETT.getVehiculosETT().getTipo());
				System.out.println("* Numero llantas        : " + inventarioETT.getVehiculosETT().getNumeroLLantas());
				System.out.println("* Numero Asiento        : " + inventarioETT.getVehiculosETT().getNumeroAsientos());
				System.out.println("* Valor                 : " + inventarioETT.getVehiculosETT().getValor());

				switch (inventarioETT.getVehiculosETT().getTipo()) {
				case 1: // deportivo
					System.out.println("* Color                 : " + inventarioETT.getVehiculosETT().getColor());
					System.out.println("* Convertible           : "
							+ ((DeportivoETT) inventarioETT.getVehiculosETT()).getConvertible());
					break;
				case 2: // estandar
					System.out.println("* Color                 : " + inventarioETT.getVehiculosETT().getColor());
					break;
				case 3:// carga
					System.out.println("* Color                 : " + inventarioETT.getVehiculosETT().getColor());
					System.out.println("* Capacida carga        : "
							+ ((CargaETT) inventarioETT.getVehiculosETT()).getCapacidadCarga());
					break;
				case 4:// Personalizado
					System.out.println("* Color Personalizado   : " + inventarioETT.getVehiculosETT().getColor());
					break;
				}
				System.out.println("**************************************************************");
			}
		}
	}
}
