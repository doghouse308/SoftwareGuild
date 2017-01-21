/*
Given a string, return a version without the first 2 chars. Except keep the 
first char if it is 'a' and keep the second char if it is 'b'. The string may 
be any length.

TweakFront("Hello") -> "llo"
TweakFront("away") -> "aay"
TweakFront("abed") -> "abed"

public string TweakFront(string str) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class TweakFront {

    public String tweakFront(String str) {
        
        if (str.startsWith("ab")){
            return str;
        } else if (str.startsWith("a")){
            if (str.length() < 2){
                return str;
            } else {
                return str.substring(0, 1).concat(str.substring(2));
            }
        } else {
            return str.substring(2);
        }
    }
}
