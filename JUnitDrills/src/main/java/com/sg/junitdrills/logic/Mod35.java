/*
Return true if the given non-negative number is a multiple of 3 or 5, but not 
both. Use the % "mod" operator

Mod35(3) → true
Mod35(10) → true
Mod35(15) → false

public boolean Mod35(int n) {
  
}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class Mod35 {

    public boolean mod35(int n) {
        return n % 3 == 0 ^ n % 5 == 0;
    }
}
