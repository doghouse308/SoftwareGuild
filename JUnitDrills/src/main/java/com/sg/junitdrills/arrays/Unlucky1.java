/*
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
Return true if the given array contains an unlucky 1 in the first 2 or last 
2 positions in the array. 

Unlucky1({1, 3, 4, 5}) -> true
Unlucky1({2, 1, 3, 4, 5}) -> true
Unlucky1({1, 1, 1}) -> false

public boolean Unlucky1(int[] numbers) {

}
 */
package com.sg.junitdrills.arrays;

/**
 *
 * @author Paul Peterson
 */
public class Unlucky1 {

    public boolean unlucky1(int[] numbers) {
        
        for (int i = 0; i < numbers.length - 1; i++){
            if( (i <= 1 || i == numbers.length - 2) && numbers[i] == 1){
                if (numbers[i + 1] == 3){
                    return true;
                }
            }
        }
        return false;
    }

}
