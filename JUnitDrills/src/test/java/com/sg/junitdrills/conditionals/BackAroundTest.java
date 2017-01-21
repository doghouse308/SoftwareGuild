/*
Given a string, take the last char and return a new string with the last char
added at the front and back, so "cat" yields "tcatt". The original string will 
be length 1 or more. 

BackAround("cat") -> "tcatt"
BackAround("Hello") -> "oHelloo"
BackAround("a") -> "aaa"

public string BackAround(string str) {

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
public class BackAroundTest {
    
    public BackAroundTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //BackAround("cat") -> "tcatt"
    @Test
    public void backAroundTest(){
        
        //arrange
        String str = "cat";
        String expected = "tcatt";
        
        //actual
        BackAround test = new BackAround();
        String actual = test.backAround(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //BackAround("Hello") -> "oHelloo"
    @Test
    public void backAroundTest2(){
        
        //arrange
        String str = "Hello";
        String expected = "oHelloo";
        
        //actual
        BackAround test = new BackAround();
        String actual = test.backAround(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //BackAround("a") -> "aaa"    
    @Test
    public void backAroundTest3(){
        
        //arrange
        String str = "a";
        String expected = "aaa";
        
        //actual
        BackAround test = new BackAround();
        String actual = test.backAround(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    
}
