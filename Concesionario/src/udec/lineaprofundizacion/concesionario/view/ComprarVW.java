package udec.lineaprofundizacion.concesionario.view;

import java.util.ArrayList;
import java.util.List;

import udec.lineaprofundizacion.concesionario.core.ComprarCR;
import udec.lineaprofundizacion.concesionario.core.ConsultarCR;
import udec.lineaprofundizacion.concesionario.entities.OrdenCompraETT;
import udec.lineaprofundizacion.concesionario.facade.FacadeVW;
import udec.lineaprofundizacion.concesionario.utils.Constantes;
/**
 * 
 * @author Andres Cadena
 * @since 03/03/2019
 * 
 * clase que hace de vista para comprar un vehiculo
 *
 */
public class ComprarVW extends BaseVW implements FacadeVW {
	
	private ConsultarCR consultarCR;
	private ComprarCR comprarCR;
	private List<OrdenCompraETT> listOrdenCompraETT;
	private OrdenCompraETT ordenCompraETT;
	private int flagComprar = 0;
	
	
	/**
	 * consructor de la clase
	 */
	public ComprarVW() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarMenu() {
		while (super.getFlagMenu() == 0) {
			System.out.println("**************************************************************");
			System.out.println("******************** COMPRAR VEHICULO LDP2 *******************");
			System.out.println("**************************************************************");
			System.out.println("* Seleccione el opcion                                       *");
			System.out.println("* 1) Mostrar vehiculos                                       *");
			System.out.println("* 2) Volver al menu anterior                                 *");
			System.out.println("**************************************************************");
			super.setSeleccionMenu(super.getScanner().next());
			procesarSeleccion(super.getSeleccionMenu());
			Constantes.limpiarPantalla();
		}
	}

	@Override
	public void procesarSeleccion(String seleccion) {
		
		switch (seleccion) {
		case "1":
			consultarCR = new ConsultarCR();
			if (consultarCR.consultarInventario().size() == 0) {
				System.out.println("**************************************************************");
				System.out.println("*************** NO HAY DATOS QUE MOSTRAR *********************");
				System.out.println("**************************************************************");
			} else {
				ConsultarVW.mostrarVehiculos(consultarCR.consultarInventario());
				comprarCarro();
			}			
			super.setFlagMenu(0);
			break;
		case "2":
			super.setFlagMenu(1);
			break;
		default:
			System.out.println("ELIJA UNA OPCIN VALIDA");
			super.setFlagMenu(0);
			break;
		}

	}
	
	/**
	 * metodo que toma los datos del vehiculo a comprar y hace uso de comprarVehiculo 
	 * con el finde realizar la compra del vahiculo
	 */
	
	public void comprarCarro() {
		
		comprarCR = new ComprarCR();
		listOrdenCompraETT = new ArrayList<OrdenCompraETT>();
		
		while (flagComprar == 0) {
			
			ordenCompraETT = new OrdenCompraETT();
			
			System.out.println("**************************************************************");
			System.out.println("* Digite el id del vehiculo a comprar:                       *");
			ordenCompraETT.setIdVehiculo(super.getScanner().nextInt());
			System.out.println("* Digite la cantida de vehiculos a comprar:                  *");
			
			ordenCompraETT.setCantidadVehiculo(super.getScanner().nextInt());
			listOrdenCompraETT.add(ordenCompraETT);
			
			System.out.println("**************************************************************");
			System.out.println("*************** VEHICULO COMPRADO EXITOSAMENTE ***************");
			System.out.println("**************************************************************");
			
			System.out.println("* Desea comprar otro vehiculo 0 = Si   1 = No                *");
			flagComprar = super.getScanner().nextInt();
		}
		
		comprarCR.comprarVehiculo(listOrdenCompraETT);
		
	}

}
