package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class BabyNim {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        boolean validPile = false;
        String a, b, c, selection;
        int countA = 3, countB = 3, countC = 3, number;

        while (countA > 0 || countB > 0 || countC > 0) {

            System.out.printf("A:  %d    B:  %d    C:  %d", countA, countB, countC);
            do {
                System.out.print("\nChoose a pile:  ");
                selection = kb.next().toUpperCase().substring(0, 1);
                validPile = (selection.equals("A") || selection.equals("B")
                        || selection.equals("C"));
                if (!(selection.equals("A") || selection.equals("B")
                        || selection.equals("C"))) {
                    System.out.println("Nice Try!  That pile does not exist!");
                }
            } while (!validPile);

            System.out.print("How many to remove from pile " + selection + ":  ");
            number = Integer.parseInt(kb.next());
            switch (selection) {
                case "A":
                    if (number > countA) {
                        System.out.println("No cheating!  Pile " + selection
                                + " only has " + countA + ".");
                        break;
                    }
                    countA -= number;
                    break;
                case "B":
                    if (number > countB) {
                        System.out.println("No cheating!  Pile " + selection
                                + " only has " + countB + ".");
                        break;
                    }
                    countB -= number;
                    break;
                case "C":
                    if (number > countC) {
                        System.out.println("No cheating!  Pile " + selection
                                + " only has " + countC + ".");
                        break;
                    }
                    countC -= number;
                    break;
                default:
                    System.out.println("Nice Try!  That pile does not exist!");
                    break;
            }
        }
        System.out.printf("%nA:  %d    B:  %d    C:  %d%n", countA, countB, countC);
    }

}
