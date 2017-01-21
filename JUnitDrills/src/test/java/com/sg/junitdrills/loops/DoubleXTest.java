/*
Given a string, return true if the first instance of "x" in the string is 
immediately followed by another "x". 

DoubleX("axxbb") -> true
DoubleX("axaxxax") -> false
DoubleX("xxxxx") -> true

public boolean DoubleX(string str) {

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
public class DoubleXTest {
    
    public DoubleXTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //DoubleX("axxbb") -> true
    @Test
    public void doubleXTest(){
        
        //arrange
        String str = "axxbb";
        boolean expected = true;
        
        //actual
        DoubleX test = new DoubleX();
        boolean actual = test.doubleX(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //DoubleX("axaxxax") -> false
    @Test
    public void doubleXTest2(){
        
        //arrange
        String str = "axaxxax";
        boolean expected = false;
        
        //actual
        DoubleX test = new DoubleX();
        boolean actual = test.doubleX(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //DoubleX("xxxxx") -> true  
    @Test
    public void doubleXTest3(){
        
        //arrange
        String str = "xxxxx";
        boolean expected = true;
        
        //actual
        DoubleX test = new DoubleX();
        boolean actual = test.doubleX(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
