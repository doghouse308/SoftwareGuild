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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class CanSleepInTest {
    
    public CanSleepInTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //sleepIn(false, false) -> true
    @Test
    public void canSleepInTest(){
        
        //arrange
        boolean isWeekday = false;
        boolean isVacation = false;
        boolean expected = true;
        
        //actual 
        CanSleepIn test = new CanSleepIn();
        boolean actual = test.canSleepIn(isWeekday, isVacation);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //sleepIn(true, false) -> false
    @Test
    public void canSleepInTest2(){
        
        //arrange
        boolean isWeekday = true;
        boolean isVacation = false;
        boolean expected = false;
        
        //actual 
        CanSleepIn test = new CanSleepIn();
        boolean actual = test.canSleepIn(isWeekday, isVacation);
        
        //assert
        assertEquals(expected, actual);
    }
       
    //sleepIn(false, true) -> true
    @Test
    public void canSleepInTest3(){
        
        //arrange
        boolean isWeekday = false;
        boolean isVacation = true;
        boolean expected = true;
        
        //actual 
        CanSleepIn test = new CanSleepIn();
        boolean actual = test.canSleepIn(isWeekday, isVacation);
        
        //assert
        assertEquals(expected, actual);
    }

    //sleepIn(true, true) -> true
    @Test
    public void canSleepInTest4(){
        
        //arrange
        boolean isWeekday = true;
        boolean isVacation = true;
        boolean expected = true;
        
        //actual 
        CanSleepIn test = new CanSleepIn();
        boolean actual = test.canSleepIn(isWeekday, isVacation);
        
        //assert
        assertEquals(expected, actual);
    }    
    
    
}
