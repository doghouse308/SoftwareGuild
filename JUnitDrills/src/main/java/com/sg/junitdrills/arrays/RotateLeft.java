/*
Given an array of ints, return an array with the elements "rotated left" 
so {1, 2, 3} yields {2, 3, 1}. 

RotateLeft({1, 2, 3}) -> {2, 3, 1}
RotateLeft({5, 11, 9}) -> {11, 9, 5}
RotateLeft({7, 0, 0}) -> {0, 0, 7}

public int[] RotateLeft(int[] numbers) {

}
 */
package com.sg.junitdrills.arrays;

/**
 *
 * @author Paul Peterson
 */
public class RotateLeft {

    public int[] rotateLeft(int[] numbers) {
        int [] temp = new int[numbers.length];
        for (int i = 0; i < numbers.length - 1; i ++){
            temp[i] = numbers[i + 1];
        }
        temp [numbers.length - 1] = numbers[0];
        
        return temp;
    }
}
