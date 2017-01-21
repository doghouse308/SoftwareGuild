/*
Return true if the given string begins with "*ix", the '*' can be anything, 
so "pix", "9ix" .. all count. 

IxStart("mix snacks") -> true
IxStart("pix snacks") -> true
IxStart("piz snacks") -> false

public boolean IxStart(string str) {

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
public class IxStartTest {
    
    public IxStartTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //IxStart("mix snacks") -> true
    @Test
    public void ixStartTest(){
        
        //arange
        String str = "mix snacks";
        boolean expected = true;
        
        //actual
        IxStart test = new IxStart();
        boolean actual = test.ixStart(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //IxStart("pix snacks") -> true
    @Test
    public void ixStartTest2(){
        
        //arange
        String str = "pix snacks";
        boolean expected = true;
        
        //actual
        IxStart test = new IxStart();
        boolean actual = test.ixStart(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //IxStart("piz snacks") -> false  
    @Test
    public void ixStartTest3(){
        
        //arange
        String str = "piz snacks";
        boolean expected = false;
        
        //actual
        IxStart test = new IxStart();
        boolean actual = test.ixStart(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
