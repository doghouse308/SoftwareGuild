package pbd.lesson5;

import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class DiceDoubles {

    public static void main(String[] args) {

        Random r = new Random();

        int die1 = 1, die2 = 0, total, count = 0;

        System.out.println("HERE COMES THE DICE!\n");
        while (die1 != die2) {
            count++;
            die1 = 1 + r.nextInt(6);
            die2 = 1 + r.nextInt(6);
            total = die1 + die2;
            System.out.println("Roll 1: " + die1);
            System.out.println("Roll 2: " + die2);
            System.out.println("The total is " + total + "!");
        }
        System.out.println("\nIt took " + count + " rolls to roll doubles,");
    }
}
