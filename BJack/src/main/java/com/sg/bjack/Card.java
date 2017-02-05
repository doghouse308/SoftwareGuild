package com.sg.bjack;

/**
 *
 * @author Paul Peterson
 */
public class Card {

    //Map<Integer, String[]> cardFace = new HashMap();
    private final String spade = "\u2660";
    private final String club = "\u2663";
    private final String diamond = "\u2666";
    private final String heart = "\u2665";
    private String cardBack = "#";
    private String suit;
    private String cardValue;
    private int value;
    private boolean isAce;

    private String[] face;
    private String[] suits = {heart, diamond, spade, club, cardBack};
    private String[] cardValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "BACK"};
    private String[][] cardFaces = {{"  A  ", " A A ", "A   A", "AAAAA", "A   A", "A   A", "A   A"},
    {" 222 ", "2   2", "    2", "  2  ", "2    ", "2    ", "22222"},
    {" 333 ", "3   3", "    3", "  33 ", "    3", "3   3", " 333 "},
    {"   4", "  44", " 4 4", "4  4", "44444", "   4 ", "   4 "},
    {"55555", "5    ", "5 55 ", " 5  5", "    5", "5   5", " 555 "},
    {" 666 ", "6   6", "6    ", "6666 ", "6   6", "6   6", " 666 "},
    {"77777", "    7", "   7 ", "  7  ", " 7   ", "7    ", "7    "},
    {" 888 ", "8   8", "8   8", " 888 ", "8   8", "8   8", " 888 "},
    {" 999 ", "9   9", "9   9", " 9999", "    9", "9   9", " 999 "},
    {"TTTTT", "  T  ", "  T  ", "  T  ", "  T  ", "  T  ", "  T  "},
    {"JJJJJ", "  J  ", "  J  ", "  J  ", "J J  ", "J J  ", " JJ  "},
    {" QQQ ", "Q   Q", "Q   Q", "Q   Q", "Q   Q", "Q  Q ", " QQ Q"},
    {"K   K", "K  K ", "K K  ", "KK   ", "K K  ", "K  K ", "K   K"}};

    public Card() {

    }

    public Card(int suit, int value) {
        this.suit = suits[suit];
        if (value <= 9) {
            this.value = value + 1;
        } else {
            this.value = 10;
        }
        if (value == 0) {
            this.isAce = true;
        }
        this.cardValue = cardValues[value];
        this.face = cardFaces[value];
    }

    public static void printCardBack(String cardBack) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(repeat(cardBack, 15));
        }
    }

    public static void printCard(String[] card, String suit, String value) {

        String topBottom = repeat(suit, 12);
        String num = value;
        String leftNumberandSuit = suit + " " + num + " " + suit;
        String rightNumberAndSuit = num + " " + suit + " " + suit;
        System.out.printf("%-11s%n", topBottom);
        System.out.printf("%-14s%s%n", leftNumberandSuit, suit);
        System.out.printf("%-5s%-5s%5s%n", suit, card[0], suit);
        System.out.printf("%-5s%-5s%5s%n", suit, card[1], suit);
        System.out.printf("%-5s%-5s%5s%n", suit, card[2], suit);
        System.out.printf("%-5s%-5s%5s%n", suit, card[3], suit);
        System.out.printf("%-5s%-5s%5s%n", suit, card[4], suit);
        System.out.printf("%-5s%-5s%5s%n", suit, card[5], suit);
        System.out.printf("%-5s%-5s%5s%n", suit, card[6], suit);
        System.out.printf("%s%14s%n", suit, rightNumberAndSuit);
        System.out.printf("%-11s%n", topBottom);
    }

    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    /**
     * @return the spade
     */
    public String getSpade() {
        return spade;
    }

    /**
     * @return the club
     */
    public String getClub() {
        return club;
    }

    /**
     * @return the diamond
     */
    public String getDiamond() {
        return diamond;
    }

    /**
     * @return the heart
     */
    public String getHeart() {
        return heart;
    }

    /**
     * @return the cardBack
     */
    public String getCardBack() {
        return cardBack;
    }

    /**
     * @param cardBack the cardBack to set
     */
    public void setCardBack(String cardBack) {
        this.cardBack = cardBack;
    }

    /**
     * @return the suits
     */
    public String[] getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String[] suits) {
        this.suits = suits;
    }

    /**
     * @return the cardValues
     */
    public String[] getCardValues() {
        return cardValues;
    }

    /**
     * @param cardValues the cardValues to set
     */
    public void setCardValues(String[] cardValues) {
        this.cardValues = cardValues;
    }

    /**
     * @return the card
     */
    public String[][] getCardFaces() {
        return cardFaces;
    }

    /**
     * @param cardFaces the card to set
     */
    public void setCardFaces(String[][] cardFaces) {
        this.cardFaces = cardFaces;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the face
     */
    public String[] getFace() {
        return face;
    }

    /**
     * @param face the face to set
     */
    public void setFace(String[] face) {
        this.face = face;
    }

    /**
     * @return the cardValue
     */
    public String getCardValue() {
        return cardValue;
    }

    /**
     * @param cardValue the cardValue to set
     */
    public void setCardValue(String cardValue) {
        this.cardValue = cardValue;
    }

    /**
     * @return the isAce
     */
    public boolean isIsAce() {
        return isAce;
    }

}
