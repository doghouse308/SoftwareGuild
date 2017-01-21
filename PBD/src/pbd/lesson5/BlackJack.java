package pbd.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class BlackJack {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        int hCard1, hCard2, cCard1, cCard2, draw, player, dealer, bank;
        String human1, human2, computer1, computer2, cardDrawn;

        System.out.printf("Let's play Blackjack!%n");
        do {
            System.out.printf("Please Enter Your Starting Bank:  (1 to $10000)");
            bank = Integer.parseInt(kb.next());
            if (bank < 1 || bank > 10000) {
                System.out.printf("Please enter an amount greater than 1 and less than 10000%n");
            }
        } while (bank < 1 || bank > 10000);
        
        //human deal
        System.out.printf("Deal!%n");
        hCard1 = r.nextInt(13);
        human1 = showCard(hCard1);
        if (hCard1 < 10) {
            hCard1 = 10;
        }
        hCard2 = r.nextInt(13);
        human2 = showCard(hCard1);
        if (hCard2 < 10) {
            hCard2 = 10;
        }
        human2 = showCard(hCard2);
        player = hCard1 + hCard2;
        
        System.out.printf("Your cards are %s and %s%n", human1, human2);
        System.out.printf("Your total is:  %d%n%n", player);

        //computer deal
        cCard1 = r.nextInt(13);
        computer1 = showCard(cCard1);
        if (cCard1 < 10) {
            cCard1 = 10;
        }
        cCard2 = r.nextInt(13);
        computer2 = showCard(cCard2);
        if (cCard2 < 10) {
            cCard2 = 10;
        }
        computer2 = showCard(cCard2);
        System.out.printf("Dealer's cards are Douwn Card and %s%n", computer2);
        System.out.printf("Your total is:  %d%n%n", player);


        /*
                

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
         */
    }

    public static String showCard(int card) {
        switch (card) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return Integer.toString(card);
        }
    }

}
