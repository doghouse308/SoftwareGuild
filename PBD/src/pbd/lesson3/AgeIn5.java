package pbd.lesson3;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class AgeIn5 {

    public static void main(String[] args) {
        
        //declare varaibles
        String name;
        int age;

        Scanner kb = new Scanner(System.in);
        
        //get user input
        System.out.print("Hello, what is your name?  \u2665");
        name = kb.nextLine();
        System.out.printf("Hi %s!  How old are you? ", name);
        age = Integer.parseInt(kb.next());
        
        //display output
        System.out.printf("Did you know that in five years you will be %d years"
                + " old?%n", age + 5);
        System.out.printf("And five years ago you were %d! Imagine that!%n", age - 5);
    }

}
