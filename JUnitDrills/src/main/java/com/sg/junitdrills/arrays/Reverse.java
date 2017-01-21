/*
Given an array of ints length 3, return a new array with the elements in reverse
order, so for example {1, 2, 3} becomes {3, 2, 1}. 

public int[] Reverse(int[] numbers) {

}
 */
package com.sg.junitdrills.arrays;

/**
 *
 * @author Paul Peterson
 */
public class Reverse {

    public int[] reverse(int[] numbers) {
        int i = 0;
        int [] temp = new int[numbers.length];
        for (int j = numbers.length - 1; j >= 0; j--){
            temp[i] = numbers[j];
            i++;
        }
        return temp;
    }
}
