package udec.lineaprofundizacion.avion.vista;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Scanner;

import udec.lineaprofundizacion.avion.dao.AvionDao;
import udec.lineaprofundizacion.avion.entidades.AvionGrande;
import udec.lineaprofundizacion.avion.entidades.AvionMediano;
import udec.lineaprofundizacion.avion.entidades.AvionPequeño;
import udec.lineaprofundizacion.avion.entidades.Persona;

public class TiqueteVista {
	
	private Scanner scanner;
	private boolean flagSeleccionAvion = true;
	private boolean flagSeleccionSilla = true;
	private AvionDao avionDao;
	
	public TiqueteVista() {
		// TODO Auto-generated constructor stub
	}
	
	public void comprarTiquete() {
		
		mostrarAviones(true);
		
		while (flagSeleccionAvion) {
			
			try {
				
				scanner = new Scanner(System.in);
				
				System.out.println("************************************************************************************************************************");
				System.out.println("* Seleccione el avion que desea ver:                                                                                   *");
				System.out.println("************************************************************************************************************************");
				
				procesarSeleccionCompraTiquete(scanner.nextInt());
				
			} catch (Exception e) {
				
				System.out.println("************************************************************************************************************************");
				System.out.println("**************************************** SELECCIONE UNA OPCION VALIDA **************************************************");
				System.out.println("************************************************************************************************************************");
			
			}
			
			
			
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
				
				System.out.println("*  " + idAvion + ") Destion    : " + avionDao.listarAviones().get(idAvion).getDestino());
				System.out.println("*     Tipo Avion : " + avionDao.listarAviones().get(idAvion).getTipoAvion());
				
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
	
	private void procesarSeleccionCompraTiquete(int idAvionSeleccionado) {
		
		avionDao = new AvionDao();
		
		if (idAvionSeleccionado == 99) {
			
			flagSeleccionAvion = false;
			
		}else if (avionDao.listarAviones().containsKey(idAvionSeleccionado)) {
			
			mostrarAvionSelecionado(idAvionSeleccionado);
			
			reservarSilla(idAvionSeleccionado);			
			
			flagSeleccionAvion = false;
			
		}else {
			
			System.out.println("************************************************************************************************************************");
			System.out.println("***************************************** SELECCIONE UNA OPCION VALIDA *************************************************");
			System.out.println("************************************************************************************************************************");
			
		}
		
	}
	
	private void mostrarAvionSelecionado(int idAvionSeleccionado) {
		
		avionDao = new AvionDao();
		
		Iterator<Integer> iterator = avionDao.listarAviones().keySet().iterator();
		
		while(iterator.hasNext()){
			
			Integer idAvion = iterator.next();
			
			if (idAvion == idAvionSeleccionado) {
				
				if (avionDao.listarAviones().get(idAvion) instanceof AvionGrande) {
					
					((AvionGrande)avionDao.listarAviones().get(idAvion)).imprimir();
					
				}
				if (avionDao.listarAviones().get(idAvion) instanceof AvionMediano) {
					
					((AvionMediano)avionDao.listarAviones().get(idAvion)).imprimir();
					
				}
				if (avionDao.listarAviones().get(idAvion) instanceof AvionPequeño) {
	
					((AvionPequeño)avionDao.listarAviones().get(idAvion)).imprimir();
	
				}
				
			}
			
		  
		}
		
	}
	
	private void reservarSilla(int idAvion) {
		
		scanner = new Scanner(System.in);
		
		while (flagSeleccionSilla) {
			
			System.out.println("************************************************************************************************************************");
			System.out.println("* Seleccione la silla que desea reservar:                                                                              *");
			System.out.println("************************************************************************************************************************");
			procesarSillaSeleccionada(scanner.next().toUpperCase(),idAvion);
			
		}
		
		
	}
	
	private void procesarSillaSeleccionada(String idSilla, int idAvion) {
		
		avionDao = new AvionDao();
		
		if (avionDao.listarAviones().get(idAvion).getMapSillas().containsKey(idSilla) && avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).isEstado()) {
			
			avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).setPersona(pedirDatosPersona());
			avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).setEstado(false);
			
			System.out.println("************************************************************************************************************************");
			System.out.println("******************************************* SILLA RESERVADA CON EXITO **************************************************");
			System.out.println("************************************************************************************************************************");
			
			flagSeleccionSilla = false;
			
		}else if (avionDao.listarAviones().get(idAvion).getMapSillas().containsKey(idSilla) && avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).isEstado() == false) {
			
			System.out.println("************************************************************************************************************************");
			System.out.println("************************** SILLA YA SE ENCUENTRA OCUPADA POR FAVOR SELECCIONE OTRA SILLA *******************************");
			System.out.println("************************************************************************************************************************");
			
		}else {
			
			System.out.println("************************************************************************************************************************");
			System.out.println("******************************************* SELECCIONE UNA SILLA VALIDA ************************************************");
			System.out.println("************************************************************************************************************************");
			
		}
		
	}
	
	private Persona pedirDatosPersona() {
		
		Persona persona = new Persona();
		
		boolean flagValidacion;
		
		
		
		System.out.println("************************************************************************************************************************");
		
		flagValidacion = true;
		while (flagValidacion) {
			
			try {
				
				scanner = new Scanner(System.in);
				
				System.out.println("* Digite el id de la persona                                                                                           *");
				persona.setId(scanner.nextInt());
				
				flagValidacion = false;
				
			} catch (Exception e) {
				
				System.out.println("************************************************************************************************************************");
				System.out.println("******************************************* DIGITE SOLO VALORES NUMERICOS **********************************************");
				System.out.println("************************************************************************************************************************");
				
			}
			
		}
		
		scanner = new Scanner(System.in);
		
		System.out.println("* Digite el Nombre de la persona                                                                                       *");
		persona.setNombre(scanner.next());
		
		
		
		flagValidacion = true;
		while (flagValidacion) {
			
			try {
				
				scanner = new Scanner(System.in);
				
				System.out.println("* Digite la fecha de naciminmeto de la persona (DD/MM/YYYY)                                                            *");
				
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
				
				persona.setFechaNacimiento(simpleDateFormat.parse(scanner.next()));
				
				flagValidacion = false;
				
			} catch (Exception e) {
				
				System.out.println("************************************************************************************************************************");
				System.out.println("************************************** DIGITE LA FECHA EN EL FORMATO CORRECTO ******************************************");
				System.out.println("************************************************************************************************************************");
						
			}
			
		}
		System.out.println("************************************************************************************************************************");

		return persona;
	}
	
}
