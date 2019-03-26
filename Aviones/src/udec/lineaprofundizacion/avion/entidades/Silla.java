package udec.lineaprofundizacion.avion.entidades;

public class Silla {
	
	private String tipo;
	private int valor;
	private boolean estado;
	private Persona persona;
	
	public Silla(String tipo,int valor) {
		this.tipo = tipo;
		this.valor = valor;
		this.estado = true;
	}
	
	// getters y setters
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
