/*
Given three int values, a b c, return the largest. 

Max(1, 2, 3) -> 3
Max(1, 3, 2) -> 3
Max(3, 2, 1) -> 3

public int Max(int a, int b, int c) {

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
public class MaxTest {
    
    public MaxTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //Max(1, 2, 3) -> 3
    @Test
    public void maxTest(){
        
        //arrange
        int a = 1;
        int b = 2;
        int c = 3;
        int expected = 3;
        
        //actual
        Max test = new Max();
        int actual = test.max(a, b, c);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Max(1, 3, 2) -> 3
    @Test
    public void maxTest2(){
        
        //arrange
        int a = 1;
        int b = 3;
        int c = 2;
        int expected = 3;
        
        //actual
        Max test = new Max();
        int actual = test.max(a, b, c);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Max(3, 2, 1) -> 3  
    @Test
    public void maxTest3(){
        
        //arrange
        int a = 3;
        int b = 2;
        int c = 1;
        int expected = 3;
        
        //actual
        Max test = new Max();
        int actual = test.max(a, b, c);
        
        //assert
        assertEquals(expected, actual);
    }
        
    
}
