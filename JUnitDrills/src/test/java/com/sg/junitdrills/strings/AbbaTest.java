/*
Given two strings, a and b, return the result of putting them together in the 
order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". 

Abba("Hi", "Bye") -> "HiByeByeHi"
Abba("Yo", "Alice") -> "YoAliceAliceYo"
Abba("What", "Up") -> "WhatUpUpWhat"

public string Abba(string a, string b) {

 */
package com.sg.junitdrills.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class AbbaTest {
    
    public AbbaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    //Abba("Hi", "Bye") -> "HiByeByeHi"
    @Test
    public void abbaTest(){
        
        //arrange
        String a = "Hi";
        String b = "Bye";
        String expected = a + b + b + a;
        
        //actual
        Abba aT = new Abba();
        String actual = aT.abba(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
       
    //Abba("Yo", "Alice") -> "YoAliceAliceYo"
    @Test
    public void abbaTest2(){
        
        //arrange
        String a = "Yo";
        String b = "Alice";
        String expected = a + b + b + a;
        
        //actual
        Abba aT = new Abba();
        String actual = aT.abba(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Abba("What", "Up") -> "WhatUpUpWhat"
    @Test
    public void abbaTest3(){
        
        //arrange
        String a = "What";
        String b = "Up";
        String expected = a + b + b + a;
        
        //actual
        Abba aT = new Abba();
        String actual = aT.abba(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
}
