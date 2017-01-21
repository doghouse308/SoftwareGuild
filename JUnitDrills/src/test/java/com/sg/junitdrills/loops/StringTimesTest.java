/*
Given a string and a non-negative int n, return a larger string that is 
n copies of the original string. 

StringTimes("Hi", 2) -> "HiHi"
StringTimes("Hi", 3) -> "HiHiHi"
StringTimes("Hi", 1) -> "Hi"

public string StringTimes(string str, int n) {

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
public class StringTimesTest {
    
    public StringTimesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //StringTimes("Hi", 2) -> "HiHi"
    @Test
    public void stringTimesTest(){
        
        //arrange
        String str = "Hi";
        int n = 2;
        String expected = "HiHi";
        
        //actual
        StringTimes test = new StringTimes();
        String actual = test.stringTimes(str, n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //StringTimes("Hi", 3) -> "HiHiHi"
    @Test
    public void stringTimesTest2(){
        
        //arrange
        String str = "Hi";
        int n = 3;
        String expected = "HiHiHi";
        
        //actual
        StringTimes test = new StringTimes();
        String actual = test.stringTimes(str, n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //StringTimes("Hi", 1) -> "Hi"    
    @Test
    public void stringTimesTest3(){
        
        //arrange
        String str = "Hi";
        int n = 1;
        String expected = "Hi";
        
        //actual
        StringTimes test = new StringTimes();
        String actual = test.stringTimes(str, n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //StringTimes("Hi", -1) -> "Hi"    
    @Test
    public void stringTimesTest4(){
        
        //arrange
        String str = "Hi";
        int n = -1;
        String expected = "Hi";
        
        //actual
        StringTimes test = new StringTimes();
        String actual = test.stringTimes(str, n);
        
        //assert
        assertEquals(expected, actual);
    }    
          
}
