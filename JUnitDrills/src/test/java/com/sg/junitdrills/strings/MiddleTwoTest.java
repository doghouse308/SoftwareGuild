/*
Given a string of even length, return a string made of the middle two chars, so 
the string "string" yields "ri". The string length will be at least 2. 

MiddleTwo("string") -> "ri"
MiddleTwo("code") -> "od"
MiddleTwo("Practice") -> "ct"

public string MiddleTwo(string str ) {

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
public class MiddleTwoTest {

    public MiddleTwoTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //MiddleTwo("string") -> "ri"
    @Test
    public void takeOneTest() {

        //arrange 
        String str = "string";
        String expected = "ri";

        //actual 
        MiddleTwo test = new MiddleTwo();
        String actual = test.middleTwo(str);

        //assert
        assertEquals(expected, actual);
    }

    //MiddleTwo("code") -> "od"
    @Test
    public void takeOneTest2() {

        //arrange 
        String str = "code";
        String expected = "od";

        //actual 
        MiddleTwo test = new MiddleTwo();
        String actual = test.middleTwo(str);

        //assert
        assertEquals(expected, actual);
    }

    //MiddleTwo("Practice") -> "ct"
    @Test
    public void takeOneTest3() {

        //arrange 
        String str = "Practice";
        String expected = "ct";

        //actual 
        MiddleTwo test = new MiddleTwo();
        String actual = test.middleTwo(str);

        //assert
        assertEquals(expected, actual);
    }

}
