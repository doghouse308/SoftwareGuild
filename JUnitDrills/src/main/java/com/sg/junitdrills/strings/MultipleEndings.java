/*
Given a string, return a new string made of 3 copies of the last 2 chars of the 
original string. The string length will be at least 2. 

MultipleEndings("Hello") -> "lololo"
MultipleEndings("ab") -> "ababab"
MultipleEndings("Hi") -> "HiHiHi"

public string MultipleEndings(string str) 
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class MultipleEndings {
    
    public String multipleEndings(String a){
        return new String(new char[3]).replace("\0", a.subSequence(0, 2));
    }
    
}
