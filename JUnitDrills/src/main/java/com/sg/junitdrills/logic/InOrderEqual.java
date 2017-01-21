/*
Given three ints, a b c, return true if they are in strict increasing order, 
such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception 
that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5. 

InOrderEqual(2, 5, 11, false) → true
InOrderEqual(5, 7, 6, false) → false
InOrderEqual(5, 5, 7, true) → true

public boolean InOrderEqual(int a, int b, int c, boolean equalOk) {
  
}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class InOrderEqual {

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return a < b && b < c || (a <= b && b <= c) && equalOk;
    }
}
