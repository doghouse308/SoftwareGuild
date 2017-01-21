/*
Given three ints, a b c, return true if it is possible to add two of the ints 
to get the third. 

TwoIsOne(1, 2, 3) → true
TwoIsOne(3, 1, 2) → true
TwoIsOne(3, 2, 2) → false

public boolean TwoIsOne(int a, int b, int c) {
  
}
 */
package com.sg.junitdrills.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class TwoIsOneTest {
    
    public TwoIsOneTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    //TwoIsOne(1, 2, 3) → true
    @Test
    public void twoIsOneTest(){
        
        //arrange 
        int a = 1;
        int b = 2;
        int c = 3;
        boolean expected = true;
        
        //actual
        TwoIsOne test = new TwoIsOne();
        boolean actual = test.twoIsOne(a, b, c);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //TwoIsOne(3, 1, 2) → true
    @Test
    public void twoIsOneTes2t(){
        
        //arrange 
        int a = 3;
        int b = 1;
        int c = 2;
        boolean expected = true;
        
        //actual
        TwoIsOne test = new TwoIsOne();
        boolean actual = test.twoIsOne(a, b, c);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //TwoIsOne(3, 2, 2) → false    
    @Test
    public void twoIsOneTest3(){
        
        //arrange 
        int a = 3;
        int b = 2;
        int c = 2;
        boolean expected = false;
        
        //actual
        TwoIsOne test = new TwoIsOne();
        boolean actual = test.twoIsOne(a, b, c);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
