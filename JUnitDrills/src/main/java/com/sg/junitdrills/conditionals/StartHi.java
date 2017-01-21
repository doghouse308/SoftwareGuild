/*
Given a string, return true if the string starts with "hi" and false otherwise. 

StartHi("hi there") -> true
StartHi("hi") -> true
StartHi("high up") -> false

public boolean StartHi(string str) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class StartHi {

    public boolean startHi(String str) {
        if (str.length() > 2 && str.contains(" ")) {
            String[] s = str.split(" ");
            return s[0].equalsIgnoreCase("hi");
        } else {
            return str.equalsIgnoreCase("hi");
        }
    }
}
