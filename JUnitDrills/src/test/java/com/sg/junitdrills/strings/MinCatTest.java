/*
Given two strings, append them together (known as "concatenation") and return
the result. However, if the strings are different lengths, omit chars from the 
longer string so it is the same length as the shorter string. So "Hello" and 
"Hi" yield "loHi". The strings may be any length. 

MinCat("Hello", "Hi") -> "loHi"
MinCat("Hello", "java") -> "ellojava"
MinCat("java", "Hello") -> "javaello"

public string MinCat(string a, string b) {

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
public class MinCatTest {

    public MinCatTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //    MinCat("Hello", "Hi") -> "loHi"
    @Test
    public void minCatTest() {

        //arrange 
        String a = "Hello";
        String b = "Hi";
        String expected = "loHi";

        //actual 
        MinCat test = new MinCat();
        String actual = test.minCat(a, b);

        //assert
        assertEquals(expected, actual);
    }

    //    MinCat("Hello", "java") -> "ellojava"
    @Test
    public void minCatTest2() {

        //arrange 
        String a = "Hello";
        String b = "java";
        String expected = "ellojava";

        //actual 
        MinCat test = new MinCat();
        String actual = test.minCat(a, b);

        //assert
        assertEquals(expected, actual);
    }

    //    MinCat("java", "Hello") -> "javaello"    
    @Test
    public void minCatTest3() {

        //arrange 
        String a = "java";
        String b = "Hello";
        String expected = "javaello";

        //actual 
        MinCat test = new MinCat();
        String actual = test.minCat(a, b);

        //assert
        assertEquals(expected, actual);
    }
    
    //    MinCat("abc", "def") -> "abcdef"    
    @Test
    public void minCatTest4() {

        //arrange 
        String a = "abc";
        String b = "def";
        String expected = "abcdef";

        //actual 
        MinCat test = new MinCat();
        String actual = test.minCat(a, b);

        //assert
        assertEquals(expected, actual);
    }

}
