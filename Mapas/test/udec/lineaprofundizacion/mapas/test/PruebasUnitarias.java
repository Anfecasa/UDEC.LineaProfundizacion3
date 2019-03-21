/**
 * 
 */
package udec.lineaprofundizacion.mapas.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import udec.lineaprofundizacion.mapas.vista.MenuPrincipal;

/**
 * Clase de prueba unitarias
 * @author Andres Cadena
 *
 */
public class PruebasUnitarias {
	
	MenuPrincipal menuPrincipal = new MenuPrincipal();
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("**********************************************************");
		System.out.println("**************** INICIO PRUBAS UNITARIAS *****************");
		System.out.println("**********************************************************");

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("**********************************************************");
		System.out.println("****************** FIN PRUBAS UNITARIAS ******************");
		System.out.println("**********************************************************");
		
	}

	@Test
	public void pruebaAbuelo() {
		
		System.out.println("**********************************************************");
		System.out.println("******************** PRUEBA ABUELO ***********************");
		System.out.println("**********************************************************");
		
		int id = 10;
		int idEsperado = 0;
		
		
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.crearObjetos();
		idEsperado = menuPrincipal.imprimirPersona(id);
		
		assertEquals(idEsperado, id);
		
	}
	
	@Test
	public void pruebaPadre() {
		
		System.out.println("**********************************************************");
		System.out.println("********************* PRUEBA PADRE ***********************");
		System.out.println("**********************************************************");
		
		int id = 5;
		int idEsperado = 0;
		
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.crearObjetos();
		idEsperado = menuPrincipal.imprimirPersona(5);
		
		assertEquals(idEsperado, id);
				
	}
	
	@Test
	public void pruebaNieto() {
		
		System.out.println("**********************************************************");
		System.out.println("*********************** PRUEBA NIETO *********************");
		System.out.println("**********************************************************");
		
		int id = 3;
		int idEsperado = 0;
		
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.crearObjetos();
		idEsperado = menuPrincipal.imprimirPersona(3);
		
		assertEquals(idEsperado, id);
		
	}
	
	@Test
	public void pruebaAbueloHijoSinNietos() {
		
		System.out.println("**********************************************************");
		System.out.println("************ PRUEBA ABUELO HIJO SIN NIETOS ***************");
		System.out.println("**********************************************************");
		
		int id = 9;
		int idEsperado = 0;
		
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.crearObjetos();
		idEsperado = menuPrincipal.imprimirPersona(9);
		
		assertEquals(idEsperado, id);
		
	}
		
}
