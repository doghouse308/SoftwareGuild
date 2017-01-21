
package pbd.lesson3;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class MoreInputOfData {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        //declare variables
        String login, firstName, lastName;
        int id, grade;
        double gpa;
        
        //collect user input
        System.out.println("Please enter the following information so I can sell it for a profit!\n");
        System.out.print("First name:  ");
        firstName = kb.next();
        System.out.print("Last name:  ");
        lastName = kb.next();
        System.out.print("Grade (9-12):  ");
        grade = Integer.parseInt(kb.next());
        System.out.print("Student ID:  ");
        id = Integer.parseInt(kb.next());
        System.out.print("Login:  ");
        login = kb.next();
        System.out.print("GPA (0.0-4.0):  ");
        gpa = Double.parseDouble(kb.next());
        
        //output results
        System.out.println("Your information:");
        System.out.printf("\tLogin:  %s%n", login);
        System.out.printf("\tID:  %d%n", id);
        System.out.printf("\tName:  %s, %s%n", lastName, firstName);
        System.out.printf("\tGPA:  %.2f%n", gpa);
        System.out.printf("\tGrade:  %d%n", grade);
        
    }
}
