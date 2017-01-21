
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class AlphabeticalOrder {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        String name, initial;
        
        System.out.print("What is your last name?  ");
        name = kb.next();
        initial = name.substring(0, 1);
        
        if ((initial.compareToIgnoreCase("C") <= 0)){
            System.out.println("You don't have to wait long before we get to you, \"" + name + "\".");
        } else if ((initial.compareToIgnoreCase("J") <= 0)) {
            System.out.println("It's not looking that's not bad before we get to you, \"" + name + "\".");
        } else if ((initial.compareToIgnoreCase("S") <= 0)) {
            System.out.println("It looks like a bit of a wait before we get to you, \"" + name + "\".");
        } else if ((initial.compareToIgnoreCase("Y") <= 0)) {
            System.out.println("It's gonna be a while before we get to you, \"" + name + "\".");
        } else {
            System.out.println("I you're hope not going anywhere for a while, \"" + name + "\".");
        }    }
    
}
