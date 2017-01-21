/*
What does n++ do? Remove it and see what happens. (Then put it back.)

    The ++ increments n by 1
Change the code so that the loop repeats ten times instead of five.
See if you can change the code so that the message still prints ten times,
but the numbers in front count by tens, like so: 
*/

package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class CountingWhile {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it 10 times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
        System.out.print("Repeat how many times?   ");
        int repeat = Integer.parseInt(keyboard.next());        
        int n = 0;
        while (n < repeat * 10) {
            n += 10;
            System.out.println(n + ". " + message);
        }
    }
}
