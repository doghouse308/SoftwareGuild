/*
Given two ints, a and b, return true if one if them is 10 or if their sum is 10. 

Makes10(9, 10) -> true
Makes10(9, 9) -> false
Makes10(1, 9) -> true

public boolean Makes10(int a, int b) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class Makes10 {

    public boolean makes10(int a, int b) {
        return ( a == 10 || b == 10 || (a + b) == 10);
    }
}
