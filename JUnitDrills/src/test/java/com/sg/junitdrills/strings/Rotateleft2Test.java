/*
Given a string, return a "rotated left 2" version where the first 2 chars are 
moved to the end. The string length will be at least 2. 

Rotateleft2("Hello") -> "lloHe"
Rotateleft2("java") -> "vaja"
Rotateleft2("Hi") -> "Hi"

public string Rotateleft2(string str) {

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
public class Rotateleft2Test {

    public Rotateleft2Test() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //Rotateleft2("Hello") -> "lloHe"
    @Test
    public void rotateleft2Test() {

        //arrange
        String str = "Hello";
        String expected = "lloHe";

        //actual
        Rotateleft2 test = new Rotateleft2();
        String actual = test.rotateleft2(str);

        //assert
        assertEquals(expected, actual);
    }

    //Rotateleft2("java") -> "vaja"
    @Test
    public void rotateleft2Test2() {

        //arrange
        String str = "java";
        String expected = "vaja";

        //actual
        Rotateleft2 test = new Rotateleft2();
        String actual = test.rotateleft2(str);

        //assert
        assertEquals(expected, actual);
    }

    //Rotateleft2("Hi") -> "Hi"
    @Test
    public void rotateleft2Test3() {

        //arrange
        String str = "Hi";
        String expected = "Hi";

        //actual
        Rotateleft2 test = new Rotateleft2();
        String actual = test.rotateleft2(str);

        //assert
        assertEquals(expected, actual);
    }
}
