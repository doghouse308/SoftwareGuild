/*
Suppose the string "yak" is unlucky. Given a string, return a version where all
the "yak" are removed, but the "a" can be any char. The "yak" strings will
not overlap. 

DoNotYak("yakpak") -> "pak"
DoNotYak("pakyak") -> "pak"
DoNotYak("yak123ya") -> "123ya"

public string DoNotYak(string str) {

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
public class DoNotYakTest {
    
    public DoNotYakTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //DoNotYak("yakpak") -> "pak"
    @Test
    public void doNotYakTest(){
        
        //arrange
        String str = "yakpak";
        String expected = "pak";
        
        //actual
        DoNotYak test = new DoNotYak();
        String actual = test.doNotYak(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //DoNotYak("pakyak") -> "pak"
    @Test
    public void doNotYakTest2(){
        
        //arrange
        String str = "pakyak";
        String expected = "pak";
        
        //actual
        DoNotYak test = new DoNotYak();
        String actual = test.doNotYak(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //DoNotYak("yak123ya") -> "123ya"    
    @Test
    public void doNotYakTest3(){
        
        //arrange
        String str = "yak123ya";
        String expected = "123ya";
        
        //actual
        DoNotYak test = new DoNotYak();
        String actual = test.doNotYak(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //DoNotYak("yakpakpakyakyakpakpakyak") -> "pakpakpakpak"    
    @Test
    public void doNotYakTest4(){
        
        //arrange
        String str = "yakpakpakyakyakpakpakyak";
        String expected = "pakpakpakpak";
        
        //actual
        DoNotYak test = new DoNotYak();
        String actual = test.doNotYak(str);
        
        //assert
        assertEquals(expected, actual);
    }        
}
