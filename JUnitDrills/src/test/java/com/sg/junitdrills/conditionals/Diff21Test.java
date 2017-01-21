/*
Given an int n, return the absolute value of the difference between n and 21, 
except return double the absolute value of the difference if n is over 21. 

Diff21(23) -> 4
Diff21(10) -> 11
Diff21(21) -> 0

public int Diff21(int n) {
  
}
 */
package com.sg.junitdrills.conditionals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class Diff21Test {
    
    public Diff21Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //Diff21(23) -> 4
    @Test
    public void diff21Test(){
        
        //arrange
        int n = 23;
        int expected = 4;
        
        //actual
        Diff21 test = new Diff21();
        int actual = test.diff21(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Diff21(10) -> 11
    @Test
    public void diff21Test2(){
        
        //arrange
        int n = 10;
        int expected = 11;
        
        //actual
        Diff21 test = new Diff21();
        int actual = test.diff21(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Diff21(21) -> 0  
    @Test
    public void diff21Test3(){
        
        //arrange
        int n = 21;
        int expected = 0;
        
        //actual
        Diff21 test = new Diff21();
        int actual = test.diff21(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
