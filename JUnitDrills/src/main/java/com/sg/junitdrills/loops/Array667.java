/*
Given an array of ints, return the number of times that two 6's are next to each
other in the array. Also count instances where the second "6" is actually a 7. 

Array667({6, 6, 2}) -> 1
Array667({6, 6, 2, 6}) -> 1
Array667({6, 7, 2, 6}) -> 1

public int array667(int[] numbers) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class Array667 {

    public int array667(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++){
            if (numbers[i] == 6 && (numbers[i + 1] == 6 || numbers[i + 1] == 7)){
                count ++;
            }
        }
        return count;
    }
}
