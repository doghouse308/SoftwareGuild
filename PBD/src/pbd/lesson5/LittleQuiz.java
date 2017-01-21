
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class LittleQuiz {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //declare variables
        int question1, question2, question3, score = 0;
        String name, takeQuiz;

        System.out.print("Are you ready to take a quiz? ");
        takeQuiz = kb.next();
        if (!takeQuiz.equalsIgnoreCase("yes")) {
            System.out.println("Thank you. \n\nGood bye");
            System.exit(0);
        }
        System.out.println("Okay, here it comes!\n");
        System.out.println("Q1) What is the capital of Alaska?");
        System.out.println("\t1) Melbourne");
        System.out.println("\t2) Anchorage");
        System.out.println("\t3) Juneau");
        System.out.print("\n>  ");
        question1 = Integer.parseInt(kb.next());
        if (question1 == 3) {
            System.out.println("\nThat's correct!\n");
            score++;
        } else {
            System.out.println("\nSorry, Juneau is the capital of Alaska\n");
        }
        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
        System.out.println("\t1) yes");
        System.out.println("\t2) no");
        System.out.print("\n>  ");
        question1 = Integer.parseInt(kb.next());
        if (question1 == 2) {
            System.out.println("\nThat's correct!\n");
            score++;
        } else {
            System.out.println("\nSorry, \"cat\" is a string. ints can only store numbers.\n");
        }
        System.out.println("Q3) What is the result of 9+6/3??");
        System.out.println("\t1) 5");
        System.out.println("\t2) 11");
        System.out.println("\t3) 15/3");
        System.out.print("\n>  ");
        question1 = Integer.parseInt(kb.next());
        if (question1 == 2) {
            System.out.println("\nThat's correct!\n");
            score++;
        } else {
            System.out.println("\nSorry, the correct answer is 11.  Study your order of operations\n");
        }
        System.out.println("Overall, you got " + score + " out of 3 correct.");
        System.out.println("Thanks for playing!");
    }

}
