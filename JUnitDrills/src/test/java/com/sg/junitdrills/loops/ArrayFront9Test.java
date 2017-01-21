/*
Given an array of ints, return true if one of the first 4 elements in the array
is a 9. The array length may be less than 4. 

ArrayFront9({1, 2, 9, 3, 4}) -> true
ArrayFront9({1, 2, 3, 4, 9}) -> false
ArrayFront9({1, 2, 3, 4, 5}) -> false

public boolean ArrayFront9(int[] numbers) {

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
public class ArrayFront9Test {
    
    public ArrayFront9Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //ArrayFront9({1, 2, 9, 3, 4}) -> true
    @Test
    public void arrayFront9Test(){
        
        //arrange
        int [] n = {1, 2, 9, 3, 4};
        boolean expected = true;
        
        //actual
        ArrayFront9 test = new ArrayFront9();
        boolean actual = test.arrayFront9(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //ArrayFront9({1, 2, 3, 4, 9}) -> false
    @Test
    public void arrayFront9Test2(){
        
        //arrange
        int [] n = {1, 2, 3, 4, 9};
        boolean expected = false;
        
        //actual
        ArrayFront9 test = new ArrayFront9();
        boolean actual = test.arrayFront9(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //ArrayFront9({1, 2, 3, 4, 5}) -> false 
    @Test
    public void arrayFront9Test3(){
        
        //arrange
        int [] n = {1, 2, 3, 4, 5};
        boolean expected = false;
        
        //actual
        ArrayFront9 test = new ArrayFront9();
        boolean actual = test.arrayFront9(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //ArrayFront9({1, 2, 9}) -> true 
    @Test
    public void arrayFront9Test4(){
        
        //arrange
        int [] n = {1, 2, 9};
        boolean expected = true;
        
        //actual
        ArrayFront9 test = new ArrayFront9();
        boolean actual = test.arrayFront9(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //ArrayFront9({1, 2, 3}) -> false 
    @Test
    public void arrayFront9Test5(){
        
        //arrange
        int [] n = {1, 2, 3};
        boolean expected = false;
        
        //actual
        ArrayFront9 test = new ArrayFront9();
        boolean actual = test.arrayFront9(n);
        
        //assert
        assertEquals(expected, actual);
    }    
}
