/*
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 
inclusive are forbidden, so in that case just return 20. 

SkipSum(3, 4) → 7
SkipSum(9, 4) → 20
SkipSum(10, 11) → 21

public int SkipSum(int a, int b) {
  
}
 */
package com.sg.junitdrills.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class SkipSumTest {
    
    public SkipSumTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    //SkipSum(3, 4) → 7
    @Test
    public void skipSum(){
        
        //arrange 
        int a = 3;
        int b = 4;
        int expected = 7;
        
        //actual 
        SkipSum test = new SkipSum();
        int actual = test.skipSum(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //SkipSum(9, 4) → 20
    @Test
    public void skipSum2(){
        
        //arrange 
        int a = 9;
        int b = 4;
        int expected = 20;
        
        //actual 
        SkipSum test = new SkipSum();
        int actual = test.skipSum(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //SkipSum(10, 11) → 21  
    @Test
    public void skipSum3(){
        
        //arrange 
        int a = 10;
        int b = 11;
        int expected = 21;
        
        //actual 
        SkipSum test = new SkipSum();
        int actual = test.skipSum(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
