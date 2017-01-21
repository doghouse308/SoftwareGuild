package pbd.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class KeepGuessing {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        int number, guess;

        number = r.nextInt(10) + 1;

        System.out.println("Guessing Game\n");
        System.out.print("Guess a number (1 - 10):  ");
        guess = Integer.parseInt(kb.next());
        while (guess != number) {
            System.out.println("That is incorrect. Guess again");
            System.out.print("Guess a number (1 - 10):  ");
            guess = Integer.parseInt(kb.next());
        }
        System.out.println("WINNER!!! I can't believe you guessed " + number + "!");
    }
}
