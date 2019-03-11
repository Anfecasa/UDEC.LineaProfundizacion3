package udec.lineaprodfundizacion.pilimorfismo.entities;
	
/**
 * clase que representa al objeto bicicleta
 * @author Andres Cadena
 *
 */

public class Bicycle extends Vehicle{
	
	/**
	 * variable gearCoint de la clase
	 */
	
	private int gearCount;
	
	/**
	 * constructor de la clase
	 * @param brand
	 * @param model
	 * @param gearCount
	 */
	
	public Bicycle(String brand, String model, int gearCount) {
		super(brand, model);
		this.gearCount = gearCount;
	}
	
	/**
	 * metodo que imprime las variables propias de la clase
	 */
	
	public void printBicycle() {
		System.out.println(" gearCount: " + gearCount);
	}
		
	/**
	 * metodo para obtener el valor de la variable gearCount
	 * @return gearCount
	 */
	
	public int getGearCount() {
		return gearCount;
	}
	
	/**
	 * metodo que asigna valor a la varoable gearCount
	 * @param gearCount
	 */
	
	public void setGearCount(int gearCount) {
		this.gearCount = gearCount;
	}
	
	
}
