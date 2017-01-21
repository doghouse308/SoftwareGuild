/*
What does n = n+1 do? Remove it and see what happens. (Then put it back.)
    n = n + 1 increments the for counter in the for loop.  If it is removed
    the loop will become an ifinite loop because n will always equal 1
What does int n = 1 do? Remove it and see what happens. (Then put it back.)
    int n = 1 initializes the counter.  Removing it will cause an error that
    will prevent the file from compiling
Change the code so that the loop repeats ten times instead of five.
See if you can change the for loop so that the message starts at 2 and counts by twos, like so: 
 */
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class CountingFor {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();

        for (int n = 2; n <= 10; n = n + 2) {
            System.out.println(n + ". " + message);
        }

    }
}
