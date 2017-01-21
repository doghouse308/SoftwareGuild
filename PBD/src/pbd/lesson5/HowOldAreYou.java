
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class HowOldAreYou {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        //declare variables
        String name;
        int age;
        
        //get user input
        System.out.print("Hi, what is your name?  ");
        name = kb.nextLine();
        System.out.print("Hi " + name + ".  How old are you? ");
        age = Integer.parseInt(kb.next());
        //display results
        if (age < 16) {
            System.out.println("You can't drive.");
        }
        if (age < 18){
            System.out.println("You can't vote.");
        }
        if (age < 25) {
            System.out.println("You can't rent a car.");
        }
        if (age >= 25) {
            System.out.println("You can do anything that's legal.");
        }
            
    }
    
}
