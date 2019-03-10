package udec.lineaprodfundizacion.pilimorfismo.entities;

public abstract class Vehicle {
	
	private String brand;
	private String model;
	
	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public void printVehicle() {
		System.out.println(" Brand: " + brand);
		System.out.println(" Model: " + model);
	}
	
	/**
	 * getters y setters de las variables del la clase 
	 */
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
