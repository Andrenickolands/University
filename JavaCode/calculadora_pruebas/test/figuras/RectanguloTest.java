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
public class RectanguloTest {
    
    public RectanguloTest() {
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
     * Test of getAreaRectangulo method, of class Rectangulo.
     */
    @Test
    public void testGetAreaRectangulo() {
        System.out.println("getAreaRectangulo");
        double largo = 0.0;
        double ancho = 0.0;
        Rectangulo instance = new Rectangulo();
        double expResult = 0.0;
        double result = instance.getAreaRectangulo(largo, ancho);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Rectangulo.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        double a = 0.0;
        Rectangulo instance = new Rectangulo();
        double expResult = 0.0;
        double result = instance.get(a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerimetroRectangulo method, of class Rectangulo.
     */
    @Test
    public void testGetPerimetroRectangulo() {
        System.out.println("getPerimetroRectangulo");
        double largo = 0.0;
        double ancho = 0.0;
        Rectangulo instance = new Rectangulo();
        double expResult = 0.0;
        double result = instance.getPerimetroRectangulo(largo, ancho);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get2 method, of class Rectangulo.
     */
    @Test
    public void testGet2() {
        System.out.println("get2");
        double a = 0.0;
        Rectangulo instance = new Rectangulo();
        double expResult = 0.0;
        double result = instance.get2(a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
