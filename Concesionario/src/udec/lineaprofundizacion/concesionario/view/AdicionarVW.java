package udec.lineaprofundizacion.concesionario.view;

import udec.lineaprofundizacion.concesionario.core.AdicionarCR;
import udec.lineaprofundizacion.concesionario.entities.CargaETT;
import udec.lineaprofundizacion.concesionario.entities.DeportivoETT;
import udec.lineaprofundizacion.concesionario.entities.VehiculoETT;
import udec.lineaprofundizacion.concesionario.facade.FacadeVW;
import udec.lineaprofundizacion.concesionario.factory.VehiculoFTY;
import udec.lineaprofundizacion.concesionario.utils.Constantes;
/**
 * 
 * @author Andres Cadena
 * @since 03/03/2019
 * 
 * Clase que hace de vista para adicionar vehiculos al inventario
 */
public class AdicionarVW extends BaseVW implements FacadeVW {

	private VehiculoETT vehiculoETT;
	private AdicionarCR adicionarCR;
	private int cantidad;
	
	/**
	 * constructor de la clase
	 */
	
	public AdicionarVW() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarMenu() {
		while (super.getFlagMenu() == 0) {
			System.out.println("**************************************************************");
			System.out.println("****************** ADICIONAR INVENARIO LDP2 ******************");
			System.out.println("**************************************************************");
			System.out.println("* Seleccione el tipo de vehiculo que desea agregar           *");
			System.out.println("* 1) Deportivos                                              *");
			System.out.println("* 2) Estandar                                                *");
			System.out.println("* 3) Carga                                                   *");
			System.out.println("* 4) Personaliza                                             *");
			System.out.println("* 5) Volver al menu anterior                                 *");
			System.out.println("**************************************************************");
			super.setSeleccionMenu(super.getScanner().next());
			procesarSeleccion(super.getSeleccionMenu());
			Constantes.limpiarPantalla();
		}		
	}

	@Override
	public void procesarSeleccion(String seleccion) {

		switch (seleccion) {
		case "1": //deportivo
			vehiculoETT = VehiculoFTY.obtenerVehiculo(Integer.parseInt(seleccion));
			pedirDatosGenerales(vehiculoETT);
			pedirColor(vehiculoETT);
			pedirDatosDeportivo((DeportivoETT)vehiculoETT);
			crearVehiculos(vehiculoETT);
			setFlagMenu(0);
			break;
		case "2": //estandar
			vehiculoETT = VehiculoFTY.obtenerVehiculo(Integer.parseInt(seleccion));
			pedirDatosGenerales(vehiculoETT);
			pedirColor(vehiculoETT);
			crearVehiculos(vehiculoETT);
			setFlagMenu(0);
			break;
		case "3": //carga
			vehiculoETT = VehiculoFTY.obtenerVehiculo(Integer.parseInt(seleccion));
			pedirDatosGenerales(vehiculoETT);
			pedirColor(vehiculoETT);
			pedirDatosCarga((CargaETT)vehiculoETT);
			crearVehiculos(vehiculoETT);
			setFlagMenu(0);
			break;
		case "4": //personalizado
			vehiculoETT = VehiculoFTY.obtenerVehiculo(Integer.parseInt(seleccion));
			pedirDatosGenerales(vehiculoETT);
			crearVehiculos(vehiculoETT);
			setFlagMenu(0);
			break;
		case "5": // volver
			setFlagMenu(1);
			break;
		default:
			System.out.println("ELIJA UNA OPCIN VALIDA");
			setFlagMenu(0);
			break;
		}
		
	}
	
	/**
	 * metodo que pide los datos para crear el vahiculo
	 * @param vehiculo
	 */
	
	private void pedirDatosGenerales(VehiculoETT vehiculo) {
		System.out.println("* Digite el modelo del vehiculo:                             *");
		vehiculo.setModelo(super.getScanner().next());
		System.out.println("* Digite la marca del vehiculo:                              *");
		vehiculo.setMarca(super.getScanner().next());
		System.out.println("* Digite el numero de llantas del vehiculo:                  *");
		vehiculo.setNumeroLLantas(super.getScanner().nextInt());
		System.out.println("* Digite el numero de asientos del vehiculo:                 *");
		vehiculo.setNumeroAsientos(super.getScanner().nextInt());
		System.out.println("* Digite el valor del vehiculo:                              *");
		vehiculo.setValor(super.getScanner().nextInt());		
	}
	
	/**
	 * metodo que pide el color de vehiculo
	 * @param vehiculo
	 */
	
	private void pedirColor(VehiculoETT vehiculo) {
		System.out.println("* Digite el color del vehiculo:                              *");
		vehiculo.setColor(super.getScanner().next());
	}
	
	/**
	 * metodo que pide los dato del vahiculo tipo carga
	 * @param vehiculoCarga
	 */
	
	private void pedirDatosCarga(CargaETT vehiculoCarga) {
		System.out.println("* Digite la capacidad de carga del vahiculo:                 *");
		vehiculoCarga.setCapacidadCarga((super.getScanner().nextInt()));
	}
	
	/**
	 * metodo que pide los datos del vehiculo tipo deportivo
	 * @param vaehiculoDeportivo
	 */
	
	private void pedirDatosDeportivo(DeportivoETT vaehiculoDeportivo) {
		System.out.println("* Digite 0 = Convertible 1 = No Convertible                  *");
		vaehiculoDeportivo.setConvertible((super.getScanner().nextInt()));
	}
	
	/**
	 * metodo que pide la cantida de vehiculos a crear y hace uso de crearVehiculo para crear
	 * los vehiculos
	 * @param vehiculo
	 */
	
	private void crearVehiculos(VehiculoETT vehiculo) {
		System.out.println("**************************************************************");
		System.out.println("* Digite la cantidad de vehiculos a crear:                   *");
		cantidad=super.getScanner().nextInt();
		adicionarCR = new AdicionarCR();
		adicionarCR.crearVehiculo(vehiculoETT, cantidad);
	}
	
}
