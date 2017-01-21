/*
Given an int array , return true if it contains an even number (HINT: Use Mod (%)). 

HasEven({2, 5}) -> true
HasEven({4, 3}) -> true
HasEven({7, 5}) -> false

public boolean HasEven(int[] numbers) {

}
 */
package com.sg.junitdrills.arrays;

/**
 *
 * @author Paul Peterson
 */
public class HasEven {

    public boolean hasEven(int[] numbers) {
        for(int n : numbers){
            if (n % 2 == 0){
                return true;
            }
        }
        return false;
    }

}
