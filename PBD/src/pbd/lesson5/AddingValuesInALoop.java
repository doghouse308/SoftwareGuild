
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class AddingValuesInALoop {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        int number = -1, sum = 0;
        System.out.println("I will add up the numbers you give me.");
        while (number != 0){
            System.out.print("Number:  ");
            number = Integer.parseInt(kb.next());
            sum += number;
            System.out.println("The total so far is " + sum);
        }
        
        System.out.println("The total is " + sum);
    }
}
