/*
Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere. 

Array123({1, 1, 2, 3, 1}) -> true
Array123({1, 1, 2, 4, 1}) -> false
Array123({1, 1, 2, 1, 2, 3}) -> true

public boolean Array123(int[] numbers) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class Array123 {
    public boolean array123(int[] numbers) {
        String str = "";
        for (int i = 0; i < numbers.length; i++){
            str += numbers[i];
        }
        return str.contains("123");
    }
}
