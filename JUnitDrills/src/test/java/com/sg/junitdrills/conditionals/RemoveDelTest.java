/*
Given a string, if the string "del" appears starting at index 1, return a string
where that "del" has been deleted. Otherwise, return the string unchanged. 

RemoveDel("adelbc") -> "abc"
RemoveDel("adelHello") -> "aHello"
RemoveDel("adedbc") -> "adedbc"

public string RemoveDel(string str) {

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
public class RemoveDelTest {
    
    public RemoveDelTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //RemoveDel("adelbc") -> "abc"
    @Test
    public void removeDelTest(){
        
        //arrange
        String str = "aDeLbc";
        String expected = "abc";
        
        //actual
        RemoveDel test = new RemoveDel();
        String actual = test.removeDel(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //RemoveDel("adelHello") -> "aHello"
    @Test
    public void removeDelTest2(){
        
        //arrange
        String str = "adelHello";
        String expected = "aHello";
        
        //actual
        RemoveDel test = new RemoveDel();
        String actual = test.removeDel(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //RemoveDel("adedbc") -> "adedbc"  
    @Test
    public void removeDelTest3(){
        
        //arrange
        String str = "adedbc";
        String expected = "adedbc";
        
        //actual
        RemoveDel test = new RemoveDel();
        String actual = test.removeDel(str);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
