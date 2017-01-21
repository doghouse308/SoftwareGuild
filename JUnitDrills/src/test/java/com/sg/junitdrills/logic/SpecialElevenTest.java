/*
We'll say a number is special if it is a multiple of 11 or if it is one more 
than a multiple of 11. Return true if the given non-negative number is special. 
Use the % "mod" operator

SpecialEleven(22) → true
SpecialEleven(23) → true
SpecialEleven(24) → false

public boolean SpecialEleven(int n) {

}.
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
public class SpecialElevenTest {
    
    public SpecialElevenTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
  
    //SpecialEleven(22) → true
    @Test
    public void specialElevenTest(){
        
        //arrange
        int n = 22;
        boolean expected = true;
        
        //actual
        SpecialEleven test = new SpecialEleven();
        boolean actual = test.specialEleven(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //SpecialEleven(23) → true
    @Test
    public void specialElevenTest2(){
        
        //arrange
        int n = 23;
        boolean expected = true;
        
        //actual
        SpecialEleven test = new SpecialEleven();
        boolean actual = test.specialEleven(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //SpecialEleven(24) → false 
    @Test
    public void specialElevenTest3(){
        
        //arrange
        int n = 24;
        boolean expected = false;
        
        //actual
        SpecialEleven test = new SpecialEleven();
        boolean actual = test.specialEleven(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
