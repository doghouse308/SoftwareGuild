
package com.sg.shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class RectangleTest {

    public RectangleTest() {
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
        String color = "Orange";
        double length = 6.0;
        double width = 9.0;
        double expected = 30;

        //actual
        Rectangle test = new Rectangle(color, length, width);
        double actual = test.perimeter();

        //assert
        assertEquals(expected, actual, .01);
    }

    @Test
    public void areaTest() {
        //arrange
        String color = "Orange";
        double length = 6.0;
        double width = 9.0;
        double expected = 54;

        //actual
        Rectangle test = new Rectangle(color, length, width);
        double actual = test.area();

        //assert
        assertEquals(expected, actual, .01);
    }

}
