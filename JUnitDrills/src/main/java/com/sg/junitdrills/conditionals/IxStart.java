/*
Return true if the given string begins with "*ix", the '*' can be anything, 
so "pix", "9ix" .. all count. 

IxStart("mix snacks") -> true
IxStart("pix snacks") -> true
IxStart("piz snacks") -> false

public boolean IxStart(string str) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class IxStart {

    public boolean ixStart(String str) {
        return str.substring(1, 3).equalsIgnoreCase("ix");
    }
}
