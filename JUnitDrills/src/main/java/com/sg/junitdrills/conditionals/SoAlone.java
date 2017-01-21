/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 2 int values, return true if one or the other is teen, but not both. 

SoAlone(13, 99) -> true
SoAlone(21, 19) -> true
SoAlone(13, 13) -> false

public boolean SoAlone(int a, int b) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class SoAlone {

    public boolean soAlone(int a, int b) {
        return ((a >= 13 && a <= 19) ^ (b >= 13 && b <= 19));
    }
}
