/*
Given a string, return a new string made of every other char starting with the 
first, so "Hello" yields "Hlo". 

EveryOther("Hello") -> "Hlo"
EveryOther("Hi") -> "H"
EveryOther("Heeololeo") -> "Hello"

public string EveryOther(string str) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class EveryOther {
    public String everyOther(String str) {
        String r = "";
        for (int i = 0; i < str.length(); i++){
            if (i % 2 == 0){
                r += str.charAt(i);
            }
        }
        return r;    }
}
