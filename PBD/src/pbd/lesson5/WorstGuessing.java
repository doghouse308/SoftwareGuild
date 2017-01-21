
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class WorstGuessing {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        int number = 7, guess;
        
        System.out.println("The Worst Guessing game ever!\n");
        System.out.print("Guess a number (1 - 10):  ");
        guess = Integer.parseInt(kb.next());
        System.out.println("");
        if (guess == number){
            System.out.println("WINNER!!! I can't believe you guessed " + guess + "!");
        } else {
            System.out.println("You lose!! The number was " + number + ".");
        }
    }
}
