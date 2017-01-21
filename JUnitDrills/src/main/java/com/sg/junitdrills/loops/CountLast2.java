/*
Given a string, return the count of the number of times that a substring length
2 appears in the string and also as the last 2 chars of the string, so "hixxxhi"
yields 1 (we won't count the end substring). 

CountLast2("hixxhi") -> 1
CountLast2("xaxxaxaxx") -> 1
CountLast2("axxxaaxx") -> 2

public int CountLast2(string str) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class CountLast2 {

    public int countLast2(String str) {
        int r = 0;
        for (int i = 0; i < str.length() - 2; i++){
            if (str.substring(i, i + 2).equalsIgnoreCase(str.substring(str.length() - 2))){
                r ++;
            }
        }
        return r;
    }
}
