/*
Given a non-empty string and an int n, return a new string where the char at 
index n has been removed. The value of n will be a valid index of a char in the 
original string (Don't check for bad index). 

MissingChar("kitten", 1) -> "ktten"
MissingChar("kitten", 0) -> "itten"
MissingChar("kitten", 4) -> "kittn"

public string MissingChar(string str, int n) {
  
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
public class MissingCharTest {
    
    public MissingCharTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //MissingChar("kitten", 1) -> "ktten"
    @Test
    public void missingCharTest(){
        
        //arrange
        String str = "kitten";
        int n = 1;
        String expected = "ktten";
        
        //actual
        MissingChar test = new MissingChar();
        String actual = test.missingChar(str, n);
        
        //arrange
        assertEquals(expected, actual);
    }
    
    //MissingChar("kitten", 0) -> "itten"
    @Test
    public void missingCharTest2(){
        
        //arrange
        String str = "kitten";
        int n = 0;
        String expected = "itten";
        
        //actual
        MissingChar test = new MissingChar();
        String actual = test.missingChar(str, n);
        
        //arrange
        assertEquals(expected, actual);
    }
        
    //MissingChar("kitten", 4) -> "kittn"  
    @Test
    public void missingCharTest3(){
        
        //arrange
        String str = "kitten";
        int n = 4;
        String expected = "kittn";
        
        //actual
        MissingChar test = new MissingChar();
        String actual = test.missingChar(str, n);
        
        //arrange
        assertEquals(expected, actual);
    }
        
    //MissingChar("kitten", 8) -> "kitten"  
    @Test
    public void missingCharTest4(){
        
        //arrange
        String str = "kitten";
        int n = 8;
        String expected = "kitten";
        
        //actual
        MissingChar test = new MissingChar();
        String actual = test.missingChar(str, n);
        
        //arrange
        assertEquals(expected, actual);
    }    
        
    
}
