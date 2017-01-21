/*
Given an int array length 3, if there is a 2 in the array immediately followed
by a 3, set the 3 element to 0. Return the changed array. 

Fix23({1, 2, 3}) ->{1, 2, 0}
Fix23({2, 3, 5}) -> {2, 0, 5}
Fix23({1, 2, 1}) -> {1, 2, 1}

public int[] Fix23(int[] numbers) {

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
public class Fix23Test {
    
    public Fix23Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //Fix23({1, 2, 3}) ->{1, 2, 0}
    @Test
    public void fix23Test(){
        
        //arrange 
        int [] n = {1, 2, 3};
        int [] expected = {1, 2, 0};
        
        //actual 
        Fix23 test = new Fix23();
        int [] actual = test.fix23(n);
        
        //assert
        assertArrayEquals(expected, actual);
    }
    
    //Fix23({2, 3, 5}) -> {2, 0, 5}
    @Test
    public void fix23Test2(){
        
        //arrange 
        int [] n = {2, 3, 5};
        int [] expected = {2, 0, 5};
        
        //actual 
        Fix23 test = new Fix23();
        int [] actual = test.fix23(n);
        
        //assert
        assertArrayEquals(expected, actual);
    }
        
    //Fix23({1, 2, 1}) -> {1, 2, 1}  
    @Test
    public void fix23Test3(){
        
        //arrange 
        int [] n = {1, 2, 1};
        int [] expected = {1, 2, 1} ;
        
        //actual 
        Fix23 test = new Fix23();
        int [] actual = test.fix23(n);
        
        //assert
        assertArrayEquals(expected, actual);
    }
    
    //Fix23({2, 3, 2}) -> {2, 0, 2}
    @Test
    public void fix23Test4(){
        
        //arrange 
        int [] n = {2, 3, 2};
        int [] expected = {2, 0, 2};
        
        //actual 
        Fix23 test = new Fix23();
        int [] actual = test.fix23(n);
        
        //assert
        assertArrayEquals(expected, actual);
    }
        
    
}
