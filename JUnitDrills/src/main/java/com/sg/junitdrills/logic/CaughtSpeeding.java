/*
You are driving a little too fast, and a police officer stops you. Write code to
compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 
2=big ticket. If speed is 60 or less, the result is 0. If speed is between 
61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
Unless it is your birthday -- on that day, your speed can be 5 higher in all cases. 

CaughtSpeeding(60, false) → 0
CaughtSpeeding(65, false) → 1
CaughtSpeeding(65, true) → 0

public int CaughtSpeeding(int speed, boolean isBirthday) {
  
}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class CaughtSpeeding {

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int speedLimit = 60;
        int range = 20;
        if (isBirthday){
            speedLimit += 5;
        }
        if (speed > speedLimit && speed <= speedLimit + range){
            return 1;
        } else if (speed > speedLimit + range){
            return 2;
        } else {
            return 0;
        }
    }

}
