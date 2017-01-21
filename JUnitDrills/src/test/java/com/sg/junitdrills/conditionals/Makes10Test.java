/*
Given two ints, a and b, return true if one if them is 10 or if their sum is 10. 

Makes10(9, 10) -> true
Makes10(9, 9) -> false
Makes10(1, 9) -> true

public boolean Makes10(int a, int b) {

}
 */
package com.sg.junitdrills.conditionals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class Makes10Test {
    
    public Makes10Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //Makes10(9, 10) -> true
    @Test
    public void makes10Test(){
        
        //arrange
        int a = 9;
        int b = 10;
        boolean expected = true;
        
        //actual
        Makes10 test = new Makes10();
        boolean actual = test.makes10(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Makes10(9, 9) -> false
    @Test
    public void makes10Test2(){
        
        //arrange
        int a = 9;
        int b = 9;
        boolean expected = false;
        
        //actual
        Makes10 test = new Makes10();
        boolean actual = test.makes10(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Makes10(1, 9) -> true  
    @Test
    public void makes10Test3(){
        
        //arrange
        int a = 1;
        int b = 9;
        boolean expected = true;
        
        //actual
        Makes10 test = new Makes10();
        boolean actual = test.makes10(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
}
