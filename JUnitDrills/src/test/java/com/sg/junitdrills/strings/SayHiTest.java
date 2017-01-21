package com.sg.junitdrills.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class SayHiTest {

    public SayHiTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void sayHiTest() {
        //arrange
        String name = "Bob";
        String expected = "Hello " + name + "!";

        //actual
        SayHi hi = new SayHi();
        String actual = hi.sayHi(name);

        //assert
        assertEquals(actual, expected);
    }

    @Test
    public void sayHiTest2() {
        //arrange
        String name = "Alice";
        String expected = "Hello " + name + "!";

        //actual
        SayHi hi = new SayHi();
        String actual = hi.sayHi(name);

        //assert
        assertEquals(actual, expected);
    }

    @Test
    public void sayHiTest3() {
        //arrange
        String name = "X";
        String expected = "Hello " + name + "!";

        //actual
        SayHi hi = new SayHi();
        String actual = hi.sayHi(name);

        //assert
        assertEquals(actual, expected);
    }
}
