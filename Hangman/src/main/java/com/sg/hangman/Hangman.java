
package com.sg.hangman;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class Hangman {

    static Scanner kb = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
        int wrong = 0;
        char guess;
        boolean endGame = false;
        String[] words = {"parachute", "stapler", "bookshelf", "wide-eyed", "open-ended",
            "computer", "scanner", "printer", "television", "hangman", "aquarium", "enhance",
            "apple", "orange", "dog collar", "blanket", "sewing machine", "human", "quality",
            "razor", "for loop", "nested loop", "discount", "runing shoes", "pizza", "jello",
            "medal", "cellphone", "remorse", "wine rack", "tea cart", "jacket", "motorcycle"};
        String word = words[(0 + r.nextInt(words.length))];
        char[] correct = new char[word.length()];
        char[] miss = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        correct = initializeGuess(word);

        while (!endGame) {
            guess = display(word, correct, miss);
            if (checkGuess(word, guess)) {
                correct = updateArray(word, correct, guess);
                endGame = checkWinner(correct);
            } else if (wrong < 9) {
                miss[wrong] = guess;
                wrong++;
                System.out.println("Wrong Guesses:  " + wrong);
            } else {
                System.out.println("\n\nYou Lose!  Too many wrong guesses.");
                endGame = true;
            }
        }
    }

    public static char[] initializeGuess(String word) {
        char[] temp = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case '-':
                    temp[i] = '-';
                    break;
                case ' ':
                    temp[i] = ' ';
                    break;
                case '\'':
                    temp[i] = '\'';
                    break;
                default:
                    temp[i] = '_';
                    break;
            }
        }
        return temp;
    }

    public static char display(String word, char[] correct, char[] miss) {
        char guess = ' ';
        int count = 0;
        String s;

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.print("Word:  ");
        for (char c : correct) {
            System.out.print(c + " ");
        }
        System.out.print("\n\nMisses:  ");
        while (miss[count] != ' ' || count < 9) {
            System.out.print(miss[count] + " ");
            count++;
        }
        System.out.print("\n\nGuess:  ");
        s = kb.next().toLowerCase();
        guess = s.charAt(0);

        return guess;
    }

    public static boolean checkGuess(String word, char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static char[] updateArray(String word, char[] correct, char g) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == g) {
                correct[i] = g;
            }
        }
        return correct;
    }

    public static boolean checkWinner(char[] correct) {
        int right = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i] == '_') {
                return false;
            }
        }
        System.out.println("\nWINNER!!!");
        System.out.println("\tWINNER!!!");
        System.out.println("\t\tWINNER!!!");
        System.out.println("\t\t\tWINNER!!!");
        System.out.println("The You guessed:  ");
        for (int i = 0; i < correct.length; i++) {
            System.out.print(correct[i] + " ");
        }
        System.out.println("");
        return true;
    }

}

