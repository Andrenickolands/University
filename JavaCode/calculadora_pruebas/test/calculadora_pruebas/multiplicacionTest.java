/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora_pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolás
 */
public class multiplicacionTest {
    
    public multiplicacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMultiplicacion method, of class multiplicacion.
     */
    @Test
    public void testGetMultiplicacion() {
        System.out.println("getMultiplicacion");
        double a = 0.0;
        double b = 0.0;
        multiplicacion instance = new multiplicacion();
        double expResult = 0.0;
        double result = instance.getMultiplicacion(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doble method, of class multiplicacion.
     */
    @Test
    public void testDoble() {
        System.out.println("doble");
        double a = 0.0;
        multiplicacion instance = new multiplicacion();
        double expResult = 0.0;
        double result = instance.doble(a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
