package udec.lineaprofundizacion.avion.vista;

import java.util.Iterator;
import java.util.Scanner;

import udec.lineaprofundizacion.avion.dao.AvionDao;
import udec.lineaprofundizacion.avion.utilitarios.Constantes;

public class ReporteVista {
	
	private AvionDao avionDao;
	
	private boolean flagSeleccionAvion = true;
	
	private Scanner scanner;
	
	public ReporteVista() {
		// TODO Auto-generated constructor stub
	}
	
	public void reporteAvion() {
		
		mostrarAviones(false);
		
		while (flagSeleccionAvion) {
			
			try {
				
				scanner = new Scanner(System.in);
				
				System.out.println("************************************************************************************************************************");
				System.out.println("* Seleccione el avion del que desea ver el reporte:                                                                    *");
				System.out.println("************************************************************************************************************************");
				procesarSeleccionReporteAvion(scanner.nextInt());
				
			} catch (Exception e) {
				
				System.out.println("************************************************************************************************************************");
				System.out.println("****************************************** SELECCIONE UNA OPCION VALIDA ************************************************");
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
				
				System.out.println("* " + idAvion + ") Destion    : " + avionDao.listarAviones().get(idAvion).getDestino());
				System.out.println("*    Tipo Avion : " + avionDao.listarAviones().get(idAvion).getTipoAvion());
				
				flagHayAviones = true;
				
			}
			
		}
		
		if (flagHayAviones) {
			
			System.out.println("* 99) Volver A Atras");
			
		} else {
			
			System.out.println("************************************************************************************************************************");
			System.out.println("*********************************** NO HAY AVIONES EN ESTADO CERRADO PARA MOSTRAR **************************************");
			System.out.println("************************************************************************************************************************");
			
			flagSeleccionAvion = false;
			
		}
		
	}
	
	
	private void procesarSeleccionReporteAvion(int idAvion) {
		
		int sumSillasPrimeraClase = 0;
		int sumSillasSegundaClase = 0;
		int sumSillasNegociosClase = 0;
		
		int contSillasPrimeraCLase = 0;
		int contSillasSegundaCLase = 0;
		int contSillasNegociosCLase = 0;
		
		int totalVendido = 0;
		
		avionDao = new AvionDao();
		
		if (idAvion == 99) {
			
			flagSeleccionAvion = false;
			
		} else 	if (avionDao.listarAviones().containsKey(idAvion)) {
			
			for (String idSilla : avionDao.listarAviones().get(idAvion).getMapSillas().keySet()) {
				
				if (avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).getTipo() == Constantes.SILLA_PRIMERA_CLASE && avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).isEstado() == false) {
					
					contSillasPrimeraCLase += 1;
					
					sumSillasPrimeraClase += avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).getValor();
					
				}
				
				if (avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).getTipo() == Constantes.SILLA_SEGUNDA_CLASE && avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).isEstado() == false) {
					
					contSillasSegundaCLase += 1;
					
					sumSillasSegundaClase += avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).getValor();
					
				}
				
				if (avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).getTipo() == Constantes.SILLA_NEGOCIOS_CLASE && avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).isEstado() == false) {
					
					contSillasNegociosCLase += 1;
					
					sumSillasNegociosClase += avionDao.listarAviones().get(idAvion).getMapSillas().get(idSilla).getValor();
					
				}
				
			}
			
			System.out.println("************************************************************************************************************************");
			System.out.println("****************************************** REPORTE VENTAS **************************************************************");
			System.out.println("************************************************************************************************************************");	
			System.out.println("* Id Avion      : " + idAvion);	
			System.out.println("* Destino Acion : " + avionDao.listarAviones().get(idAvion).getDestino());
			
			
			if (avionDao.listarAviones().get(idAvion).getTipoAvion() == Constantes.AVION_GRANDE) {
				
				System.out.println("************************************************************************************************************************");
				System.out.println("* Total Numero de sillas 1 clase vendidas        : " + contSillasPrimeraCLase);
				System.out.println("* Total Valor vendido sillas 1 clase             : " + sumSillasPrimeraClase);
				System.out.println("************************************************************************************************************************");
				System.out.println("* Total Numero de sillas 2 clase vendidas        : " + contSillasSegundaCLase);
				System.out.println("* Total Valor vendido sillas 2 clase             : " + sumSillasSegundaClase);
				System.out.println("************************************************************************************************************************");
				System.out.println("* Total Numero de sillas negocios clase vendidas : " + contSillasNegociosCLase);
				System.out.println("* Total Valor vendido sillas negocios clase      : " + sumSillasNegociosClase);
				System.out.println("************************************************************************************************************************");
				
				totalVendido = sumSillasPrimeraClase + sumSillasSegundaClase + sumSillasNegociosClase;
				
			}
			
			if (avionDao.listarAviones().get(idAvion).getTipoAvion() == Constantes.AVION_MEDIANO) {
				
				System.out.println("************************************************************************************************************************");
				System.out.println("* Total Numero de sillas 1 clase vendidas        : " + contSillasPrimeraCLase);
				System.out.println("* Total Valor vendido sillas 1 clase             : " + sumSillasPrimeraClase);
				System.out.println("************************************************************************************************************************");
				System.out.println("* Total Numero de sillas 2 clase vendidas        : " + contSillasSegundaCLase);
				System.out.println("* Total Valor vendido sillas 2 clase             : " + sumSillasSegundaClase);
				System.out.println("************************************************************************************************************************");
				
				totalVendido = sumSillasPrimeraClase + sumSillasSegundaClase;
				
			}

			if (avionDao.listarAviones().get(idAvion).getTipoAvion() == Constantes.AVION_PEQUEÑO) {
	
				System.out.println("************************************************************************************************************************");
				System.out.println("* Total Numero de sillas 1 clase vendidas        : " + contSillasPrimeraCLase);
				System.out.println("* Total Valor vendido sillas 1 clase             : " + sumSillasPrimeraClase);
				System.out.println("************************************************************************************************************************");
				
				totalVendido = sumSillasPrimeraClase;
				
			}
			
			System.out.println("* Total Valor vendido                            : " + totalVendido);
			System.out.println("************************************************************************************************************************");
			
			flagSeleccionAvion = false;
			
		}else {
			
			System.out.println("************************************************************************************************************************");
			System.out.println("****************************************** SELECCIONE UNA OPCION VALIDA ************************************************");
			System.out.println("************************************************************************************************************************");
			
		}
		
		
		
	}
	
}
