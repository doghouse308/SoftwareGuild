/*
Given an int array, return a new array with double the length where its last 
element is the same as the original array, and all the other elements are 0. 
The original array will be length 1 or more. Note: by default, a new int array
contains all 0's. 

KeepLast({4, 5, 6}) -> {0, 0, 0, 0, 0, 6}
KeepLast({1, 2}) -> {0, 0, 0, 2}
KeepLast({3}) -> {0, 3}

public int[] KeepLast(int[] numbers) {

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
public class KeepLastTest {

    public KeepLastTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //KeepLast({4, 5, 6}) -> {0, 0, 0, 0, 0, 6}
    @Test
    public void keepLastTest() {

        //arrange
        int[] n = {4, 5, 6};
        int[] expected = {0, 0, 0, 0, 0, 6};

        //actual
        KeepLast test = new KeepLast();
        int[] actual = test.keepLast(n);

        //assert
        assertArrayEquals(expected, actual);
    }

    //KeepLast({1, 2}) -> {0, 0, 0, 2}
    @Test
    public void keepLastTest2() {

        //arrange
        int[] n = {1, 2};
        int[] expected = {0, 0, 0, 2};

        //actual
        KeepLast test = new KeepLast();
        int[] actual = test.keepLast(n);

        //assert
        assertArrayEquals(expected, actual);
    }

    //KeepLast({3}) -> {0, 3}  
    @Test
    public void keepLastTest3() {

        //arrange
        int[] n = {3};
        int[] expected = {0, 3};

        //actual
        KeepLast test = new KeepLast();
        int[] actual = test.keepLast(n);

        //assert
        assertArrayEquals(expected, actual);
    }

}
