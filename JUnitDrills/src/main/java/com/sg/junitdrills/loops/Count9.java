/*
Given an array of ints, return the number of 9's in the array. 

Count9({1, 2, 9}) -> 1
Count9({1, 9, 9}) -> 2
Count9({1, 9, 9, 3, 9}) -> 3

public int Count9 (int[] numbers) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class Count9 {

    public int count9(int[] numbers) {
        int r = 0;
        int num = 9;
        for (int n : numbers) {
            if (n == num) {
                r++;
            }
        }
        return r;
    }
}
