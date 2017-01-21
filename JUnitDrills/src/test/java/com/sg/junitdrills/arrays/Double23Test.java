/*
Given an int array, return true if the array contains 2 twice, or 3 twice. 

Double23({2, 2, 3}) -> true
Double23({3, 4, 5, 3}) -> true
Double23({2, 3, 2, 2}) -> false

public boolean Double23(int[] numbers) {

}
 */
package com.sg.junitdrills.arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class Double23Test {
    
    public Double23Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    
    //Double23({2, 2, 3}) -> true
    @Test
    public void double23Test(){
        
        //arrange
        int [] n = {2, 2, 3};
        boolean expected = true;
        
        //actual
        Double23 test = new Double23();
        boolean actual = test.double23(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Double23({3, 4, 5, 3}) -> true
    @Test
    public void double23Test2(){
        
        //arrange
        int [] n = {2, 2, 3};
        boolean expected = true;
        
        //actual
        Double23 test = new Double23();
        boolean actual = test.double23(n);
        
        //assert
        assertEquals(expected, actual);
    }    
    
    //Double23({2, 3, 2, 2}) -> false  
    @Test
    public void double23Test3(){
        
        //arrange
        int [] n = {2, 3, 2, 2};
        boolean expected = false;
        
        //actual
        Double23 test = new Double23();
        boolean actual = test.double23(n);
        
        //assert
        assertEquals(expected, actual);
    }    
}
