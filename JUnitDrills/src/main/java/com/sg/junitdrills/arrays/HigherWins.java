/*
Given an array of ints, figure out which is larger between the first and last
elements in the array, and set all the other elements to be that value. Return 
the changed array. 

HigherWins({1, 2, 3}) -> {3, 3, 3}
HigherWins({11, 5, 9}) -> {11, 11, 11}
HigherWins({2, 11, 3}) -> {3, 3, 3}

public int[] HigherWins(int[] numbers) {

}
 */
package com.sg.junitdrills.arrays;

import java.util.Arrays;

/**
 *
 * @author Paul Peterson
 */
public class HigherWins {

    public int[] higherWins(int[] numbers) {

        int[] n = new int[numbers.length];
        if (numbers[0] > numbers[numbers.length - 1]) {
            Arrays.fill(n, numbers[0]);
        } else {
            Arrays.fill(n, numbers[numbers.length - 1]);
        }
        return n;
    }

}
