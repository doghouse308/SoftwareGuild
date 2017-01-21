/*
The parameter weekday is true if it is a weekday, and the parameter vacation is 
true if we are on vacation. We sleep in if it is not a weekday or we're on 
vacation. Return true if we sleep in. 

sleepIn(false, false) -> true
sleepIn(true, false) -> false
sleepIn(false, true) -> true

public boolean CanSleepIn(boolean isWeekday, boolean isVacation) {
  
}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class CanSleepIn {
    public boolean canSleepIn(boolean isWeekday, boolean isVacation) {
        if ((!isWeekday && !isVacation) || (!isWeekday && isVacation) || (isWeekday && isVacation)){
            return true;
        } else {
            return false;
        }
    }
}
