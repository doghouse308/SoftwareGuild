/*
Given a string and a non-negative int n, return a larger string that is 
n copies of the original string. 

StringTimes("Hi", 2) -> "HiHi"
StringTimes("Hi", 3) -> "HiHiHi"
StringTimes("Hi", 1) -> "Hi"

public string StringTimes(string str, int n) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class StringTimes {

    public String stringTimes(String str, int n) {
        String r = "";
        if (n <= 0){
            return str;
        }
        for (int i = 0; i < n; i++){
            r += str;
        }
        return r;
    }
}
