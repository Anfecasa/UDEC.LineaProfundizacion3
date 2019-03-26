package udec.lineaprofundizacion.avion.vista;

import udec.lineaprofundizacion.avion.dao.AvionDao;
import udec.lineaprofundizacion.avion.fabrica.FabricaAviones;
import udec.lineaprofundizacion.avion.utilitarios.Constantes;

public class AvionVista {
	
	private AvionDao avionDao;
	
	public AvionVista() {
		// TODO Auto-generated constructor stub
	}
	
	public void crearAviones() {
		
		avionDao = new AvionDao();
		
		avionDao.insertarAvion(FabricaAviones.fabricarAvion(Constantes.AVION_GRANDE));
		avionDao.insertarAvion(FabricaAviones.fabricarAvion(Constantes.AVION_MEDIANO));
		avionDao.insertarAvion(FabricaAviones.fabricarAvion(Constantes.AVION_PEQUEÑO));
		
		System.out.println("************************************************************************************************************************");
		System.out.println("*********************************************** AVIONES CREADOS CON EXITO **********************************************");
		System.out.println("************************************************************************************************************************");
		
	}
	
	
}
