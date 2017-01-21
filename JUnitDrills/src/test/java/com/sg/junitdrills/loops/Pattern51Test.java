/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
followed by the value plus 5, followed by the value minus 1.

Pattern51({1, 2, 7, 1}) -> true
Pattern51({1, 2, 8, 1}) -> false
Pattern51({2, 7, 1}) -> true

public boolean pattern51(int[] numbers) {

}
 */
package com.sg.junitdrills.loops;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class Pattern51Test {
    
    public Pattern51Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //Pattern51({1, 2, 7, 1}) -> true
    @Test
    public void pattern51Test(){
        
        //arrange
        int [] n = {1, 2, 7, 1};
        boolean expected = true;
        
        //actual
        Pattern51 test = new Pattern51();
        boolean actual = test.pattern51(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Pattern51({1, 2, 8, 1}) -> false
    @Test
    public void pattern51Test2(){
        
        //arrange
        int [] n = {1, 2, 8, 1};
        boolean expected = false;
        
        //actual
        Pattern51 test = new Pattern51();
        boolean actual = test.pattern51(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Pattern51({2, 7, 1}) -> true  
    @Test
    public void pattern51Test3(){
        
        //arrange
        int [] n = {2, 7, 1};
        boolean expected = true;
        
        //actual
        Pattern51 test = new Pattern51();
        boolean actual = test.pattern51(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Pattern51({1, 6, 11, 5, 1, 2, 7, 1, 1}) -> true  
    @Test
    public void pattern51Test4(){
        
        //arrange
        int [] n = {1, 6, 11, 5, 1, 2, 7, 1, 1};
        boolean expected = true;
        
        //actual
        Pattern51 test = new Pattern51();
        boolean actual = test.pattern51(n);
        
        //assert
        assertEquals(expected, actual);
    }  
        
    //Pattern51({3, 8, 2}) -> true  
    @Test
    public void pattern51Test5(){
        
        //arrange
        int [] n = {3, 8, 2};
        boolean expected = true;
        
        //actual
        Pattern51 test = new Pattern51();
        boolean actual = test.pattern51(n);
        
        //assert
        assertEquals(expected, actual);
    }
      
}
