/*
Given 2 strings, a and b, return the number of the positions where they contain
the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx",
"aa", and "az" substrings appear in the same place in both strings. 

SubStringMatch("xxcaazz", "xxbaaz") -> 3
SubStringMatch("abc", "abc") -> 2
SubStringMatch("abc", "axc") -> 0

public int SubStringMatch(string a, string b) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class SubStringMatch {
    public int subStringMatch(String a, String b) {
        //assumption:  b.length() = a.length()
        int r = 0;
        
        for (int i = 0; i < a.length() - 2; i++){
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))){
                r ++;
            }
            if ( i + 2 == a.length() - 1){
                if (a.substring(i + 1).equalsIgnoreCase(b.substring(i + 1))){
                    r++;
                }
            }
        }
        return r;
    }
}
