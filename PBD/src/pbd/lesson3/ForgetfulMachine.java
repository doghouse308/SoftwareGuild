
package pbd.lesson3;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class ForgetfulMachine {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Give me a word! ");
        String t = kb.next();
        System.out.print("Give me a second word! ");
        t = kb.next();
        System.out.print("Great, now your favorite number? ");
        t = kb.next();
        System.out.print("And your second-favorite number... ");
        t = kb.next();
        System.out.println("Whew!  Wasn't that fun?");
    }
}
