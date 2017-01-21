/*
Given a string and an int n, return a string made of the first and last n chars 
from the string. The string length will be at least n. 

FrontAndBack("Hello", 2) -> "Helo"
FrontAndBack("Chocolate", 3) -> "Choate"
FrontAndBack("Chocolate", 1) -> "Ce"

public string FrontAndBack(string str, int n) {

}
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
public class FrontAndBackTest {
    
    public FrontAndBackTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //FrontAndBack("Hello", 2) -> "Helo"
    @Test
    public void frontAndBackTest() {

        //arrange 
        String str = "Hello";
        int n = 2;
        String expected = "Helo";

        //actual 
        FrontAndBack test = new FrontAndBack();
        String actual = test.frontAndBack(str, n);

        //assert
        assertEquals(expected, actual);
    }
    
    //FrontAndBack("Chocolate", 3) -> "Choate"
        @Test
    public void frontAndBackTest2() {

        //arrange 
        String str = "Chocolate";
        int n = 3;
        String expected = "Choate";

        //actual 
        FrontAndBack test = new FrontAndBack();
        String actual = test.frontAndBack(str, n);

        //assert
        assertEquals(expected, actual);
    }
    
    //FrontAndBack("Chocolate", 1) -> "Ce"
        @Test
    public void frontAndBackTest3() {

        //arrange 
        String str = "Chocolate";
        int n = 1;
        String expected = "Ce";

        //actual 
        FrontAndBack test = new FrontAndBack();
        String actual = test.frontAndBack(str, n);

        //assert
        assertEquals(expected, actual);
    }
    
    
}
