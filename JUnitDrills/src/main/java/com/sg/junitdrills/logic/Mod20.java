/*
Return true if the given non-negative number is 1 or 2 more than a multiple 
of 20. See also: Introduction to Mod 

Mod20(20) → false
Mod20(21) → true
Mod20(22) → true

public boolean Mod20(int n) {
  
}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class Mod20 {

    public boolean mod20(int n) {
        int num = 20;
        
        return n % num == 1 || n % num == 2;
    }
}
