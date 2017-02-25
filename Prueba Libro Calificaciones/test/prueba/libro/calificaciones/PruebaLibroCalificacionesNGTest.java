/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.libro.calificaciones;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Usuario
 */
public class PruebaLibroCalificacionesNGTest {
    
    public PruebaLibroCalificacionesNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of main method, of class PruebaLibroCalificaciones.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PruebaLibroCalificaciones.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarMensaje method, of class PruebaLibroCalificaciones.
     */
    @Test
    public void testMostrarMensaje() {
        System.out.println("mostrarMensaje");
        PruebaLibroCalificaciones.mostrarMensaje();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
