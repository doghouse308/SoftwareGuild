/*
Given a string, if the first or last chars are 'x', return the string without 
those 'x' chars, and otherwise return the string unchanged. 

StripX("xHix") -> "Hi"
StripX("xHi") -> "Hi"
StripX("Hxix") -> "Hxi"

public string StripX(string str) {

}
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
public class StripXTest {
    
    public StripXTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //StripX("xHix") -> "Hi"
    @Test
    public void stripXTest() {

        //arrange 
        String str = "xHix";
        String expected = "Hi";

        //actual 
        StripX test = new StripX();
        String actual = test.stripX(str);

        //assert
        assertEquals(expected, actual);
    }  
    
    //StripX("xHi") -> "Hi"
    @Test
    public void stripXTest2() {

        //arrange 
        String str = "xHi";
        String expected = "Hi";

        //actual 
        StripX test = new StripX();
        String actual = test.stripX(str);

        //assert
        assertEquals(expected, actual);
    }    
    //StripX("Hxix") -> "Hxi"   
    @Test
    public void stripXTest3() {

        //arrange 
        String str = "Hxix";
        String expected = "Hxi";

        //actual 
        StripX test = new StripX();
        String actual = test.stripX(str);

        //assert
        assertEquals(expected, actual);
    }    
    
}
