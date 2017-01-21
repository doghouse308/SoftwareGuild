/*
Given a string, return a version where all the "x" have been removed. 
Except an "x" at the very start or end should not be removed. 

StringX("xxHxix") -> "xHix"
StringX("abxxxcd") -> "abcd"
StringX("xabxxxcdx") -> "xabcdx"

public string StringX(string str) {

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
public class StringXTest {
    
    public StringXTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //StringX("xxHxix") -> "xHix"
    @Test
    public void stringXTest(){
        
        //arrange
        String str = "xxHxix";
        String expected = "xHix";
        
        //actual 
        StringX test = new StringX();
        String actual = test.stringX(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //StringX("abxxxcd") -> "abcd"
    @Test
    public void stringXTest2(){
        
        //arrange
        String str = "abxxxcd";
        String expected = "abcd";
        
        //actual 
        StringX test = new StringX();
        String actual = test.stringX(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //StringX("xabxxxcdx") -> "xabcdx"   
    @Test
    public void stringXTest3(){
        
        //arrange
        String str = "xabxxxcdx";
        String expected = "xabcdx";
        
        //actual 
        StringX test = new StringX();
        String actual = test.stringX(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
