package udec.lineaprodfundizacion.pilimorfismo.entities;

public abstract class PoweredVehicle extends Vehicle{
	
	private String fuelType;
	
	public PoweredVehicle(String brand, String model, String fuelType) {
		super(brand, model);
		this.fuelType = fuelType;
	}
	
	public void printPoweredVehicle() {
		System.out.println(" Fuel Type: " + fuelType);
	}
	
	/**
	 * gettesrs y setters de las variables de la clase
	 */
	
	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}	
	
}