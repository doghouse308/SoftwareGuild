package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class RightTriangleChecker {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Please enter three integers.\nEach integer must be "
                + "larger than the previous.");
        System.out.print("Side 1:  ");
        num1 = Integer.parseInt(kb.next());
        do {
            System.out.print("Side 2:  ");
            num2 = Integer.parseInt(kb.next());
            if (num2 <= num1) {
                System.out.println(num2 + " is smaller than " + num1 + "  Try Again!");
            }
        } while (num2 <= num1);
        do {
            System.out.print("Side 2:  ");
            num3 = Integer.parseInt(kb.next());
            if (num3 <= num2) {
                System.out.println(num3 + " is smaller than " + num2 + "  Try Again!");
            }
        } while (num3 <= num2);
        
        System.out.println("Your three sides are " + num1 + " " + num2 + " " + num3);
        if ((num1 * num1) + (num2 * num2) == (num3 * num3)){
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
        } else {
            System.out.println("NO!  These sides do not make a right triangle!");
        }
    }

}
