package pbd.lesson8;

import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class CopyingArrays {

    public static void main(String[] args) {

        Random r = new Random();

        int[] number = new int[10];
        int[] copyNumber = new int[number.length];

        for (int i = 0; i < number.length; i++) {
            number[i] = 1 + r.nextInt(100);
        }

        System.arraycopy(number, 0, copyNumber, 0, number.length);
        number[number.length - 1] = -7;
        System.out.print("Array 1:  ");
        printArray(number);
        System.out.print("Array 2:  ");
        printArray(copyNumber);

    }

    public static void printArray(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.printf("%3d  ", n[i]);
        }
        System.out.println("");
    }
}
