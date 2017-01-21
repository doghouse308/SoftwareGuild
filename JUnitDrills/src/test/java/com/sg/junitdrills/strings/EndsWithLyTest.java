/*
Given a string, return true if it ends in "ly". 

EndsWithLy("oddly") -> true
EndsWithLy("y") -> false
EndsWithLy("oddy") -> false

public boolean EndsWithLy(string str) { 

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
public class EndsWithLyTest {

    public EndsWithLyTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //EndsWithLy("oddly") -> true
    @Test
    public void EndsWithLyTest() {
        //arrange 
        String str = "oddly";
        boolean expected = true;

        //actual 
        EndsWithLy test = new EndsWithLy();
        boolean actual = test.EndsWithLy(str);

        //assert
        assertEquals(expected, actual);
    }

    //EndsWithLy("y") -> false
    @Test
    public void EndsWithLyTest2() {
        //arrange 
        String str = "y";
        boolean expected = false;

        //actual 
        EndsWithLy test = new EndsWithLy();
        boolean actual = test.EndsWithLy(str);

        //assert
        assertEquals(expected, actual);
    }

    //EndsWithLy("oddy") -> false
    @Test
    public void EndsWithLyTest3() {
        //arrange 
        String str = "oddy";
        boolean expected = false;

        //actual 
        EndsWithLy test = new EndsWithLy();
        boolean actual = test.EndsWithLy(str);

        //assert
        assertEquals(expected, actual);
    }
}
