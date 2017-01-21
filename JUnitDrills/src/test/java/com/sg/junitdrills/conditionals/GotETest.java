/*
Return true if the given string contains between 1 and 3 'e' chars. 

GotE("Hello") -> true
GotE("Heelle") -> true
GotE("Heelele") -> false

public boolean GotE(string str) {

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
public class GotETest {
    
    public GotETest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //GotE("Hello") -> true
    @Test
    public void gotETest(){
        
        //arrange
        String str = "Hello";
        boolean expected = true;
        
        //actual
        GotE test = new GotE();
        boolean actual = test.gotE(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //GotE("Heelle") -> true
    @Test
    public void gotETest2(){
        
        //arrange
        String str = "Heelle";
        boolean expected = true;
        
        //actual
        GotE test = new GotE();
        boolean actual = test.gotE(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //GotE("Heelele") -> false 
    @Test
    public void gotETest3(){
        
        //arrange
        String str = "Heelele";
        boolean expected = false;
        
        //actual
        GotE test = new GotE();
        boolean actual = test.gotE(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
