/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class CircleTest {
    
    public CircleTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void perimeterTest() {
        //arrange
        String color = "Blue";
        double r = 6.0;
        double expected = 37.69;
        
        //actual
        Circle test = new Circle(color, r);
        double actual = test.perimeter();
        
        //assert
        assertEquals(expected, actual, .01);
    }
    
    @Test
    public void areaTest(){
        //arrange
        String color = "Blue";
        double r = 6.0;
        double expected = 113.09;
        
        //actual
        Circle test = new Circle(color, r);
        double actual = test.area();
        
        //assert
        assertEquals(expected, actual, .01);
    }    
}
