/*
Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there. Return a 
new string which is 3 copies of the front. 

Front3("Microsoft") -> "MicMicMic"
Front3("Chocolate") -> "ChoChoCho"
Front3("at") -> "atatat"

public string Front3(string str) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class Front3 {

    //new String(new char[times]).replace("\0", str);
    public String front3(String str) {
        if (str.length() > 2){
            return new String(new char[3]).replace("\0", str.substring(0, 3));
        } else {
            return new String(new char[3]).replace("\0", str);
        }
    }
}
