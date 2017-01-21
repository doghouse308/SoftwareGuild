/*
Given 2 strings, a and b, return a string of the form short+long+short, with the
shorter string on the outside and the longer string on the inside. The strings 
will not be the same length, but they may be empty (length 0). 

LongInMiddle("Hello", "hi") -> "hiHellohi"
LongInMiddle("hi", "Hello") -> "hiHellohi"
LongInMiddle("aaa", "b") -> "baaab"

public string LongInMiddle(string a, string b) {

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
public class LongInMiddleTest {

    public LongInMiddleTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //LongInMiddle("Hello", "hi") -> "hiHellohi"
    @Test
    public void longInMiddle() {

        //arrange
        String a = "Hello";
        String b = "hi";
        String expected = "hiHellohi";

        //actual
        LongInMiddle test = new LongInMiddle();
        String actual = test.longInMiddle(a, b);

        //assert
        assertEquals(expected, actual);
    }

    //LongInMiddle("hi", "Hello") -> "hiHellohi"
    @Test
    public void longInMiddle2() {

        //arrange
        String a = "hi";
        String b = "Hello";
        String expected = "hiHellohi";

        //actual
        LongInMiddle test = new LongInMiddle();
        String actual = test.longInMiddle(a, b);

        //assert
        assertEquals(expected, actual);
    }

    //LongInMiddle("aaa", "b") -> "baaab"
    @Test
    public void longInMiddle3() {

        //arrange
        String a = "aaa";
        String b = "b";
        String expected = "baaab";

        //actual
        LongInMiddle test = new LongInMiddle();
        String actual = test.longInMiddle(a, b);

        //assert
        assertEquals(expected, actual);
    }

}
