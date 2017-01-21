/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". 

FirstHalf("WooHoo") -> "Woo"
FirstHalf("HelloThere") -> "Hello"
FirstHalf("abcdef") -> "abc"

public string FirstHalf(string str) {}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class FirstHalf {
    
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
}
