/*
Given a string and a non-negative int n, we'll say that the front of the string
is the first 3 chars, or whatever is there if the string is less than length 3.
Return n copies of the front; 

FrontTimes("Chocolate", 2) -> "ChoCho"
FrontTimes("Chocolate", 3) -> "ChoChoCho"
FrontTimes("Abc", 3) -> "AbcAbcAbc"

public string FrontTimes(string str, int n) {

}
 */
package com.sg.junitdrills.loops;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class FrontTimesTest {
    
    public FrontTimesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //FrontTimes("Chocolate", 2) -> "ChoCho"
    @Test
    public void frontTimesTest(){
        
        //arrange
        String str = "Chocolate";
        int n = 2;
        String expected = "ChoCho";
        
        //actual
        FrontTimes test = new FrontTimes();
        String actual = test.frontTimes(str, n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //FrontTimes("Chocolate", 3) -> "ChoChoCho"
    @Test
    public void frontTimesTest2(){
        
        //arrange
        String str = "Chocolate";
        int n = 3;
        String expected = "ChoChoCho";
        
        //actual
        FrontTimes test = new FrontTimes();
        String actual = test.frontTimes(str, n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //FrontTimes("Abc", 3) -> "AbcAbcAbc"   
    @Test
    public void frontTimesTest3(){
        
        //arrange
        String str = "Abc";
        int n = 3;
        String expected = "AbcAbcAbc";
        
        //actual
        FrontTimes test = new FrontTimes();
        String actual = test.frontTimes(str, n);
        
        //assert
        assertEquals(expected, actual);
    }    
}
