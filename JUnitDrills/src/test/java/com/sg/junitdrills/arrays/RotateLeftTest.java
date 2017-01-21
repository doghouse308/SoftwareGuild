/*
Given an array of ints, return an array with the elements "rotated left" so 
{1, 2, 3} yields {2, 3, 1}. 

RotateLeft({1, 2, 3}) -> {2, 3, 1}
RotateLeft({5, 11, 9}) -> {11, 9, 5}
RotateLeft({7, 0, 0}) -> {0, 0, 7}

public int[] RotateLeft(int[] numbers) {

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
public class RotateLeftTest {
    
    public RotateLeftTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //RotateLeft({1, 2, 3}) -> {2, 3, 1}
    @Test
    public void rotateLeftTest(){
        
        //arrange
        int [] n = {1, 2, 3};
        int [] expected = {2, 3, 1};
        
        //arrange
        RotateLeft test = new RotateLeft();
        int [] actual = test.rotateLeft(n);
        
        //assert
        assertArrayEquals(expected, actual);
   }
    
    //RotateLeft({5, 11, 9}) -> {11, 9, 5}
    @Test
    public void rotateLeftTest2(){
        
        //arrange
        int [] n = {5, 11, 9};
        int [] expected = {11, 9, 5};
        
        //arrange
        RotateLeft test = new RotateLeft();
        int [] actual = test.rotateLeft(n);
        
        //assert
        assertArrayEquals(expected, actual);
   }   
    
    //RotateLeft({7, 0, 0}) -> {0, 0, 7}
    @Test
    public void rotateLeftTest3(){
        
        //arrange
        int [] n = {7, 0, 0};
        int [] expected = {0, 0, 7};
        
        //arrange
        RotateLeft test = new RotateLeft();
        int [] actual = test.rotateLeft(n);
        
        //assert
        assertArrayEquals(expected, actual);
   }    
    
}
