package pbd.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class AgainWithTheNumberGuessing {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        int number, guess, count = 1;

        number = r.nextInt(10) + 1;

        System.out.println("Guessing Game\n");
        do {
            System.out.print("Guess a number (1 - 10):  ");
            guess = Integer.parseInt(kb.next());
            if (guess != number){
                System.out.println("That is incorrect. Guess again");
                count++;
            }
            
        } while (guess != number);
        System.out.println("WINNER!!! I can't believe you guessed " + number + "!"
                + "\nIn only " + count + " guesses!");
    }

}
