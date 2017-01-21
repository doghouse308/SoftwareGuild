/*
Given a string, take the last char and return a new string with the last char
added at the front and back, so "cat" yields "tcatt". The original string will 
be length 1 or more. 

BackAround("cat") -> "tcatt"
BackAround("Hello") -> "oHelloo"
BackAround("a") -> "aaa"

public string BackAround(string str) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class BackAround {

    public String backAround(String str) {
        if (str.length() < 2){
            return new String(new char[3]).replace("\0", str);
        }
        return Character.toString(str.charAt((str.length() - 1))).concat(str)
                .concat(Character.toString(str.charAt((str.length() - 1))));
    }
}
