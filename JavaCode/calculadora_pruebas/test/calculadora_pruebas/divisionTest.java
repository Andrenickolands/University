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
public class divisionTest {
    
    public divisionTest() {
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
     * Test of getDivision method, of class division.
     */
    @Test
    public void testGetDivision() {
        System.out.println("getDivision");
        double a = 0.0;
        double b = 0.0;
        division instance = new division();
        double expResult = 0.0;
        double result = instance.getDivision(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mitad method, of class division.
     */
    @Test
    public void testMitad() {
        System.out.println("mitad");
        double a = 0.0;
        division instance = new division();
        double expResult = 0.0;
        double result = instance.mitad(a);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
