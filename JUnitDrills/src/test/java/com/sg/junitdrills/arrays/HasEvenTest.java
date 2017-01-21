/*
Given an int array , return true if it contains an even number (HINT: Use Mod (%)). 

HasEven({2, 5}) -> true
HasEven({4, 3}) -> true
HasEven({7, 5}) -> false

public boolean HasEven(int[] numbers) {

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
public class HasEvenTest {

    public HasEvenTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //HasEven({2, 5}) -> true
    @Test
    public void hasEvenTest() {

        //arrange
        int[] n = {2, 5};
        boolean expected = true;

        //actual
        HasEven test = new HasEven();
        boolean actual = test.hasEven(n);

        //assert
        assertEquals(expected, actual);
    }

    //HasEven({4, 3}) -> true
    @Test
    public void hasEvenTest2() {

        //arrange
        int[] n = {4, 3};
        boolean expected = true;

        //actual
        HasEven test = new HasEven();
        boolean actual = test.hasEven(n);

        //assert
        assertEquals(expected, actual);
    }

    //HasEven({7, 5}) -> false  
    @Test
    public void hasEvenTest3() {

        //arrange
        int[] n = {7, 5};
        boolean expected = false;

        //actual
        HasEven test = new HasEven();
        boolean actual = test.hasEven(n);

        //assert
        assertEquals(expected, actual);
    }

    //HasEven({7, 13, 27, 15, 31, 19, 5}) -> false  
    @Test
    public void hasEvenTest4() {

        //arrange
        int[] n = {7, 13, 27, 15, 31, 19, 5};
        boolean expected = false;

        //actual
        HasEven test = new HasEven();
        boolean actual = test.hasEven(n);

        //assert
        assertEquals(expected, actual);
    }

    // HasEven({7, 13, 27, 15, 32, 19, 5}) -> false     
    @Test
    public void hasEvenTest5() {

        //arrange
        int[] n = {7, 13, 27, 15, 32, 19, 5};
        boolean expected = true;

        //actual
        HasEven test = new HasEven();
        boolean actual = test.hasEven(n);

        //assert
        assertEquals(expected, actual);
    }

}
