/*
Return true if the given non-negative number is a multiple of 3 or a multiple
of 5. Use the % "mod" operator

Multiple3or5(3) -> true
Multiple3or5(10) -> true
Multiple3or5(8) -> false

public boolean Multiple3or5(int number) {

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
public class Multiple3or5Test {

    public Multiple3or5Test() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //Multiple3or5(3) -> true
    @Test
    public void multiple3or5Test() {

        //arrange
        int number = 3;
        boolean expected = true;

        //actual
        Multiple3or5 test = new Multiple3or5();
        boolean actual = test.multiple3or5(number);

        //assert
        assertEquals(expected, actual);
    }

    //Multiple3or5(10) -> true
    @Test
    public void multiple3or5Test2() {

        //arrange
        int number = 10;
        boolean expected = true;

        //actual
        Multiple3or5 test = new Multiple3or5();
        boolean actual = test.multiple3or5(number);

        //assert
        assertEquals(expected, actual);
    }

    //Multiple3or5(8) -> false    
    @Test
    public void multiple3or5Test3(){
        
        //arrange
        int number = 8;
        boolean expected = false;
        
        //actual
        Multiple3or5 test = new Multiple3or5();
        boolean actual = test.multiple3or5(number);
        
        //assert
        assertEquals(expected, actual);
    }
        
}
