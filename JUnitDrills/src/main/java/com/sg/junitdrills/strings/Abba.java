/*
Given two strings, a and b, return the result of putting them together in the 
order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". 

Abba("Hi", "Bye") -> "HiByeByeHi"
Abba("Yo", "Alice") -> "YoAliceAliceYo"
Abba("What", "Up") -> "WhatUpUpWhat"

public string Abba(string a, string b) {

}
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class Abba {
    
    public String abba (String a, String b){
        return a + b + b + a;
    }
    
}
