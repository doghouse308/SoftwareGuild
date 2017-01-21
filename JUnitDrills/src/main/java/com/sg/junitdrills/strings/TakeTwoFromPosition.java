/*
Given a string and an index, return a string length 2 starting at the given 
index. If the index is too big or too small to define a string length 2, use the
first 2 chars. The string length will be at least 2. 

TakeTwoFromPosition("java", 0) -> "ja"
TakeTwoFromPosition("java", 2) -> "va"
TakeTwoFromPosition("java", 3) -> "ja"

public string TakeTwoFromPosition(string str, int n) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class TakeTwoFromPosition {

    public String takeTwoFromPosition(String str, int n) {

        if (str.length() - 2 >= 0 && n + 2 <= str.length()) {
            return str.substring(n, n + 2);
        } else {
            return str.substring(0, 2);
        }

    }
}
