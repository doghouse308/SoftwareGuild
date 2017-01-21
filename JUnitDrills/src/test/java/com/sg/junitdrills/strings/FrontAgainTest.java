/*
Given a string, return true if the first 2 chars in the string also appear at 
the end of the string, such as with "edited". 

FrontAgain("edited") -> true
FrontAgain("edit") -> false
FrontAgain("ed") -> true

public boolean FrontAgain(string str) {

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
public class FrontAgainTest {

    public FrontAgainTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //FrontAgain("edited") -> true
    @Test
    public void hasBadTest() {
        //arrange 
        String str = "edited";
        boolean expected = true;

        //actual 
        FrontAgain test = new FrontAgain();
        boolean actual = test.frontAgain(str);

        //assert
        assertEquals(expected, actual);
    }

    //FrontAgain("edit") -> false
    @Test
    public void hasBadTest2() {
        //arrange 
        String str = "edit";
        boolean expected = false;

        //actual 
        FrontAgain test = new FrontAgain();
        boolean actual = test.frontAgain(str);

        //assert
        assertEquals(expected, actual);
    }

    //FrontAgain("ed") -> true
    @Test
    public void hasBadTest3() {
        //arrange 
        String str = "ed";
        boolean expected = true;

        //actual 
        FrontAgain test = new FrontAgain();
        boolean actual = test.frontAgain(str);

        //assert
        assertEquals(expected, actual);
    }

}
