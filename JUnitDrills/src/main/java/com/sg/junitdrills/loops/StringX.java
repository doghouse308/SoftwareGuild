/*
Given a string, return a version where all the "x" have been removed. 
Except an "x" at the very start or end should not be removed. 

StringX("xxHxix") -> "xHix"
StringX("abxxxcd") -> "abcd"
StringX("xabxxxcdx") -> "xabcdx"

public string StringX(string str) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class StringX {

    public String stringX(String str) {
        String r = str.substring(0, 1);
        for (int i = 1; i < str.length() - 1; i++){
            if (str.charAt(i) != 'x'){
                r += str.charAt(i);
            }
        }
        r += str.substring(str.length() - 1);
        return r;
    }
}
