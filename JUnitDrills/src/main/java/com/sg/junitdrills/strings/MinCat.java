/*
Given two strings, append them together (known as "concatenation") and return
the result. However, if the strings are different lengths, omit chars from the 
longer string so it is the same length as the shorter string. So "Hello" and 
"Hi" yield "loHi". The strings may be any length. 

MinCat("Hello", "Hi") -> "loHi"
MinCat("Hello", "java") -> "ellojava"
MinCat("java", "Hello") -> "javaello"

public string MinCat(string a, string b) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class MinCat {

    public String minCat(String a, String b) {
        
        if (a.length() == b.length()){
            return a.concat(b);
        } else if (a.length() > b.length()){
            return a.substring(a.length() - b.length()).concat(b);
        } else {
            return a.concat(b.substring(b.length() - a.length()));
        }
    }

}
