package udec.lineaprodfundizacion.pilimorfismo.entities;

/**
 * clase abstracta que representa ala objeto Powered Vehicle
 * @author Andres Cadena
 *
 */

public abstract class PoweredVehicle extends Vehicle{
	
	/**
	 * variable que almacena el Fuel Type
	 */
	
	private String fuelType;
	
	/**
	 * constructor de la clase
	 * @param brand
	 * @param model
	 * @param fuelType
	 */
	
	public PoweredVehicle(String brand, String model, String fuelType) {
		super(brand, model);
		this.fuelType = fuelType;
	}
	
	/**
	 * metodo que imprime la variables propias de la clase
	 */
	
	public void printPoweredVehicle() {
		System.out.println(" Fuel Type: " + fuelType);
	}
	
	/**
	 * metodo para obtener la variable fuelType
	 *  @return fuelType
	 */
	
	public String getFuelType() {
		return fuelType;
	}
	
	/**
	 * metodo para asignarle valor a la variable fuelType
	 * @param fuelType
	 */
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}	
	
}