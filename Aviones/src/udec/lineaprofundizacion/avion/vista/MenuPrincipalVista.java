package udec.lineaprofundizacion.avion.vista;

import java.util.Scanner;

import udec.lineaprofundizacion.avion.dao.AvionDao;

public class MenuPrincipalVista {

	private boolean flagMenuPrinciapl = true;

	private Scanner scanner;

	public MenuPrincipalVista() {
		// TODO Auto-generated constructor stub
	}

	public void mostrarMenu() {

		while (flagMenuPrinciapl) {

			scanner = new Scanner(System.in);
			
			System.out.println("************************************************************************************************************************");
			System.out.println("********************************************** MENU PRINCIPAL AVIONES **************************************************");
			System.out.println("************************************************************************************************************************");
			System.out.println("* Seleccione una opcion                                                                                                *");
			System.out.println("* 1) Crear Aviones                                                                                                     *");
			System.out.println("* 2) Comprar Tiquete                                                                                                   *");
			System.out.println("* 3) Cerrar Vuelo                                                                                                      *");
			System.out.println("* 4) Reporte Ventas                                                                                                    *");
			System.out.println("* 5) Salir                                                                                                             *");
			System.out.println("************************************************************************************************************************");
			
			procesarSeleccionMenuPrincipal(scanner.next());

		}

	}

	private void procesarSeleccionMenuPrincipal(String seleccion) {
		
		AvionDao avionDao = new AvionDao();
		
		switch (seleccion) {
		
		case "1":
			
			AvionVista avionVista = new AvionVista();
			avionVista.crearAviones();
			
			break;
			
		case "2":
			
			if (!(avionDao.listarAviones().size() == 0)) {
				
				TiqueteVista tiqueteVista = new TiqueteVista();
				tiqueteVista.comprarTiquete();
				
			}else {
				
				System.out.println("************************************************************************************************************************");
				System.out.println("** !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ERROR NO HAY AVIONES CREADOS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! **");
				System.out.println("************************************************************************************************************************");
				
			}
			
			break;
		case "3":
			
			if (!(avionDao.listarAviones().size() == 0)) {
				
				CerrarVista cerrarVista = new CerrarVista();
				cerrarVista.cerrarAvion();
				
			}else {
				
				System.out.println("************************************************************************************************************************");
				System.out.println("** !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ERROR NO HAY AVIONES CREADOS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! **");
				System.out.println("************************************************************************************************************************");
				
			}
			
			break;
		case "4":
			
			if (!(avionDao.listarAviones().size() == 0)) {
				
				ReporteVista reporteVista = new ReporteVista();
				reporteVista.reporteAvion();
				
			}else {
				
				System.out.println("************************************************************************************************************************");
				System.out.println("** !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ERROR NO HAY AVIONES CREADOS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! **");
				System.out.println("************************************************************************************************************************");
				
			}
			
			
			
			break;
		case "5":
			
			System.out.println("************************************************************************************************************************");
			System.out.println("********************************************** FIN APLICAICON AVIONES **************************************************");
			System.out.println("************************************************************************************************************************");
			
			flagMenuPrinciapl = false;
			
			break;
		default:
			
			System.out.println("************************************************************************************************************************");
			System.out.println("****************************************** SELECCIONE UNA OPCION VALIDA ************************************************");
			System.out.println("************************************************************************************************************************");
			
			break;
			
		}
		
	}

}
