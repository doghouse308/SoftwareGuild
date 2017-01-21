/*
The number 6 is a truly great number. Given two int values, a and b, return true
if either one is 6. Or if their sum or difference is 6.

LoveSix(6, 4) → true
LoveSix(4, 5) → false
LoveSix(1, 5) → true

public boolean LoveSix(int a, int b) {
  
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
public class LoveSixTest {
    
    public LoveSixTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //LoveSix(6, 4) → true
    @Test
    public void loveSixTest(){
        
        //arrange
        int a = 6;
        int b = 4;
        boolean expected = true;
        
        //actual
        LoveSix test = new LoveSix();
        boolean actual = test.loveSix(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //LoveSix(4, 5) → false
    @Test
    public void loveSixTest2(){
        
        //arrange
        int a = 4;
        int b = 5;
        boolean expected = false;
        
        //actual
        LoveSix test = new LoveSix();
        boolean actual = test.loveSix(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //LoveSix(1, 5) → true  
    @Test
    public void loveSixTest3(){
        
        //arrange
        int a = 1;
        int b = 5;
        boolean expected = true;
        
        //actual
        LoveSix test = new LoveSix();
        boolean actual = test.loveSix(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //LoveSix(1, 6) → true  
    @Test
    public void loveSixTest4(){
        
        //arrange
        int a = 1;
        int b = 6;
        boolean expected = true;
        
        //actual
        LoveSix test = new LoveSix();
        boolean actual = test.loveSix(a, b);
        
        //assert
        assertEquals(expected, actual);
    }   
        
    //LoveSix(1, 7) → true  
    @Test
    public void loveSixTest5(){
        
        //arrange
        int a = 1;
        int b = 7;
        boolean expected = true;
        
        //actual
        LoveSix test = new LoveSix();
        boolean actual = test.loveSix(a, b);
        
        //assert
        assertEquals(expected, actual);
    }  
    
    //LoveSix(8, 2) → true  
    @Test
    public void loveSixTest6(){
        
        //arrange
        int a = 8;
        int b = 2;
        boolean expected = true;
        
        //actual
        LoveSix test = new LoveSix();
        boolean actual = test.loveSix(a, b);
        
        //assert
        assertEquals(expected, actual);
    }     
}
