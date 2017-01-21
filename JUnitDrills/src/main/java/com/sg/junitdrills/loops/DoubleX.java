/*
Given a string, return true if the first instance of "x" in the string is 
immediately followed by another "x". 

DoubleX("axxbb") -> true
DoubleX("axaxxax") -> false
DoubleX("xxxxx") -> true

public boolean DoubleX(string str) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class DoubleX {
    public boolean doubleX(String str) {
        int n = str.indexOf("x");
        
        return Character.toString(str.charAt(n + 1)).equals("x");
    }
}
