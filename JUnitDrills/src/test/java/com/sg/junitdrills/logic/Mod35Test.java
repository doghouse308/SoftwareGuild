/*
Return true if the given non-negative number is a multiple of 3 or 5, but not 
both. Use the % "mod" operator

Mod35(3) → true
Mod35(10) → true
Mod35(15) → false

public boolean Mod35(int n) {
  
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
public class Mod35Test {
    
    public Mod35Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    //Mod35(3) → true
    @Test
    public void mod35(){
        
        //arrange
        int n = 3;
        boolean expected = true;
        
        //actual
        Mod35 test = new Mod35();
        boolean actual = test.mod35(n);
        
        //assert
        assertEquals(expected, actual);
    }
   
    //Mod35(10) → true
    @Test
    public void mod352(){
        
        //arrange
        int n = 10;
        boolean expected = true;
        
        //actual
        Mod35 test = new Mod35();
        boolean actual = test.mod35(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Mod35(15) → false
    @Test
    public void mod353(){
        
        //arrange
        int n = 15;
        boolean expected = false;
        
        //actual
        Mod35 test = new Mod35();
        boolean actual = test.mod35(n);
        
        //assert
        assertEquals(expected, actual);
    }    
}
