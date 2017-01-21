/*
Given a string, return a "rotated left 2" version where the first 2 chars are 
moved to the end. The string length will be at least 2. 

Rotateleft2("Hello") -> "lloHe"
Rotateleft2("java") -> "vaja"
Rotateleft2("Hi") -> "Hi"

public string Rotateleft2(string str) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class Rotateleft2 {

    public String rotateleft2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }
}
