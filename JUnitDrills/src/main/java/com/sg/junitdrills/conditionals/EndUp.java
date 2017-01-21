/*
Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there. 

EndUp("Hello") -> "HeLLO"
EndUp("hi there") -> "hi thERE"
EndUp("hi") -> "HI"

public string EndUp(string str) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class EndUp {

    public String endUp(String str) {
        if (str.length() > 3){
            return str.substring(0, str.length() - 3)
                    .concat(str.substring(str.length() - 3).toUpperCase());
        } else {
            return str.toUpperCase();
        }
    }
}
