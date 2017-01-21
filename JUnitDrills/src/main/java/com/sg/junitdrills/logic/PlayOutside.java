/*
The children in Cleveland spend most of the day playing outside. In particular,
they play if the temperature is between 60 and 90 (inclusive). Unless it is 
summer, then the upper limit is 100 instead of 90. Given an int temperature and
a boolean isSummer, return true if the children play and false otherwise. 

PlayOutside(70, false) → true
PlayOutside(95, false) → false
PlayOutside(95, true) → true

public boolean PlayOutside(int temp, boolean isSummer) {
  
}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class PlayOutside {

    public boolean playOutside(int temp, boolean isSummer) {
        int min = 60, max = 90;
        if (isSummer){
            max = 100;
        }
        return ((temp >= min && temp <= max && !isSummer)
                || (temp >= min && temp <= max && isSummer));
    }
}
