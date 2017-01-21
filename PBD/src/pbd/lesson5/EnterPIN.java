package pbd.lesson5;

/*
    How is a while loop similar to an if statement? 
        A while loop executes the code block in the loop IF the condition is true 
        and skips the code block if the condition is false
    How is a while loop different from an if statement?
        An if statement executes the code block once if the condition is true, 
        a while loop continues to execute the code block as long as the condition 
        is true.
    Inside the while loop, why isn't there an int in front of the line entry = keyboard.nextInt()?
        because the varaible entry was declared and assigned in line 31
    Delete the line entry = keyboard.nextInt(); from inside the while loop. What happens? Why?
        If the line entry = keyboard.nextInt(); is removed, and the user enters the 
        wrong PIN the first time the while loop becomes an infinite loop
        because there is no user input to change the PIN value entered the first time. 
        If the user enters the correct PIN the first time, the program functions 
        normally.
    (Put the entry = keyboard.nextInt(); back before you turn in the assignment.) 
*/

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class EnterPIN {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();

        while (entry != pin) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
}
