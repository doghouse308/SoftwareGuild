/*
Given three int values, a b c, return the largest. 

Max(1, 2, 3) -> 3
Max(1, 3, 2) -> 3
Max(3, 2, 1) -> 3

public int Max(int a, int b, int c) {

}
 */
package com.sg.junitdrills.conditionals;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Paul Peterson
 */
public class Max {

    public int max(int a, int b, int c) {
        
        int [] r = {a, b, c};
        Arrays.sort(r);
        return r[r.length - 1];
/*
        writing as a contidional
        if (a > b && a > c){
            return a;
        } else if (b > a && b > c){
            return b;
        } else {
            return c;
        }
*/
    }
}
