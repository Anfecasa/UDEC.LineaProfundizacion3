package udec.lineaprofundizacion.concesionario.view;

import udec.lineaprofundizacion.concesionario.facade.FacadeVW;
import udec.lineaprofundizacion.concesionario.utils.Constantes;

/**
 * 
 * @author Andres Cadena
 * @since 03/03/2019
 * 
 * Clase que hace de vista para mostrar los reporte de carro mas vendido y menos vendido
 */

public class ReporteVW extends BaseVW implements FacadeVW{
	
	/**
	 * constructor de la clase
	 */
	
	public ReporteVW() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarMenu() {
		while (super.getFlagMenu() == 0) {
			System.out.println("**************************************************************");
			System.out.println("************************ MENU REPORTE ************************");
			System.out.println("**************************************************************");
			System.out.println("* Seleccione una opcion                                      *");
			System.out.println("* 1) Carro mas vendido                                       *");
			System.out.println("* 2) Carro menos vendido                                     *");
			System.out.println("* 3) Volver al menu anterior                                 *");
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
			setFlagMenu(0);
			break;
		case "2":
			setFlagMenu(0);
			break;
		case "3":
			setFlagMenu(1);
			break;
		default:
			setFlagMenu(0);
			break;
		}
		
	}

}
