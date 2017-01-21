/*
Given an array of ints, return the number of times that two 6's are next to each
other in the array. Also count instances where the second "6" is actually a 7. 

Array667({6, 6, 2}) -> 1
Array667({6, 6, 2, 6}) -> 1
Array667({6, 7, 2, 6}) -> 1

public int array667(int[] numbers) {

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
public class Array667Test {
    
    public Array667Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //Array667({6, 6, 2}) -> 1
    @Test
    public void array667Test(){
        
        //arrange
        int [] n = {6, 6, 2};
        int expected = 1;
        
        //actual
        Array667 test = new Array667();
        int actual = test.array667(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Array667({6, 6, 2, 6}) -> 1
    @Test
    public void array667Test2(){
        
        //arrange
        int [] n = {6, 6, 2, 6};
        int expected = 1;
        
        //actual
        Array667 test = new Array667();
        int actual = test.array667(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Array667({6, 7, 2, 6}) -> 1    
    @Test
    public void array667Test3(){
        
        //arrange
        int [] n = {6, 7, 2, 6};
        int expected = 1;
        
        //actual
        Array667 test = new Array667();
        int actual = test.array667(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Array667({6, 8, 2, 6}) -> 0    
    @Test
    public void array667Test4(){
        
        //arrange
        int [] n = {6, 8, 2, 6};
        int expected = 0;
        
        //actual
        Array667 test = new Array667();
        int actual = test.array667(n);
        
        //assert
        assertEquals(expected, actual);
    }   
        
    //Array667({6, 7, 2, 6, 2, 6, 8, 2, 6, 6, 7, 2, 6, 6, 7, 2, 6}) -> 5    
    @Test
    public void array667Test5(){
        
        //arrange
        int [] n = {6, 7, 2, 6, 2, 6, 8, 2, 6, 6, 7, 2, 6, 6, 7, 2, 6};
        int expected = 5;
        
        //actual
        Array667 test = new Array667();
        int actual = test.array667(n);
        
        //assert
        assertEquals(expected, actual);
    }    
}
