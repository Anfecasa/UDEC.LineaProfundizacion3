/**
 * 
 */
package udec.lineaprofundizacion.concesionario.view;

import udec.lineaprofundizacion.concesionario.facade.FacadeVW;
import udec.lineaprofundizacion.concesionario.utils.Constantes;

/**
 * @author Andres Cadena
 * @since 03/03/2019
 * 
 * Clase que hace de vista principal que se muestra por la aplicacion
 *
 */
public class PrincipalVW extends BaseVW implements FacadeVW{

	private ConsultarVW consultaVW;
	private ComprarVW comprarVW;
	private AdicionarVW adicionarVW;
	private ReporteVW reporteVW;
	
	/**
	 * constructor de la clase
	 */
	
	public PrincipalVW() {

	}
	
	@Override
	public void mostrarMenu() {
		while (getFlagMenu() == 0) {
			System.out.println("**************************************************************");
			System.out.println("******************* CONCESIONARIO LDP2 ***********************");
			System.out.println("**************************************************************");
			System.out.println("* Seleccione una opcion                                      *");
			System.out.println("* 1) Consultar inventario                                    *");
			System.out.println("* 2) Comprar Vehiculo                                        *");
			System.out.println("* 3) Cargar Vehiculos al inventario                          *");
			System.out.println("* 4) Reporte                                                 *");
			System.out.println("* 5) Salir                                                   *");
			System.out.println("**************************************************************");
			super.setSeleccionMenu(super.getScanner().next());
			procesarSeleccion(super.getSeleccionMenu());
			Constantes.limpiarPantalla();
		}
		
	}
	
	@Override
	public void procesarSeleccion(String seleccion) {
		switch (super.getSeleccionMenu()) {
		case "1": // consultar
			consultaVW = new ConsultarVW();
			consultaVW.mostrarMenu();;
			break;
		case "2": // comprar
			comprarVW = new ComprarVW();
			comprarVW.mostrarMenu();
			break;
		case "3": // adicionar
			adicionarVW = new AdicionarVW();
			adicionarVW.mostrarMenu();
			break;
		case "4": // reporte
			reporteVW = new ReporteVW();
			reporteVW.mostrarMenu();
			break;
		case "5": // salir
			System.out.println("FIN DEL PROGRAMA");
			setFlagMenu(1);
			break;
		default:
			System.out.println("ELIJA UNA OPCIN VALIDA");
			setFlagMenu(0);
			break;
		}
	}

}
