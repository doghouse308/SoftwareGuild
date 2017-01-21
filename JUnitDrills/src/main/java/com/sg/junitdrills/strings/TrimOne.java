/*
Given a string, return a version without the first and last char, so "Hello" 
yields "ell". The string length will be at least 2. 

TrimOne("Hello") -> "ell"
TrimOne("java") -> "av"
TrimOne("coding") -> "odin"

public string TrimOne(string str) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class TrimOne {

    public String trimOne(String str) {
        return str.substring(1, str.length() - 1);
    }
}
