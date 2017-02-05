package com.sg.shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class SphereTest {

    public SphereTest() {
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
        String color = "Green";
        double r = 6.0;
        double expected = 37.69;

        //actual
        Sphere test = new Sphere(color, r);
        double actual = test.perimeter();

        //assert
        assertEquals(expected, actual, .01);
    }

    @Test
    public void areaTest() {
        //arrange
        String color = "Green";
        double r = 6.0;
        double expected = 452.38;

        //actual
        Sphere test = new Sphere(color, r);
        double actual = test.area();

        //assert
        assertEquals(expected, actual, .01);
    }

    @Test
    public void volumeTest() {
        //arrange
        String color = "Green";
        double r = 6.0;
        double expected = 904.77;

        //actual
        Sphere test = new Sphere(color, r);
        double actual = test.volume(r);

        //assert
        assertEquals(expected, actual, .01);
    }
}
