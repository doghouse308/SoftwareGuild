/*
Given a string, return a string length 2 made of its first 2 chars. If the 
string length is less than 2, use '@' for the missing chars. 

AtFirst("hello") -> "he"
AtFirst("hi") -> "hi"
AtFirst("h") -> "h@"

public string AtFirst(string str) {

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
public class AtFirstTest {

    public AtFirstTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //AtFirst("hello") -> "he"
    @Test
    public void AtFirst() {

        //arrange 
        String str = "hello";
        String expected = "he";

        //actual 
        AtFirst test = new AtFirst();
        String actual = test.atFirst(str);

        //assert
        assertEquals(expected, actual);
    }

    //AtFirst("hi") -> "hi"
    @Test
    public void AtFirst2() {

        //arrange 
        String str = "hi";
        String expected = "hi";

        //actual 
        AtFirst test = new AtFirst();
        String actual = test.atFirst(str);

        //assert
        assertEquals(expected, actual);
    }

    //AtFirst("h") -> "h@"
    @Test
    public void AtFirst3() {

        //arrange 
        String str = "h";
        String expected = "h@";

        //actual 
        AtFirst test = new AtFirst();
        String actual = test.atFirst(str);

        //assert
        assertEquals(expected, actual);
    }
    
    //AtFirst("") -> "@@"
    @Test
    public void AtFirst4() {

        //arrange 
        String str = "";
        String expected = "@@";

        //actual 
        AtFirst test = new AtFirst();
        String actual = test.atFirst(str);

        //assert
        assertEquals(expected, actual);
    }

}
