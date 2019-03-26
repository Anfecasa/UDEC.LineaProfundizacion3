package udec.lineaprofundizacion.avion.entidades;

import java.util.HashMap;
import java.util.Map;

import udec.lineaprofundizacion.avion.utilitarios.Constantes;

public abstract class Avion {

	private String destino;
	private String tipoAvion;
	private boolean estado;
	private Map<String, Silla> mapSillas = new HashMap<String, Silla>();
	
	public Avion(String destino,String tipoAvion) {
		this.destino = destino;
		this.tipoAvion = tipoAvion;
		this.estado = true;
	}
	
	public String colorEstadoSilla(String idSilla) {
		
		if (mapSillas.get(idSilla).isEstado()) {
			// estado true = silla disponible = color verde
			return Constantes.ANSI_COLOR_VERDE + idSilla + Constantes.ANSI_COLOR_NEGRO;
		}else {
			// estado false = silla no disponible = color rojo
			return Constantes.ANSI_COLOR_ROJO + idSilla + Constantes.ANSI_COLOR_NEGRO;
		}
		
	}
	
	// setters y getters de las variables de la clase
	
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTipoAvion() {
		return tipoAvion;
	}

	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Map<String, Silla> getMapSillas() {
		return mapSillas;
	}

	public void setMapSillas(Map<String, Silla> mapSillas) {
		this.mapSillas = mapSillas;
	}
	
}
