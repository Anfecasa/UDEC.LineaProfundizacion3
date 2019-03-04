/**
 * 
 */
package udec.lineaprofundizacion.concesionario.factory;

import udec.lineaprofundizacion.concesionario.entities.CargaETT;
import udec.lineaprofundizacion.concesionario.entities.DeportivoETT;
import udec.lineaprofundizacion.concesionario.entities.EstandarETT;
import udec.lineaprofundizacion.concesionario.entities.PersonalizadoETT;
import udec.lineaprofundizacion.concesionario.entities.VehiculoETT;

/**
 * @author Andres Cadena
 * @since 03/03/2019
 * clase con el patron factory para crear los objetos vehiculo
 */
public class VehiculoFTY {
	
	/**
	 * constructor de la clase
	 * @param tipo - tipo de vehiculo a crear
	 * @return objetoVehiculo - objeto que creo la clase segun el tipo
	 */
	public static VehiculoETT obtenerVehiculo (int tipo) {
		
		switch (tipo) {
		case 1: //deportivo
			return new DeportivoETT();
		case 2: //estandar
			return new EstandarETT();
		case 3: //carga
			return new CargaETT();
		case 4: //personalizado
			return new PersonalizadoETT();
		default:
			return null;
		}		
		
	}
	
}
