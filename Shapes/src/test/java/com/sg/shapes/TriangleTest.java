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
public class TriangleTest {
    
    public TriangleTest() {
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
        String color = "Yellow";
        double a = 3.0;
        double base = 6.0;
        double c = 4.0;
        double height = 9.0;
        double expected = 13;

        //actual
        Triangle test = new Triangle(color, a, base, c, height);
        double actual = test.perimeter();

        //assert
        assertEquals(expected, actual, .01);
    }

    @Test
    public void areaTest() {
        //arrange
        String color = "Yellow";
        double a = 3.0;
        double base = 6.0;
        double c = 4.0;
        double height = 9.0;
        double expected = 27;

        //actual
        Triangle test = new Triangle(color, a, base, c, height);
        double actual = test.area();

        //assert
        assertEquals(expected, actual, .01);
    }     
}
