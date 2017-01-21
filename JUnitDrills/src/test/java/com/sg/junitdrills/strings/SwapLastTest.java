/*
Given a string of any length, return a new string where the last 2 chars, if 
present, are swapped, so "coding" yields "codign". 

SwapLast("coding") -> "codign"
SwapLast("cat") -> "cta"
SwapLast("ab") -> "ba"

public string SwapLast(string str) {

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
public class SwapLastTest {

    public SwapLastTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //SwapLast("coding") -> "codign"
    @Test
    public void AtFirst() {

        //arrange 
        String str = "coding";
        String expected = "codign";

        //actual 
        SwapLast test = new SwapLast();
        String actual = test.swapLast(str);

        //assert
        assertEquals(expected, actual);
    }

    //SwapLast("cat") -> "cta"
    @Test
    public void AtFirst2() {

        //arrange 
        String str = "cat";
        String expected = "cta";

        //actual 
        SwapLast test = new SwapLast();
        String actual = test.swapLast(str);

        //assert
        assertEquals(expected, actual);
    }  
    
    //SwapLast("ab") -> "ba"
    @Test
    public void AtFirst3() {

        //arrange 
        String str = "ab";
        String expected = "ba";

        //actual 
        SwapLast test = new SwapLast();
        String actual = test.swapLast(str);

        //assert
        assertEquals(expected, actual);
    }    
    
    //SwapLast("a") -> "b"
    @Test
    public void AtFirst4() {

        //arrange 
        String str = "a";
        String expected = "a";

        //actual 
        SwapLast test = new SwapLast();
        String actual = test.swapLast(str);

        //assert
        assertEquals(expected, actual);
    }      
}
