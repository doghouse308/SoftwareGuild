/*
Given an array of ints, return true if the array is length 1 or more, and the
first element and the last element are equal. 

SameFirstLast({1, 2, 3}) -> false
SameFirstLast({1, 2, 3, 1}) -> true
SameFirstLast({1, 2, 1}) -> true

public boolean SameFirstLast(int[] numbers) {

}
 */
package com.sg.junitdrills.arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class SameFirstLastTest {

    public SameFirstLastTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //SameFirstLast({1, 2, 3}) -> false
    @Test
    public void firstLast6Test() {

        //arrange
        int[] numbers = {1, 2, 3};
        boolean expected = false;

        //actual
        SameFirstLast test = new SameFirstLast();
        boolean actual = test.sameFirstLast(numbers);

        //assert
        assertEquals(expected, actual);
    }

    //SameFirstLast({1, 2, 3, 1}) -> true
    @Test
    public void firstLast6Tes2t() {

        //arrange
        int[] numbers = {1, 2, 3, 1};
        boolean expected = true;

        //actual
        SameFirstLast test = new SameFirstLast();
        boolean actual = test.sameFirstLast(numbers);

        //assert
        assertEquals(expected, actual);
    }

    //SameFirstLast({1, 2, 1}) -> true 
    @Test
    public void firstLast6Test3() {

        //arrange
        int[] numbers = {1, 2, 1};
        boolean expected = true;

        //actual
        SameFirstLast test = new SameFirstLast();
        boolean actual = test.sameFirstLast(numbers);

        //assert
        assertEquals(expected, actual);
    }
}
