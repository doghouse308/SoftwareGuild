/*
Given a string, return a new string where the first and last chars have been exchanged. 

FrontBack("code") -> "eodc"
FrontBack("a") -> "a"
FrontBack("ab") -> "ba"

public string FrontBack(string str) {

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
public class FrontBackTest {
    
    public FrontBackTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    //FrontBack("code") -> "eodc"
    @Test
    public void frontBackTest(){
        
        //arrange
        String str = "code";
        String expected = "eodc";
        
        //actual
        FrontBack test = new FrontBack();
        String actual = test.frontBack(str);
        
        //assert 
        assertEquals(expected, actual);
    }
    
    //FrontBack("a") -> "a"
    @Test
    public void frontBackTest2(){
        
        //arrange
        String str = "a";
        String expected = "a";
        
        //actual
        FrontBack test = new FrontBack();
        String actual = test.frontBack(str);
        
        //assert 
        assertEquals(expected, actual);
    }
        
    //FrontBack("ab") -> "ba"  
    @Test
    public void frontBackTest3(){
        
        //arrange
        String str = "ab";
        String expected = "ba";
        
        //actual
        FrontBack test = new FrontBack();
        String actual = test.frontBack(str);
        
        //assert 
        assertEquals(expected, actual);
    }
        
}
