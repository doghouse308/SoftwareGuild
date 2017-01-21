/*
Given three ints, a b c, return true if two or more of them have the same
rightmost digit. The ints are non-negative. 

LastDigit(23, 19, 13) → true
LastDigit(23, 19, 12) → false
LastDigit(23, 19, 3) → true

public boolean LastDigit(int a, int b, int c){

}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class LastDigit {

    //int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
    public boolean lastDigit(int a, int b, int c) {
        while (a > 10) {
            a %= 10;
        }
        while (b > 10) {
            b %= 10;
        }
        while (c > 10) {
            c %= 10;
        }
        return a == b || b == c || a == c;
    }
}
