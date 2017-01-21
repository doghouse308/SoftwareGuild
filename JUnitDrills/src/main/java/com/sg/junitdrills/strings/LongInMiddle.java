/*
Given 2 strings, a and b, return a string of the form short+long+short, with the
shorter string on the outside and the longer string on the inside. The strings 
will not be the same length, but they may be empty (length 0). 

LongInMiddle("Hello", "hi") -> "hiHellohi"
LongInMiddle("hi", "Hello") -> "hiHellohi"
LongInMiddle("aaa", "b") -> "baaab"

public string LongInMiddle(string a, string b) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class LongInMiddle {

    public String longInMiddle(String a, String b) {
        if (a.length() < b.length()){
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}
