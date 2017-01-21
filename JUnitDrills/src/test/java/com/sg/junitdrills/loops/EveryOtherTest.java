/*
Given a string, return a new string made of every other char starting with the 
first, so "Hello" yields "Hlo". 

EveryOther("Hello") -> "Hlo"
EveryOther("Hi") -> "H"
EveryOther("Heeololeo") -> "Hello"

public string EveryOther(string str) {

}
 */
package com.sg.junitdrills.loops;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class EveryOtherTest {
    
    public EveryOtherTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //EveryOther("Hello") -> "Hlo"
    @Test
    public void everyOtherTest(){
        
        //arrange
        String str = "Hello";
        String expected = "Hlo";
        
        //actual
        EveryOther test = new EveryOther();
        String actual = test.everyOther(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //EveryOther("Hi") -> "H"
    @Test
    public void everyOtherTest2(){
        
        //arrange
        String str = "Hi";
        String expected = "H";
        
        //actual
        EveryOther test = new EveryOther();
        String actual = test.everyOther(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //EveryOther("Heeololeo") -> "Hello"  
    @Test
    public void everyOtherTest3(){
        
        //arrange
        String str = "Heeololeo";
        String expected = "Hello";
        
        //actual
        EveryOther test = new EveryOther();
        String actual = test.everyOther(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
