/*
Given two temperatures, return true if one is less than 0 and the other is greater than 100. 

IcyHot(120, -1) -> true
IcyHot(-1, 120) -> true
IcyHot(2, 120) -> false

public boolean IcyHot(int temp1, int temp2) {

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
public class IcyHotTest {
    
    public IcyHotTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    

    //IcyHot(120, -1) -> true
    @Test
    public void icyHotTest(){
        
        //arrange
        int temp1 = 120;
        int temp2 = -1;
        boolean expected = true;
        
        //actual
        IcyHot test = new IcyHot();
        boolean actual = test.icyHot(temp1, temp2);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //IcyHot(-1, 120) -> true
    @Test
    public void icyHotTest2(){
        
        //arrange
        int temp1 = -1;
        int temp2 = 120;
        boolean expected = true;
        
        //actual
        IcyHot test = new IcyHot();
        boolean actual = test.icyHot(temp1, temp2);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //IcyHot(2, 120) -> false    
    @Test
    public void icyHotTest3(){
        
        //arrange
        int temp1 = 2;
        int temp2 = 120;
        boolean expected = false;
        
        //actual
        IcyHot test = new IcyHot();
        boolean actual = test.icyHot(temp1, temp2);
        
        //assert
        assertEquals(expected, actual);
    }
}
