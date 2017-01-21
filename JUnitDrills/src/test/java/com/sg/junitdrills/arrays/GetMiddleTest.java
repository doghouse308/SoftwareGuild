/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 
containing their middle elements. 

GetMiddle({1, 2, 3}, {4, 5, 6}) -> {2, 5}
GetMiddle({7, 7, 7}, {3, 8, 0}) -> {7, 8}
GetMiddle({5, 2, 9}, {1, 4, 5}) -> {2, 4}

public int[] GetMiddle(int[] a, int[] b) {

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
public class GetMiddleTest {
    
    public GetMiddleTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //GetMiddle({1, 2, 3}, {4, 5, 6}) -> {2, 5}
    @Test
    public void getMiddleTest(){
        
        //arrange
        int [] a = {1, 2, 3};
        int [] b = {4, 5, 6};
        int [] expected = {2, 5};
        
        //actual
        GetMiddle test = new GetMiddle();
        int [] actual = test.getMiddle(a, b);
        
        //assert
        assertArrayEquals(expected, actual);
    }
    
    //GetMiddle({7, 7, 7}, {3, 8, 0}) -> {7, 8}
    @Test
    public void getMiddleTest2(){
        
        //arrange
        int [] a = {7, 7, 7};
        int [] b = {3, 8, 0};
        int [] expected = {7, 8};
        
        //actual
        GetMiddle test = new GetMiddle();
        int [] actual = test.getMiddle(a, b);
        
        //assert
        assertArrayEquals(expected, actual);
    }
        
    //GetMiddle({5, 2, 9}, {1, 4, 5}) -> {2, 4}  
    @Test
    public void getMiddleTest3(){
        
        //arrange
        int [] a = {5, 2, 9};
        int [] b = {1, 4, 5};
        int [] expected = {2, 4};
        
        //actual
        GetMiddle test = new GetMiddle();
        int [] actual = test.getMiddle(a, b);
        
        //assert
        assertArrayEquals(expected, actual);
    }
        
}
