/*
Given a non-empty string like "Code" return a string like "CCoCodCode".  
(first char, first two, first 3, etc)

StringSplosion("Code") -> "CCoCodCode"
StringSplosion("abc") -> "aababc"
StringSplosion("ab") -> "aab"

public string StringSplosion(string str) {

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
public class StringSplosionTest {
    
    public StringSplosionTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //StringSplosion("Code") -> "CCoCodCode"
    @Test
    public void stringSpolsionTest(){
        
        //arrange
        String str = "Code";
        String expected = "CCoCodCode";
        
        //actual
        StringSplosion test = new StringSplosion();
        String actual = test.stringSplosion(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //StringSplosion("abc") -> "aababc"
    @Test
    public void stringSpolsionTest2(){
        
        //arrange
        String str = "abc";
        String expected = "aababc";
        
        //actual
        StringSplosion test = new StringSplosion();
        String actual = test.stringSplosion(str);
        
        //assert
        assertEquals(expected, actual);
    }
       
    //StringSplosion("ab") -> "aab"   
    @Test
    public void stringSpolsionTest3(){
        
        //arrange
        String str = "ab";
        String expected = "aab";
        
        //actual
        StringSplosion test = new StringSplosion();
        String actual = test.stringSplosion(str);
        
        //assert
        assertEquals(expected, actual);
    }
       
}
