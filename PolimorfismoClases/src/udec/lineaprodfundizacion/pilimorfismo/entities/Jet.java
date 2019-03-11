package udec.lineaprodfundizacion.pilimorfismo.entities;
/**
 * clase que representa al objeto Jet
 * @author Andres Cadena
 *
 */
public class Jet extends PoweredVehicle{
	
	/**
	 * variable que almacena engineCount
	 */
	
	private int engineCount;
	
	/**
	 * contructor de la clase
	 * @param brand
	 * @param model
	 * @param fuelType
	 * @param engineCount
	 */
	
	public Jet(String brand, String model, String fuelType, int engineCount) {
		super(brand, model, fuelType);
		this.engineCount = engineCount;
	}
	
	/**
	 * metodo que imprime las variables propias de la clase
	 */
	
	public void printJet() {
		System.out.println(" Engine Count: " + engineCount);
	}
	
	/**
	 * metodo para obtener el valor de la variable engineCount
	 * @return engineCount
	 */
	
	public int getEngineCount() {
		return engineCount;
	}
	
	/**
	 * metodo que le asigna valor a la varibale engineCount
	 * @param engineCount
	 */
	
	public void setEngineCount(int engineCount) {
		this.engineCount = engineCount;
	}
	
}
