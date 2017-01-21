/*
Given an array of ints length 3, return a new array with the elements in reverse
order, so for example {1, 2, 3} becomes {3, 2, 1}. 

public int[] Reverse(int[] numbers) {

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
public class ReverseTest {

    public ReverseTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // {1, 2, 3} becomes {3, 2, 1}
    @Test
    public void reverseTest() {

        //arrange
        int[] n = {1, 2, 3};
        int[] expected = {3, 2, 1};

        //actual
        Reverse test = new Reverse();
        int[] actual = test.reverse(n);

        //assert
        assertArrayEquals(expected, actual);
    }

    // {1, 2, 3, 4, 5} becomes {5, 4, 3, 2, 1}
    @Test
    public void reverseTest2() {

        //arrange
        int[] n = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};

        //actual
        Reverse test = new Reverse();
        int[] actual = test.reverse(n);

        //assert
        assertArrayEquals(expected, actual);
    }

    // {3, 1, 7} becomes {7, 1, 3}
    @Test
    public void reverseTest3() {

        //arrange
        int[] n = {3, 1, 7} ;
        int[] expected = {7, 1, 3};

        //actual
        Reverse test = new Reverse();
        int[] actual = test.reverse(n);

        //assert
        assertArrayEquals(expected, actual);
    }
    
    // {7, 6, 0, 1} becomes {1, 0, 6, 7}
    @Test
    public void reverseTest4() {

        //arrange
        int[] n = {7, 6, 0, 1};
        int[] expected = {1, 0, 6, 7};

        //actual
        Reverse test = new Reverse();
        int[] actual = test.reverse(n);

        //assert
        assertArrayEquals(expected, actual);
    }    

}
