
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class AgeMessages3 {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        //variable declaration
        String name;
        int age;
        
        System.out.print("Your name:  ");
        name = kb.nextLine();
        System.out.print("Your age:  ");
        age = Integer.parseInt(kb.next());
        
        //output
        if (age < 16){
            System.out.println("You can't drive, " + name + ".");
        } else if (age >= 16 && age < 18) {
            System.out.println("You can drive but not vote, " + name + ".");
        } else if (age >= 18 && age <= 24) {
            System.out.println("You can vote but not rent a car, " + name + ".");
        } else {
            System.out.println("You can do pretty much anything, " + name + ".");
        }
    }
    
}
