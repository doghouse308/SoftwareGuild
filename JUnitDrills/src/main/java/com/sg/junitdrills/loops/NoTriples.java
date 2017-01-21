/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in
a row in the array. Return true if the array does not contain any triples. 

NoTriples({1, 1, 2, 2, 1}) -> true
NoTriples({1, 1, 2, 2, 2, 1}) -> false
NoTriples({1, 1, 1, 2, 2, 2, 1}) -> false

public boolean noTriples(int[] numbers) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class NoTriples {

    public boolean noTriples(int[] numbers) {
        for (int i = 0; i < numbers.length - 2; i++){
            if (numbers[i] == numbers[i + 1] && numbers[i + 1] == numbers[i + 2]){
                return false;
            }
        }
        return true;
    }
}
