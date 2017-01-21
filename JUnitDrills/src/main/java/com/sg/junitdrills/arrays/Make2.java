/*
Given 2 int arrays, a and b, return a new array length 2 containing, as much as
will fit, the elements from a followed by the elements from b. The arrays may be
any length, including 0, but there will be 2 or more elements available between 
the 2 arrays. 

Make2({4, 5}, {1, 2, 3}) -> {4, 5}
Make2({4}, {1, 2, 3}) -> {4, 1}
Make2({}, {1, 2}) -> {1, 2}

public int[] make2(int[] a, int[] b) {
  
}
 */
package com.sg.junitdrills.arrays;

/**
 *
 * @author Paul Peterson
 */
public class Make2 {

    public int[] make2(int[] a, int[] b) {
        int [] temp = new int[a.length + b.length];
        System.arraycopy(a, 0, temp, 0, a.length);
        System.arraycopy(b, 0, temp, a.length, b.length);
        int [] out = {temp[0], temp[1]};
        
        return out;
    }

}
