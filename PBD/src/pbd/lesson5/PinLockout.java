/*
    Change the code so that it locks them out after 4 tries instead of 3. 
    Make sure to change the message at the bottom, too.
    Move the "maximum tries" value into a variable, and use that variable 
    everywhere instead of just the number. 
 */
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class PinLockout {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int MAX_ATTEMPTS = 3;
        int pin = 12345;
        int tries = 0;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        tries++;

        while (entry != pin && tries < MAX_ATTEMPTS) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
            tries++;
        }

        if (entry == pin) {
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        } else if (tries >= MAX_ATTEMPTS) {
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
        }
    }
}
