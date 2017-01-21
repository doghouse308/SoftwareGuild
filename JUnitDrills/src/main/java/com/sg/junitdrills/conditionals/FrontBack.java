/*
Given a string, return a new string where the first and last chars have been exchanged. 

FrontBack("code") -> "eodc"
FrontBack("a") -> "a"
FrontBack("ab") -> "ba"

public string FrontBack(string str) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class FrontBack {

    public String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return Character.toString(str.charAt((str.length() - 1)))
                    .concat(str.substring(1, (str.length() - 1)))
                    .concat(Character.toString(str.charAt(0)));
        }
    }
}
