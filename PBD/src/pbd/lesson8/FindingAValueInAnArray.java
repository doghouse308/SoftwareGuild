package pbd.lesson8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class FindingAValueInAnArray {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        int[] number = new int[10];
        int value;

        for (int i = 0; i < number.length; i++) {
            number[i] = 1 + r.nextInt(50);
        }
        System.out.print("Array:  ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "  ");
        }
        System.out.println("");
        System.out.print("Value to find:  ");
        value = Integer.parseInt(kb.next());
        for (int i = 0; i < number.length; i++) {
            if (value == number[i]){
                System.out.print(value + " is in the array.");
            }
        }
        System.out.println("");
    }
}
