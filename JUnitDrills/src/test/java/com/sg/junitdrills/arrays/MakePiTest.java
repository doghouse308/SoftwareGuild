/*
Return an int array length n containing the first n digits of pi.

MakePi(3) -> {3, 1, 4}

public int[] MakePi(int n) {

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
public class MakePiTest {
    
    public MakePiTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //MakePi(3) -> {3, 1, 4}
    @Test
    public void makePiTest(){
        
        //arrange
        int n = 3;
        int [] expected = {3, 1, 4};
        
        //actual
        MakePi test = new MakePi();
        int[] actual = test.makePi(n);
        
        //assert
        assertArrayEquals(expected, actual);
    }
    
    //makePi(10) -> {3, 1, 4, 1, 5, 9, 2, 6, 5, 3}
    @Test
    public void makePiTest2(){
        
        //arrange
        int n = 10;
        int [] expected = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        
        //actual
        MakePi test = new MakePi();
        int[] actual = test.makePi(n);
        
        //assert
        assertArrayEquals(expected, actual);
    }  
    
    //makePi(16) -> {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3}
    @Test
    public void makePiTest3(){
        
        //arrange
        int n = 16;
        int [] expected = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3};
        
        //actual
        MakePi test = new MakePi();
        int[] actual = test.makePi(n);
        
        //assert
        assertArrayEquals(expected, actual);
    }    
    
    //makePi(20) -> {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3}
    @Test
    public void makePiTest4(){
        
        //arrange
        int n = 20;
        int [] expected = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3};
        
        //actual
        MakePi test = new MakePi();
        int[] actual = test.makePi(n);
        
        //assert
        assertArrayEquals(expected, actual);
    }    
}
