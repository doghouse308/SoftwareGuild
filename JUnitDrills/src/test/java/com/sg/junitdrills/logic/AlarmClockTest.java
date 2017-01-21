/*
Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a 
booleanean indicating if we are on vacation, return a string of the form "7:00" 
indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" 
and on the weekend it should be "10:00". Unless we are on vacation -- then on 
weekdays it should be "10:00" and weekends it should be "off". 

AlarmClock(1, false) → "7:00"
AlarmClock(5, false) → "7:00"
AlarmClock(0, false) → "10:00"

public string AlarmClock(int day, boolean vacation) {

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
public class AlarmClockTest {
    
    public AlarmClockTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //AlarmClock(1, false) → "7:00"
    @Test
    public void alarmClockTest(){
        
        //arrange
        int day = 1;
        boolean vacation = false;
        String expected = "7:00";
        
        //actual
        AlarmClock test = new AlarmClock();
        String actual = test.alarmClock(day, vacation);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //AlarmClock(5, false) → "7:00"
    @Test
    public void alarmClockTest2(){
        
        //arrange
        int day = 5;
        boolean vacation = false;
        String expected = "7:00";
        
        //actual
        AlarmClock test = new AlarmClock();
        String actual = test.alarmClock(day, vacation);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //AlarmClock(0, false) → "10:00"
    @Test
    public void alarmClockTest3(){
        
        //arrange
        int day = 0;
        boolean vacation = false;
        String expected = "10:00";
        
        //actual
        AlarmClock test = new AlarmClock();
        String actual = test.alarmClock(day, vacation);
        
        //assert
        assertEquals(expected, actual);
    }  
    
    //AlarmClock(0, true) → "off"
    @Test
    public void alarmClockTest4(){
        
        //arrange
        int day = 0;
        boolean vacation = true;
        String expected = "off";
        
        //actual
        AlarmClock test = new AlarmClock();
        String actual = test.alarmClock(day, vacation);
        
        //assert
        assertEquals(expected, actual);
    }
  
    //AlarmClock(5, true) → "10:00"
    @Test
    public void alarmClockTest5(){
        
        //arrange
        int day = 5;
        boolean vacation = true;
        String expected = "10:00";
        
        //actual
        AlarmClock test = new AlarmClock();
        String actual = test.alarmClock(day, vacation);
        
        //assert
        assertEquals(expected, actual);
    }
  
}
