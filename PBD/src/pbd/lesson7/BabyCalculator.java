package pbd.lesson7;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class BabyCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double a, b, c;
        String op;

        do {
            System.out.print("> ");
            a = keyboard.nextDouble();
            op = keyboard.next();
            b = keyboard.nextDouble();

            switch (op) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "*":
                    c = a * b;
                    break;
                case "/":
                    c = a / b;
                    break;
                default:
                    System.out.println("Undefined operator: '" + op + "'.");
                    c = 0;
                    break;
            }
            if (a == 0) {
                System.out.println("Bye, now");
            } else {
                System.out.println(c);
            }
        } while (a != 0);
    }
}
