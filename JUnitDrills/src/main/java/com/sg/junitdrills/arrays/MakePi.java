/*
Return an int array length n containing the first n digits of pi.

MakePi(3) -> {3, 1, 4}

public int[] MakePi(int n) {

}
 */
package com.sg.junitdrills.arrays;

/**
 *
 * @author Paul Peterson
 */
public class MakePi {

    public int[] makePi(int n) {
        String pi = Double.toString(Math.PI).replace(".", "");
        if (n > 16){
            n = 16;
        }
        int[] p = new int[n];
        for (int i = 0; i < n; i++){
            p[i] = Integer.parseInt(String.valueOf(pi.charAt(i)));
        }
        return p;
    }
}
