
package pbd.lesson5;

import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class Dice {
    
    public static void main(String[] args) {
        
        Random r = new Random();
        
        int die1, die2, total;
        
        die1 = 1 + r.nextInt(6);
        die2 = 1 + r.nextInt(6);
        total = die1 + die2;
        System.out.println("HERE COMES THE DICE!\n");
        System.out.println("Roll 1: " + die1);
        System.out.println("Roll 2: " + die2);
        System.out.println("The total is " + total + "!");
        
    }
}
