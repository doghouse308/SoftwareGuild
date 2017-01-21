/*
Return the sum of two 6-sided dice rolls, each in the range 1..6. However, 
if noDoubles is true, if the two dice show the same value, increment one die to
the next value, wrapping around to 1 if its value was 6. 

RollDice(2, 3, true) → 5
RollDice(3, 3, true) → 7
RollDice(3, 3, false) → 6

public int RollDice(int die1, int die2, boolean noDoubles) {

}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class RollDice {

    public int rollDice(int die1, int die2, boolean noDoubles) {
        return noDoubles ? ((die1 == die2) ? die1 + die2 + 1 : die1 + die2) : die1 + die2;
    }
}
