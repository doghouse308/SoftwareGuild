
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class CountingMachine {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        int number;
        
        System.out.print("Count to:  ");
        number = Integer.parseInt(kb.next());
        
        for (int i = 0; i <= number; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
