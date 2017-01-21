/*
Given a string, return true if it ends in "ly". 

EndsWithLy("oddly") -> true
EndsWithLy("y") -> false
EndsWithLy("oddy") -> false

public boolean EndsWithLy(string str) { 

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class EndsWithLy {

    public boolean EndsWithLy(String str) {
        if (str.length() < 2) {
            return false;
        } else {
            return str.substring(str.length() - 2).equalsIgnoreCase("ly");
        }
    }
}
