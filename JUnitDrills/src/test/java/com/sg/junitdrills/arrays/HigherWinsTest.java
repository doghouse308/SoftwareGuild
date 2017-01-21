/*
Given an array of ints, figure out which is larger between the first and last
elements in the array, and set all the other elements to be that value. Return 
the changed array. 

HigherWins({1, 2, 3}) -> {3, 3, 3}
HigherWins({11, 5, 9}) -> {11, 11, 11}
HigherWins({2, 11, 3}) -> {3, 3, 3}

public int[] HigherWins(int[] numbers) {

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
public class HigherWinsTest {
    
    public HigherWinsTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //HigherWins({1, 2, 3}) -> {3, 3, 3}
    @Test
    public void higherWinsTest(){
        
        //arrange
        int [] n = {1, 2, 3};
        int [] expected = {3, 3, 3};
        
        //actual
        HigherWins test = new HigherWins();
        int [] actual = test.higherWins(n);
        
        //assert
        assertArrayEquals(expected, actual);
    }
    
    //HigherWins({11, 5, 9}) -> {11, 11, 11}
    @Test
    public void higherWinsTest2(){
        
        //arrange
        int [] n = {11, 5, 9};
        int [] expected = {11, 11, 11};
        
        //actual
        HigherWins test = new HigherWins();
        int [] actual = test.higherWins(n);
        
        //assert
        assertArrayEquals(expected, actual);
    }
    //HigherWins({2, 11, 3}) -> {3, 3, 3}
    @Test
    public void higherWinsTest3(){
        
        //arrange
        int [] n = {2, 11, 3};
        int [] expected = {3, 3, 3};
        
        //actual
        HigherWins test = new HigherWins();
        int [] actual = test.higherWins(n);
        
        //assert
        assertArrayEquals(expected, actual);
    }    
    
}
