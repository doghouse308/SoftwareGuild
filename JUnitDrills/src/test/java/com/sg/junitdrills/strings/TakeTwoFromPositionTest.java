/*
Given a string and an index, return a string length 2 starting at the given 
index. If the index is too big or too small to define a string length 2, use the
first 2 chars. The string length will be at least 2. 



public string TakeTwoFromPosition(string str, int n) {

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
public class TakeTwoFromPositionTest {

    public TakeTwoFromPositionTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //TakeTwoFromPosition("java", 0) -> "ja"
    @Test
    public void takeTwoFromPositionTest() {

        //arrange 
        String str = "java";
        int n = 0;
        String expected = "ja";

        //actual 
        TakeTwoFromPosition test = new TakeTwoFromPosition();
        String actual = test.takeTwoFromPosition(str, n);

        //assert
        assertEquals(expected, actual);
    }

    //TakeTwoFromPosition("java", 2) -> "va"
    @Test
    public void takeTwoFromPositionTest2() {

        //arrange 
        String str = "java";
        int n = 2;
        String expected = "va";

        //actual 
        TakeTwoFromPosition test = new TakeTwoFromPosition();
        String actual = test.takeTwoFromPosition(str, n);

        //assert
        assertEquals(expected, actual);
    }

    //TakeTwoFromPosition("java", 3) -> "ja"
    @Test
    public void takeTwoFromPositionTest3() {

        //arrange 
        String str = "java";
        int n = 3;
        String expected = "ja";

        //actual 
        TakeTwoFromPosition test = new TakeTwoFromPosition();
        String actual = test.takeTwoFromPosition(str, n);

        //assert
        assertEquals(expected, actual);
    }
}
