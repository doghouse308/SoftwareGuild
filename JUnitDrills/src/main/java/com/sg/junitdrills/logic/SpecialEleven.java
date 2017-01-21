/*
We'll say a number is special if it is a multiple of 11 or if it is one more 
than a multiple of 11. Return true if the given non-negative number is special. 
Use the % "mod" operator

SpecialEleven(22) → true
SpecialEleven(23) → true
SpecialEleven(24) → false

public boolean SpecialEleven(int n) {

}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class SpecialEleven {

    public boolean specialEleven(int n) {
        int num = 11;
        return n % num == 0 || n % 11 == 1;
    }
}
