/*
Given a string of any length, return a new string where the last 2 chars, if 
present, are swapped, so "coding" yields "codign". 

SwapLast("coding") -> "codign"
SwapLast("cat") -> "cta"
SwapLast("ab") -> "ba"

public string SwapLast(string str) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class SwapLast {

    public String swapLast(String str) {

        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, str.length() - 2).concat(str.substring(str.length() - 1))
                    .concat(str.substring(str.length() - 2, str.length() - 1));
        }
    }
}
