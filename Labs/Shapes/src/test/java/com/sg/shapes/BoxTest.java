
package com.sg.shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class BoxTest {
    
    public BoxTest() {
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
        String color = "Silver";
        double length = 6.0;
        double width = 9.0;
        double height = 4.0;
        double expected = 30;

        //actual
        Box test = new Box(color, length, width, height);
        double actual = test.perimeter();

        //assert
        assertEquals(expected, actual, .01);
    }

    @Test
    public void areaTest() {
        //arrange
        String color = "Silver";
        double length = 6.0;
        double width = 9.0;
        double height = 4.0;
        double expected = 228;

        //actual
        Box test = new Box(color, length, width, height);
        double actual = test.area();

        //assert
        assertEquals(expected, actual, .01);
    }   
    
    @Test
    public void volumeTest() {
        //arrange
        String color = "Silver";
        double length = 6.0;
        double width = 9.0;
        double height = 4.0;
        double expected = 216;

        //actual
        Box test = new Box(color, length, width, height);
        double actual = test.volume();

        //assert
        assertEquals(expected, actual, .01);
    }      
}
