/*
Given 2 arrays of ints, a and b, return true if they have the same first element
or they have the same last element. Both arrays will be length 1 or more. 

CommonEnd({1, 2, 3}, {7, 3}) -> true
CommonEnd({1, 2, 3}, {7, 3, 2}) -> false
CommonEnd({1, 2, 3}, {1, 3}) -> true

public boolean commonEnd(int[] a, int[] b) {
  
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
public class commonEndTest {
    
    public commonEndTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //CommonEnd({1, 2, 3}, {7, 3}) -> true
    @Test
    public void commonEndTest(){
        
        //arrange
        int [] a = {1, 2, 3};
        int [] b = {7, 3};
        boolean expected = true;
        
        //actual
        CommonEnd test = new CommonEnd();
        boolean actual = test.commonEnd(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //CommonEnd({1, 2, 3}, {7, 3, 2}) -> false
    @Test
    public void commonEndTest2(){
        
        //arrange
        int [] a = {1, 2, 3};
        int [] b = {7, 3, 2};
        boolean expected = false;
        
        //actual
        CommonEnd test = new CommonEnd();
        boolean actual = test.commonEnd(a, b);
        
        //assert
        assertEquals(expected, actual);
    }    
    
    //CommonEnd({1, 2, 3}, {1, 3}) -> true 
    @Test
    public void commonEndTest3(){
        
        //arrange
        int [] a = {1, 2, 3};
        int [] b = {1, 3};
        boolean expected = true;
        
        //actual
        CommonEnd test = new CommonEnd();
        boolean actual = test.commonEnd(a, b);
        
        //assert
        assertEquals(expected, actual);
    }    
}
