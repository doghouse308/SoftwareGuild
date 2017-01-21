/*
Given 2 strings, a and b, return a new string made of the first char of a and 
the last char of b, so "yo" and "java" yields "ya". If either string is length 
0, use '@' for its missing char. 

LastChars("last", "chars") -> "ls"
LastChars("yo", "mama") -> "ya"
LastChars("hi", "") -> "h@"

public string LastChars(string str) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class LastChars {

    public String lastChars(String a, String b) {
        if (!a.isEmpty() && ! b.isEmpty()){
            return a.substring(0, 1).concat(b.substring(b.length() - 1));
        } else {
            if (a.isEmpty()){
                return "@".concat(b.substring(b.length() - 1));
            }
            return a.substring(0, 1).concat("@");
        }
    }
}
