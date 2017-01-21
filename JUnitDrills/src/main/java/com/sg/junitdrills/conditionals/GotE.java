/*
Return true if the given string contains between 1 and 3 'e' chars. 

GotE("Hello") -> true
GotE("Heelle") -> true
GotE("Heelele") -> false

public boolean GotE(string str) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class GotE {

    public boolean gotE(String str) {
        int n = str.toLowerCase().split("e").length;
        
        return (n >= 1 && n <= 3);
    }
}
