package pbd.lesson3;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class NameAgeAndSalary {

    public static void main(String[] args) {
        String name;
        double wage;
        int age;

        Scanner kb = new Scanner(System.in);

        System.out.print("Hello, what is your name?  ");
        name = kb.nextLine();
        System.out.printf("Hi %s!  How old are you? ", name);
        age = Integer.parseInt(kb.next());
        System.out.printf("Wow %s, you're %d!  I remember when I was %d%n",
                name, age, age);
        System.out.print("How much do you make per hour?  ");
        wage = Double.parseDouble(kb.next());
        System.out.printf("It must be nice to earn $%.2f per hour%n", wage);
        
    }
}
