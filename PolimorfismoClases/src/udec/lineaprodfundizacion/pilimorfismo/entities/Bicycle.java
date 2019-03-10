package udec.lineaprodfundizacion.pilimorfismo.entities;

public class Bicycle extends Vehicle{
	
	private int gearCount;
	
	public Bicycle(String brand, String model, int gearCount) {
		super(brand, model);
		this.gearCount = gearCount;
	}
	
	public void printBicycle() {
		System.out.println(" gearCount: " + gearCount);
	}
		
	/**
	 * getters y setters de las variables de la clase
	 */
	
	public int getGearCount() {
		return gearCount;
	}

	public void setGearCount(int gearCount) {
		this.gearCount = gearCount;
	}
	
	
}
