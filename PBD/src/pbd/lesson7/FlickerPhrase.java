package pbd.lesson7;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class FlickerPhrase {

    public static void main(String[] args) {
        Random rng = new Random();
        int r;

        for (int i = 0; i < 1000; i++) {
            r = 1 + rng.nextInt(5);
            // Write five if statements here.
            if (r == 1) {
                first();
            }
            if (r == 2) {
                second();
            }
            if (r == 3) {
                third();
            }
            if (r == 4) {
                fourth();
            }
            if (r == 5) {
                fifth();
            }
            System.out.println("");

            try {
                // Optional: after the if statements are over, add in a slight delay.
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(FlickerPhrase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("I pledge allegiance to the flag.");

    }

    public static void first() {
        System.out.print("I                               \r");
    }

    public static void second() {
        System.out.print("  pledge                        \r");
    }

    public static void third() {
        System.out.print("         allegiance             \r");
    }

    public static void fourth() {
        System.out.print("                    to the      \r");
    }

    public static void fifth() {
        System.out.print("                           flag.\r");
    }
}
