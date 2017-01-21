package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class AddingValuesForLoop {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Number:  ");
        number = Integer.parseInt(kb.next());

        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("");
        System.out.println("The sum is:  " + sum);
    }
}
