/*
Given two strings, append them together (known as "concatenation") and return 
the result. However, if the concatenation creates a double-char, then omit one 
of the chars, so "abc" and "cat" yields "abcat". 

ConCat("abc", "cat") -> "abcat"
ConCat("dog", "cat") -> "dogcat"
ConCat("abc", "") -> "abc"

public string ConCat(string a, string b) {

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
public class ConCatTest {

    public ConCatTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //ConCat("abc", "cat") -> "abcat"
    @Test
    public void conCatTest() {

        //arrange 
        String a = "abc";
        String b = "cat";
        String expected = "abcat";

        //actual 
        ConCat test = new ConCat();
        String actual = test.conCat(a, b);

        //assert
        assertEquals(expected, actual);
    }

    //ConCat("dog", "cat") -> "dogcat"
    @Test
    public void conCatTest2() {

        //arrange 
        String a = "dog";
        String b = "cat";
        String expected = "dogcat";

        //actual 
        ConCat test = new ConCat();
        String actual = test.conCat(a, b);

        //assert
        assertEquals(expected, actual);
    }
    
    //ConCat("abc", "") -> "abc"
    @Test
    public void conCatTest3() {

        //arrange 
        String a = "abc";
        String b = "";
        String expected = "abc";

        //actual 
        ConCat test = new ConCat();
        String actual = test.conCat(a, b);

        //assert
        assertEquals(expected, actual);
    }
        //ConCat("", "def") -> "def"
    @Test
    public void conCatTest4() {

        //arrange 
        String a = "";
        String b = "def";
        String expected = "def";

        //actual 
        ConCat test = new ConCat();
        String actual = test.conCat(a, b);

        //assert
        assertEquals(expected, actual);
    }
}
