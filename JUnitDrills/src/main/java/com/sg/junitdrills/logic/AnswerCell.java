/*
Your cell phone rings. Return true if you should answer it. Normally you answer,
except in the morning you only answer if it is your mom calling. In all cases, 
if you are asleep, you do not answer. 

AnswerCell(false, false, false) → true
AnswerCell(false, false, true) → false
AnswerCell(true, false, false) → false

public boolean AnswerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  
}
*/
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class AnswerCell {

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return isMorning ? isMom && !isAsleep : !isAsleep;
    }
}
