/*
This class creates a multideck shoe of cards for card games
each deck is randomly created
 */
package com.sg.bjack;

import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class Shoe {

    Random r = new Random();
    Card c = new Card();

    private final int SHOE = 6;

    //multi-deck shoe in three dimensional array
    //first array = deck, second array = suit, third array = card vallue
    private String[][][] card = new String[SHOE][4][13];
    private String[] temp = c.getCardValues().clone();

    public void initializeShoe() {
        //initialize shoe
        for (int deck = 0; deck < getSHOE(); deck++) {
            //initialize deck
            for (int suit = 0; suit < 4; suit++) {
                for (int face = 0; face < 13; face++) {
                    getCard()[deck][suit][face] = "X";
                }
            }
        }
    }

    public void shuffleCards() {
        //fill shoe
        for (int deck = 0; deck < getSHOE(); deck++) {
            //fill deck
            for (int suit = 0; suit < 4; suit++) {
                int loc;
                for (int face = 0; face < 13; face++) {
                    loc = 0 + r.nextInt(12);
                    while (temp[loc].equals("X")) {
                        loc = 0 + r.nextInt(13);
                    }
                    getCard()[deck][suit][face] = temp[loc];
                    temp[loc] = "X";
                }
                temp = c.getCardValues().clone();
            }
        }
    }

    /**
     * @return the card
     */
    public String[][][] getCard() {
        return card;
    }

    /**
     * @param d = deck
     * @param s = suit
     * @param f = faceValue
     * @param v = new value 
     */
    public void setCard(int d, int s, int f, String v) {
        this.card[d][s][f] = v;
    }

    /**
     * @return the SHOE
     */
    public int getSHOE() {
        return SHOE;
    }
}

