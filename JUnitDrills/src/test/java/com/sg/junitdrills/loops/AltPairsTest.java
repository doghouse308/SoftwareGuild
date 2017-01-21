/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... 
so "kittens" yields "kien". 

AltPairs("kitten") -> "kien"
AltPairs("Chocolate") -> "Chole"
AltPairs("CodingHorror") -> "Congrr"

public string AltPairs(string str) {

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
public class AltPairsTest {
    
    public AltPairsTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //AltPairs("kitten") -> "kien"
    @Test
    public void altPairsTest(){
        
        //arrange
        String str = "kitten";
        String expected = "kien";
        
        //actual 
        AltPairs test = new AltPairs();
        String actual = test.altPairs(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //AltPairs("Chocolate") -> "Chole"
    @Test
    public void altPairsTest2(){
        
        //arrange
        String str = "Chocolate";
        String expected = "Chole";
        
        //actual 
        AltPairs test = new AltPairs();
        String actual = test.altPairs(str);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //AltPairs("CodingHorror") -> "Congrr" 
    @Test
    public void altPairsTest3(){
        
        //arrange
        String str = "CodingHorror";
        String expected = "Congrr";
        
        //actual 
        AltPairs test = new AltPairs();
        String actual = test.altPairs(str);
        
        //assert
        assertEquals(expected, actual);
    }
}
