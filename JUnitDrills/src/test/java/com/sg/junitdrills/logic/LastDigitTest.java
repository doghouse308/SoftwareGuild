/*
Given three ints, a b c, return true if two or more of them have the same
rightmost digit. The ints are non-negative. 

LastDigit(23, 19, 13) → true
LastDigit(23, 19, 12) → false
LastDigit(23, 19, 3) → true

public boolean LastDigit(int a, int b, int c){

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
public class LastDigitTest {
    
    public LastDigitTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    //LastDigit(23, 19, 13) → true
    @Test
    public void lastDigit(){
        
        //arrange
        int a = 23;
        int b = 19;
        int c = 13;
        boolean expected = true;
        
        //actual
        LastDigit test = new LastDigit();
        boolean actual = test.lastDigit(a, b, c);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //LastDigit(23, 19, 12) → false
    @Test
    public void lastDigit2(){
        
        //arrange
        int a = 23;
        int b = 19;
        int c = 12;
        boolean expected = false;
        
        //actual
        LastDigit test = new LastDigit();
        boolean actual = test.lastDigit(a, b, c);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //LastDigit(23, 19, 3) → true    
    @Test
    public void lastDigit3(){
        
        //arrange
        int a = 23;
        int b = 19;
        int c = 3;
        boolean expected = true;
        
        //actual
        LastDigit test = new LastDigit();
        boolean actual = test.lastDigit(a, b, c);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //LastDigit(21243, 1249, 2014723043) → true    
    @Test
    public void lastDigit4(){
        
        //arrange
        int a = 21243;
        int b = 1249;
        int c = 2014723043;
        boolean expected = true;
        
        //actual
        LastDigit test = new LastDigit();
        boolean actual = test.lastDigit(a, b, c);
        
        //assert
        assertEquals(expected, actual);
    }          
}
