/*
Given an array of ints, return true if 6 appears as either the first or last 
element in the array. The array will be length 1 or more. 

FirstLast6({1, 2, 6}) -> true
FirstLast6({6, 1, 2, 3}) -> true
FirstLast6({13, 6, 1, 2, 3}) -> false

public booleaneanean FirstLast6(int[] numbers) {

}
 */
package com.sg.junitdrills.arrays;

/**
 *
 * @author Paul Peterson
 */
public class FirstLast6 {

    public boolean firstLast6(int[] numbers) {
        int num = 6;
        return numbers[0] == num || numbers[numbers.length - 1] == num;
    }
}
