package pbd.lesson7;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class Refresher2 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String name;

        System.out.print("What is your name?  ");
        name = kb.next();
        printName(name);

    }

    public static void printName(String name) {
        int max = 10;
        if (name.equalsIgnoreCase("Mitchell")) {
            max = 5;
        }
        System.out.println("");
        for (int i = 0; i < max; i++) {
            System.out.println(name);
        }
    }

}
