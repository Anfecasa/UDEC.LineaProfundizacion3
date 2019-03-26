package udec.lineaprofundizacion.avion.vista;

import java.util.Iterator;
import java.util.Scanner;

import udec.lineaprofundizacion.avion.dao.AvionDao;

public class CerrarVista {

	private AvionDao avionDao;
	
	private boolean flagSeleccionAvion = true;
	
	private Scanner scanner;
	
	public CerrarVista() {
		// TODO Auto-generated constructor stub
	}

	public void cerrarAvion() {
		
		mostrarAviones(true);
		
		while (flagSeleccionAvion) {
			
			try {
				
				scanner = new Scanner(System.in);
				
				System.out.println("************************************************************************************************************************");
				System.out.println("* Seleccione el avion que desea cerrar:                                                                                *");
				System.out.println("************************************************************************************************************************");
				
				procesarAvionSeleccionado(scanner.nextInt());
				
			} catch (Exception e) {
				
				System.out.println("************************************************************************************************************************");
				System.out.println("***************************************** SELECCIONE UNA OPCION VALIDA *************************************************");
				System.out.println("************************************************************************************************************************");
				
			}
			
		}
		
	}

	private void procesarAvionSeleccionado(int idAvionCerrar) {
		
		avionDao = new AvionDao();
		
		if (idAvionCerrar == 99) {
			
			flagSeleccionAvion = false;
			
		} else if (avionDao.listarAviones().containsKey(idAvionCerrar)) {
			
			avionDao.listarAviones().get(idAvionCerrar).setEstado(false);
			
			System.out.println("************************************************************************************************************************");
			System.out.println("********************************************** AVION CERRADO CON EXITO *************************************************");
			System.out.println("************************************************************************************************************************");
			
			flagSeleccionAvion = false;
			
		}else {
			
			System.out.println("************************************************************************************************************************");
			System.out.println("******************************************** SELECCIONE UNA OPCION VALIDA **********************************************");
			System.out.println("************************************************************************************************************************");
			
		}
		
		
	}

	private void mostrarAviones(boolean estado) {
		
		boolean flagHayAviones = false;
		
		avionDao = new AvionDao();
		
		int idAvion;
		
		Iterator<Integer> iterator = avionDao.listarAviones().keySet().iterator();
		
		while(iterator.hasNext()){
			
			idAvion = (int) iterator.next();
			
			if (avionDao.listarAviones().get(idAvion).isEstado() == estado) {
				
				System.out.println("* " + idAvion + ") Destion    : " + avionDao.listarAviones().get(idAvion).getDestino());
				System.out.println("*    Tipo Avion : " + avionDao.listarAviones().get(idAvion).getTipoAvion());
				
				flagHayAviones = true;
				
			}
			
		}
		
		if (flagHayAviones) {
			
			System.out.println("* 99) Volver A Atras");
			
		}else {
			System.out.println("************************************************************************************************************************");
			System.out.println("*********************************** NO HAY AVIONES EN ESTADO ABERTO PARA MOSTRAR ***************************************");
			System.out.println("************************************************************************************************************************");
			
			flagSeleccionAvion = false;
			
		}
		
		
	}
	
}
