/*
Given a string, return true if the string starts with "hi" and false otherwise. 

StartHi("hi there") -> true
StartHi("hi") -> true
StartHi("high up") -> false

public boolean StartHi(string str) {

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
public class StartHiTest {
    
    public StartHiTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //StartHi("hi there") -> true
    @Test
    public void startHi(){
        
        //arrange
        String str = "hi there";
        boolean expected = true;
        
        //actual
        StartHi test = new StartHi();
        boolean actual = test.startHi(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //StartHi("hi") -> true
    @Test
    public void startHi2(){
        
        //arrange
        String str = "hi";
        boolean expected = true;
        
        //actual
        StartHi test = new StartHi();
        boolean actual = test.startHi(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //StartHi("high up") -> false    
    @Test
    public void startHi3(){
        
        //arrange
        String str = "high up";
        boolean expected = false;
        
        //actual
        StartHi test = new StartHi();
        boolean actual = test.startHi(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    
}
