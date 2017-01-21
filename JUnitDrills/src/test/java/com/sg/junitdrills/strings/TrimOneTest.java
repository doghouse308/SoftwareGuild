/*
Given a string, return a version without the first and last char, so "Hello" 
yields "ell". The string length will be at least 2. 

TrimOne("Hello") -> "ell"
TrimOne("java") -> "av"
TrimOne("coding") -> "odin"

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
public class TrimOneTest {

    public TrimOneTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //TrimOne("Hello") -> "ell"
    @Test
    public void trimOneTest() {

        //arrange
        String str = "Hello";
        String expected = "ell";

        //actual 
        TrimOne test = new TrimOne();
        String actual = test.trimOne(str);

        //assert
        assertEquals(expected, actual);
    }

    //TrimOne("java") -> "av"
    @Test
    public void trimOneTest2() {

        //arrange
        String str = "java";
        String expected = "av";

        //actual 
        TrimOne test = new TrimOne();
        String actual = test.trimOne(str);

        //assert
        assertEquals(expected, actual);
    }

    //TrimOne("coding") -> "odin"
    @Test
    public void trimOneTest3() {

        //arrange
        String str = "coding";
        String expected = "odin";

        //actual 
        TrimOne test = new TrimOne();
        String actual = test.trimOne(str);

        //assert
        assertEquals(expected, actual);
    }
}
