/*
Given a string, return a "rotated right 2" version where the last 2 chars are 
moved to the start. The string length will be at least 2. 

RotateRight2("Hello") -> "loHel"
RotateRight2("java") -> "vaja"
RotateRight2("Hi") -> "Hi"
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class RotateRight2 {
    
    public String rotateRight2(String str){
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
    
}
