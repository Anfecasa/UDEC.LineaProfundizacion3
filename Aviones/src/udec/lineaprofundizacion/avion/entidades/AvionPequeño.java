package udec.lineaprofundizacion.avion.entidades;

import udec.lineaprofundizacion.avion.fabrica.FabricaSillas;
import udec.lineaprofundizacion.avion.interfaces.AvionInterface;
import udec.lineaprofundizacion.avion.utilitarios.Constantes;

public class AvionPequeño extends Avion implements AvionInterface{

	public AvionPequeño(String destino, String tipoAvion) {
		
		super(destino, tipoAvion);
		llenarMapSillas();
		
	}

	@Override
	public void imprimir() {
		
		System.out.println("************************************************************************************************************************");
		System.out.println("*                                                         *                                                            *");
		System.out.println("*                                                        **                                                            *");
		System.out.println("*                                                       ***                                                            *");
		System.out.println("*                                                      ****                                                            *");
		System.out.println("*                                                     *****                                                            *");
		System.out.println("*                                                    *********                                                         *");
		System.out.println("*                                                   ***********                                                        *");
		System.out.println("*                                                  ***********                                                         *");
		System.out.println("*                                                 *********                          **                                *");
		System.out.println("*                                                **********                         ***                                *");
		System.out.println("*                                               ***********                        ****                                *");
		System.out.println("*                                    ********************************             *****                                *");
		System.out.println("*                                ****** " + super.colorEstadoSilla("A01") + " ** " + super.colorEstadoSilla("A04") + " ** " + super.colorEstadoSilla("A07") + " ** " + super.colorEstadoSilla("A10") + " ********        ******                                *");
		System.out.println("*                             ***********************************************   ********                               *");
		System.out.println("*                           *********** " + super.colorEstadoSilla("A02") + " ** " + super.colorEstadoSilla("A05") + " ** " + super.colorEstadoSilla("A08") + " ** " + super.colorEstadoSilla("A11") + " ************************                              *");
		System.out.println("*                             ***********************************************   ********                               *");
		System.out.println("*                                ****** " + super.colorEstadoSilla("A03") + " ** " + super.colorEstadoSilla("A06") + " ** " + super.colorEstadoSilla("A09") + " ** " + super.colorEstadoSilla("A12") + " ********        ******                                *");
		System.out.println("*                                    ********************************             *****                                *");
		System.out.println("*                                               ***********                        ****                                *");
		System.out.println("*                                                **********                         ***                                *");
		System.out.println("*                                                 *********                          **                                *");
		System.out.println("*                                                  ***********                                                         *");
		System.out.println("*                                                   ***********                                                        *");
		System.out.println("*                                                    *********                                                         *");
		System.out.println("*                                                     *****                                                            *");
		System.out.println("*                                                      ****                                                            *");
		System.out.println("*                                                       ***                                                            *");
		System.out.println("*                                                        **                                                            *");
		System.out.println("*                                                         *                                                            *");
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
		super.getMapSillas().put("A07", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		super.getMapSillas().put("A08", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		super.getMapSillas().put("A09", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		super.getMapSillas().put("A10", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		super.getMapSillas().put("A11", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		super.getMapSillas().put("A12", FabricaSillas.fabricarSilla(Constantes.SILLA_PRIMERA_CLASE));
		
	}

}
