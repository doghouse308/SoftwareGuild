/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive. 

Between10and20(12, 99) -> true
Between10and20(21, 12) -> true
Between10and20(8, 99) -> false

public boolean Between10and20(int a, int b) {

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
public class Between10and20Test {
    
    public Between10and20Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //Between10and20(12, 99) -> true
    @Test
    public void between10and20Test(){
        
        //arrange
        int a = 12;
        int b = 99;
        boolean expected = true;
        
        //actual
        Between10and20 test = new Between10and20();
        boolean actual = test.between10and20(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Between10and20(21, 12) -> true
    @Test
    public void between10and20Test2(){
        
        //arrange
        int a = 21;
        int b = 12;
        boolean expected = true;
        
        //actual
        Between10and20 test = new Between10and20();
        boolean actual = test.between10and20(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Between10and20(8, 99) -> false    
    @Test
    public void between10and20Test3(){
        
        //arrange
        int a = 8;
        int b = 99;
        boolean expected = false;
        
        //actual
        Between10and20 test = new Between10and20();
        boolean actual = test.between10and20(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
    
}
