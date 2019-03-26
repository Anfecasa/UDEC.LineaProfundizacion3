package udec.lineaprofundizacion.avion.dao;

import java.util.Map;

import udec.lineaprofundizacion.avion.datos.Datos;
import udec.lineaprofundizacion.avion.entidades.Avion;

public class AvionDao {

	public AvionDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void insertarAvion(Avion avion) {
		
		Datos.mapAviones.put(Datos.mapAviones.size() + 1, avion);
		
	}
	
	public Map<Integer, Avion> listarAviones() {
		
		return Datos.mapAviones;
				
	}
}
