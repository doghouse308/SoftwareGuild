package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class Nim {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        boolean validPile = false;
        String a, b, c, selection, player1, player2, currentPlayer = "";
        int countA = 3, countB = 3, countC = 3, number, play = 0;

        System.out.print("What is the name of Player 1:  ");
        player1 = kb.nextLine();
        System.out.print("What is the name of Player 2:  ");
        player2 = kb.nextLine();
        while (countA > 0 || countB > 0 || countC > 0) {

            if (play % 2 == 0) {
                currentPlayer = player1;
            } else {
                currentPlayer = player2;
            }
            play++;
            System.out.printf("A:  %d    B:  %d    C:  %d%n", countA, countB, countC);
            if (countA + countB + countC == 1) {
                if (currentPlayer.equals(player1)) {
                    System.out.println(player1 + ", you must take the last "
                            + "remaining counter.\nYou lose. " + player2 + " wins!");
                } else {
                    System.out.println(player2 + ", you must take the last "
                            + "remaining counter.\nYou lose. " + player1 + " wins!");
                }
                System.exit(0);
            }
            do {
                System.out.print("\n" + currentPlayer + ", choose a pile:  ");
                selection = kb.next().toUpperCase().substring(0, 1);

                if (!(selection.equals("A") || selection.equals("B")
                        || selection.equals("C"))) {
                    System.out.println("Nice Try " + currentPlayer + "!  That pile does not exist!");
                    validPile = false;
                } else {
                    validPile = true;
                }
            } while (!validPile);

            System.out.print("How many to remove from pile " + selection + ":  ");
            number = Integer.parseInt(kb.next());
            switch (selection) {
                case "A":
                    while (number > countA) {
                        System.out.println("No cheating! " + currentPlayer
                                + " Pile " + selection + " only has " + countA + ".");
                        System.out.print("How many to remove from pile " + selection + ":  ");
                        number = Integer.parseInt(kb.next());
                    }
                    countA -= number;
                    break;
                case "B":
                    if (number > countB) {
                        System.out.println("No cheating! " + currentPlayer
                                + " Pile " + selection + " only has " + countB + ".");
                        System.out.print("How many to remove from pile " + selection + ":  ");
                        number = Integer.parseInt(kb.next());
                    }
                    countB -= number;
                    break;
                case "C":
                    if (number > countC) {
                        System.out.println("No cheating! " + currentPlayer
                                + " Pile " + selection + " only has " + countC + ".");
                        System.out.print("How many to remove from pile " + selection + ":  ");
                        number = Integer.parseInt(kb.next());
                    }
                    countC -= number;
                    break;
                default:
                    System.out.println("Nice Try + " + currentPlayer + "!  That pile does not exist!");
                    break;
            }
        }
        System.out.println("");
        if (currentPlayer.equals(player1)) {
            System.out.println("The Winner is " + player2 + "!");
        } else {
            System.out.println("The Winner is " + player1 + "!");
        }
    }
}
