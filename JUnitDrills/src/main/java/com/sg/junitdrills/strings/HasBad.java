/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the
string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be 
any length, including 0.

HasBad("badxx") -> true
HasBad("xbadxx") -> true
HasBad("xxbadxx") -> false

public boolean HasBad(string str) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class HasBad {

    public boolean hasBad(String str) {
        return (str.indexOf("bad") == 0 || str.indexOf("bad") == 1);
    }
}
