package com.sg.shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class CubeTest {

    public CubeTest() {
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
        double side = 9.0;
        String color = "blue";
        double expected = 36;

        //actual
        Cube test = new Cube(color, side);
        double actual = test.perimeter();

        //assert
        assertEquals(expected, actual, .01);
    }

    @Test
    public void areaTest() {
        //arrange
        String color = "blue";
        double side = 9.0;
        double expected = 486;

        //actual
        Cube test = new Cube(color, side);
        double actual = test.area();

        //assert
        assertEquals(expected, actual, .01);
    }

    @Test
    public void volumeTest() {
        //arrange
        String color = "blue";
        double side = 9.0;
        double expected = 729;

        //actual
        Cube test = new Cube(color, side);
        double actual = test.volume();

        //assert
        assertEquals(expected, actual, .01);
    }
}
