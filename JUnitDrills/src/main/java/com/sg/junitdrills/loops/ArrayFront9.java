/*
Given an array of ints, return true if one of the first 4 elements in the array
is a 9. The array length may be less than 4. 

ArrayFront9({1, 2, 9, 3, 4}) -> true
ArrayFront9({1, 2, 3, 4, 9}) -> false
ArrayFront9({1, 2, 3, 4, 5}) -> false

public boolean ArrayFront9(int[] numbers) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class ArrayFront9 {

    public boolean arrayFront9(int[] numbers) {
        boolean isNine = false;
        int number = 9;
        int end = 4;
        if (numbers.length < end){
            end = numbers.length;
        }
        for (int i = 0; i < end; i++){
            if (numbers[i] == number){
                isNine = true;
            }
        }
        return isNine;
    }
}
