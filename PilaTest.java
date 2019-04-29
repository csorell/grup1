/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author perro
 */
public class PilaTest {
    
    public PilaTest() {
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
     * Test of push method, of class Pila.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        int n = 0;
        Pila instance = new Pila();
        instance.push(n);
        // TODO review the generated test code and remove the default call to fail.

    }
    public void testPush1() {
        System.out.println("push");
        int n = 'y';
        Pila instance = new Pila();
        instance.push(n);
        // TODO review the generated test code and remove the default call to fail.

    }
    public void testPush2() {
        System.out.println("push");
        int n = (int)2.3;
        Pila instance = new Pila();
        instance.push(n);
        // TODO review the generated test code and remove the default call to fail.

    }
    public void testPush3() {
        System.out.println("push");
        int n = 821;
        Pila instance = new Pila();
        instance.push(n);
        // TODO review the generated test code and remove the default call to fail.

    }
    public void testPush4() {
        System.out.println("push");
        int n = 0;
        Pila instance = new Pila();
        instance.push(n);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Pila instance = new Pila();
        instance.push(4);
        instance.pop();
        // TODO review the generated test code and remove the default call to fail.

    }
    
    /**
     * Test of isEmpty method, of class Pila.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Pila instance = new Pila();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(false, false);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of top method, of class Pila.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        Pila instance = new Pila();
        int expResult = 6;
        instance.push(6);
        int result = instance.top();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of main method, of class Pila.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Pila.main(args);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
