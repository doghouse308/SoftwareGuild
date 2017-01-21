/*
Given 2 int arrays, a and b, return a new array length 2 containing, as much as
will fit, the elements from a followed by the elements from b. The arrays may be
any length, including 0, but there will be 2 or more elements available between 
the 2 arrays. 

Make2({4, 5}, {1, 2, 3}) -> {4, 5}
Make2({4}, {1, 2, 3}) -> {4, 1}
Make2({}, {1, 2}) -> {1, 2}

public int[] make2(int[] a, int[] b) {
  
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
public class Make2Test {
    
    public Make2Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //Make2({4, 5}, {1, 2, 3}) -> {4, 5}
    @Test
    public void make2Test(){
        
        //arrange
        int [] a = {4, 5};
        int [] b = {1, 2, 3};
        int [] expected = {4, 5};
        
        //actual
        Make2 test = new Make2();
        int [] actual = test.make2(a, b);
        
        //assert
        assertArrayEquals(expected, actual);
    }
    
    //Make2({4}, {1, 2, 3}) -> {4, 1}
    @Test
    public void make2Test2(){
        
        //arrange
        int [] a = {4};
        int [] b = {1, 2, 3};
        int [] expected = {4, 1};
        
        //actual
        Make2 test = new Make2();
        int [] actual = test.make2(a, b);
        
        //assert
        assertArrayEquals(expected, actual);
    }    
    
    //Make2({}, {1, 2}) -> {1, 2}  
    @Test
    public void make2Test3(){
        
        //arrange
        int [] a = {};
        int [] b = {1, 2};
        int [] expected = {1, 2};
        
        //actual
        Make2 test = new Make2();
        int [] actual = test.make2(a, b);
        
        //assert
        assertArrayEquals(expected, actual);
    }    
    
    
}
