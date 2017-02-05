/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bjack;

import java.util.HashMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class BlackJackTest {

    public BlackJackTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //test deal
    //deal 2 cards if hand empty, 1 card if not
    @Test
    public void dealTest() {

        //arrange
        int expected = 2;

        //actual
        BlackJack test = new BlackJack();
        test.shuffle();
        HashMap<Integer, Card> computer = new HashMap();
        computer = test.deal(computer);
        int actual = computer.size();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void dealTest2() {

        //arrange
        int expected = 3;

        //actual
        BlackJack test = new BlackJack();
        test.shuffle();
        HashMap<Integer, Card> computer = new HashMap();
        computer = test.deal(computer);
        computer = test.deal(computer);
        int actual = computer.size();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void isBlackJackTest() {

        //arrange
        Card card1 = new Card(0, 0);
        Card card2 = new Card(0, 10);
        HashMap<Integer, Card> e = new HashMap();
        e.put(1, card1);
        e.put(2, card2);
        boolean expected = true;

        //actual
        BlackJack test = new BlackJack();
        boolean actual = test.blackJack(e, "human");

        //assert
        assertEquals(expected, actual);

    }

    @Test
    public void isBlackJackTest2() {

        //arrange
        Card card1 = new Card(0, 0);
        Card card2 = new Card(0, 8);
        HashMap<Integer, Card> e = new HashMap();
        e.put(1, card1);
        e.put(2, card2);
        boolean expected = false;

        //actual
        BlackJack test = new BlackJack();
        boolean actual = test.blackJack(e, "human");

        //assert
        assertEquals(expected, actual);

    }

    @Test
    public void calculateValueTest() {

        //arrange
        Card card1 = new Card(0, 0);
        Card card2 = new Card(0, 10);
        HashMap<Integer, Card> e = new HashMap();
        e.put(1, card1);
        e.put(2, card2);
        int expected = 21;

        //actual
        BlackJack test = new BlackJack();
        int actual = test.calculateValue(e, "human");

        //assert
        assertEquals(expected, actual);

    }

    @Test
    public void calculateValueTest2() {

        //arrange
        Card card1 = new Card(0, 0);
        Card card2 = new Card(0, 6);
        HashMap<Integer, Card> e = new HashMap();
        e.put(1, card1);
        e.put(2, card2);
        int expected = 18;

        //actual
        BlackJack test = new BlackJack();
        int actual = test.calculateValue(e, "human");

        //assert
        assertEquals(expected, actual);

    }

    @Test
    public void checkSplitTest2() {

        //arrange
        Card card1 = new Card(0, 0);
        Card card2 = new Card(0, 6);
        HashMap<Integer, Card> e = new HashMap();
        e.put(1, card1);
        e.put(2, card2);
        boolean expected = false;

        //actual
        BlackJack test = new BlackJack();
        boolean actual = test.checkSplit(e);

        //assert
        assertEquals(expected, actual);

    }

}
