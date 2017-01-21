/*
Given an int n, return the absolute value of the difference between n and 21, 
except return double the absolute value of the difference if n is over 21. 

Diff21(23) -> 4
Diff21(10) -> 11
Diff21(21) -> 0

public int Diff21(int n) {
  
}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class Diff21 {

    public int diff21(int n) {
        if (n > 21){
            return (Math.abs(n) - 21) * 2;
        } else {
            return 21 - Math.abs(n);
        }
    }
}
