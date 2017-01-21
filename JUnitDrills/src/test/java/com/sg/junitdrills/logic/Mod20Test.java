/*
Return true if the given non-negative number is 1 or 2 more than a multiple 
of 20. See also: Introduction to Mod 

Mod20(20) → false
Mod20(21) → true
Mod20(22) → true

public boolean Mod20(int n) {
  
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
public class Mod20Test {
    
    public Mod20Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //Mod20(20) → false
    @Test
    public void mod20Test(){
        
        //arrange
        int n = 20;
        boolean expected = false;
        
        //actual
        Mod20 test = new Mod20();
        boolean actual = test.mod20(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Mod20(21) → true
    @Test
    public void mod20Test2(){
        
        //arrange
        int n = 21;
        boolean expected = true;
        
        //actual
        Mod20 test = new Mod20();
        boolean actual = test.mod20(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Mod20(22) → true   
    @Test
    public void mod20Test3(){
        
        //arrange
        int n = 22;
        boolean expected = true;
        
        //actual
        Mod20 test = new Mod20();
        boolean actual = test.mod20(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
