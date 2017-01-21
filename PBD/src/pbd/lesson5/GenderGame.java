package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class GenderGame {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String gender, firstName, lastName, maritalStatus;
        int age;
        boolean married = false;

        System.out.print("What is your gender (M or F): ");
        gender = kb.next();
        System.out.print("First name:  ");
        firstName = kb.next();
        System.out.print("Last name:  ");
        lastName = kb.next();
        System.out.print("Age:  ");
        age = Integer.parseInt(kb.next());
        if (gender.equalsIgnoreCase("f") && age >= 20) {
            System.out.print("\nAre you married, " + firstName + " (y or n)? ");
            maritalStatus = kb.next();
            married = maritalStatus.equalsIgnoreCase("y");
        }
        if (married) {
            System.out.println("Then I shall call you Mrs. " + lastName + ".");
        } else if (gender.equalsIgnoreCase("f")) {
            if (!married && age < 20) {
                System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
            } else {
                System.out.println("Then I shall call you Ms. " + lastName + ".");
            }
        } else if (gender.equalsIgnoreCase("m") && age >= 20) {
            System.out.println("Then I shall call you Mr. " + lastName + ".");
        } else {
            System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
        }
    }
}


