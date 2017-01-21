/*
Given a non-empty string like "Code" return a string like "CCoCodCode".  
(first char, first two, first 3, etc)

StringSplosion("Code") -> "CCoCodCode"
StringSplosion("abc") -> "aababc"
StringSplosion("ab") -> "aab"

public string StringSplosion(string str) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class StringSplosion {

    public String stringSplosion(String str) {
        String r = "";
        for (int i = 0; i < str.length(); i++){
            r += str.substring(0, i + 1);
        }
        return r;
    }
}
