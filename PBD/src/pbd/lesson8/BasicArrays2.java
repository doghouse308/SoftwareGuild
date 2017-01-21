package pbd.lesson8;

import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class BasicArrays2 {

    public static void main(String[] args) {

        Random r = new Random();
        
        int[] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            number[i] = 1 + r.nextInt(100);
        }
        
        for (int i = 0; i < number.length; i++) {
            System.out.printf("Slot %d contains %d%n", i, number[i]);
        }
    }

}
