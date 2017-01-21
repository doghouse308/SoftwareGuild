package pbd.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class BabyBlackjack {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        int card1, card2, player, dealer;

        System.out.println("Baby Blackjack!");

        card1 = r.nextInt(10) + 1;
        card2 = r.nextInt(10) + 1;
        player = card1 + card2;
        System.out.println("\nYou have " + card1 + " and " + card2 + ".");
        System.out.println("Your total is " + player);
        card1 = r.nextInt(10) + 1;
        card2 = r.nextInt(10) + 1;
        dealer = card1 + card2;
        System.out.println("\nDelaer has " + card1 + " and " + card2 + ".");
        System.out.println("Delaer total is " + dealer);
        
        if (player > dealer) {
            System.out.println("You Win!");
        } else if (player < dealer){
            System.out.println("Dealer Wins!");
        } else {
            System.out.println("Push, Dealer Wins!");
        }
    }

}
