
package pbd.lesson7;

/**
 *
 * @author Paul Peterson
 */

import java.util.Scanner;

public class ProjectCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double a, b, c;
        String op;

        do {
            System.out.println("Please enter a number, an operator ( + - * / ^ %) and another number");
            System.out.print("> ");
            a = keyboard.nextDouble();
            if (a == 0 ){
                System.out.println("Good-Bye");
                System.exit(0);
            }
            op = keyboard.next();
                    
            b = keyboard.nextDouble();

            if (op.equals("+")) {
                c = add(a, b);
                System.out.println("The sum is:  " + c);
            } else if (op.equals("-")) {
                c = subtract(a, b);
                System.out.println("The difference is:  " + c);
            } else if (op.equals("*")) {
                c = multiply(a, b);
                System.out.println(a + " Times " + b + " is:  " + c);
            } else if (op.equals("-")) {
                c = divide(a, b);
                System.out.println(a + " Divided by " + b + " is:  " + c);
            }else if (op.equals("-")) {
                c = divide(a, b);
                System.out.println(a + " Divided by " + b + " is:  " + c);
            } else if (op.equals("^")){
                c = power(a, b);
                System.out.println(a + " to the " + b + "th power is:  " + c);
            } else if (op.equals("%")){
                c = modulus(a, b);
                System.out.println(a + " Modulus " + b + " is:  " + c);
            } else {
                System.out.println("Undefined operator: '" + op + "'.");
                c = 0;
            }

            System.out.println(c);

        } while ( a != 0 );

    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
    public static double modulus(double a, double b){
        return a % b;
    }
    public static double power(double a, double b){
        return Math.pow(a, b);
    }
}

