package udec.lineaprodfundizacion.pilimorfismo.entities;

public class Jet extends PoweredVehicle{
	
	private int engineCount;
	
	public Jet(String brand, String model, String fuelType, int engineCount) {
		super(brand, model, fuelType);
		this.engineCount = engineCount;
	}
	
	public void printJet() {
		System.out.println(" Engine Count: " + engineCount);
	}
	
	/**
	 * getters y setters de las variables de la clase
	 */
	
	public int getEngineCount() {
		return engineCount;
	}

	public void setEngineCount(int engineCount) {
		this.engineCount = engineCount;
	}
	
}
