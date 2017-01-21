/*
Given two int values, return true if one is negative and one is positive. Except
if the parameter "negative" is true, then return true only if both are negative. 

PosNeg(1, -1, false) -> true
PosNeg(-1, 1, false) -> true
PosNeg(-4, -5, true) -> true

public boolean PosNeg(int a, int b, boolean negative) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class PosNeg {

    public boolean posNeg(int a, int b, boolean negative) {
        return ((a < 0 && b < 0) || (a < 0 || b < 0 && !negative));
    }
}
