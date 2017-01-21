package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class TwentyQuestions {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String avm, size;

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.\n");
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        System.out.print("> ");
        avm = kb.next();
        System.out.println("");
        System.out.println("Question 2) Is it bigger than a breadbox?");
        System.out.print("> ");
        size = kb.next();

        if (avm.equalsIgnoreCase("animal")) {
            if (size.equalsIgnoreCase("yes")) {
                System.out.println("My guess is that you are thinking of a moose.");
            } else {
                System.out.println("My guess is that you are thinking of a squirrel.");
            }
        }
        if (avm.equalsIgnoreCase("vegetable")) {
            if (size.equalsIgnoreCase("yes")) {
                System.out.println("My guess is that you are thinking of a watermelon.");
            } else {
                System.out.println("My guess is that you are thinking of a carrot.");
            }
        }
        if (avm.equalsIgnoreCase("mineral")) {
            if (size.equalsIgnoreCase("yes")) {
                System.out.println("My guess is that you are thinking of a Camaro.");
            } else {
                System.out.println("My guess is that you are thinking of a paper clip .");
            }
        }
        System.out.println("\nI would ask you if I'm right, but I don't actually care.");
        
    }

}
