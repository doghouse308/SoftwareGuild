package javaobjectorientedconcepts;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class BlackJack {

    ConsoleIO cio = new ConsoleIO();
    Shoe shoe = new Shoe();
    //Card card = new Card();

    Random r = new Random();

    private boolean isSplit = false;
    private boolean hasInsurance = false;
    private String playerName;
    private final int RESHUFFLE = 285;
    private int bank = 0, bet = 0, cardCount = 0, pot = 0, insurance = 0, playerScore,
            splitScore, computerScore;

    ArrayList<Card> computerHand = new ArrayList();
    ArrayList<Card> playerHand = new ArrayList();
    ArrayList<Card> splitHand = new ArrayList();

    public void newGame() {
        cio.prompt("Welcome to Blackjack!! \n\n");
        playerName = cio.promptForString("What is your name?  ");
        bank = cio.promptForIntInRange("Starting Bank:  ", 1, 1000000);
        shuffle();
    }

    public void play() {

        bet = 0;
        pot = 0;

        if (cardCount >= RESHUFFLE) {
            shuffle();
        }

        bet = placeBet();
        computerHand = firstDeal();
        cio.prompt("Computer Deal");
        displayHand(computerHand, "computer");
        if (computerHand.get(1).getCardValue().equalsIgnoreCase("A")) {
            if (cio.promptForBoolean("Dealer is showing an Ace.\nBuy Insurance (Y or N):  ", "y")) {
                hasInsurance = true;
                insurance = cio.promptForIntInRange("Insurance Amount:  ", 1, bet / 2);
                bank -= insurance;
            }
        } else {
            cio.prompt("Computer has " + calculateHand(computerHand, "computer") + " showing");
        }
        playerHand = firstDeal();
        cio.prompt("Human Deal");
        displayHand(playerHand, playerName);
        if (isBlackJack(playerHand, playerName)) {
            cio.prompt("BLACKJACK!!");
            bank += bet * 1.5;
        } else {
            if (splitPossible(playerHand)) {
                if (cio.promptForBoolean("Split? (Y or N) ", "y")) {
                    splitCards(playerHand, bet);
                    isSplit = true;
                }
            }
            if (isSplit) {
                if (getBank() < bet) {
                    cio.prompt("You don't have enough money to afford the bet\nNo split possible");
                } else if (playerHand.get(0).getCardValue().equalsIgnoreCase("A")) {
                    playerHand.remove(1);
                    playerHand.add(1, dealCard());
                    displayHand(playerHand, playerName);
                    calculateHand(splitHand, playerName);
                    cio.prompt(playerName + " has " + playerScore);
                    splitHand.remove(1);
                    splitHand.add(1, dealCard());
                    displayHand(splitHand, playerName);
                    calculateHand(splitHand, playerName);
                    cio.prompt(playerName + " has " + splitScore);
                } else {
                    displayHand(playerHand, playerName);
                    if (isBlackJack(playerHand, playerName)) {
                        cio.prompt("BLACKJACK!!");
                        bank += bet * 1.5;
                        return;
                    } else {
                        playHand(playerHand, playerName);
                        playerScore = calculateHand(playerHand, playerName);
                    }
                    displayHand(splitHand, playerName);
                    if (isBlackJack(splitHand, playerName)) {
                        cio.prompt("BLACKJACK!!");
                        bank += bet + (bet * 1.5);
                        return;
                    } else {
                        playHand(splitHand, playerName);
                        splitScore = calculateHand(splitHand, playerName);
                    }
                }
            } else {
                playHand(playerHand, playerName);
                playerScore = calculateHand(playerHand, playerName);
            }
        }
        if (isSplit) {
            if (playerScore <= 21 || splitScore <= 21) {
                computerPlay();
            }
        } else if (playerScore <= 21) {
            computerPlay();
        }
    }

    private void computerPlay() {
        if (isBlackJack(computerHand, "") && hasInsurance) {
            cio.prompt("BLACKJACK!!\nComputer Wins!");
            cio.prompt("Insurance pays:  " + (insurance * 2));
            bank += insurance + (insurance * 2);
        } else if (isBlackJack(computerHand, "computer")) {
            cio.prompt("BLACKJACK!!\nComputer Wins!");
        } else {
            cio.prompt("Computer's Hand");
            displayHand(computerHand, "I");
            playHand(computerHand, "I");
            computerScore = calculateHand(computerHand, "I");
        }
        displayHand(computerHand, "I");
        determineWinner();
    }

    private void determineWinner() {
        cio.prompt("");

        if (computerScore > 21) {
            cio.prompt("Computer Busted, You Win!!");
            bank += bet * 2;
        } else if (isSplit) {
            if (computerScore > playerScore) {
                cio.prompt("Dealer has " + computerScore + " and " + playerName
                        + " has " + playerScore);
                cio.prompt("Dealer Wins!");
            } else if (computerScore == playerScore) {
                cio.prompt("Dealer has " + computerScore + " and " + playerName
                        + " has " + playerScore);
                cio.prompt("Push ... Dealer Wins!");
            } else if (computerScore < playerScore && playerScore <= 21) {
                cio.prompt("Dealer has " + computerScore + " and " + playerName
                        + " has " + playerScore);
                cio.prompt(playerName + " Wins!");
                bank += bet * 2;
            }
            if (computerScore > splitScore) {
                cio.prompt("Dealer has " + computerScore + " and " + playerName
                        + " has " + splitScore);
                cio.prompt("Dealer Wins!");
            } else if (computerScore == splitScore) {
                cio.prompt("Dealer has " + computerScore + " and " + playerName
                        + " has " + splitScore);
                cio.prompt("Push ... Dealer Wins!");
            } else if (computerScore < splitScore && splitScore <= 21) {
                cio.prompt("Dealer has " + computerScore + " and " + playerName
                        + " has " + splitScore);
                cio.prompt(playerName + " Wins!");
                bank += bet * 2;
            }
        } else if (computerScore > playerScore) {
            cio.prompt("Dealer has " + computerScore + " and " + playerName
                    + " has " + playerScore);
            cio.prompt("Dealer Wins!");
        } else if (computerScore == playerScore) {
            cio.prompt("Dealer has " + computerScore + " and " + playerName
                    + " has " + playerScore);
            cio.prompt("Push ... Dealer Wins!");
        } else if (computerScore < playerScore && playerScore <= 21) {
            cio.prompt("Dealer has " + computerScore + " and " + playerName
                    + " has " + playerScore);
            cio.prompt(playerName + " Wins!");
            bank += bet * 2;
        }
    }

    private boolean isBlackJack(ArrayList<Card> hand, String player) {
        return calculateHand(playerHand, player) == 21;
    }

    private ArrayList<Card> playHand(ArrayList<Card> hand, String player) {
        if (player.equalsIgnoreCase("I")) {
            while (calculateHand(hand, player) < 17) {
                cio.prompt("Computer Hit");
                hand.add(hand.size(), dealCard());
            }
        } else {
            cio.prompt(player + " has " + calculateHand(hand, player));
            while (cio.promptForBoolean("Hit or Stand (H or S)  ", "h")
                    && calculateHand(playerHand, player) <= 21) {
                hand.add(hand.size(), dealCard());
                displayHand(hand, player);
                if (calculateHand(playerHand, player) > 21) {
                    cio.prompt(player + " busted " + calculateHand(playerHand, player));
                    return hand;
                }
                cio.prompt(player + " has " + calculateHand(playerHand, player));
            }
        }

        return hand;
    }

    private boolean splitPossible(ArrayList<Card> hand) {
        if (hand.get(0).getCardValue().equals(hand.get(1).getCardValue())
                || hand.get(0).getValue() == hand.get(1).getValue()) {
            return true;
        }
        return false;
    }

    private void splitCards(ArrayList<Card> hand, int bet) {

        splitHand.add(0, playerHand.get(1));
        splitHand.add(1, dealCard());
        playerHand.remove(1);
        playerHand.add(1, dealCard());
        bank -= bet;
        pot += bet;
    }

    private int calculateHand(ArrayList<Card> hand, String player) {
        int value = 0;
        boolean hasAce = false;

        for (int i = 0; i < hand.size(); i++) {
            if (i == 0 && player.equals("computer")) {
                value = 0;
            } else {
                value += hand.get(i).getValue();
            }
            if (hand.get(i).isIsAce()) {
                hasAce = true;
            }
        }
        if (hasAce && value <= 11) {
            value += 10;
        }
        return value;
    }

    private void displayHand(ArrayList<Card> hand, String player) {
        if (player.equalsIgnoreCase(playerName)) {
            cio.prompt(player + " Bank:  " + getBank() + "\nCurrent Pot:  " + pot);
        }
        for (int i = 0; i < hand.size(); i++) {
            if (i == 0 && player.equals("computer")) {
                System.out.print("X ");
            } else {
                System.out.print(hand.get(i).getCardValue() + hand.get(i).getSuit() + " ");
            }
        }
        cio.prompt("");
    }

    private int placeBet() {
        bet = cio.promptForIntInRange("Place your Bet:  ", 1, getBank());
        bank -= bet;
        pot += bet;
        return bet;
    }

    private ArrayList<Card> firstDeal() {

        ArrayList<Card> temp = new ArrayList();

        temp.add(temp.size(), dealCard());
        temp.add(temp.size(), dealCard());

        return temp;
    }

    private Card dealCard() {

        int deck, suit, face;

        do {
            deck = 0 + r.nextInt(shoe.getSHOE() - 1);
            suit = 0 + r.nextInt(3);
            face = 0 + r.nextInt(12);
        } while (shoe.getCard()[deck][suit][face].equals("X"));
        cardCount++;
        shoe.setCard(deck, suit, face, "X");
        return new Card(suit, face);
    }

    private void shuffle() {
        cio.prompt("Shuffling cards, please wait");
        shoe.initializeShoe();
        shoe.shuffleCards();
        timeDelay(1000);
        cardCount = 0;
    }

    private void timeDelay(long t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
        }
    }

    /**
     * @return the bank
     */
    public int getBank() {
        return bank;
    }

}
