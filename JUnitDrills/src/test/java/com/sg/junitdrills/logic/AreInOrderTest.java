/*
Given three ints, a b c, return true if b is greater than a, and c is greater 
than b. However, with the exception that if "bOk" is true, b does not need to 
be greater than a. 

AreInOrder(1, 2, 4, false) → true
AreInOrder(1, 2, 1, false) → false
AreInOrder(1, 1, 2, true) → true

public boolean AreInOrder(int a, int b, int c, boolean bOk) {
  
}
 */
package com.sg.junitdrills.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class AreInOrderTest {
    
    public AreInOrderTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //AreInOrder(1, 2, 4, false) → true
    @Test
    public void areInOrderTest(){
        
        //arrange
        int a = 1;
        int b = 2;
        int c = 4;
        boolean bOk = false;
        boolean expected = true;
        
        //actual
        AreInOrder test = new AreInOrder();
        boolean actual = test.areInOrder(a, b, c, false);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //AreInOrder(1, 2, 1, false) → false
    @Test
    public void areInOrderTest2(){
        
        //arrange
        int a = 1;
        int b = 2;
        int c = 4;
        boolean bOk = false;
        boolean expected = true;
        
        //actual
        AreInOrder test = new AreInOrder();
        boolean actual = test.areInOrder(a, b, c, false);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //AreInOrder(1, 1, 2, true) → true    
    @Test
    public void areInOrderTest3(){
        
        //arrange
        int a = 1;
        int b = 1;
        int c = 2;
        boolean bOk = true;
        boolean expected = true;
        
        //actual
        AreInOrder test = new AreInOrder();
        boolean actual = test.areInOrder(a, b, c, true);
        
        //assert
        assertEquals(expected, actual);
    }
         
}
