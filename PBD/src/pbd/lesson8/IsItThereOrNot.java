package pbd.lesson8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class IsItThereOrNot {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        int[] number = new int[10];
        int value, count = 0;

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
        if (isInArray(number, value)){
            System.out.printf("%d is in the array.%n", value);
        } else {
            System.out.printf("%d is not in the array.%n", value);
        }
    }
    
    public static boolean isInArray(int[] n, int value){
        
        for (int num : n){
            if (value == num){
                return true;
            }
        }
        return false;
    }
}
