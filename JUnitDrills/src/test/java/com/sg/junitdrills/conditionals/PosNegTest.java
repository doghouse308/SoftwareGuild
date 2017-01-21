/*
Given two int values, return true if one is negative and one is positive. Except
if the parameter "negative" is true, then return true only if both are negative. 

PosNeg(1, -1, false) -> true
PosNeg(-1, 1, false) -> true
PosNeg(-4, -5, true) -> true

public boolean PosNeg(int a, int b, boolean negative) {

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
public class PosNegTest {
    
    public PosNegTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //PosNeg(1, -1, false) -> true
    @Test
    public void posNegTest(){
        
        //arrange
        int a = 1;
        int b = -1;
        boolean negative = false;
        boolean expected = true;
        
        //actual
        PosNeg test = new PosNeg();
        boolean actual = test.posNeg(a, b, negative);
    }
    
    //PosNeg(-1, 1, false) -> true
    @Test
    public void posNegTest2(){
        
        //arrange
        int a = -1;
        int b = 1;
        boolean negative = false;
        boolean expected = true;
        
        //actual
        PosNeg test = new PosNeg();
        boolean actual = test.posNeg(a, b, negative);
    }
        
    //PosNeg(-4, -5, true) -> true  
    @Test
    public void posNegTest3(){
        
        //arrange
        int a = -4;
        int b = -5;
        boolean negative = true;
        boolean expected = true;
        
        //actual
        PosNeg test = new PosNeg();
        boolean actual = test.posNeg(a, b, negative);
    }
        
    //PosNeg(4, 5, true) -> true  
    @Test
    public void posNegTest4(){
        
        //arrange
        int a = 4;
        int b = 5;
        boolean negative = true;
        boolean expected = false;
        
        //actual
        PosNeg test = new PosNeg();
        boolean actual = test.posNeg(a, b, negative);
    }    
}
