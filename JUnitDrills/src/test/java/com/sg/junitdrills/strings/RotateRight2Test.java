/*
Given a string, return a "rotated right 2" version where the last 2 chars are 
moved to the start. The string length will be at least 2. 

RotateRight2("Hello") -> "loHel"
RotateRight2("java") -> "vaja"
RotateRight2("Hi") -> "Hi"
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
public class RotateRight2Test {

    public RotateRight2Test() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //RotateRight2("Hello") -> "loHel"
    @Test
    public void rotateRight2Test() {

        //arrange 
        String str = "Hello";
        String expected = "loHel";

        //actual 
        RotateRight2 test = new RotateRight2();
        String actual = test.rotateRight2(str);

        //assert
        assertEquals(expected, actual);
    }

    //RotateRight2("java") -> "vaja"
    @Test
    public void rotateRight2Test2() {

        //arrange 
        String str = "java";
        String expected = "vaja";

        //actual 
        RotateRight2 test = new RotateRight2();
        String actual = test.rotateRight2(str);

        //assert
        assertEquals(expected, actual);
    }
    //RotateRight2("Hi") -> "Hi"
    @Test
    public void rotateRight2Test3() {

        //arrange 
        String str = "Hi";
        String expected = "Hi";

        //actual 
        RotateRight2 test = new RotateRight2();
        String actual = test.rotateRight2(str);

        //assert
        assertEquals(expected, actual);
    }
}
