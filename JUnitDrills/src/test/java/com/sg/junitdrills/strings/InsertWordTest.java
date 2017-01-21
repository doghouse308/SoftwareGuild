/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string 
where the word is in the middle of the out string, e.g. "<<word>>".

Hint: Substrings are your friend here 

InsertWord("<<>>", "Yay") -> "<<Yay>>"
InsertWord("<<>>", "WooHoo") -> "<<WooHoo>>"
InsertWord("[[]]", "word") -> "[[word]]"

public string InsertWord(string container, string word) 
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
public class InsertWordTest {

    public InsertWordTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //InsertWord("<<>>", "Yay") -> "<<Yay>>"
    @Test
    public void insertWord() {

        //arrange
        String out = "<<>>";
        String word = "Yay";
        String expected = "<<Yay>>";

        //actual
        InsertWord i = new InsertWord();
        String actual = i.insertWord(out, word);

        //assert
        assertEquals(expected, actual);
    }

    //InsertWord("<<>>", "WooHoo") -> "<<WooHoo>>"
    @Test
    public void insertWord2() {

        //arrange
        String out = "<<>>";
        String word = "WooHoo";
        String expected = "<<WooHoo>>";

        //actual
        InsertWord i = new InsertWord();
        String actual = i.insertWord(out, word);

        //assert
        assertEquals(expected, actual);
    }

    //InsertWord("[[]]", "word") -> "[[word]]"
    @Test
    public void insertWord3() {

        //arrange
        String out = "[[]]";
        String word = "word";
        String expected = "[[word]]";

        //actual
        InsertWord i = new InsertWord();
        String actual = i.insertWord(out, word);

        //assert
        assertEquals(expected, actual);
    }
}
