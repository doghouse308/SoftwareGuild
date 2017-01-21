/*
Given an int n, return true if it is within 10 of 100 or 200.
Hint: Check out the C# Math class for absolute value

NearHundred(103) -> true
NearHundred(90) -> true
NearHundred(89) -> false

public boolean NearHundred(int n) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class NearHundred {

    public boolean nearHundred(int n) {
        return ((Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10));
    }
}
