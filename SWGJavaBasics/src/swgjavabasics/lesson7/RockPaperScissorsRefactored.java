
package swgjavabasics.lesson7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class RockPaperScissorsRefactored {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        //variable declaration
        int games, win = 0, loss = 0, tie = 0;
        String humanPlay, computerPlay, c1, play, winner, verb;
        boolean isValid = true, playAgain = false;

        //user input
        System.out.println("Let's Play Rock, Paper, Scissors!!");
        do {
            games = readValueInRange("How many games would you like to play? (1 - 10) ", 1, 10);
            for (int i = 0; i < games; i++) {
                do {
                    humanPlay = readStringValue("\nPlease enter your choice (Rock, Paper, or Scissors) :  ");
                } while (!validatePlay(humanPlay));

                c1 = humanPlay.substring(0, 1).toUpperCase();
                humanPlay = c1 + humanPlay.substring(1);

                //computer selection
                computerPlay = selectComputerChoice();
                //determine winner and update score
                winner = determineWinner(humanPlay, computerPlay);
                switch (winner) {
                    case "human":
                        win++;
                        break;
                    case "computer":
                        loss++;
                        break;
                    case "tie":
                        tie++;
                        break;
                }
                //determine winning verb
                verb = determineVerb(humanPlay, computerPlay);
                //display results
                displayResults(winner, verb, computerPlay, humanPlay);
            }
            displayStatistics(win, loss, tie);
            //prompt user to play again
            play = readStringValue("Do you want to play again?  ");
            playAgain = play.equalsIgnoreCase("yes");

        } while (playAgain);

    }

    public static String readStringValue(String prompt) {
        System.out.print(prompt);
        return kb.next();
    }

    public static boolean validatePlay(String play) {
        if (play.equals("rock") || play.equals("paper")
                || play.equals("scissors")) {
            return true;
        } else {
            System.out.println("Please make a valid selection");
            return false;
        }
    }

    public static int readValueInRange(String prompt, int low, int high) {
        int num;
        do {
            System.out.print(prompt);
            num = Integer.parseInt(kb.next());
            if (num < low || num > high) {
                System.out.print("Please enter a number between " + low
                        + " and " + high + " inclusive.");
            }
        } while (num < low || num > high);

        return num;
    }

    public static String determineWinner(String humanPlay, String computerPlay) {
        switch (humanPlay) {
            case "Rock":
                switch (computerPlay) {
                    case "Rock":
                        return "tie";
                    case "Paper":
                        return "computer";
                    case "Scissors":
                        return "human";
                }
                break;
            case "Paper":
                switch (computerPlay) {
                    case "Rock":
                        return "human";
                    case "Paper":
                        return "tie";
                    case "Scissors":
                        return "computer";
                }
                break;
            case "Scissors":
                switch (computerPlay) {
                    case "Rock":
                        return "computer";
                    case "Paper":
                        return "human";
                    case "Scissors":
                        return "tie";
                }
                break;
        }
        return "";
    }

    public static String determineVerb(String humanPlay, String computerPlay) {
        switch (humanPlay) {
            case "Rock":
                switch (computerPlay) {
                    case "Paper":
                        return "Covered";
                    case "Scissors":
                        return "Smashed";
                }
                break;
            case "Paper":
                switch (computerPlay) {
                    case "Rock":
                        return "Covered";
                    case "Scissors":
                        return "Cut";
                }
                break;
            case "Scissors":
                switch (computerPlay) {
                    case "Rock":
                        return "Smashed";
                    case "Paper":
                        return "Cut";
                }
                break;
        }
        return "error";
    }

    public static String selectComputerChoice() {
        Random random = new Random();
        int cp;
        cp = random.nextInt(3) + 1;
        switch (cp) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            default:
                return "Scissors";
        }
    }

    public static void displayResults(String winner, String verb, String computerPlay, String humanPlay) {

        switch (winner) {
            case "tie":
                System.out.println("It's a tie.\n\n We both played " + humanPlay);
                break;
            case "human":
                System.out.println("You win!\n\nYour " + humanPlay + " "
                        + verb + " my " + computerPlay + ".");
                break;
            case "computer":
                System.out.println("I win!!\n\nMy " + computerPlay + " " + verb
                        + " your " + humanPlay + ".");
                break;
        }
    }

    public static void displayStatistics(int win, int loss, int tie) {
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
    }

}
