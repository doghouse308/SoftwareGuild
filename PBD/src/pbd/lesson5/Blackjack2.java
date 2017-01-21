/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class Blackjack2 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        int cardsInHand = 2;
        int bank = 0, bet = 0, cardValue;
        String name = "";
        boolean isValid = false;
        String spade = "\u2660";
        String club = "\u2663";
        String diamond = "\u2666";
        String heart = "\u2665";
        String cardBack = "#";
        String suit = "";
        String value = "";
        String[] suits = {"hearts", "diamonds", "spades", "clubs", "back"};
        String[] cardValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "BACK"};
        String[] card = new String[7];
        String[] ace = {"  A  ", " A A ", "A   A", "AAAAA", "A   A", "A   A", "A   A"};
        String[] two = {" 222 ", "2   2", "    2", "  2  ", "2    ", "2    ", "22222"};
        String[] three = {" 333 ", "3   3", "    3", "  33 ", "    3", "3   3", " 333 "};
        String[] four = {"   4", "  44", " 4 4", "4  4", "44444", "   4 ", "   4 "};
        String[] five = {"55555", "5    ", "5 55 ", " 5  5", "    5", "5   5", " 555 "};
        String[] six = {" 666 ", "6   6", "6    ", "6666 ", "6   6", "6   6", " 666 "};
        String[] seven = {"77777", "    7", "   7 ", "  7  ", " 7   ", "7    ", "7    "};
        String[] eight = {" 888 ", "8   8", "8   8", " 888 ", "8   8", "8   8", " 888 "};
        String[] nine = {" 999 ", "9   9", "9   9", " 9999", "    9", "9   9", " 999 "};
        String[] ten = {"TTTTT", "  T  ", "  T  ", "  T  ", "  T  ", "  T  ", "  T  "};
        String[] jack = {"JJJJJ", "  J  ", "  J  ", "  J  ", "J J  ", "J J  ", " JJ  "};
        String[] queen = {" QQQ ", "Q   Q", "Q   Q", "Q   Q", "Q   Q", "Q  Q ", " QQ Q"};
        String[] king = {"K   K", "K  K ", "K K  ", "KK   ", "K K  ", "K  K ", "K   K"};
        String[] back = {};
        String[] error = {"X   X", "X   X", " X X ", "  X  ", " X X ", "X   X", "X   X"};

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
}
