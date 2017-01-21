/*
Given a non-empty string and an int N, return the string made starting with 
char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6,
... and so on. N is 1 or more. 

EveryNth("Miracle", 2) -> "Mrce"
EveryNth("abcdefg", 2) -> "aceg"
EveryNth("abcdefg", 3) -> "adg"

public string EveryNth(string str, int n) {

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
public class EveryNthTest {
    
    public EveryNthTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    //EveryNth("Miracle", 2) -> "Mrce"
    @Test
    public void everyNthTest(){
        
        //arrange
        String str = "Miracle";
        int n = 2;
        String expected = "Mrce";
        
        //actual
        EveryNth test = new EveryNth();
        String actual = test.everyNth(str, n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //EveryNth("abcdefg", 2) -> "aceg"
    @Test
    public void everyNthTest2(){
        
        //arrange
        String str = "abcdefg";
        int n = 2;
        String expected = "aceg";
        
        //actual
        EveryNth test = new EveryNth();
        String actual = test.everyNth(str, n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //EveryNth("abcdefg", 3) -> "adg"  
    @Test
    public void everyNthTest3(){
        
        //arrange
        String str = "abcdefg";
        int n = 3;
        String expected = "adg";
        
        //actual
        EveryNth test = new EveryNth();
        String actual = test.everyNth(str, n);
        
        //assert
        assertEquals(expected, actual);
    }
     
    //EveryNth("Miracle", 0) -> ""
    @Test
    public void everyNthTest4(){
        
        //arrange
        String str = "Miracle";
        int n = 0;
        String expected = "";
        
        //actual
        EveryNth test = new EveryNth();
        String actual = test.everyNth(str, n);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
