/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the
string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be 
any length, including 0.

HasBad("badxx") -> true
HasBad("xbadxx") -> true
HasBad("xxbadxx") -> false

public boolean HasBad(string str) {

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
public class HasBadTest {

    public HasBadTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //HasBad("badxx") -> true
    @Test
    public void hasBadTest() {
        //arrange 
        String str = "badxx";
        boolean expected = true;

        //actual 
        HasBad test = new HasBad();
        boolean actual = test.hasBad(str);

        //assert
        assertEquals(expected, actual);
    }

    //HasBad("xbadxx") -> true
    @Test
    public void hasBadTest2() {
        //arrange 
        String str = "xbadxx";
        boolean expected = true;

        //actual 
        HasBad test = new HasBad();
        boolean actual = test.hasBad(str);

        //assert
        assertEquals(expected, actual);
    }

    //HasBad("xxbadxx") -> false
    @Test
    public void hasBadTest3() {
        //arrange 
        String str = "xxbadxx";
        boolean expected = false;

        //actual 
        HasBad test = new HasBad();
        boolean actual = test.hasBad(str);

        //assert
        assertEquals(expected, actual);
    }

    //HasBad("") -> false
    @Test
    public void hasBadTest4() {
        //arrange 
        String str = "";
        boolean expected = false;

        //actual 
        HasBad test = new HasBad();
        boolean actual = test.hasBad(str);

        //assert
        assertEquals(expected, actual);
    }
}
