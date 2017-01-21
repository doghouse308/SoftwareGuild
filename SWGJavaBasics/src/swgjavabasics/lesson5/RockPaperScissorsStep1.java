
package swgjavabasics.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class RockPaperScissorsStep1 {

    public static void main(String[] args) {

        //variable declaration
        int computerPlay;
        String humanPlay, verb = "", winner = "", cPlay = "", c1;

        Random random = new Random();
        Scanner kb = new Scanner(System.in);

        //user input
        System.out.println("Let's Play Rock, Paper, Scissors!!");
        System.out.print("\nPlease enter your choice (Rock, Paper, or Scissors:  ");
        humanPlay = kb.next().toLowerCase();
        c1 = humanPlay.substring(0, 1).toUpperCase();
        humanPlay = c1 + humanPlay.substring(1);
        
        //computer selection
        // 1 = Rock, 2 = Paper, 3 = Scissors
        computerPlay = random.nextInt(3) + 1;

        switch (humanPlay) {
            case "Rock":
                switch (computerPlay) {
                    case 1:
                        winner = "tie";
                        break;

                    case 2:
                        winner = "My ";
                        cPlay = "Paper";
                        verb = "Covered";
                        break;
                    case 3:
                        winner = "Your";
                        cPlay = "Scissors";
                        verb = "Smashed";
                        break;
                }
                break;
            case "Paper":
                switch (computerPlay) {
                    case 1:
                        winner = "Your";
                        cPlay = "Rock";
                        verb = "Covered";
                        break;

                    case 2:
                        winner = "tie";
                        break;
                    case 3:
                        winner = "My";
                        cPlay = "Scissors";
                        verb = "Cuts";
                        break;
                }
                break;
            case "Scissors":
                switch (computerPlay) {
                    case 1:
                        winner = "My";
                        cPlay = "Rock";
                        verb = "Smashed";
                        break;

                    case 2:
                        winner = "Your";
                        cPlay = "Paper";
                        verb = "Cut";
                        break;
                    case 3:
                        winner = "tie";
                        break;
                }
                break;
        }
        System.out.println("");
        if (winner.equals("tie")){
            System.out.printf("Tie!  We both played %s.%n", humanPlay);
        } else if (winner.equals("Your")) {
            System.out.printf("You Win!%nYour %s %s my %s.%n", humanPlay, verb, cPlay);
        } else {
            System.out.printf("I Win!!%nMy %s %s your %s.%n", cPlay, verb, humanPlay);
        }
    }
}
