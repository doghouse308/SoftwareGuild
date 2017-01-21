/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are teen. 

HasTeen(13, 20, 10) -> true
HasTeen(20, 19, 10) -> true
HasTeen(20, 10, 12) -> false

public boolean (int a, int b, int c) {

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
public class HasTeenTest {

    public HasTeenTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //HasTeen(13, 20, 10) -> true
    @Test
    public void hasTeenTest() {

        //arrange
        int a = 13;
        int b = 20;
        int c = 10;
        boolean expected = true;

        //actual
        HasTeen test = new HasTeen();
        boolean actual = test.hasTeen(a, b, c);

        //assert
        assertEquals(expected, actual);
    }

    //HasTeen(20, 19, 10) -> true
    @Test
    public void hasTeenTest2() {

        //arrange
        int a = 20;
        int b = 19;
        int c = 10;
        boolean expected = true;

        //actual
        HasTeen test = new HasTeen();
        boolean actual = test.hasTeen(a, b, c);

        //assert
        assertEquals(expected, actual);
    }

    //HasTeen(20, 10, 12) -> false   
    @Test
    public void hasTeenTest3() {

        //arrange
        int a = 20;
        int b = 10;
        int c = 12;
        boolean expected = false;

        //actual
        HasTeen test = new HasTeen();
        boolean actual = test.hasTeen(a, b, c);

        //assert
        assertEquals(expected, actual);
    }

}
