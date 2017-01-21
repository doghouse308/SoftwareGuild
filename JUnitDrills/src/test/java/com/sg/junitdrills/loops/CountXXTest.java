/*
Count the number of "xx" in the given string. We'll say that overlapping is 
allowed, so "xxx" contains 2 "xx". 

CountXX("abcxx") -> 1
CountXX("xxx") -> 2
CountXX("xxxx") -> 3

public int CountXX(string str) {

}
 */
package com.sg.junitdrills.loops;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class CountXXTest {

    public CountXXTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //CountXX("abcxx") -> 1
    @Test
    public void countXXTest() {

        //arrange
        String str = "abcxx";
        int expected = 1;

        //actual
        CountXX test = new CountXX();
        int actual = test.countXX(str);

        //assert
        assertEquals(expected, actual);
    }

    //CountXX("xxx") -> 2
    @Test
    public void countXXTest2() {

        //arrange
        String str = "xxx";
        int expected = 2;

        //actual
        CountXX test = new CountXX();
        int actual = test.countXX(str);

        //assert
        assertEquals(expected, actual);
    }

    //CountXX("xxxx") -> 3  
    @Test
    public void countXXTest3() {

        //arrange
        String str = "xxxx";
        int expected = 3;

        //actual
        CountXX test = new CountXX();
        int actual = test.countXX(str);

        //assert
        assertEquals(expected, actual);
    }
    
}
