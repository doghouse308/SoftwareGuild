/*
Given a string, return a new string where "not " has been added to the front. 
However, if the string already begins with "not", return the string unchanged.

NotString("candy") -> "not candy"
NotString("x") -> "not x"
NotString("not bad") -> "not bad"

public string NotString(string s) {

}
 */
package com.sg.junitdrills.conditionals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class NotStringTest {

    public NotStringTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //NotString("candy") -> "not candy"
    @Test
    public void notStringTest() {

        //arrange
        String s = "candy";
        String expected = "not candy";

        //actual
        NotString test = new NotString();
        String actual = test.notString(s);

        //assert
        assertEquals(expected, actual);
    }

    //NotString("x") -> "not x"
    @Test
    public void notStringTest2() {

        //arrange
        String s = "x";
        String expected = "not x";

        //actual
        NotString test = new NotString();
        String actual = test.notString(s);

        //assert
        assertEquals(expected, actual);
    }

    //NotString("not bad") -> "not bad"  
    @Test
    public void notStringTest3(){
        
        //arrange
        String s = "not bad";
        String expected = "not bad";
        
        //actual
        NotString test = new NotString();
        String actual = test.notString(s);
        
        //assert
        assertEquals(expected, actual);
    }
       
}
