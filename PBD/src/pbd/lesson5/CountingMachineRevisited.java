package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class CountingMachineRevisited {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int number, start, increment;

        System.out.print("Count from:  ");
        start = Integer.parseInt(kb.next());
        System.out.print("Count to:  ");
        number = Integer.parseInt(kb.next());
        System.out.print("Count by:  ");
        increment = Integer.parseInt(kb.next());

        for (int i = start; i <= number; i+= increment) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

}
