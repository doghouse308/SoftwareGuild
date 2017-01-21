/*
Given an array of ints, return true if 6 appears as either the first or last 
element in the array. The array will be length 1 or more. 

FirstLast6({1, 2, 6}) -> true
FirstLast6({6, 1, 2, 3}) -> true
FirstLast6({13, 6, 1, 2, 3}) -> false

public booleaneanean FirstLast6(int[] numbers) {

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
public class FirstLast6Test {
    
    public FirstLast6Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //FirstLast6({1, 2, 6}) -> true
    @Test
    public void firstLast6Test(){
        
        //arrange
        int[] numbers = {1, 2, 6};
        boolean expected = true;
        
        //actual
        FirstLast6 test = new FirstLast6();
        boolean actual = test.firstLast6(numbers);
        
        //assert
        assertEquals(expected, actual);
    }

    //FirstLast6({6, 1, 2, 3}) -> true
    @Test
    public void firstLast6Test2(){
        
        //arrange
        int[] numbers = {6, 1, 2, 3};
        boolean expected = true;
        
        //actual
        FirstLast6 test = new FirstLast6();
        boolean actual = test.firstLast6(numbers);
        
        //assert
        assertEquals(expected, actual);
    }  
    
    //FirstLast6({13, 6, 1, 2, 3}) -> false    
    @Test
    public void firstLast6Test3(){
        
        //arrange
        int[] numbers = {13, 6, 1, 2, 3};
        boolean expected = false;
        
        //actual
        FirstLast6 test = new FirstLast6();
        boolean actual = test.firstLast6(numbers);
        
        //assert
        assertEquals(expected, actual);
    }    
    
}
