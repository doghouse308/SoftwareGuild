
package pbd.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class OneShotHiLo {
    
    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        
        int number, guess;
        
        number = 1 + r.nextInt(100);
        
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        System.out.print("> ");
        guess = Integer.parseInt(kb.next());
        
        System.out.println("");
        if (guess == number) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (guess < number) {
            System.out.println("Sorry, you are too low.  I was thinking of " + number + ".");
        } else {
            System.out.println("Sorry, you are too high.  I was thinking of " + number + ".");
        }
        
    }
}
