/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive. 

Between10and20(12, 99) -> true
Between10and20(21, 12) -> true
Between10and20(8, 99) -> false

public boolean Between10and20(int a, int b) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class Between10and20 {

    public boolean between10and20(int a, int b) {
        return ((a >= 10 && a <=20) || (b >= 10 && b <= 20));
    }
}
