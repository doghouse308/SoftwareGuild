/*
Given three ints, a b c, return true if it is possible to add two of the ints 
to get the third. 

TwoIsOne(1, 2, 3) → true
TwoIsOne(3, 1, 2) → true
TwoIsOne(3, 2, 2) → false

public boolean TwoIsOne(int a, int b, int c) {
  
}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class TwoIsOne {

    public boolean twoIsOne(int a, int b, int c) {
        return a + b == c || b + c == a || a + c == b;
    }
}
