/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import esercitazionejunit.NumberHelper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author stefa
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsEven() {
        System.out.println("isEven");
        int n = 0;
        NumberHelper instance = new NumberHelper(20);
        boolean expResult = true;
        boolean result = instance.isEven(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsOdd() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(8);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testSum() {
        System.out.println("sum");
        int n = 0;
        NumberHelper instance = new NumberHelper(50);
        int expResult = 50;
        int result = instance.sum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsPrime() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsDivisibleBy() {
        System.out.println("isDivisibleBy");
        int n = 0;
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = true;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
