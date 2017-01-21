package javaobjectorientedconcepts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class RockPaperScissorsLizardSpock {

    static Scanner kb = new Scanner(System.in);

    private String name;
    private String humanChoice;
    private String computerChoice;
    private String action;
    private int win = 0;
    private int lose = 0;
    private int tie = 0;
    boolean play = false;

    public void playGame() {
        int hChoice, cChoice, games = 0;
        String result;
        String keepPlaying;
        play = startGame();
        while (play) {
            hChoice = humanChoice();
            cChoice = computerChoice();
            result = outcome(hChoice, cChoice);
            showWinner(result);
            games++;
            System.out.print("\nWant to play again?  ");
            keepPlaying = kb.nextLine();
            if (keepPlaying.equalsIgnoreCase("yes") || keepPlaying.equalsIgnoreCase("yep")
                    || keepPlaying.equalsIgnoreCase("y") || keepPlaying.equalsIgnoreCase("sure")) {
                play = true;
            } else {
                play = false;
            }

        }
        gameOver(win, lose, tie, games);
    }

    private boolean startGame() {
        String gameOn;
        boolean play = false;
        System.out.println("Welcome to Rock Paper Scissors!!!\n");
        System.out.print("What is your name?  ");
        name = kb.nextLine();
        setName(name);
        System.out.println("\nHello " + name + "!  I'm here to kick your butt at Rock Paper Scissors!\n");

        System.out.print("\nWould you like to play Rock Paper Scissors? ");
        gameOn = kb.nextLine();
        if (!"yes".equalsIgnoreCase(gameOn) && !"yep".equalsIgnoreCase(gameOn)
                && !"y".equalsIgnoreCase(gameOn) && !"sure".equalsIgnoreCase(gameOn)) {
            System.out.println("You don't play nice, I'm getting out of this sandbox!");
            System.exit(0);
        } else {
            play = true;
        }
        return play;
    }

    private int humanChoice() {
        String choice;
        int human = 0;
        boolean valid = false;
        do {
            System.out.print("\nPick Rock, Paper, Scissors, Lizard, or Spock  ");
            choice = kb.nextLine().toLowerCase();

            switch (choice) {
                case "rock":
                    human = 1;
                    valid = true;
                    break;
                case "paper":
                    human = 2;
                    valid = true;
                    break;
                case "scissors":
                    human = 3;
                    valid = true;
                    break;
                case "lizard":
                    human = 4;
                    valid = true;
                    break;
                case "spock":
                    human = 5;
                    valid = true;
                    break;
                default:
                    System.out.println("Please make a valid selection.");
                    valid = false;
            }
        } while (!valid);
        setHumanChoice(choice);
        return human;
    }

    private int computerChoice() {
        int choice;
        String computer;
        Random number = new Random();
        choice = 1 + number.nextInt(5);
        switch (choice) {
            case 1:
                computer = "rock";
                break;
            case 2:
                computer = "paper";
                break;
            case 3:
                computer = "scissors";
                break;
            case 4:
                computer = "Lizard";
                break;
            case 5:
                computer = "Spock";
                break;
            default:
                computer = "error";
        }
        setComputerChoice(computer);
        return choice;
    }

    private String outcome(int human, int computer) {
        if (human == computer) {
            return "tie";
        }
        switch (human) {
            case 1:
                switch (computer) {
                    case 2:
                        setAction("Covers");
                        return "lose";
                    case 3:
                        setAction("Crushes");
                        return "win";
                    case 4:
                        setAction("Crushes");
                        return "win";
                    case 5:
                        setAction("Vaporizes");
                        return "lose";
                }

            case 2:
                switch (computer) {
                    case 1:
                        setAction("Covers");
                        return "win";
                    case 3:
                        setAction("Cuts");
                        return "lose";
                    case 4:
                        setAction("Eats");
                        return "lose";
                    case 5:
                        setAction("Disproves");
                        return "win";
                }

            case 3:
                switch (computer) {
                    case 1:
                        setAction("Crushes");
                        return "lose";
                    case 2:
                        setAction("Cuts");
                        return "win";
                    case 4:
                        setAction("Decapitates");
                        return "win";
                    case 5:
                        setAction("Smashes");
                        return "lose";
                }

            case 4:
                switch (computer) {
                    case 1:
                        setAction("Crushes");
                        return "lose";
                    case 2:
                        setAction("Eats");
                        return "win";
                    case 3:
                        setAction("Decapitates");
                        return "lose";
                    case 5:
                        setAction("Poisons");
                        return "win";
                }
            case 5:
                switch (computer) {
                    case 1:
                        setAction("Vaporizes");
                        return "win";
                    case 2:
                        setAction("Disproves");
                        return "lose";
                    case 3:
                        setAction("Smashes");
                        return "win";
                    case 4:
                        setAction("Poisons");
                        return "lose";
                }
        }
        return "error";
    }

    private void showWinner(String results) {
        if (results.equalsIgnoreCase("win")) {
            win++;
            System.out.println("You win this time sucker!");
            System.out.println(getName() + "'s " + getHumanChoice() + " "
                    + getAction() + " my " + getComputerChoice());
        } else if (results.equalsIgnoreCase("lose")) {
            lose++;
            System.out.println("Yah, I came, I saw, I kicked your butt!!!");
            System.out.println("My " + getComputerChoice() + " "
                    + getAction() + " " + getName() + "'s " + getHumanChoice());
        } else {
            tie++;
            System.out.println("Tie, we both played:  " + getHumanChoice());
        }
    }

    private void gameOver(int win, int lose, int tie, int games) {
        System.out.println("We played " + games + " games");
        System.out.println("You cheated " + win + " times.");
        System.out.println("I kicked your butt " + lose + " times!");
        System.out.println("We tied " + tie + " times.");

    }

    private void setHumanChoice(String c) {
        this.humanChoice = c;
    }

    public String getHumanChoice() {
        return humanChoice;
    }

    private void setComputerChoice(String c) {
        this.computerChoice = c;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    private void setAction(String s) {
        this.action = s;
    }

    public String getAction() {
        return action;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    private void setName(String name) {
        this.name = name;
    }
}
