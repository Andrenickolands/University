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
public class potenciacionTest {
    
    public potenciacionTest() {
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
     * Test of getPotenciacion method, of class potenciacion.
     */
    @Test
    public void testGetPotenciacion() {
        System.out.println("getPotenciacion");
        double a = 0.0;
        double b = 0.0;
        potenciacion instance = new potenciacion();
        double expResult = 0.0;
        double result = instance.getPotenciacion(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of base100 method, of class potenciacion.
     */
    @Test
    public void testBase100() {
        System.out.println("base100");
        double a = 0.0;
        potenciacion instance = new potenciacion();
        double expResult = 0.0;
        double result = instance.base100(a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
