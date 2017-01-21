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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class ParrotTroubleTest {

    public ParrotTroubleTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //ParrotTrouble(true, 6) -> true
    @Test
    public void parrotTroubleTest() {

        //arrange
        boolean isTalking = true;
        int hour = 6;
        boolean expected = true;

        //actual
        ParrotTrouble test = new ParrotTrouble();
        boolean actual = test.parrotTrouble(isTalking, hour);

        //assert
        assertEquals(expected, actual);
    }

    //ParrotTrouble(true, 7) -> false
    @Test
    public void parrotTroubleTest2() {

        //arrange
        boolean isTalking = true;
        int hour = 7;
        boolean expected = false;

        //actual
        ParrotTrouble test = new ParrotTrouble();
        boolean actual = test.parrotTrouble(isTalking, hour);

        //assert
        assertEquals(expected, actual);
    }

    //ParrotTrouble(false, 6) -> false    
    @Test
    public void parrotTroubleTest3() {

        //arrange
        boolean isTalking = false;
        int hour = 6;
        boolean expected = false;

        //actual
        ParrotTrouble test = new ParrotTrouble();
        boolean actual = test.parrotTrouble(isTalking, hour);

        //assert
        assertEquals(expected, actual);
    }

    //ParrotTrouble(true, 22) -> true    
    @Test
    public void parrotTroubleTest4() {

        //arrange
        boolean isTalking = true;
        int hour = 22;
        boolean expected = true;

        //actual
        ParrotTrouble test = new ParrotTrouble();
        boolean actual = test.parrotTrouble(isTalking, hour);

        //assert
        assertEquals(expected, actual);
    }

}
