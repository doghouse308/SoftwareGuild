/*
The children in Cleveland spend most of the day playing outside. In particular,
they play if the temperature is between 60 and 90 (inclusive). Unless it is 
summer, then the upper limit is 100 instead of 90. Given an int temperature and
a boolean isSummer, return true if the children play and false otherwise. 

PlayOutside(70, false) → true
PlayOutside(95, false) → false
PlayOutside(95, true) → true

public boolean PlayOutside(int temp, boolean isSummer) {
  
}
 */
package com.sg.junitdrills.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class PlayOutsideTest {
    
    public PlayOutsideTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //PlayOutside(70, false) → true
    @Test
    public void playOutsideTest(){
        
        //arrange
        int temp = 70;
        boolean isSummer = false;
        boolean expected = true;
        
        //actual
        PlayOutside test = new PlayOutside();
        boolean actual = test.playOutside(temp, isSummer);
    }
    
    //PlayOutside(95, false) → false
    @Test
    public void playOutsideTest2(){
        
        //arrange
        int temp = 95;
        boolean isSummer = false;
        boolean expected = false;
        
        //actual
        PlayOutside test = new PlayOutside();
        boolean actual = test.playOutside(temp, isSummer);
    }
        
    //PlayOutside(95, true) → true    
    @Test
    public void playOutsideTest3(){
        
        //arrange
        int temp = 95;
        boolean isSummer = true;
        boolean expected = true;
        
        //actual
        PlayOutside test = new PlayOutside();
        boolean actual = test.playOutside(temp, isSummer);
    }
        
}
