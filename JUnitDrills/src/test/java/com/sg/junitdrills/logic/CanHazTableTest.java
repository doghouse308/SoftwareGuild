/*
You and your date are trying to get a table at a restaurant. The parameter 
"you" is the stylishness of your clothes, in the range 0..10, and "date" is the
stylishness of your date's clothes. The result getting the table is encoded as 
an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 
8 or more, then the result is 2 (yes). With the exception that if either of you 
has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe). 

CanHazTable(5, 10) → 2
CanHazTable(5, 2) → 0
CanHazTable(5, 5) → 1

public int CanHazTable(int yourStyle, int dateStyle) {
  
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
public class CanHazTableTest {
    
    public CanHazTableTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
  
    //CanHazTable(5, 10) → 2
    @Test
    public void canHazTableTest(){
        
        //arrange
        int yourStyle = 5;
        int dateStyle = 10;
        int expected = 2;
        
        //actual
        CanHazTable test = new CanHazTable();
        int actual = test.canHazTable(yourStyle, dateStyle);
        
        //assert
        assertEquals(expected, actual);
        
    }
    
    //CanHazTable(5, 2) → 0
    @Test
    public void canHazTableTest2(){
        
        //arrange
        int yourStyle = 5;
        int dateStyle = 2;
        int expected = 0;
        
        //actual
        CanHazTable test = new CanHazTable();
        int actual = test.canHazTable(yourStyle, dateStyle);
        
        //assert
        assertEquals(expected, actual);
        
    }
        
    //CanHazTable(5, 5) → 1  
    @Test
    public void canHazTableTest3(){
        
        //arrange
        int yourStyle = 5;
        int dateStyle = 5;
        int expected = 1;
        
        //actual
        CanHazTable test = new CanHazTable();
        int actual = test.canHazTable(yourStyle, dateStyle);
        
        //assert
        assertEquals(expected, actual);
        
    }
        
}
