/*
Given a string, return a new string where "not " has been added to the front. 
However, if the string already begins with "not", return the string unchanged.

NotString("candy") -> "not candy"
NotString("x") -> "not x"
NotString("not bad") -> "not bad"

public string NotString(string s) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class NotString {

    public String notString(String s) {
        if (s.toLowerCase().startsWith("not")){
            return s;
        } else {
            return "not ".concat(s);
        }
    }
}
