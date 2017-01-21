
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class TwoMoreQuestions {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String location, status;

        System.out.println("TWO MORE QUESTIONS, BABY!\n"
                + "\nThink of something and I'll try to guess it!\n");
        System.out.print("Question 1) Does it stay inside or outside or both? ");
        location = kb.next();
        System.out.print("Question 2) Is it a living thing? ");
        status = kb.next();

        if (location.equalsIgnoreCase("inside") && status.equalsIgnoreCase("yes")) {
            System.out.println("Then what else could you be thinking of besides a houseplant!");
        }
        if (location.equalsIgnoreCase("inside") && status.equalsIgnoreCase("no")) {
            System.out.println("Then what else could you be thinking of besides a shower curtain!");
        }
        if (location.equalsIgnoreCase("outside") && status.equalsIgnoreCase("yes")) {
            System.out.println("Then what else could you be thinking of besides a bison!");
        }
        if (location.equalsIgnoreCase("outside") && status.equalsIgnoreCase("no")) {
            System.out.println("Then what else could you be thinking of besides a billboard!");
        }
        if (location.equalsIgnoreCase("both") && status.equalsIgnoreCase("yes")) {
            System.out.println("Then what else could you be thinking of besides a dog!");
        }
        if (location.equalsIgnoreCase("both") && status.equalsIgnoreCase("no")) {
            System.out.println("Then what else could you be thinking of besides a cell phone!");
        }
    }
}
