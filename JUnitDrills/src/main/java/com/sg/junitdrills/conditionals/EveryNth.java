/*
Given a non-empty string and an int N, return the string made starting with 
char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6,
... and so on. N is 1 or more. 

EveryNth("Miracle", 2) -> "Mrce"
EveryNth("abcdefg", 2) -> "aceg"
EveryNth("abcdefg", 3) -> "adg"

public string EveryNth(string str, int n) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class EveryNth {

    public String everyNth(String str, int n) {
        String r = "";
        if (n <= 0){
            return r;
        }
        for (int i = 0; i < str.length(); i++){
            if (i % n == 0){
                r += str.charAt(i);
            }
        }
        return r;
    }
}
