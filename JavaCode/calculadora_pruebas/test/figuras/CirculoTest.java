/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package figuras;

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
public class CirculoTest {
    
    public CirculoTest() {
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
     * Test of getAreaCirculo method, of class Circulo.
     */
    @Test
    public void testGetAreaCirculo() {
        System.out.println("getAreaCirculo");
        double radio = 0.0;
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.getAreaCirculo(radio);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Circulo.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        double a = 0.0;
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.get(a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerimetroCirculo method, of class Circulo.
     */
    @Test
    public void testGetPerimetroCirculo() {
        System.out.println("getPerimetroCirculo");
        double radio = 0.0;
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.getPerimetroCirculo(radio);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get2 method, of class Circulo.
     */
    @Test
    public void testGet2() {
        System.out.println("get2");
        double a = 0.0;
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.get2(a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
