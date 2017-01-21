/*
Given 2 strings, a and b, return the number of the positions where they contain
the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx",
"aa", and "az" substrings appear in the same place in both strings. 

SubStringMatch("xxcaazz", "xxbaaz") -> 3
SubStringMatch("abc", "abc") -> 2
SubStringMatch("abc", "axc") -> 0

public int SubStringMatch(string a, string b) {

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
public class SubStringMatchTest {
    
    public SubStringMatchTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //SubStringMatch("xxcaazz", "xxbaaz") -> 3
    @Test
    public void subStringMatchTest(){
        
        //arrange
        String a = "xxcaazz";
        String b = "xxbaaz";
        int expected = 3;
        
        //actual
        SubStringMatch test = new SubStringMatch();
        int actual = test.subStringMatch(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //SubStringMatch("abc", "abc") -> 2
    @Test
    public void subStringMatchTest2(){
        
        //arrange
        String a = "abc";
        String b = "abc";
        int expected = 2;
        
        //actual
        SubStringMatch test = new SubStringMatch();
        int actual = test.subStringMatch(a, b);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //SubStringMatch("abc", "axc") -> 0 
    @Test
    public void subStringMatchTest3(){
        
        //arrange
        String a = "abc";
        String b = "axc";
        int expected = 0;
        
        //actual
        SubStringMatch test = new SubStringMatch();
        int actual = test.subStringMatch(a, b);
        
        //assert
        assertEquals(expected, actual);
    }    
}
