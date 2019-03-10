package udec.lineaprodfundizacion.pilimorfismo.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import udec.lineaprodfundizacion.pilimorfismo.entities.Bicycle;
import udec.lineaprodfundizacion.pilimorfismo.entities.Car;
import udec.lineaprodfundizacion.pilimorfismo.entities.Jet;
import udec.lineaprodfundizacion.pilimorfismo.entities.SkateBoard;
import udec.lineaprodfundizacion.pilimorfismo.entities.Vehicle;

public class MenuPrincipal {

	private int flagMenu = 0;
	private Scanner scanner;
	private List<Vehicle> listVehicle;

	public MenuPrincipal() {
		// TODO Auto-generated constructor stub
	}

	public void mostrarMenu() {
		scanner = new Scanner(System.in);
		while (flagMenu == 0) {
			System.out.println("**********************************************************");
			System.out.println("****************** MENU PRINCIPAL*************************");
			System.out.println("**********************************************************");
			System.out.println("* Seleccione una opcion                                  *");
			System.out.println("* 1) Crear lista de objetos                              *");
			System.out.println("* 2) Imprimir lista de objetos                           *");
			System.out.println("* 3) Salir                                               *");
			System.out.println("**********************************************************");
			procesarSeleccion(scanner.next());
		}

	}

	public void procesarSeleccion(String seleccion) {
		switch (seleccion) {
		case "1":
			crearObjetos();
			System.out.println("**********************************************************");
			System.out.println("**************** LISTA DE VEHICULOS CREADA ***************");
			System.out.println("**********************************************************");
			setFlagMenu(0);
			break;
		case "2":
			imprimirObjejetos();
			setFlagMenu(0);
			break;
		case "3":
			setFlagMenu(1);
			break;
		default:
			System.out.println("**********************************************************");
			System.out.println("* Seleccione una opcion valida                           *");
			System.out.println("**********************************************************");
			setFlagMenu(0);
			break;
		}
	}

	public void crearObjetos() {
		listVehicle = new ArrayList<Vehicle>();
		listVehicle.add(new Bicycle("Pinarello", "Dogma F10", 24));
		listVehicle.add(new SkateBoard("Sk8mafia", "4EVA Marshall Heath ", 15));
		listVehicle.add(new Car("Lamborghini", "Aventador", "Extra", 5000));
		listVehicle.add(new Jet("Airbus", "ACJ319 Elegance", "ATF", 2));
	}

	public void imprimirObjejetos() {
		if (listVehicle == null || listVehicle.size() == 0) {
			System.out.println("**********************************************************");
			System.out.println("************* NO HAY VEHICULOS PARA MOSTRAR **************");
			System.out.println("**********************************************************");
		} else {
			for (Vehicle vehicle : listVehicle) {

				System.out.println("**********************************************************");
				if (vehicle instanceof Bicycle) {
					System.out.println("*********************** BICYCLE **************************");
					((Bicycle) vehicle).printVehicle();
					((Bicycle) vehicle).printBicycle();
				}
				if (vehicle instanceof SkateBoard) {
					System.out.println("********************** SKATEBOARD ************************");
					((SkateBoard) vehicle).printVehicle();
					((SkateBoard) vehicle).printSkateBorad();
				}
				if (vehicle instanceof Car) {
					System.out.println("************************* CAR ****************************");
					((Car) vehicle).printVehicle();
					((Car) vehicle).printPoweredVehicle();
					((Car) vehicle).printCar();
				}
				if (vehicle instanceof Jet) {
					System.out.println("************************* JET ***************************");
					((Jet) vehicle).printVehicle();
					((Jet) vehicle).printPoweredVehicle();
					((Jet) vehicle).printJet();
				}
				System.out.println("**********************************************************");

			}

		}

	}

	/**
	 * getters y setters de las variables de la clase
	 */

	public int getFlagMenu() {
		return flagMenu;
	}

	public void setFlagMenu(int flagMenu) {
		this.flagMenu = flagMenu;
	}

}
