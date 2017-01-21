
package pbd.lesson7;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class DisplayingSomeMultiples {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        int number;
        
        System.out.print("Enter an Integer:  ");
        number = Integer.parseInt(kb.next());
        System.out.println("");
        for (int i = 1; i <= 12;i++){
            System.out.printf("%d x %d = %d%n",number, i, (number * i));            
        }
    }
    
}
