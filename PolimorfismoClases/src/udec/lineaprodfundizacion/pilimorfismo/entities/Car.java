package udec.lineaprodfundizacion.pilimorfismo.entities;

public class Car extends PoweredVehicle{
	
	private int engineSize;
	
	public Car(String brand, String model, String fuelType, int engineSize) {
		super(brand, model, fuelType);
		this.engineSize = engineSize;
		
	}
	
	public void printCar() {
		System.out.println(" Engine Size: " + engineSize);
	}
	
	/**
	 * getters y setters de las varables de la clase
	 */

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	
}
