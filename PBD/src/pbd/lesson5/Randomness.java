package pbd.lesson5;

/**
 *
 * @author Paul Peterson
 */
import java.util.Random;

public class Randomness {

    public static void main(String[] args) {
        
        Random r = new Random();
        //changing the random generator to a seeded random number generator yields 
        //the same results each time the program runs
        //Random r = new Random(12353);
        //changing the seed number yeilds different results from the previous seeded
        //results, nut the same every time the program is executed
        //Random r = new Random(45796);

        int x = 1 + r.nextInt(10);

        System.out.println("My random number is " + x);

        System.out.println("Here are some numbers from 1 to 5!");
        //System.out.print(1 + r.nextInt(5) + " ");
//        System.out.print(1 + r.nextInt(5) + " ");
//        System.out.print(1 + r.nextInt(5) + " ");
//        System.out.print(1 + r.nextInt(5) + " ");
//        System.out.print(1 + r.nextInt(5) + " ");
//        System.out.print(1 + r.nextInt(5) + " ");
    //deleting the "1 + "changes the range to 1 - 4
//        System.out.print(r.nextInt(5) + " ");
//        System.out.print(r.nextInt(5) + " ");
//        System.out.print(r.nextInt(5) + " ");
//        System.out.print(r.nextInt(5) + " ");
//        System.out.print(r.nextInt(5) + " ");
//        System.out.print(r.nextInt(5) + " ");
//        System.out.print(r.nextInt(5) + " ");
    //changing the "1 + " to "3 + " changes the range from 1 to 5 to 3 to 7
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.println();

        System.out.println("Here are some numbers from 1 to 100!");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.println();
        
        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if (num1 == num2) {
            System.out.println("The random numbers were the same! Weird.");
        }
        if (num1 != num2) {
            System.out.println("The random numbers were different! Not too surprising, actually.");
        }
    }
}
