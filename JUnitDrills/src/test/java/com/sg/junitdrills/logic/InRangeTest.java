/*
Given a number n, return true if n is in the range 1..10, inclusive. 
Unless "outsideMode" is true, in which case return true if the number is 
less or equal to 1, or greater or equal to 10. 

InRange(5, false) → true
InRange(11, false) → false
InRange(11, true) → true

public boolean InRange(int n, boolean outsideMode) {
  
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
public class InRangeTest {
    
    public InRangeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    //InRange(5, false) → true
    @Test
    public void inRangeTest(){
        
        //arrange
        int n = 5;
        boolean outsideMode = false;
        boolean expected = true;
        
        //actual
        InRange test = new InRange();
        boolean actual = test.inRange(n, outsideMode);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //InRange(11, false) → false
    @Test
    public void inRangeTest2(){
        
        //arrange
        int n = 11;
        boolean outsideMode = false;
        boolean expected = false;
        
        //actual
        InRange test = new InRange();
        boolean actual = test.inRange(n, outsideMode);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //InRange(11, true) → true   
    @Test
    public void inRangeTest3(){
        
        //arrange
        int n = 11;
        boolean outsideMode = true;
        boolean expected = true;
        
        //actual
        InRange test = new InRange();
        boolean actual = test.inRange(n, outsideMode);
        
        //assert
        assertEquals(expected, actual);
    }
         
}
