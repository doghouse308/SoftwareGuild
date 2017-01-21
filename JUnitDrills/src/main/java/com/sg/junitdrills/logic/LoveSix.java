/*
The number 6 is a truly great number. Given two int values, a and b, return true
if either one is 6. Or if their sum or difference is 6.

LoveSix(6, 4) → true
LoveSix(4, 5) → false
LoveSix(1, 5) → true

public boolean LoveSix(int a, int b) {
  
}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class LoveSix {

    public boolean loveSix(int a, int b) {
        int num = 6;
        return (a == num || b == num) || (a + b == num) || (Math.abs(a - b) == num);
    }
}
