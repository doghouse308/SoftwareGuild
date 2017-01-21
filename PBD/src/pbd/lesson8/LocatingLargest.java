package pbd.lesson8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class LocatingLargest {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        int[] number = new int[10];
        int value, max = 0, maxLoc = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] = 1 + r.nextInt(50);
        }
        System.out.print("Array:  ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "  ");
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
                maxLoc = i;
            }
        }
        System.out.println("");
        System.out.printf("%d is the largest value in slot %d of the array.%n", max, maxLoc);
    }

}
