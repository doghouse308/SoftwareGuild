 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swgjavabasics.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class RockPaperScissorsStep4 {

    public static void main(String[] args) {

        //variable declaration
        int computerPlay, games, win = 0, loss = 0, tie = 0;
        String humanPlay, verb = "", winner = "", cPlay = "", c1, play;
        boolean isValid = true, playAgain = false;
        Random random = new Random();
        Scanner kb = new Scanner(System.in);
        
        //user input
        System.out.println("Let's Play Rock, Paper, Scissors!!");
        do{
            do {
            System.out.print("How many games would you like to play? (1 - 10) ");
            games = Integer.parseInt(kb.next());
            if (games < 1 || games > 10) {
                System.out.print("Please make a selection between 1 and 10");
            }
        } while (games < 1 || games > 10);
        for (int i = 0; i < games; i++) {
            do {
                System.out.print("\nPlease enter your choice (Rock, Paper, or Scissors:  ");
                humanPlay = kb.next().toLowerCase();
                if (humanPlay.equals("rock") || humanPlay.equals("paper")
                        || humanPlay.equals("scissors")) {
                    isValid = true;
                } else {
                    System.out.println("Please make a valid selection");
                    isValid = false;
                }
            } while (!isValid);
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
            switch (winner) {
                case "tie":
                    System.out.printf("Tie!  We both played %s.%n", humanPlay);
                    tie++;
                    break;
                case "Your":
                    System.out.printf("You Win!%nYour %s %s my %s.%n", humanPlay, verb, cPlay);
                    win++;
                    break;
                default:
                    System.out.printf("I Win!!%nMy %s %s your %s.%n", cPlay, verb, humanPlay);
                    loss++;
                    break;
            }
        }
        System.out.println("");
        System.out.println("Game Statistics:");
        System.out.println("\tWin:  " + win);
        System.out.println("\tLoss:  " + loss);
        System.out.println("\tTie:  " + tie);
        System.out.println("");
        if (win > loss) {
            System.out.println("You are the overall winner!");
        } else if (win < loss) {
            System.out.println("I am the overall winner!");
        } else {
            System.out.println("We tied.");
        }
            System.out.print("Want to play again? (yes or no) ");
            play = kb.next();
            if (play.equalsIgnoreCase("yes")){
                playAgain = true;
                win = 0; 
                loss = 0;
                tie = 0;
            } else {
                playAgain = false;
                System.out.println("Thanks for playing!  Come back anytime!");
            }
        } while (playAgain);
    }    
}
