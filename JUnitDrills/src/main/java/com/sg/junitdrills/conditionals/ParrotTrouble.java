/*
We have a loud talking parrot. The "hour" parameter is the current hour time in 
the range 0..23. We are in trouble if the parrot is talking and the hour is
before 7 or after 20. Return true if we are in trouble. 

ParrotTrouble(true, 6) -> true
ParrotTrouble(true, 7) -> false
ParrotTrouble(false, 6) -> false

public boolean ParrotTrouble(boolean isTalking, int hour) {
  
}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class ParrotTrouble {

    public boolean parrotTrouble(boolean isTalking, int hour) {
        return (isTalking && (hour < 7 || hour > 20));
    }
}
