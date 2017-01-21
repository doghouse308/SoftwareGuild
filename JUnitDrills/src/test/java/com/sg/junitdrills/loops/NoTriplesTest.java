/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in
a row in the array. Return true if the array does not contain any triples. 

NoTriples({1, 1, 2, 2, 1}) -> true
NoTriples({1, 1, 2, 2, 2, 1}) -> false
NoTriples({1, 1, 1, 2, 2, 2, 1}) -> false

public boolean noTriples(int[] numbers) {

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
public class NoTriplesTest {
    
    public NoTriplesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //NoTriples({1, 1, 2, 2, 1}) -> true
    @Test
    public void noTripplesTest(){
        
        //arrange
        int [] n = {1, 1, 2, 2, 1};
        boolean expected = true;
        
        //actual
        NoTriples test = new NoTriples();
        boolean actual = test.noTriples(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //NoTriples({1, 1, 2, 2, 2, 1}) -> false
    @Test
    public void noTripplesTest2(){
        
        //arrange
        int [] n = {1, 1, 2, 2, 2, 1};
        boolean expected = false;
        
        //actual
        NoTriples test = new NoTriples();
        boolean actual = test.noTriples(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //NoTriples({1, 1, 1, 2, 2, 2, 1}) -> false   
    @Test
    public void noTripplesTest3(){
        
        //arrange
        int [] n = {1, 1, 1, 2, 2, 2, 1};
        boolean expected = false;
        
        //actual
        NoTriples test = new NoTriples();
        boolean actual = test.noTriples(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //NoTriples({1, 1, 1, 2, 2, 2}) -> false   
    @Test
    public void noTripplesTest4(){
        
        //arrange
        int [] n = {1, 1, 1, 2, 2, 2};
        boolean expected = false;
        
        //actual
        NoTriples test = new NoTriples();
        boolean actual = test.noTriples(n);
        
        //assert
        assertEquals(expected, actual);
    }        
}
