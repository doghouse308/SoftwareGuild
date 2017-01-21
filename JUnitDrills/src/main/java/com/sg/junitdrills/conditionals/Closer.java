/*
Given 2 int values, return whichever value is nearest to the value 10,
or return 0 in the event of a tie. 

Closer(8, 13) -> 8
Closer(13, 8) -> 8
Closer(13, 7) -> 0

public int Closer(int a, int b) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class Closer {

    public int closer(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        } else if (Math.abs(b - 10) < Math.abs(a - 10)) {
            return b;
        } else {
            return 0;
        }
    }
}
