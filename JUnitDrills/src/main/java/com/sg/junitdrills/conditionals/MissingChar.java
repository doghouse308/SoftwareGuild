/*
Given a non-empty string and an int n, return a new string where the char at 
index n has been removed. The value of n will be a valid index of a char in the 
original string (Don't check for bad index). 

MissingChar("kitten", 1) -> "ktten"
MissingChar("kitten", 0) -> "itten"
MissingChar("kitten", 4) -> "kittn"

public string MissingChar(string str, int n) {
  
}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class MissingChar {

    public String missingChar(String str, int n) {
        if (n > str.length() - 1){
            return str;
        } else {
           return str.replace(Character.toString(str.charAt(n)), "");
        }
    }
}
