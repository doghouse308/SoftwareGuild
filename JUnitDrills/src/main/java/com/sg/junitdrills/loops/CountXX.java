/*
Count the number of "xx" in the given string. We'll say that overlapping is 
allowed, so "xxx" contains 2 "xx". 

CountXX("abcxx") -> 1
CountXX("xxx") -> 2
CountXX("xxxx") -> 3

public int CountXX(string str) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class CountXX {

    public int countXX(String str) {
        int r = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.toString(str.charAt(i)).equalsIgnoreCase("x")
                    && Character.toString(str.charAt(i + 1)).equalsIgnoreCase("x")) {
                r++;
            }
        }
        return r;
    }
}
