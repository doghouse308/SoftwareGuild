/*
Given a string, return a new string made of 3 copies of the last 2 chars of the 
original string. The string length will be at least 2. 

MultipleEndings("Hello") -> "lololo"
MultipleEndings("ab") -> "ababab"
MultipleEndings("Hi") -> "HiHiHi"

public string MultipleEndings(string str) 
 */
package com.sg.junitdrills.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class MultipleEndingsTest {
    
    public MultipleEndingsTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    //MultipleEndings("Hello") -> "lololo"
    @Test
    public void multipleEndingsTest(){
        
        //arranve
        String a = "Hello";
        String expected = "HeHeHe";
        
        //actual
        MultipleEndings test = new MultipleEndings();
        String actual = test.multipleEndings(a);
        
        //assert
        assertEquals(expected, actual);
    }
    //MultipleEndings("ab") -> "ababab"
        @Test
    public void multipleEndingsTest2(){
        
        //arranve
        String a = "ab";
        String expected = "ababab";
        
        //actual
        MultipleEndings test = new MultipleEndings();
        String actual = test.multipleEndings(a);
        
        //assert
        assertEquals(expected, actual);
    }
    //MultipleEndings("Hi") -> "HiHiHi"
        @Test
    public void multipleEndingsTest3(){
        
        //arranve
        String a = "Hi";
        String expected = "HiHiHi";
        
        //actual
        MultipleEndings test = new MultipleEndings();
        String actual = test.multipleEndings(a);
        
        //assert
        assertEquals(expected, actual);
    }
}
