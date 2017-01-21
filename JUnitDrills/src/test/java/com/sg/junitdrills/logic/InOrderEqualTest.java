/*
Given three ints, a b c, return true if they are in strict increasing order,
such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception 
that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5. 

InOrderEqual(2, 5, 11, false) → true
InOrderEqual(5, 7, 6, false) → false
InOrderEqual(5, 5, 7, true) → true

public boolean InOrderEqual(int a, int b, int c, boolean equalOk) {
  
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
public class InOrderEqualTest {
    
    public InOrderEqualTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    //InOrderEqual(2, 5, 11, false) → true
    @Test
    public void inOrderEqualTest(){
        
        //arrange
        int a = 2;
        int b = 5;
        int c = 11;
        boolean equalOk = false;
        boolean expected = true;
        
        //actual
        InOrderEqual test = new InOrderEqual();
        boolean actual = test.inOrderEqual(a, b, c, equalOk);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //InOrderEqual(5, 7, 6, false) → false
    @Test
    public void inOrderEqualTest2(){
        
        //arrange
        int a = 5;
        int b = 7;
        int c = 6;
        boolean equalOk = false;
        boolean expected = false;
        
        //actual
        InOrderEqual test = new InOrderEqual();
        boolean actual = test.inOrderEqual(a, b, c, equalOk);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //InOrderEqual(5, 5, 7, true) → true    
    @Test
    public void inOrderEqualTest3(){
        
        //arrange
        int a = 5;
        int b = 5;
        int c = 7;
        boolean equalOk = true;
        boolean expected = true;
        
        //actual
        InOrderEqual test = new InOrderEqual();
        boolean actual = test.inOrderEqual(a, b, c, equalOk);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
