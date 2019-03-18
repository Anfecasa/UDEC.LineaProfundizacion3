/**
 * 
 */
package udec.lineaprofundizacion.mapas.test;

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
		
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.crearObjetos();
		menuPrincipal.imprimirPersona(10);
		
	}
	
	@Test
	public void pruebaPadre() {
		
		System.out.println("**********************************************************");
		System.out.println("********************* PRUEBA PADRE ***********************");
		System.out.println("**********************************************************");
		
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.crearObjetos();
		menuPrincipal.imprimirPersona(5);
		
	}
	
	@Test
	public void pruebaNieto() {
		
		System.out.println("**********************************************************");
		System.out.println("*********************** PRUEBA NIETO *********************");
		System.out.println("**********************************************************");
		
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.crearObjetos();
		menuPrincipal.imprimirPersona(3);
		
	}
	
}
