/*
Given a string and an int n, return a string made of the first and last n chars 
from the string. The string length will be at least n. 

FrontAndBack("Hello", 2) -> "Helo"
FrontAndBack("Chocolate", 3) -> "Choate"
FrontAndBack("Chocolate", 1) -> "Ce"

public string FrontAndBack(string str, int n) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class FrontAndBack {

    public String frontAndBack(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
