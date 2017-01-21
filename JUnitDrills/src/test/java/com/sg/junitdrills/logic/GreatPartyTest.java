/*
When squirrels get together for a party, they like to have cigars. A squirrel 
party is successful when the number of cigars is between 40 and 60, inclusive. 
Unless it is the weekend, in which case there is no upper bound on the number of
cigars.

Return true if the party with the given values is successful, or false otherwise. 

GreatParty(30, false) → false
GreatParty(50, false) → true
GreatParty(70, true) → true

public boolean GreatParty(int cigars, boolean isWeekend) {
  
}.
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
public class GreatPartyTest {
    
    public GreatPartyTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //GreatParty(30, false) → false
    @Test
    public void greatPartyTest(){
        
        //arrange
        int cigars = 30;
        boolean isWeekend = false;
        boolean expected = false;
        
        //actual
        GreatParty test = new GreatParty();
        boolean actual = test.greatParty(cigars, isWeekend);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //GreatParty(50, false) → true
    @Test
    public void greatPartyTest2(){
        
        //arrange
        int cigars = 50;
        boolean isWeekend = false;
        boolean expected = true;
        
        //actual
        GreatParty test = new GreatParty();
        boolean actual = test.greatParty(cigars, isWeekend);
        
        //assert
        assertEquals(expected, actual);
    }
        
    //GreatParty(70, true) → true   
    @Test
    public void greatPartyTest3(){
        
        //arrange
        int cigars = 70;
        boolean isWeekend = true;
        boolean expected = true;
        
        //actual
        GreatParty test = new GreatParty();
        boolean actual = test.greatParty(cigars, isWeekend);
        
        //assert
        assertEquals(expected, actual);
    }
      
    //GreatParty(30, true) → false   
    @Test
    public void greatPartyTest4(){
        
        //arrange
        int cigars = 30;
        boolean isWeekend = true;
        boolean expected = false;
        
        //actual
        GreatParty test = new GreatParty();
        boolean actual = test.greatParty(cigars, isWeekend);
        
        //assert
        assertEquals(expected, actual);
    }    
}
