package pbd.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class ThreeCardMonte {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        
        int ace, guess;
        
        ace = 1 + r.nextInt(3);

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.\n\nWhich one is the ace?\n");
        for (int n = 1; n <= 3; n++) {
            for (int i = 1; i <= 3; i++) {
                if (n != 3) {
                    System.out.print("##  ");
                } else {
                    System.out.print(i + "   ");
                }
            }
            System.out.println("");                
        }
        System.out.print("\n> ");
        guess = Integer.parseInt(kb.next());
        
        if (guess == ace) {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
        } else {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + ace + ".");
        }
        for (int n = 1; n <= 3; n++) {
            for (int i = 1; i <= 3; i++) {
                if (i == ace) {
                    System.out.print("AA  ");
                } else if (n != 3){
                    System.out.print("##  ");
                } else {
                    System.out.print(i + "   ");
                }
            }
            System.out.println("");                
        }        
    }
}
