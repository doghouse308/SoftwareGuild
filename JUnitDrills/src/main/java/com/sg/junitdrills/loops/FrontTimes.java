/*
Given a string and a non-negative int n, we'll say that the front of the string
is the first 3 chars, or whatever is there if the string is less than length 3.
Return n copies of the front; 

FrontTimes("Chocolate", 2) -> "ChoCho"
FrontTimes("Chocolate", 3) -> "ChoChoCho"
FrontTimes("Abc", 3) -> "AbcAbcAbc"

public string FrontTimes(string str, int n) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class FrontTimes {

    public String frontTimes(String str, int n) {
        int sLength = 3;
        if (str.length() < 3){
            sLength = str.length();
        }
        String r = "";
        if (n <= 0) {
            return str.substring(0, sLength);
        }
        for (int i = 0; i < n; i++) {
            r += str.substring(0, sLength);
        }
        return r;
    }
}


