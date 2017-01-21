/*
Given an array of ints, return the number of 9's in the array. 

Count9({1, 2, 9}) -> 1
Count9({1, 9, 9}) -> 2
Count9({1, 9, 9, 3, 9}) -> 3

public int Count9 (int[] numbers) {

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
public class Count9Test {
    
    public Count9Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //Count9({1, 2, 9}) -> 1
    @Test
    public void count9Test(){
        
        //arrange
        int [] n = {1, 2, 9};
        int expected = 1;
        
        //actual
        Count9 test = new Count9();
        int actual = test.count9(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Count9({1, 9, 9}) -> 2
    @Test
    public void count9Test2(){
        
        //arrange
        int [] n = {1, 9, 9};
        int expected = 2;
        
        //actual
        Count9 test = new Count9();
        int actual = test.count9(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Count9({1, 9, 9, 3, 9}) -> 3   
    @Test
    public void count9Test3(){
        
        //arrange
        int [] n = {1, 9, 9, 3, 9};
        int expected = 3;
        
        //actual
        Count9 test = new Count9();
        int actual = test.count9(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
