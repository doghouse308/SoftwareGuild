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

/**
 *
 * @author Paul Peterson
 */
public class SameFirstLast {

    public boolean sameFirstLast(int[] numbers) {
        return numbers[0] == numbers[numbers.length - 1];
    }
}
