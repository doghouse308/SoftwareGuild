package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class SafeSquareRoot {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double number = 0;

        System.out.println("SQUARE ROOT!!");
        System.out.print("Enter a Number:  ");
        number = Double.parseDouble(kb.next());
        while (number < 0) {
            System.out.println("Not even Enron got away with using imaginary numbers!");
            System.out.print("Enter a POSITIVE Number:  ");
            number = Double.parseDouble(kb.next());
        }
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));
    }

}
