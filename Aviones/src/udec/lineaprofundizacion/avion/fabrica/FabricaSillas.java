package udec.lineaprofundizacion.avion.fabrica;

import udec.lineaprofundizacion.avion.entidades.Silla;
import udec.lineaprofundizacion.avion.utilitarios.Constantes;

public class FabricaSillas {

	public FabricaSillas() {
		// TODO Auto-generated constructor stub
	}

	public static Silla fabricarSilla(String tipoSilla) {

		switch (tipoSilla) {
		case Constantes.SILLA_PRIMERA_CLASE:
			
			return new Silla(Constantes.SILLA_PRIMERA_CLASE, Constantes.VALOR_SILLA_PRIMERA_CLASE);
			
		case Constantes.SILLA_SEGUNDA_CLASE:
			
			return new Silla(Constantes.SILLA_SEGUNDA_CLASE, Constantes.VALOR_SILLA_SEGUNDA_CLASE);
		
		case Constantes.SILLA_NEGOCIOS_CLASE:
			
			return new Silla(Constantes.SILLA_NEGOCIOS_CLASE, Constantes.VALOR_SILLA_NEGOCIOS_CLASE);
			
		default:
			return null;
		}

	}

}
