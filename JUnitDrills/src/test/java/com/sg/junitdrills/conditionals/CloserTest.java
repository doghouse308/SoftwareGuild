/*
Given 2 int values, return whichever value is nearest to the value 10,
or return 0 in the event of a tie. 

Closer(8, 13) -> 8
Closer(13, 8) -> 8
Closer(13, 7) -> 0

public int Closer(int a, int b) {

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
public class CloserTest {
    
    public CloserTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
  
    //Closer(8, 13) -> 8
    @Test
    public void closerTest(){
        
        //arrange
        int a = 8;
        int b = 13;
        int expected = a;
        
        //actual
        Closer test = new Closer();
        int actual = test.closer(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Closer(13, 8) -> 8
    @Test
    public void closerTest2(){
        
        //arrange
        int a = 13;
        int b = 8;
        int expected = b;
        
        //actual
        Closer test = new Closer();
        int actual = test.closer(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Closer(13, 6) -> 13
    @Test
    public void closerTest3(){
        
        //arrange
        int a = 13;
        int b = 6;
        int expected = a;
        
        //actual
        Closer test = new Closer();
        int actual = test.closer(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Closer(13, 7) -> 0 
    @Test
    public void closerTest4(){
        
        //arrange
        int a = 13;
        int b = 7;
        int expected = 0;
        
        //actual
        Closer test = new Closer();
        int actual = test.closer(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
