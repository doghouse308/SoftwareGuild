/*
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 
inclusive are forbidden, so in that case just return 20. 

SkipSum(3, 4) → 7
SkipSum(9, 4) → 20
SkipSum(10, 11) → 21

public int SkipSum(int a, int b) {
  
}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class SkipSum {

    public int skipSum(int a, int b) {
        int floor = 10;
        int ceiling = 20;
        int n = 20;
        if (a + b <= floor || a + b >= ceiling){
            return a + b;
        } else {
            return n;
        }
    }
}
