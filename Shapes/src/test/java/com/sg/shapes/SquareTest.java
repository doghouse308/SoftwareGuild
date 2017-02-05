package com.sg.shapes;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class SquareTest {

    public SquareTest() {
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
        String color = "Red";
        double side = 6.0;
        double expected = 24;
        
        //actual
        Square test = new Square(color, side);
        double actual = test.perimeter();
        
        //assert
        assertEquals(expected, actual, .01);
    }
    
    @Test
    public void areaTest(){
        //arrange
        double side = 6.0;
        String color = "Red";
        double expected = 36;
        
        //actual
        Square test = new Square(color, side);
        double actual = test.area();
        
        //assert
        assertEquals(expected, actual, .01);
    }
}
