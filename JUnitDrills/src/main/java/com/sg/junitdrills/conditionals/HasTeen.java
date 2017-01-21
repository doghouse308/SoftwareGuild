/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are teen. 

HasTeen(13, 20, 10) -> true
HasTeen(20, 19, 10) -> true
HasTeen(20, 10, 12) -> false

public boolean (int a, int b, int c) {

}
 */
package com.sg.junitdrills.conditionals;

import java.util.Arrays;

/**
 *
 * @author Paul Peterson
 */
public class HasTeen {

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
}
