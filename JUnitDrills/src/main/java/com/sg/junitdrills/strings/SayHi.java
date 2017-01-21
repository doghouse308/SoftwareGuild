/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!". 

SayHi("Bob") -> "Hello Bob!"
SayHi("Alice") -> "Hello Alice!"
SayHi("X") -> "Hello X!"

public string SayHi(string name) 
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class SayHi {
    
    public String sayHi(String name){
        return "Hello " + name + "!";
    }
}
