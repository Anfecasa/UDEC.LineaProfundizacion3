/**
 * 
 */
package udec.lineaprofundizacion.concesionario.entities;

/**
 * @author Andres Cadena
 * @since 03/03/2019
 * calse padre que representa alos objetos vehiculos
 */
public abstract class VehiculoETT {

	private String modelo;
	private String marca;
	private int tipo;
	private int numeroLLantas;
	private int numeroAsientos;
	private int valor;
	private String color;	
	
	/**
	 * constructor de la clase
	 */
	
	public VehiculoETT() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * metodos set y get para las variables del la clase
	 */
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getNumeroLLantas() {
		return numeroLLantas;
	}

	public void setNumeroLLantas(int numeroLLantas) {
		this.numeroLLantas = numeroLLantas;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
