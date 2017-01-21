/*
Given an array of ints, return the sum of all the elements. 

Sum({1, 2, 3}) -> 6
Sum({5, 11, 2}) -> 18
Sum({7, 0, 0}) -> 7

public int Sum(int[] numbers) {

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
public class SumTest {
    
    public SumTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //Sum({1, 2, 3}) -> 6
    @Test
    public void sumTest(){
        
        //arrange
        int [] n = {1, 2, 3};
        int expected = 6;
        
        //actual
        Sum test = new Sum();
        int actual = test.sum(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Sum({5, 11, 2}) -> 18
    @Test
    public void sumTest2(){
        
        //arrange
        int [] n = {5, 11, 2};
        int expected = 18;
        
        //actual
        Sum test = new Sum();
        int actual = test.sum(n);
        
        //assert
        assertEquals(expected, actual);
    }  
    
    //Sum({7, 0, 0}) -> 7  
    @Test
    public void sumTest3(){
        
        //arrange
        int [] n = {7, 0, 0};
        int expected = 7;
        
        //actual
        Sum test = new Sum();
        int actual = test.sum(n);
        
        //assert
        assertEquals(expected, actual);
    }    
    
}
