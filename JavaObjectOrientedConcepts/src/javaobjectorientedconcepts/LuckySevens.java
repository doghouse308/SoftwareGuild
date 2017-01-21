package javaobjectorientedconcepts;

import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class LuckySevens {

    ConsoleIO c = new ConsoleIO();
    Random r = new Random();

    private int die1, die2, startingBank = 0, balance, rolls = 0, maxBank = 0,
            maxRolls = 0;

    public void run() {

        dataEntry();
        balance = startingBank;
        maxBank = balance;
        play();
        displayResults();

    }

    private void dataEntry() {
        while (startingBank < 1) {
            startingBank = c.promptForInt("How Much can you afford to lose?  ");
            if (startingBank < 1) {
                c.prompt("Please enter a nmuber greater than 1");
            }
        }
    }

    private void play() {
        while (balance > 1) {

            die1 = rollDice();
            die2 = rollDice();
            rolls++;

            if (die1 + die2 == 7) {
                balance += 4;
            } else {
                balance--;
            }

            if (balance > maxBank) {
                maxBank = balance;
                maxRolls = rolls;
            }
        }
    }

    private int rollDice() {
        return r.nextInt(6) + 1;
    }

    private void displayResults() {
        System.out.printf("%nYou busted in %d rolls%n%n", rolls);
        System.out.printf("You should have stopped after %d rolls when you had"
                + " $%d.00 %n%n", maxRolls, maxBank);
    }

}
