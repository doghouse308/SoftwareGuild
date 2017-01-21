/*
Given two int values, return their sum. However, if the two values are the same,
then return double their sum. 

SumDouble(1, 2) -> 3
SumDouble(3, 2) -> 5
SumDouble(2, 2) -> 8

public int SumDouble(int a, int b) {
  
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
public class SumDoubleTest {

    public SumDoubleTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //SumDouble(1, 2) -> 3
    @Test
    public void SumDoubleTest() {

        int a = 1;
        int b = 2;
        int expected = 3;

        //arrange
        SumDouble test = new SumDouble();
        int actual = test.sumDouble(a, b);

        //assert
        assertEquals(expected, actual);
    }

    //SumDouble(3, 2) -> 5
    @Test
    public void SumDoubleTest2() {

        int a = 3;
        int b = 2;
        int expected = 5;

        //arrange
        SumDouble test = new SumDouble();
        int actual = test.sumDouble(a, b);

        //assert
        assertEquals(expected, actual);
    }

    //SumDouble(2, 2) -> 8  
    @Test
    public void SumDoubleTest3() {

        int a = 2;
        int b = 2;
        int expected = 8;

        //arrange
        SumDouble test = new SumDouble();
        int actual = test.sumDouble(a, b);

        //assert
        assertEquals(expected, actual);
    }

}
