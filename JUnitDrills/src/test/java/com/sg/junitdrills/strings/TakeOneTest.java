/*
Given a string, return a string length 1 from its front, unless front is false,
in which case return a string length 1 from its back. The string will be non-empty. 

TakeOne("Hello", true) -> "H"
TakeOne("Hello", false) -> "o"
TakeOne("oh", true) -> "o"

public string TakeOne(string str, boolean fromFront) {

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
public class TakeOneTest {

    public TakeOneTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //TakeOne("Hello", true) -> "H"
    @Test
    public void takeOneTest() {

        //arrange 
        String str = "Hello";
        String expected = "H";

        //actual 
        TakeOne test = new TakeOne();
        String actual = test.takeOne(str, true);

        //assert
        assertEquals(expected, actual);
    }
    
    //TakeOne("Hello", false) -> "o"
        @Test
    public void takeOneTest2() {

        //arrange 
        String str = "Hello";
        String expected = "o";

        //actual 
        TakeOne test = new TakeOne();
        String actual = test.takeOne(str, false);

        //assert
        assertEquals(expected, actual);
    }
    
    //TakeOne("oh", true) -> "o"
        @Test
    public void takeOneTest3() {

        //arrange 
        String str = "oh";
        String expected = "o";

        //actual 
        TakeOne test = new TakeOne();
        String actual = test.takeOne(str, true);

        //assert
        assertEquals(expected, actual);
    }
}
