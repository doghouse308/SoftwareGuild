/*
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
Return true if the given array contains an unlucky 1 in the first 2 or last 
2 positions in the array. 

Unlucky1({1, 3, 4, 5}) -> true
Unlucky1({2, 1, 3, 4, 5}) -> true
Unlucky1({1, 1, 1}) -> false

public boolean Unlucky1(int[] numbers) {

}
 */
package com.sg.junitdrills.arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class Unlucky1Test {
    
    public Unlucky1Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //Unlucky1({1, 3, 4, 5}) -> true
    @Test
    public void unluck1Test(){
        
        //arrange 
        int [] n = {1, 3, 4, 5};
        boolean expected = true;
        
        //actual
        Unlucky1 test = new Unlucky1();
        boolean actual = test.unlucky1(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Unlucky1({2, 1, 3, 4, 5}) -> true
    @Test
    public void unluck1Test2(){
        
        //arrange 
        int [] n = {2, 1, 3, 4, 5};
        boolean expected = true;
        
        //actual
        Unlucky1 test = new Unlucky1();
        boolean actual = test.unlucky1(n);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //Unlucky1({1, 1, 1}) -> false  
    @Test
    public void unluck1Test3(){
        
        //arrange 
        int [] n = {1, 1, 1};
        boolean expected = false;
        
        //actual
        Unlucky1 test = new Unlucky1();
        boolean actual = test.unlucky1(n);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //Unlucky1({1, 1, 1, 3}) -> true  
    @Test
    public void unluck1Test4(){
        
        //arrange 
        int [] n = {1, 1, 1, 3};
        boolean expected = true;
        
        //actual
        Unlucky1 test = new Unlucky1();
        boolean actual = test.unlucky1(n);
        
        //assert
        assertEquals(expected, actual);
    }    
        
    
}
