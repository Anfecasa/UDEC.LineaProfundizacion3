package udec.lineaprofundizacion.avion.fabrica;

import udec.lineaprofundizacion.avion.entidades.Avion;
import udec.lineaprofundizacion.avion.entidades.AvionGrande;
import udec.lineaprofundizacion.avion.entidades.AvionMediano;
import udec.lineaprofundizacion.avion.entidades.AvionPeque�o;
import udec.lineaprofundizacion.avion.utilitarios.Constantes;

public class FabricaAviones {

	public FabricaAviones() {
		// TODO Auto-generated constructor stub
	}

	public static Avion fabricarAvion(String tipoAvion) {

		switch (tipoAvion) {
		case Constantes.AVION_GRANDE:

			return new AvionGrande("Panama", tipoAvion);

		case Constantes.AVION_MEDIANO:

			return new AvionMediano("Costa Rica", tipoAvion);
			
		case Constantes.AVION_PEQUE�O:

			return new AvionPeque�o("Honduras", tipoAvion);
			
		default:
			return null;
		}		

	}

}
