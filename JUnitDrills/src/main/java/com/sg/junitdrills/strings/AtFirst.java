/*
Given a string, return a string length 2 made of its first 2 chars. If the 
string length is less than 2, use '@' for the missing chars. 

AtFirst("hello") -> "he"
AtFirst("hi") -> "hi"
AtFirst("h") -> "h@"

public string AtFirst(string str) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class AtFirst {

    public String atFirst(String str) {
        if (str.length() >= 2){
            return str.substring(0, 2);
        } else {
            if (str.isEmpty()){
                return "@@";
            }
            return str.substring(0).concat("@");
        }
    }
}
