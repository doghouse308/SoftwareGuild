/*
Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there. 

EndUp("Hello") -> "HeLLO"
EndUp("hi there") -> "hi thERE"
EndUp("hi") -> "HI"

public string EndUp(string str) {

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
public class EndUpTest {
    
    public EndUpTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //EndUp("Hello") -> "HeLLO"
    @Test
    public void endUpTest(){
        
        //arrange
        String str = "Hello";
        String expected = "HeLLO";
        
        //actual
        EndUp test = new EndUp();
        String actual = test.endUp(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //EndUp("hi there") -> "hi thERE"
    @Test
    public void endUpTest2(){
        
        //arrange
        String str = "hi there";
        String expected = "hi thERE";
        
        //actual
        EndUp test = new EndUp();
        String actual = test.endUp(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //EndUp("hi") -> "HI" 
    @Test
    public void endUpTest3(){
        
        //arrange
        String str = "hi";
        String expected = "HI";
        
        //actual
        EndUp test = new EndUp();
        String actual = test.endUp(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //EndUp("bye") -> "BYE" 
    @Test
    public void endUpTest4(){
        
        //arrange
        String str = "bye";
        String expected = "BYE";
        
        //actual
        EndUp test = new EndUp();
        String actual = test.endUp(str);
        
        //assert
        assertEquals(expected, actual);
    }    
        
}
