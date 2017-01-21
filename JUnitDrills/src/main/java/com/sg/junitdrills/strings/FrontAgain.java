/*
Given a string, return true if the first 2 chars in the string also appear at 
the end of the string, such as with "edited". 

FrontAgain("edited") -> true
FrontAgain("edit") -> false
FrontAgain("ed") -> true

public boolean FrontAgain(string str) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class FrontAgain {

    public boolean frontAgain(String str) {
        return str.endsWith(str.substring(0, 2));
    }
}
