/*
Given a string, if the first or last chars are 'x', return the string without 
those 'x' chars, and otherwise return the string unchanged. 

StripX("xHix") -> "Hi"
StripX("xHi") -> "Hi"
StripX("Hxix") -> "Hxi"

public string StripX(string str) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class StripX {

    public String stripX(String str) {
        if (str.startsWith("x") && str.endsWith("x")) {
            return str.substring(1, str.length() - 1);
        } else if (str.startsWith("x")){
            return str.substring(1);
        } else if (str.endsWith("x")){
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }
}
