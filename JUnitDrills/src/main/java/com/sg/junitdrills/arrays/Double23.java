/*
Given an int array, return true if the array contains 2 twice, or 3 twice. 

Double23({2, 2, 3}) -> true
Double23({3, 4, 5, 3}) -> true
Double23({2, 3, 2, 2}) -> false

public boolean Double23(int[] numbers) {

}
 */
package com.sg.junitdrills.arrays;

/**
 *
 * @author Paul Peterson
 */
public class Double23 {

    public boolean double23(int[] numbers) {
        int count = 2;
        int count2 = 0;
        int count3 = 0;
        for (int n : numbers){
            if ( n == count){
                count2 ++;
            }
            if (n == 3){
                count3 ++;
            }
        }
        if (count2 == count){
            return true;
        }else if (count3 == count){
            return true;
        } else {
            return false;
        }
    }
}
