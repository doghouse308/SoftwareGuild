/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". 

FirstHalf("WooHoo") -> "Woo"
FirstHalf("HelloThere") -> "Hello"
FirstHalf("abcdef") -> "abc"

public string FirstHalf(string str) {}
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
public class FirstHalfTest {

    public FirstHalfTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //FirstHalf("WooHoo") -> "Woo"
    @Test
    public void firstHalfTest() {

        //arrange
        String str = "WooHoo";
        String expected = "Woo";

        //actual
        FirstHalf test = new FirstHalf();
        String actual = test.firstHalf(str);

        //assert
        assertEquals(expected, actual);
    }

    //FirstHalf("HelloThere") -> "Hello"
    @Test
    public void firstHalfTest2() {

        //arrange
        String str = "HelloThere";
        String expected = "Hello";

        //actual
        FirstHalf test = new FirstHalf();
        String actual = test.firstHalf(str);

        //assert
        assertEquals(expected, actual);
    }

    //FirstHalf("abcdef") -> "abc"
    @Test
    public void firstHalfTest3() {

        //arrange
        String str = "abcdef";
        String expected = "abc";

        //actual
        FirstHalf test = new FirstHalf();
        String actual = test.firstHalf(str);

        //assert
        assertEquals(expected, actual);
    }
}
