/*
Given an int n, return true if it is within 10 of 100 or 200.
Hint: Check out the C# Math class for absolute value

NearHundred(103) -> true
NearHundred(90) -> true
NearHundred(89) -> false

public boolean NearHundred(int n) {

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
public class NearHundredTest {
    
    public NearHundredTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //NearHundred(103) -> true
    @Test
    public void nearHundredTest(){
        
        //arrange
        int n = 103;
        boolean expected = true;
        
        //actual
        NearHundred test = new NearHundred();
        boolean actual = test.nearHundred(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //NearHundred(90) -> true
    @Test
    public void nearHundredTest2(){
        
        //arrange
        int n = 90;
        boolean expected = true;
        
        //actual
        NearHundred test = new NearHundred();
        boolean actual = test.nearHundred(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //NearHundred(89) -> false
    @Test
    public void nearHundredTest3(){
        
        //arrange
        int n = 89;
        boolean expected = false;
        
        //actual
        NearHundred test = new NearHundred();
        boolean actual = test.nearHundred(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
        
    //NearHundred(197) -> true   
    @Test
    public void nearHundredTest4(){
        
        //arrange
        int n = 103;
        boolean expected = true;
        
        //actual
        NearHundred test = new NearHundred();
        boolean actual = test.nearHundred(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //NearHundred(187) -> false   
    @Test
    public void nearHundredTest5(){
        
        //arrange
        int n = 187;
        boolean expected = false;
        
        //actual
        NearHundred test = new NearHundred();
        boolean actual = test.nearHundred(n);
        
        //assert
        assertEquals(expected, actual);
    }    
}
