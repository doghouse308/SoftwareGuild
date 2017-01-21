package javaobjectorientedconcepts;

/**
 *
 * @author Paul Peterson
 */
public class BlackJackApp {

    public static void main(String[] args) {

        ConsoleIO cio = new ConsoleIO();

        BlackJack blackjack = new BlackJack();

        blackjack.newGame();

        do {
            if (blackjack.getBank() <= 0) {
                cio.prompt("You Lose!!  I took all of your money!!");
            } else {
                blackjack.play();
            }
        } while (cio.promptForBoolean("Do you want to play again?  (Y or N) ", "y")
                || blackjack.getBank() <= 0);

    }
}
