package com.sg.bjack;

import com.sg.bjack.BlackJack;
import com.sg.bjack.Card;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class BlackJackManualTests {

    BlackJack blackjack = new BlackJack();

    //computerPlay test
    public void testComputerBlackJack() {

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
        if (expected == actual) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        //arrange
        Card card3 = new Card(0, 0);
        Card card4 = new Card(0, 6);
        HashMap<Integer, Card> e2 = new HashMap();
        e2.put(1, card3);
        e2.put(2, card4);
        boolean expected2 = false;

        //actual
        boolean actual2 = test.blackJack(e2, "human");

        //assert
        if (expected2 == actual2) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

    }

    public void testComputerPlay() {

        //arrange
        Card card1 = new Card(0, 0);
        Card card2 = new Card(0, 6);
        HashMap<Integer, Card> e = new HashMap();
        e.put(1, card1);
        e.put(2, card2);
        int expected = 2;

        //actual
        BlackJack test = new BlackJack();
        test.shuffle();
        e = test.computerPlayManualTest(e);
        int actual = e.size();

        //assert
        if (expected == actual) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        //arrange
        Card card3 = new Card(0, 5);
        Card card4 = new Card(0, 6);
        HashMap<Integer, Card> e2 = new HashMap();
        e2.put(1, card3);
        e2.put(2, card4);

        //actual
        test.shuffle();
        e2 = test.computerPlayManualTest(e2);
        int actual2 = e2.size();

        //assert
        if (actual2 > 2) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void testGetInsurance() {

        //arrange
        Card card1 = new Card(0, 6);
        Card card2 = new Card(0, 0);
        HashMap<Integer, Card> e = new HashMap();
        e.put(1, card1);
        e.put(2, card2);
        int expected = 10; //enter 10 in execution

        //actual
        BlackJack test = new BlackJack();
        int actual = test.getInsurance(e);

        //assert
        if (expected == actual) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        //arrange
        Card card3 = new Card(0, 5);
        Card card4 = new Card(0, 6);
        HashMap<Integer, Card> e2 = new HashMap();
        e2.put(1, card3);
        e2.put(2, card4);
        int expected2 = 0; //no insurance offered

        //actual
        int actual2 = test.getInsurance(e2);

        //assert
        if (actual2 == expected2) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void testCardSuit() {
        Random r = new Random();
        int suit = 0 + r.nextInt(3);
        int card = 0 + r.nextInt(12);
        Card card3 = new Card(suit, card);
        suit = 0 + r.nextInt(3);
        card = 0 + r.nextInt(12);
        Card card4 = new Card(suit, card);
        
        System.out.println(card3.getCardValue() + card3.getSuit().toString());
        System.out.println(card4.getCardValue() + card4.getSuit());

        System.out.println("");
    }
}
