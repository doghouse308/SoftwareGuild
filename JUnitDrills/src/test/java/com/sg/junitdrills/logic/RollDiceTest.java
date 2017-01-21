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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class RollDiceTest {
    
    public RollDiceTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //RollDice(2, 3, true) → 5
    @Test
    public void rollDiceTest(){
        
        //arrange
        int die1 = 2;
        int die2 = 3;
        boolean noDoubles = true;
        int expected = 5;
        
        //actual
        RollDice test = new RollDice();
        int actual = test.rollDice(die1, die2, noDoubles);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //RollDice(3, 3, true) → 7
    @Test
    public void rollDiceTest2(){
        
        //arrange
        int die1 = 3;
        int die2 = 3;
        boolean noDoubles = true;
        int expected = 7;
        
        //actual
        RollDice test = new RollDice();
        int actual = test.rollDice(die1, die2, noDoubles);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //RollDice(3, 3, false) → 6    
    @Test
    public void rollDiceTest3(){
        
        //arrange
        int die1 = 3;
        int die2 = 3;
        boolean noDoubles = false;
        int expected = 6;
        
        //actual
        RollDice test = new RollDice();
        int actual = test.rollDice(die1, die2, noDoubles);
        
        //assert
        assertEquals(expected, actual);
    }    
}
