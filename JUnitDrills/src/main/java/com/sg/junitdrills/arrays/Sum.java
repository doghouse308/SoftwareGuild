/*
Given an array of ints, return the sum of all the elements. 

Sum({1, 2, 3}) -> 6
Sum({5, 11, 2}) -> 18
Sum({7, 0, 0}) -> 7

public int Sum(int[] numbers) {

}
 */
package com.sg.junitdrills.arrays;

/**
 *
 * @author Paul Peterson
 */
public class Sum {
    public int sum(int[] numbers) {
        int sum = 0;
        for (int n : numbers){
            sum += n;
        }
        return sum;
    }
}
