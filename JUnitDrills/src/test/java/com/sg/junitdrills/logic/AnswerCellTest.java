/*
Your cell phone rings. Return true if you should answer it. Normally you answer,
except in the morning you only answer if it is your mom calling. In all cases, 
if you are asleep, you do not answer. 

AnswerCell(false, false, false) → true
AnswerCell(false, false, true) → false
AnswerCell(true, false, false) → false

public boolean AnswerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  
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
public class AnswerCellTest {
    
    public AnswerCellTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
  
    //AnswerCell(false, false, false) → true
    @Test
    public void answerCellTest(){
        
        //arrange
        boolean isMoring = false;
        boolean isMom = false;
        boolean isAsleep = false;
        boolean expected = true;
        
        //actual
        AnswerCell test = new AnswerCell();
        boolean actual = test.answerCell(isMoring, isMom, isAsleep);
        
        //assert
        assertEquals(expected, actual);
    }
    
    //AnswerCell(true, false, false) → false  
    @Test
    public void answerCellTest2(){
        
        //arrange
        boolean isMoring = true;
        boolean isMom = false;
        boolean isAsleep = false;
        boolean expected = false;
        
        //actual
        AnswerCell test = new AnswerCell();
        boolean actual = test.answerCell(isMoring, isMom, isAsleep);
        
        //assert
        assertEquals(expected, actual);
    }
      
    //AnswerCell(false, false, true) → false
    @Test
    public void answerCellTest3(){
        
        //arrange
        boolean isMoring = false;
        boolean isMom = false;
        boolean isAsleep = true;
        boolean expected = false;
        
        //actual
        AnswerCell test = new AnswerCell();
        boolean actual = test.answerCell(isMoring, isMom, isAsleep);
        
        //assert
        assertEquals(expected, actual);
    }

    //AnswerCell(true, true, false) → true  
    @Test
    public void answerCellTest4(){
        
        //arrange
        boolean isMoring = true;
        boolean isMom = true;
        boolean isAsleep = false;
        boolean expected = true;
        
        //actual
        AnswerCell test = new AnswerCell();
        boolean actual = test.answerCell(isMoring, isMom, isAsleep);
        
        //assert
        assertEquals(expected, actual);
    }    
      
    //AnswerCell(true, true, true) → false  
    @Test
    public void answerCellTest5(){
        
        //arrange
        boolean isMoring = true;
        boolean isMom = true;
        boolean isAsleep = true;
        boolean expected = false;
        
        //actual
        AnswerCell test = new AnswerCell();
        boolean actual = test.answerCell(isMoring, isMom, isAsleep);
        
        //assert
        assertEquals(expected, actual);
    }     
}
