package udec.lineaprofundizacion.mapas.vista;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import udec.lineaprofundizacion.mapas.entidades.Persona;
/**
 * clase que muestra el menu y procesa la informacion
 * @author Andres Cadena
 *
 */
public class MenuPrincipal {
	
	/**
	 * Flag que indica si se muestra o no el menu
	 */
	
	private boolean flagMenu = true;
	
	/**
	 * objeto que permite leer la entrada por teclado
	 */
	
	private Scanner scanner;
	
	/**
	 * mapa que contiene lo objetos persona
	 */
	
	private Map<Integer, Persona> mapAbuelos;
	
	/**
	 * cosntructor de la clase
	 */
	
	public MenuPrincipal() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * metodo que muestra el menu 
	 */
	
	public void mostrarMenu() {
		while (flagMenu) {
			scanner = new Scanner(System.in);
			System.out.println("**********************************************************");
			System.out.println("****************** MENU PRINCIPAL ************************");
			System.out.println("**********************************************************");
			System.out.println("* Seleccione una opcion                                  *");
			System.out.println("* 1) Crear Personas                                      *");
			System.out.println("* 2) Buscar Persona                                      *");
			System.out.println("* 3) Salir                                               *");
			System.out.println("**********************************************************");
			procesarSeleccion(scanner.next());
		}
	}
	
	/**
	 * metodo que proicesa la opcion del menu
	 * @param seleccion
	 */
	
	private void procesarSeleccion(String seleccion) {

		boolean flagDigite = true;

		switch (seleccion) {

		case "1":

			crearObjetos();
			System.out.println("**********************************************************");
			System.out.println("****************** OBJETOS CREADOS ***********************");
			System.out.println("**********************************************************");
			flagMenu = true;
			break;

		case "2":
			if (!(mapAbuelos == null)) {
				
				while (flagDigite) {

					scanner = new Scanner(System.in);

					try {

						System.out.println("**********************************************************");
						System.out.println("* Dijite el id de la persona a buscar                    *");
						System.out.println("**********************************************************");

						int id = scanner.nextInt();

						if (buscarPersona(id)) {

							imprimirPersona(id);

						} else {

							System.out.println("**********************************************************");
							System.out.println("* NO SE ENCONTRARON PERSONAR CON EL ID : " + id);
							System.out.println("**********************************************************");

						}

						flagDigite = false;

					} catch (Exception e) {

						System.out.println("**********************************************************");
						System.err.println("* !!!!!!!!!!!!! ERROR SOLO DIGITE NUMEROS !!!!!!!!!!!!!! *");
						System.out.println("**********************************************************");

					}

				}
				
			} else {
				
				System.out.println("**********************************************************");
				System.err.println("* !ERROR NO HAY OBJETOS CREADOS, POR FAVOR CRELOS ANTES! *");
				System.out.println("**********************************************************");
				
			}
			
			flagMenu = true;
			break;

		case "3":

			System.out.println("**********************************************************");
			System.out.println("****************** FIN DE LA APLICACION ******************");
			System.out.println("**********************************************************");
			flagMenu = false;
			break;

		default:

			System.out.println("**********************************************************");
			System.out.println("************* SELECCIONES UNA OPCION VALIDA **************");
			System.out.println("**********************************************************");
			flagMenu = true;
			break;

		}

	}
	
	/**
	 * metodo que crea los objetos persona y lo guarda en los map
	 */
	
	private void crearObjetos() {
		
		// padre 1
		Persona personaPadre1 = new Persona(1, "Andres");
		// hijos padre 1
		personaPadre1.getMapFamilia().put(2, new Persona(2, "Juan"));
		personaPadre1.getMapFamilia().put(3, new Persona(3, "Carlos"));
		personaPadre1.getMapFamilia().put(4, new Persona(4, "Pedro"));
		
		// padres 2
		Persona personaPadre2 = new Persona(5, "Rodrigo");
		// hijos padre 2
		personaPadre2.getMapFamilia().put(6, new Persona(6, "Gabriel"));
		personaPadre2.getMapFamilia().put(7, new Persona(7, "Oscar"));
		
		//padre 3 (no tiene hijos)			
		Persona personaPadre3 = new Persona(8, "Esteban");
		
		//abuelo 1
		Persona personaAbuelo1 = new Persona(9, "Rafael");
		
		personaAbuelo1.getMapFamilia().put(8, personaPadre3);
		personaAbuelo1.getMapFamilia().put(1, personaPadre1);
		
		//abuelo 2
		Persona personaAbuelo2 = new Persona(10, "Gustavo");
	
		personaAbuelo2.getMapFamilia().put(5, personaPadre2);
		
		//map personas
		
		mapAbuelos = new HashMap<Integer, Persona>();

		mapAbuelos.put(10, personaAbuelo2);
		mapAbuelos.put(9, personaAbuelo1);

	}
	
	/**
	 * metodo que busca a la persona en el map e indica si se encuentra o no 
	 * @param id
	 * @return true (Si esta) false (No esta)
	 */
	
	private boolean buscarPersona(int id) {

		boolean flagEncontro = false;

		if (mapAbuelos.containsKey(id)) {

			flagEncontro = true;

		} else {

			for (Integer idAbuelo : mapAbuelos.keySet()) {

				if (mapAbuelos.get(idAbuelo).getMapFamilia().containsKey(id)) {

					flagEncontro = true;

				} else {

					for (Integer idHijo : mapAbuelos.get(idAbuelo).getMapFamilia().keySet()) {

						if (mapAbuelos.get(idAbuelo).getMapFamilia().get(idHijo).getMapFamilia().containsKey(id)) {

							flagEncontro = true;
						}

					}

				}

			}

		}

		return flagEncontro;

	}
	
	/**
	 * metodo que imprime la persona segun el id
	 * @param id
	 */
	
	private void imprimirPersona(int id) {

		if (mapAbuelos.containsKey(id)) {

			System.out.println("**********************************************************");
			System.out.println("* Se encontro a la persona con el id :" + id);
			System.out.println("* Nombre de la Persona : " + mapAbuelos.get(id).getNombre());
			
			System.out.println("*--------------------------------------------------------*");
			
			System.out.println("* Tiene los siguientes hijos : ");

			imprimirMapAbuelo(mapAbuelos.get(id).getMapFamilia());

			System.out.println("**********************************************************");

		} else {

			for (Integer idAbuelo : mapAbuelos.keySet()) {

				if (mapAbuelos.get(idAbuelo).getMapFamilia().containsKey(id)) {

					System.out.println("**********************************************************");

					System.out.println("* Se encontro a la persona con el id :" + id);
					System.out.println("* Nombre de la persona : " + mapAbuelos.get(idAbuelo).getMapFamilia().get(id).getNombre());
					
					System.out.println("*--------------------------------------------------------*");
					
					System.out.println("* Es Hijo de : ");

					System.out.println("* Id del Padre     : " + mapAbuelos.get(idAbuelo).getId());
					System.out.println("* Nombre del Padre : " + mapAbuelos.get(idAbuelo).getNombre());
					
					System.out.println("*--------------------------------------------------------*");
					
					System.out.println("* Tiene los siguientes hijos : ");

					imprimirMapPadre(mapAbuelos.get(idAbuelo).getMapFamilia().get(id).getMapFamilia());

				} else {

					for (Integer idHijo : mapAbuelos.get(idAbuelo).getMapFamilia().keySet()) {

						if (mapAbuelos.get(idAbuelo).getMapFamilia().get(idHijo).getMapFamilia().containsKey(id)) {

							System.out.println("* Se encontro a la persona con el id :" + id);
							System.out.println("* Nombre de la persona : " + mapAbuelos.get(idAbuelo).getMapFamilia().get(idHijo)
									.getMapFamilia().get(id).getNombre());

							System.out.println("* Es Hijo de : ");

							System.out.println("* Id del Padre     : "
									+ mapAbuelos.get(idAbuelo).getMapFamilia().get(idHijo).getId());
							System.out.println("* Nombre del Padre : "
									+ mapAbuelos.get(idAbuelo).getMapFamilia().get(idHijo).getNombre());

							System.out.println("* Es Nieto de : ");

							System.out.println("* Id del Abuelo     : " + mapAbuelos.get(idAbuelo).getId());
							System.out.println("* Nombre del Abuelo : " + mapAbuelos.get(idAbuelo).getNombre());

						}

					}

				}

			}

		}

	}
	
	/**
	 * metodo que imprime el map el una persona abuelo
	 * @param mapPersonas
	 */
	
	private void imprimirMapAbuelo(Map<Integer, Persona> mapPersonas) {
		
		if (!mapPersonas.isEmpty()) {
			
			for (Integer id : mapPersonas.keySet()) {

				System.out.println("* Id del Hijo     : " + mapPersonas.get(id).getId());
				System.out.println("* Nombre del Hijo : " + mapPersonas.get(id).getNombre());
				
				System.out.println("*--------------------------------------------------------*");
				
				System.out.println("* los nietos del hijo " + mapPersonas.get(id).getNombre() + " son :");

				imprimirMapPadreAbuelo(mapPersonas.get(id).getMapFamilia());

			}
			
		} else {
			
			System.out.println("* No tiene Hijos ");
			
		}
		

	}
	
	/**
	 * metodo que imprime los nietos de una persona abuelo
	 * @param mapPersonas
	 */
	
	public void imprimirMapPadreAbuelo(Map<Integer, Persona> mapPersonas) {
		
		if (!mapPersonas.isEmpty()) {
			
			for (Integer id : mapPersonas.keySet()) {

				System.out.println("* Id del Nieto     : " + mapPersonas.get(id).getId());
				System.out.println("* Nombre del Nieto : " + mapPersonas.get(id).getNombre());

			}
			
		} else {
			
			System.out.println("* No tiene hijos ");
			
		}

	}
	
	/**
	 * metodo que imprime los hijos de una persona padre
	 * @param mapPersonas
	 */
	
	public void imprimirMapPadre(Map<Integer, Persona> mapPersonas) {
		
		if (!mapPersonas.isEmpty()) {
			
			for (Integer id : mapPersonas.keySet()) {

				System.out.println("* Id del Hijo     : " + mapPersonas.get(id).getId());
				System.out.println("* Nombre del Hijo : " + mapPersonas.get(id).getNombre());

			}
			
		} else {
			
			System.out.println("* No tiene Nietos ");
			
		}

	}

}
