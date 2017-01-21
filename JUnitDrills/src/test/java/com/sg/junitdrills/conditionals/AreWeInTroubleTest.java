/*
We have two children, a and b, and the parameters aSmile and bSmile indicate if 
each is smiling. We are in trouble if they are both smiling or if neither of 
them is smiling. Return true if we are in trouble. 

AreWeInTrouble(true, true) -> true
AreWeInTrouble(false, false) -> true
AreWeInTrouble(true, false) -> false

public boolean AreWeInTrouble(boolean aSmile, boolean bSmile) {
  
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
public class AreWeInTroubleTest {

    public AreWeInTroubleTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //AreWeInTrouble(true, true) -> true
    @Test
    public void areWeInTroubleTest() {

        //arrange
        boolean a = true;
        boolean b = true;
        boolean expected = true;

        //actual
        AreWeInTrouble test = new AreWeInTrouble();
        boolean actual = test.areWeInTrouble(a, b);

        //assert
        assertEquals(expected, actual);
    }

    //AreWeInTrouble(false, false) -> true
    @Test
    public void areWeInTroubleTest2() {

        //arrange
        boolean a = false;
        boolean b = false;
        boolean expected = true;

        //actual
        AreWeInTrouble test = new AreWeInTrouble();
        boolean actual = test.areWeInTrouble(a, b);

        //assert
        assertEquals(expected, actual);
    }

    //AreWeInTrouble(true, false) -> false  
    @Test
    public void areWeInTroubleTest3() {

        //arrange
        boolean a = true;
        boolean b = false;
        boolean expected = false;

        //actual
        AreWeInTrouble test = new AreWeInTrouble();
        boolean actual = test.areWeInTrouble(a, b);

        //assert
        assertEquals(expected, actual);
    }

}
