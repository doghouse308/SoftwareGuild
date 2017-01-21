/*
Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere. 

Array123({1, 1, 2, 3, 1}) -> true
Array123({1, 1, 2, 4, 1}) -> false
Array123({1, 1, 2, 1, 2, 3}) -> true

public boolean Array123(int[] numbers) {

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
public class Array123Test {
    
    public Array123Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //Array123({1, 1, 2, 3, 1}) -> true
    @Test
    public void array123Test(){
        
        //arrange
        int [] n = {1, 1, 2, 3, 1};
        boolean expected = true;
        
        //actual
        Array123 test = new Array123();
        boolean actual = test.array123(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Array123({1, 1, 2, 4, 1}) -> false
    @Test
    public void array123Test2(){
        
        //arrange
        int [] n = {1, 1, 2, 4, 1};
        boolean expected = false;
        
        //actual
        Array123 test = new Array123();
        boolean actual = test.array123(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Array123({1, 1, 2, 1, 2, 3}) -> true
    @Test
    public void array123Test3(){
        
        //arrange
        int [] n = {1, 1, 2, 1, 2, 3};
        boolean expected = true;
        
        //actual
        Array123 test = new Array123();
        boolean actual = test.array123(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
}
