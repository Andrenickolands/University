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
public class restaTest {
    
    public restaTest() {
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
     * Test of getResta method, of class resta.
     */
    @Test
    public void testGetResta() {
        System.out.println("getResta");
        double a = 0.0;
        double b = 0.0;
        resta instance = new resta();
        double expResult = 0.0;
        double result = instance.getResta(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decremento method, of class resta.
     */
    @Test
    public void testDecremento() {
        System.out.println("decremento");
        double a = 0.0;
        resta instance = new resta();
        double expResult = 0.0;
        double result = instance.decremento(a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
