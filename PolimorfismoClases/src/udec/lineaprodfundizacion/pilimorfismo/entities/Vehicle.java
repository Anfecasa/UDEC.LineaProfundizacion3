package udec.lineaprodfundizacion.pilimorfismo.entities;

/**
 * clase que representa al objeto Vehiculo
 * @author Andres Cadena
 *
 */

public abstract class Vehicle {
	
	/**
	 * variable que almacen el Brand
	 */
	
	private String brand;
	
	/**
	 * variable que almacena el Model
	 */
	
	private String model;
	
	/**
	 * constructor de la clase 
	 * @param brand
	 * @param model
	 */
	
	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	/**
	 * metodo que imprime las variables propias de la clase
	 */
	
	public void printVehicle() {
		System.out.println(" Brand: " + brand);
		System.out.println(" Model: " + model);
	}
	
	/**
	 * metodo para obtener el valor de la variable brand
	 * @return brand
	 */
	
	public String getBrand() {
		return brand;
	}
	
	/**
	 * metodo para asiganr valor a la variable brand
	 * @param brand
	 */
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * metodo para obtener el valor de la variable Model
	 * @return Model
	 */
	
	public String getModel() {
		return model;
	}

	/**
	 * metodo para asiganr el valor a la variable Model
	 * @param model
	 */
	
	public void setModel(String model) {
		this.model = model;
	}
	
}
