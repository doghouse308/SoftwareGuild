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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class CaughtSpeedingTest {
    
    public CaughtSpeedingTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    //CaughtSpeeding(60, false) → 0
    @Test
    public void caughtSpeedingTest(){
        
        //arrange
        int speed = 60;
        boolean isBirthday = false;
        int expected = 0;
        
        //actual 
        CaughtSpeeding test = new CaughtSpeeding();
        int actual = test.caughtSpeeding(speed, isBirthday);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //CaughtSpeeding(65, false) → 1
    @Test
    public void caughtSpeedingTest2(){
        
        //arrange
        int speed = 65;
        boolean isBirthday = false;
        int expected = 1;
        
        //actual 
        CaughtSpeeding test = new CaughtSpeeding();
        int actual = test.caughtSpeeding(speed, isBirthday);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //CaughtSpeeding(65, true) → 0  
    @Test
    public void caughtSpeedingTest3(){
        
        //arrange
        int speed = 65;
        boolean isBirthday = true;
        int expected = 0;
        
        //actual 
        CaughtSpeeding test = new CaughtSpeeding();
        int actual = test.caughtSpeeding(speed, isBirthday);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //CaughtSpeeding(81, false) → 2
    @Test
    public void caughtSpeedingTest4(){
        
        //arrange
        int speed = 81;
        boolean isBirthday = false;
        int expected = 2;
        
        //actual 
        CaughtSpeeding test = new CaughtSpeeding();
        int actual = test.caughtSpeeding(speed, isBirthday);
        
        //assert
        assertEquals(expected, actual);
    }    

        
    //CaughtSpeeding(86, true) → 2
    @Test
    public void caughtSpeedingTest5(){
        
        //arrange
        int speed = 86;
        boolean isBirthday = true;
        int expected = 2;
        
        //actual 
        CaughtSpeeding test = new CaughtSpeeding();
        int actual = test.caughtSpeeding(speed, isBirthday);
        
        //assert
        assertEquals(expected, actual);
    }    
}
