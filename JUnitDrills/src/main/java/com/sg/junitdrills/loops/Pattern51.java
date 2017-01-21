/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
followed by the value plus 5, followed by the value minus 1.

Pattern51({1, 2, 7, 1}) -> true
Pattern51({1, 2, 8, 1}) -> false
Pattern51({2, 7, 1}) -> true

public boolean pattern51(int[] numbers) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class Pattern51 {

    public boolean pattern51(int[] numbers) {
        int num1 = 5, num2 = 1;
        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i + 1] == numbers[i] + num1 && numbers[i + 2] == numbers[i] - 1) {
                return true;
            }
        }
        return false;
    }
}
