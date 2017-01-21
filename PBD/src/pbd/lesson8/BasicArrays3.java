
package pbd.lesson8;

import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class BasicArrays3 {

    public static void main(String[] args) {

        Random r = new Random();

        int[] number = new int[1000];

        for (int i = 0; i < number.length; i++) {
            number[i] = 1 + r.nextInt(99);
        }
        int count = 1;
        for (int i = 0; i < number.length; i++) {
            System.out.printf("%2d  ", number[i]);
            count++;
            if (count == 20){
                System.out.println("");
                count = 1;
            }
        }
    }

}
