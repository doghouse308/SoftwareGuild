/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it 
is 'z', so "ozymandias" yields "oz". 

StartOz("ozymandias") -> "oz"
StartOz("bzoo") -> "z"
StartOz("oxx") -> "o"

public string StartOz(string str) {

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
public class StartOzTest {
    
    public StartOzTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //StartOz("ozymandias") -> "oz"
    @Test
    public void startOzTest(){
        //arrange
        String str = "ozymandias";
        String expected = "oz";
        
        //actual
        StartOz test = new StartOz();
        String actual = test.startOz(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //StartOz("bzoo") -> "z"
    @Test
    public void startOzTest2(){
        //arrange
        String str = "bzoo";
        String expected = "z";
        
        //actual
        StartOz test = new StartOz();
        String actual = test.startOz(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //StartOz("oxx") -> "o"    
    @Test
    public void startOzTest3(){
        //arrange
        String str = "oxx";
        String expected = "o";
        
        //actual
        StartOz test = new StartOz();
        String actual = test.startOz(str);
        
        //assert
        assertEquals(expected, actual);
    }
         
    //StartOz("o") -> "o"    
    @Test
    public void startOzTest4(){
        //arrange
        String str = "o";
        String expected = "o";
        
        //actual
        StartOz test = new StartOz();
        String actual = test.startOz(str);
        
        //assert
        assertEquals(expected, actual);
    }

    //StartOz("a") -> "a"    
    @Test
    public void startOzTest5(){
        //arrange
        String str = "a";
        String expected = "";
        
        //actual
        StartOz test = new StartOz();
        String actual = test.startOz(str);
        
        //assert
        assertEquals(expected, actual);
    }   
    
    //StartOz("") -> ""    
    @Test
    public void startOzTest6(){
        //arrange
        String str = "";
        String expected = "";
        
        //actual
        StartOz test = new StartOz();
        String actual = test.startOz(str);
        
        //assert
        assertEquals(expected, actual);
    }     
}
