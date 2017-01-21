package pbd.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class HiLoLimited {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        final int MAX_GUESSES = 7;
        int number, guess = 0, count = 0;

        number = 1 + r.nextInt(100);

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it."
                + "\nYou have " + MAX_GUESSES + " guesses.");

        while (guess != number || count >= MAX_GUESSES) {
            System.out.print("Guess: ");
            guess = Integer.parseInt(kb.next());
            count++;

            System.out.println("");
            if (guess == number) {
                System.out.println("You guessed it in " + count + " guesses!");
            } else if (guess < number) {
                System.out.println("Sorry, you are too low.");
            } else if (guess > number) {
                System.out.println("Sorry, you are too high.");
            }
            if (count == 7 && guess != number) {
                System.out.println("You Lose! you only have " + MAX_GUESSES + " guesses.");
            }
        }

    }
}
