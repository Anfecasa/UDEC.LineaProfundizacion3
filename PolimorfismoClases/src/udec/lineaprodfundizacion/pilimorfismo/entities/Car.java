package udec.lineaprodfundizacion.pilimorfismo.entities;
/**
 * clase que representa al objeto Car
 * @author Andres Cadena
 *
 */
public class Car extends PoweredVehicle{
	
	/**
	 * variable que almacena el engineSize
	 */
	
	private int engineSize;
	
	/**
	 * contructor de la clase
	 * @param brand
	 * @param model
	 * @param fuelType
	 * @param engineSize
	 */
	
	public Car(String brand, String model, String fuelType, int engineSize) {
		super(brand, model, fuelType);
		this.engineSize = engineSize;
		
	}
	
	/**
	 * metodo que imprime la variables propias de la clase
	 */
	
	public void printCar() {
		System.out.println(" Engine Size: " + engineSize);
	}
	
	/**
	 * metodo para obtener el valor de la variable engineSize
	 * @return engineSize
	 */

	public int getEngineSize() {
		return engineSize;
	}
	
	/**
	 * metodo para asignarle el valor a la variable engineSize
	 * @param engineSize
	 */
	
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	
}
