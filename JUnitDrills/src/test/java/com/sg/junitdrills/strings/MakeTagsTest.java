/*
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic 
text. In this example, the "i" tag makes <i> and </i> which surround the word 
"Yay". Given tag and word strings, create the HTML string with tags around the 
word, e.g. "<i>Yay</i>". 

MakeTags("i", "Yay") -> "<i>Yay</i>"
MakeTags("i", "Hello") -> "<i>Hello</i>"
MakeTags("cite", "Yay") -> "<cite>Yay</cite>"

public string MakeTags(string tag, string content)
 */
package com.sg.junitdrills.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class MakeTagsTest {

    public MakeTagsTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //MakeTags("i", "Yay") -> "<i>Yay</i>"
    @Test
    public void makeTagTest() {

        //arrange
        String tag = "i";
        String body = "Yay";
        String expected = "<" + tag + ">" + body + "</" + tag + ">";

        //actual
        MakeTags make = new MakeTags();
        String actual = make.makeTags(tag, body);

        //assert
        assertEquals(expected, actual);
    }
    
    //MakeTags("i", "Hello") -> "<i>Hello</i>"
    @Test
    public void makeTagTest2() {

        //arrange
        String tag = "i";
        String body = "Hello";
        String expected = "<" + tag + ">" + body + "</" + tag + ">";

        //actual
        MakeTags make = new MakeTags();
        String actual = make.makeTags(tag, body);

        //assert
        assertEquals(expected, actual);
    }
    
    //MakeTags("cite", "Yay") -> "<cite>Yay</cite>"
    @Test
    public void makeTagTest3() {

        //arrange
        String tag = "cite";
        String body = "Yay";
        String expected = "<" + tag + ">" + body + "</" + tag + ">";

        //actual
        MakeTags make = new MakeTags();
        String actual = make.makeTags(tag, body);

        //assert
        assertEquals(expected, actual);
    }
}
