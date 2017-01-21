
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class CollatzSequence {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        int result = 0, number, count = 0, row = 0, max = 0;
        
        System.out.println("Collatz Sequence");
        System.out.print("Enter your starting number:  ");
        number = Integer.parseInt(kb.next());
        
        System.out.printf("%-8d",number);
        row++;
        while (result != 1){
            count++;
            if ( number % 2 == 0) {
                result = number / 2;
            } else {
                result = (number * 3) + 1;
            }
            if (result > max){
                max = result;
            }
            number = result;
            System.out.printf("%-8d", result);
            row++;
            if (row == 10){
                System.out.println("");
                row = 0;
            }
        }
        System.out.println("\n\nThe sequence terminated after " + count + " steps. "
                + "The largest value was " + max + ".");
                
    }
    
}
