package udec.lineaprofundizacion.avion.fabrica;

import udec.lineaprofundizacion.avion.entidades.Avion;
import udec.lineaprofundizacion.avion.entidades.AvionGrande;
import udec.lineaprofundizacion.avion.entidades.AvionMediano;
import udec.lineaprofundizacion.avion.entidades.AvionPequeño;
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
			
		case Constantes.AVION_PEQUEÑO:

			return new AvionPequeño("Honduras", tipoAvion);
			
		default:
			return null;
		}		

	}

}
