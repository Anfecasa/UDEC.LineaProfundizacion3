package udec.lineaprofundizacion.concesionario.facade;
/**
 * 
 * @author Andres Cadena
 * @since 03/03/2019
 * interface contiene los metodos de las vistas de la aplicacion
 */
public interface FacadeVW {
	/**
	 * metodo que muestra el menu de la vista
	 */
	void mostrarMenu();
	/**
	 * metodo que procesa la seleccion del menu de la vista
	 * @param seleccion
	 */
	void procesarSeleccion(String seleccion);
}
//