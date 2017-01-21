/*
Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there. Return a 
new string which is 3 copies of the front. 

Front3("Microsoft") -> "MicMicMic"
Front3("Chocolate") -> "ChoChoCho"
Front3("at") -> "atatat"

public string Front3(string str) {

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
public class Front3Test {
    
    public Front3Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //Front3("Microsoft") -> "MicMicMic"
    @Test
    public void front3Test(){
        
        //arrange
        String str = "Microsoft";
        String expected = "MicMicMic";
        
        //actual 
        Front3 test = new Front3();
        String actual = test.front3(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Front3("Chocolate") -> "ChoChoCho"
    @Test
    public void front3Test2(){
        
        //arrange
        String str = "Chocolate";
        String expected = "ChoChoCho";
        
        //actual 
        Front3 test = new Front3();
        String actual = test.front3(str);
        
        //assert
        assertEquals(expected, actual);
    }
      
    //Front3("at") -> "atatat"   
    @Test
    public void front3Test3(){
        
        //arrange
        String str = "at";
        String expected = "atatat";
        
        //actual 
        Front3 test = new Front3();
        String actual = test.front3(str);
        
        //assert
        assertEquals(expected, actual);
    }
      
    
}
