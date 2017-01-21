/*
Given a number n, return true if n is in the range 1..10, inclusive. 
Unless "outsideMode" is true, in which case return true if the number is 
less or equal to 1, or greater or equal to 10. 

InRange(5, false) → true
InRange(11, false) → false
InRange(11, true) → true

public boolean InRange(int n, boolean outsideMode) {
  
}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class InRange {

    public boolean inRange(int n, boolean outsideMode) {
        int floor = 1;
        int ceiling = 10;
        return outsideMode ? (n < floor || n > ceiling) : (n >= floor && n <= ceiling);
    }
}
