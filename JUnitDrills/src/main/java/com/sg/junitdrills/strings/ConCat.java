/*
Given two strings, append them together (known as "concatenation") and return 
the result. However, if the concatenation creates a double-char, then omit one 
of the chars, so "abc" and "cat" yields "abcat". 

ConCat("abc", "cat") -> "abcat"
ConCat("dog", "cat") -> "dogcat"
ConCat("abc", "") -> "abc"

public string ConCat(string a, string b) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class ConCat {

    public String conCat(String a, String b) {
        if (!a.isEmpty() && !b.isEmpty()) {
            if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
                return a.substring(0, a.length() - 1).concat(b);
            } else {
                return a.concat(b);
            }
        } else if (a.isEmpty()) {
            return b;
        } else {
            return a;
        }
    }
}
    