/*
Given a string, return the count of the number of times that a substring length
2 appears in the string and also as the last 2 chars of the string, so "hixxxhi"
yields 1 (we won't count the end substring). 

CountLast2("hixxhi") -> 1
CountLast2("xaxxaxaxx") -> 1
CountLast2("axxxaaxx") -> 2

public int CountLast2(string str) {

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
public class CountLast2Test {
    
    public CountLast2Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //CountLast2("hixxhi") -> 1
    @Test
    public void countLast2Test(){
        
        //arrange
        String str = "hixxhi";
        int expected = 1;
        
        //actual
        CountLast2 test = new CountLast2();
        int actual = test.countLast2(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //CountLast2("xaxxaxaxx") -> 1
    @Test
    public void countLast2Test2(){
        
        //arrange
        String str = "xaxxaxaxx";
        int expected = 1;
        
        //actual
        CountLast2 test = new CountLast2();
        int actual = test.countLast2(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //CountLast2("axxxaaxx") -> 2    
    @Test
    public void countLast2Test3(){
        
        //arrange
        String str = "axxxaaxx";
        int expected = 2;
        
        //actual
        CountLast2 test = new CountLast2();
        int actual = test.countLast2(str);
        
        //assert
        assertEquals(expected, actual);
    }
      
}
