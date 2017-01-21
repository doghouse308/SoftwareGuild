/*
Given a string, return a version without the first 2 chars. Except keep the 
first char if it is 'a' and keep the second char if it is 'b'. The string may 
be any length.

TweakFront("Hello") -> "llo"
TweakFront("away") -> "aay"
TweakFront("abed") -> "abed"

public string TweakFront(string str) {

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
public class TweakFrontTest {

    public TweakFrontTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //TweakFront("Hello") -> "llo"
    @Test
    public void tweakFrontTest() {

        //arrange 
        String str = "Hello";
        String expected = "llo";

        //actual 
        TweakFront test = new TweakFront();
        String actual = test.tweakFront(str);

        //assert
        assertEquals(expected, actual);
    }

    //TweakFront("away") -> "aay"
    @Test
    public void tweakFrontTest2() {

        //arrange 
        String str = "away";
        String expected = "aay";

        //actual 
        TweakFront test = new TweakFront();
        String actual = test.tweakFront(str);

        //assert
        assertEquals(expected, actual);
    }

    //TweakFront("abed") -> "abed" 
    @Test
    public void tweakFrontTest3() {

        //arrange 
        String str = "abed";
        String expected = "abed";

        //actual 
        TweakFront test = new TweakFront();
        String actual = test.tweakFront(str);

        //assert
        assertEquals(expected, actual);
    }

    //TweakFront("a") -> "a" 
    @Test
    public void tweakFrontTest4() {

        //arrange 
        String str = "a";
        String expected = "a";

        //actual 
        TweakFront test = new TweakFront();
        String actual = test.tweakFront(str);

        //assert
        assertEquals(expected, actual);
    }    

}
