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
public class TrianguloTest {
    
    public TrianguloTest() {
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
     * Test of getAreaTrianguloRectangulo method, of class Triangulo.
     */
    @Test
    public void testGetAreaTrianguloRectangulo() {
        System.out.println("getAreaTrianguloRectangulo");
        double cateto1 = 0.0;
        double cateto2 = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.getAreaTrianguloRectangulo(cateto1, cateto2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHipotenusa method, of class Triangulo.
     */
    @Test
    public void testGetHipotenusa() {
        System.out.println("getHipotenusa");
        double cateto1 = 0.0;
        double cateto2 = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.getHipotenusa(cateto1, cateto2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerimetroTrianguloRectangulo method, of class Triangulo.
     */
    @Test
    public void testGetPerimetroTrianguloRectangulo() {
        System.out.println("getPerimetroTrianguloRectangulo");
        double cateto1 = 0.0;
        double cateto2 = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.getPerimetroTrianguloRectangulo(cateto1, cateto2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Triangulo.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        double a = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.get(a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAreaTrianguloIsoseles method, of class Triangulo.
     */
    @Test
    public void testGetAreaTrianguloIsoseles() {
        System.out.println("getAreaTrianguloIsoseles");
        double base = 0.0;
        double altura = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.getAreaTrianguloIsoseles(base, altura);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuma2 method, of class Triangulo.
     */
    @Test
    public void testGetSuma2() {
        System.out.println("getSuma2");
        double a = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.getSuma2(a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerimetroTrianguloIsoseles method, of class Triangulo.
     */
    @Test
    public void testGetPerimetroTrianguloIsoseles() {
        System.out.println("getPerimetroTrianguloIsoseles");
        double base = 0.0;
        double altura = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.getPerimetroTrianguloIsoseles(base, altura);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get2 method, of class Triangulo.
     */
    @Test
    public void testGet2() {
        System.out.println("get2");
        double a = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.get2(a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAreaTrianguloEquilatero method, of class Triangulo.
     */
    @Test
    public void testGetAreaTrianguloEquilatero() {
        System.out.println("getAreaTrianguloEquilatero");
        double base = 0.0;
        double altura = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.getAreaTrianguloEquilatero(base, altura);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcomprobarAreaTrianguloEquilatero method, of class Triangulo.
     */
    @Test
    public void testGetcomprobarAreaTrianguloEquilatero() {
        System.out.println("getcomprobarAreaTrianguloEquilatero");
        double altura = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.getcomprobarAreaTrianguloEquilatero(altura);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerimetroTrianguloEquilatero method, of class Triangulo.
     */
    @Test
    public void testGetPerimetroTrianguloEquilatero() {
        System.out.println("getPerimetroTrianguloEquilatero");
        double altura = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.getPerimetroTrianguloEquilatero(altura);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get3 method, of class Triangulo.
     */
    @Test
    public void testGet3() {
        System.out.println("get3");
        double altura = 0.0;
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.get3(altura);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
