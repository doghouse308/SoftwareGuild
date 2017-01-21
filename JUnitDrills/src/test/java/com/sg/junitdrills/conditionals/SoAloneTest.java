/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 2 int values, return true if one or the other is teen, but not both. 

SoAlone(13, 99) -> true
SoAlone(21, 19) -> true
SoAlone(13, 13) -> false

public boolean SoAlone(int a, int b) {

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
public class SoAloneTest {
    
    public SoAloneTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //SoAlone(13, 99) -> true
    @Test
    public void soAloneTest(){
        
        //arrange
        int a = 13;
        int b = 99;
        boolean expected = true;
        
        //actual
        SoAlone test = new SoAlone();
        boolean actual = test.soAlone(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //SoAlone(21, 19) -> true
    @Test
    public void soAloneTest2(){
        
        //arrange
        int a = 21;
        int b = 19;
        boolean expected = true;
        
        //actual
        SoAlone test = new SoAlone();
        boolean actual = test.soAlone(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //SoAlone(13, 13) -> false  
    @Test
    public void soAloneTest3(){
        
        //arrange
        int a = 13;
        int b = 13;
        boolean expected = false;
        
        //actual
        SoAlone test = new SoAlone();
        boolean actual = test.soAlone(a, b);
        
        //assert
        assertEquals(expected, actual);
    }    
    
}
