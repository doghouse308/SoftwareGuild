/*
Given 2 strings, a and b, return a new string made of the first char of a and 
the last char of b, so "yo" and "java" yields "ya". If either string is length 
0, use '@' for its missing char. 

LastChars("last", "chars") -> "ls"
LastChars("yo", "mama") -> "ya"
LastChars("hi", "") -> "h@"

public string LastChars(string str) {

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
public class LastCharsTest {

    public LastCharsTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //LastChars("last", "chars") -> "ls"
    @Test
    public void lastChars() {

        //arrange 
        String a = "last";
        String b = "chars";
        String expected = "ls";

        //actual 
        LastChars test = new LastChars();
        String actual = test.lastChars(a, b);

        //assert
        assertEquals(expected, actual);
    }

    //LastChars("yo", "mama") -> "ya"
    @Test
    public void lastChars2() {

        //arrange 
        String a = "yo";
        String b = "mama";
        String expected = "ya";

        //actual 
        LastChars test = new LastChars();
        String actual = test.lastChars(a, b);

        //assert
        assertEquals(expected, actual);
    }

    //LastChars("hi", "") -> "h@"
    @Test
    public void lastChars3() {

        //arrange 
        String a = "hi";
        String b = "";
        String expected = "h@";

        //actual 
        LastChars test = new LastChars();
        String actual = test.lastChars(a, b);

        //assert
        assertEquals(expected, actual);
    }
    
    //LastChars("", "mama") -> "@a"
    @Test
    public void lastChars4() {

        //arrange 
        String a = "";
        String b = "mama";
        String expected = "@a";

        //actual 
        LastChars test = new LastChars();
        String actual = test.lastChars(a, b);

        //assert
        assertEquals(expected, actual);
    }

}
