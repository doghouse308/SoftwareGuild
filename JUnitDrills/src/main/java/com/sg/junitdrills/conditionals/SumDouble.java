/*
Given two int values, return their sum. However, if the two values are the same,
then return double their sum. 

SumDouble(1, 2) -> 3
SumDouble(3, 2) -> 5
SumDouble(2, 2) -> 8

public int SumDouble(int a, int b) {
  
}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class SumDouble {

    public int sumDouble(int a, int b) {
        if (a == b){
            return (a + b) * 2;
        } else {
            return a + b;
        }
    }
}
