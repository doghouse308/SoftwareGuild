package com.sg.bjack;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class BlackJack {

    ConsoleIO cio = new ConsoleIO();
    Shoe shoe = new Shoe();
    private static final int RESHUFFLE = 285;
    private static final int MIN_BANK = 100;
    private static final int MAX_BANK = 1000000;
    private static final int MIN_BET = 1;
    private static final int MAX_BET = 10000;
    private static final int COMPUTER_HIT = 16;
    HashMap<Integer, Card> computerHand = new HashMap();
    HashMap<Integer, Card> humanHand = new HashMap();
    HashMap<Integer, Card> splitHand = new HashMap();
    int bank = 0, bet = 0, splitBet = 0, insurance = 0, cardCount = 0;
    boolean humanBusted = false, splitBusted = false, computerBusted = false;
    String name = null;

    public void run() {
        name = cio.promptForLine("Welcome to BlackJack\n\nWhat is your name?  ");
        bank = cio.promptForIntInRange("Hi " + name + " What is your starting bank?  ",
                MIN_BANK, MAX_BANK, "Your starting bank must be greater than $"
                + MIN_BANK + " and the house limit is $" + MAX_BANK);
        shuffle();
        do {
            cio.prompt("Current Bank:  $" + bank + "\n");
            if (bank <= 0) {
                cio.prompt("I've taken all of your money....\n he he he < evil laugh >"
                        + "\nCome back when you can afford to lose more...");
                return;
            }
            bet = cio.promptForIntInRange("What is your bet?  ", MIN_BET, MAX_BET,
                    "Bet must be greater than $" + MIN_BET + " and less than $" + MAX_BET);
            if (bet > bank) {
                cio.prompt("You only have $" + bank + "\nNew bet is $" + bank);
                bet = bank;
            }

            play(bet);
        } while (cio.promptForBoolean("Play Again?  (Y or N) ", "y"));

    }

    private void play(int bet) {
        int pot = 0;
        boolean isBlackJack = false, handSplit = false;
        computerHand.clear();
        humanHand.clear();
        splitHand.clear();
        /* test computer blackjack
        Card c3 = new Card(0, 0);
        Card c4 = new Card(2, 10);
        computerHand.put(1, c3);
        computerHand.put(2, c4);
        */
        computerHand = deal(computerHand);
        //test split
        /*
        Card c1 = new Card(0, 9);
        Card c2 = new Card(2, 9);
        humanHand.put(1, c1);
        humanHand.put(2, c2);
        */
         humanHand = deal(humanHand);
        displayHand(computerHand, "computer");
        cio.prompt("Computer Showing:  " + calculateValue(computerHand, "computer"));
        displayHand(humanHand, "human");
        cio.prompt("You Have:  " + calculateValue(humanHand, "human"));
        if (blackJack(humanHand, "human")) {
            cio.prompt("BLACKJACK!!!\nYou Win!!");
            bank += bet * 1.5;
            isBlackJack = true;
            return;
        }
        insurance = getInsurance(computerHand);
        if (checkSplit(humanHand)) {
            if (bank < bet) {
                cio.prompt("You don't have enough money to split hand");
            } else {
                splitBet += bet;
                Card s1 = humanHand.get(1);
                Card s2 = humanHand.get(2);
                splitHand.put(1, s1);
                humanHand.clear();
                humanHand.put(1, s2);
                humanHand = deal(humanHand);
                cio.prompt("Your first hand:  ");
                displayHand(humanHand, "human");
                if (blackJack(humanHand, "human")) {
                    cio.prompt("BLACKJACK!!!\nYou Win!!");
                    bank += bet * 1.5;
                    isBlackJack = true;
                }
                cio.prompt("Your split hand:  ");
                splitHand = deal(splitHand);
                displayHand(splitHand, "human");
                if (blackJack(splitHand, "human")) {
                    cio.prompt("BLACKJACK!!!\nYou Win!!");
                    bank += bet * 1.5;
                    isBlackJack = true;
                }
            }
        }
        if (isBlackJack) {
            return;
        }
        if (!splitHand.isEmpty()) {
            cio.prompt("Now playing your first hand");
            displayHand(humanHand, "human");
            humanHand = hitOrStand(humanHand, "human");
            if (humanBusted) {
                bank -= (bet);
                cio.prompt("Busted!! better luck with your other hand.");
            }
            cio.prompt("Now playing your split hand");
            displayHand(splitHand, "human");
            splitHand = hitOrStand(splitHand, "human");
            if (splitBusted) {
                bank -= (bet);
                if (humanBusted) {
                    cio.prompt("You Busted, I win!!");
                    bank -= (insurance + splitBet);
                    return;
                } else {
                    cio.prompt("Busted!! better luck with your other hand.");
                }
            }
        } else {
            humanHand = hitOrStand(humanHand, "human");
            if (humanBusted) {
                cio.prompt("You Busted, I win!!");
                bank -= (bet);
                return;
            }
        }
        if (blackJack(computerHand, "human")) {
            cio.prompt("BLACKJACK!!!\nI Win!!");
            bank -= bet;
            return;
        }
        computerPlay();
        if (computerBusted) {
            cio.prompt("I busted, you win this time.");
            bank += (bet + insurance + splitBet);
            return;
        }
        determineWinner();
    }

    //tested - passed
    protected HashMap<Integer, Card> deal(HashMap<Integer, Card> hand) {
        Random r = new Random();
        int deck, suit, face;
        do {
            deck = 0 + r.nextInt(shoe.getSHOE() - 1);
            suit = 0 + r.nextInt(3);
            face = 0 + r.nextInt(12);
        } while (shoe.getCard()[deck][suit][face].equals("X"));
        cardCount++;
        shoe.setCard(deck, suit, face, "X");
        Card card = new Card(suit, face);
        hand.put(hand.size() + 1, card);
        if (hand.size() == 1) {
            deal(hand);
        }

        return hand;
    }

    //tested - passed
    protected boolean blackJack(HashMap<Integer, Card> hand, String player) {

        return calculateValue(hand, player) == 21;
    }

    //test manually - passed
    protected int getInsurance(HashMap<Integer, Card> hand) {
        bank = 1000;
        insurance = 0;
        if (hand.get(2).getCardValue().equalsIgnoreCase("A")) {
            if (cio.promptForBoolean("Dealer is showing an Ace.\nDo you want "
                    + "insurance? ( Y or N) ", "y")) {
                insurance = cio.promptForIntInRange("Insurance Amount $", MIN_BET, MAX_BET,
                        "Insurance must be greater than $" + MIN_BET + " and less"
                        + " than $" + MAX_BET);
                if (insurance > bank) {
                    cio.prompt("You only have $" + bank + "\nNew inusrance is $" + bank);
                    insurance = bank;
                }
            }
        }

        return insurance;
    }

    //manual and automated testing passed
    protected boolean checkSplit(HashMap<Integer, Card> hand) {
        boolean split = false;
        if (hand.get(1).getCardValue().equalsIgnoreCase(hand.get(2).getCardValue())) {
            split = cio.promptForBoolean("\nSplit Hand? (Y or N) ", "y");
        }

        return split;
    }

    private void displayHand(HashMap<Integer, Card> hand, String player) {

        for (int i = 1; i <= hand.size(); i++) {
            Card c = hand.get(i);
            if (i == 1 && player.equals("computer")) {
                System.out.print("X ");
            } else {
                System.out.print(c.getCardValue() + c.getSuit() + " ");
            }
        }
        cio.prompt("");
    }

    protected HashMap<Integer, Card> hitOrStand(HashMap<Integer, Card> hand, String player) {
        cio.prompt("You have " + calculateValue(hand, "human") + "\n");
        while (cio.promptForBoolean("Hit or Stand? (H or S) ", "h")) {
            hand = deal(hand);
            displayHand(hand, "human");
            cio.prompt("You have " + calculateValue(hand, "human") + "\n");
            if (player.equals("human") && (calculateValue(hand, "human") > 21)) {
                humanBusted = true;
                return hand;
            } else if (player.equals("split") && (calculateValue(hand, "human") > 21)) {
                splitBusted = true;
                return hand;
            }
        }
        return hand;
    }

    //manual test - passed
    protected HashMap<Integer, Card> computerPlayManualTest(HashMap<Integer, Card> hand) {
        //using player parameter "human" to display and count the computer's first card
        while (calculateValue(hand, "human") < COMPUTER_HIT) {
            deal(hand);
            displayHand(hand, "human");
            if (calculateValue(hand, "human") > 21) {
                computerBusted = true;
            }
        }
        return hand;
    }

    //testing passed
    protected void computerPlay() {
        //using player parameter "human" to display and count the computer's first card
        cio.prompt("\nIt's My Turn\n");
        displayHand(computerHand, "human");
        while (calculateValue(computerHand, "human") < COMPUTER_HIT) {
            deal(computerHand);
            displayHand(computerHand, "human");
            if (calculateValue(computerHand, "human") > 21) {
                displayHand(computerHand, "human");
                computerBusted = true;
            }
        }
    }

    //tested - passed
    protected int calculateValue(HashMap<Integer, Card> hand, String player) {
        int value = 0;
        boolean hasAce = false;
        for (HashMap.Entry<Integer, Card> entry : hand.entrySet()) {
            if (entry.getKey() == 1 && player.equalsIgnoreCase("computer")) {
                value = 0;
            } else {
                value += hand.get(entry.getKey()).getValue();
            }
            if (hand.get(entry.getKey()).isIsAce()) {
                hasAce = true;
            }
            if (hasAce && value <= 11) {
                value += 10;
            }
        }

        return value;
    }

    private void determineWinner() {
        int human = 0, split = 0, computer = 0;
        human = calculateValue(humanHand, "human");
        computer = calculateValue(computerHand, "human");
        if (computerBusted) {
            cio.prompt("You Win!!");
            bank += (bet + insurance + splitBet);
        } else if (humanBusted && splitHand.isEmpty()) {
            cio.prompt("I Win!!");
            bank -= (bet + insurance + splitBet);
        } else if (humanBusted && splitBusted) {
            cio.prompt("I Win!!");
            bank -= (bet + insurance + splitBet);
        } else if (splitHand.isEmpty()) {
            if (computer > human || humanBusted) {
                cio.prompt("I have " + computer + " and you have " + human);
                cio.prompt("I Win!!");
                bank -= (bet + insurance);
            } else if (computer == human) {
                cio.prompt("Push, we both have " + computer);
                cio.prompt("I Win!!");
                bank -= (bet + insurance);
            } else if (computer < human && !humanBusted) {
                cio.prompt("I have " + computer + " and you have " + human);
                cio.prompt("You Win!!");
                bank += (bet + insurance);
            }
        } else if (!splitHand.isEmpty()) {
            split = calculateValue(splitHand, "human");
            if (computer > human || humanBusted) {
                cio.prompt("I have " + computer + " and you have " + human);
                cio.prompt("I Win!!");
                bank -= (bet + insurance);
            } else if (computer == human) {
                cio.prompt("Push, we both have " + computer);
                cio.prompt("I Win!!");
                bank -= (bet + insurance);
            } else if (computer < human && !humanBusted) {
                cio.prompt("I have " + computer + " and you have " + human);
                cio.prompt("You Win!!");
                bank += (bet + insurance);
            }
            if (computer > split || splitBusted) {
                cio.prompt("I have " + computer + " and you have " + split);
                cio.prompt("I Win!!");
                bank -= (insurance + splitBet);
            } else if (computer == split) {
                cio.prompt("Push, we both have " + computer);
                cio.prompt("I Win!!");
                bank -= (insurance + splitBet);
            } else if (computer < split && !splitBusted) {
                cio.prompt("I have " + computer + " and you have " + split);
                cio.prompt("You Win!!");
                bank += (insurance + splitBet);
            }
        }
    }

    //tested - passed
    public void shuffle() {
        cio.prompt("Shuffling cards, please wait");
        shoe.initializeShoe();
        shoe.shuffleCards();
        cardCount = 0;
    }
}
