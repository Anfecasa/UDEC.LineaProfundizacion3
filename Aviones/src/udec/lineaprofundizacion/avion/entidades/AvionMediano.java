package udec.lineaprofundizacion.avion.entidades;

import udec.lineaprofundizacion.avion.fabrica.FabricaSillas;
import udec.lineaprofundizacion.avion.interfaces.AvionInterface;
import udec.lineaprofundizacion.avion.utilitarios.Constantes;

public class AvionMediano extends Avion implements AvionInterface{

	public AvionMediano(String destino, String tipoAvion) {
		super(destino, tipoAvion);
		llenarMapSillas();
	}
	
	@Override
	public void imprimir() {
		
		System.out.println("************************************************************************************************************************");
		System.out.println("*                                                       *                                                              *");
		System.out.println("*                                                      **                                                              *");
		System.out.println("*                                                     ***                                                              *");
		System.out.println("*                                                    ****                                                              *");
		System.out.println("*                                                   *****                                                              *");
		System.out.println("*                                                  *********                                                           *");
		System.out.println("*                                                 ***********                                                          *");
		System.out.println("*                                                ***********                                                           *");
		System.out.println("*                                               *********                                       **                     *");
		System.out.println("*                                              **********                                     ****                     *");
		System.out.println("*                                             ***********                                   ******                     *");
		System.out.println("*                          *************************************************              ********                     *");
		System.out.println("*                      ****** " + super.colorEstadoSilla("A01") + " ** " + super.colorEstadoSilla("A04") + " ***** " + super.colorEstadoSilla("B01") + " ** " + super.colorEstadoSilla("B04") + " ** " + super.colorEstadoSilla("B07") + " ** " + super.colorEstadoSilla("B10") + " ********        **********                     *");
		System.out.println("*                   ****************************************************************   *************                   *");
		System.out.println("*                 *********** " + super.colorEstadoSilla("A02") + " ** " + super.colorEstadoSilla("A05") + " ***** " + super.colorEstadoSilla("B02") + " ** " + super.colorEstadoSilla("B05") + " ** " + super.colorEstadoSilla("B08") + " ** " + super.colorEstadoSilla("B11") + " *****************************                  *");
		System.out.println("*                   ****************************************************************   *************                   *");
		System.out.println("*                      ****** " + super.colorEstadoSilla("A03") + " ** " + super.colorEstadoSilla("A06") + " ***** " + super.colorEstadoSilla("B03") + " ** " + super.colorEstadoSilla("B06") + " ** " + super.colorEstadoSilla("B09") + " ** " + super.colorEstadoSilla("B12") + " ********        **********                     *");
		System.out.println("*                          *************************************************              ********                     *");
		System.out.println("*                                             ***********                                   ******                     *");
		System.out.println("*                                              **********                                     ****                     *");
		System.out.println("*                                               *********                                       **                     *");
		System.out.println("*                                                ***********                                                           *");
		System.out.println("*                                                 ***********                                                          *");
		System.out.println("*                                                  *********                                                           *");
		System.out.println("*                                                   *****                                                              *");
		System.out.println("*                                                    ****                                                              *");
		System.out.println("*                                                     ***                                                              *");
		System.out.println("*                                                      **                                                              *");
		System.out.println("*                                                       *                                                              *");
		System.out.println("************************************************************************************************************************");
		
	}

	@Override
	public void llenarMapSillas() {

		super.getMapSillas().put("A01", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		super.getMapSillas().put("A02", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		super.getMapSillas().put("A03", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		super.getMapSillas().put("A04", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		super.getMapSillas().put("A05", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		super.getMapSillas().put("A06", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		super.getMapSillas().put("B01", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		super.getMapSillas().put("B02", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		super.getMapSillas().put("B03", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		super.getMapSillas().put("B04", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		super.getMapSillas().put("B05", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		super.getMapSillas().put("B06", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		super.getMapSillas().put("B07", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		super.getMapSillas().put("B08", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		super.getMapSillas().put("B09", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		super.getMapSillas().put("B10", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		super.getMapSillas().put("B11", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		super.getMapSillas().put("B12", FabricaSillas.fabricarSilla(Constantes.SILLA_SEGUNDA_CLASE));
		
	}

}
