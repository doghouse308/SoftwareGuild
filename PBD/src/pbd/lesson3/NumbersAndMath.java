/*
What You Should Do on Your Own

Assignments turned in without these things will not receive any points.
Above each line, use two slashes // to write a comment to yourself explaining
what the line does.
Notice the math seems "wrong"? There are no fractions, only whole numbers. Find
out why by researching what a "floating point" number is.
Rewrite NumbersAndMath.java to use floating point numbers so it's more accurate
(hint: 20.0 is floating point). 
 */
package pbd.lesson3;

/**
 *
 * @author Paul Peterson
 */
public class NumbersAndMath {

    public static void main(String[] args) {
        System.out.println("I will now count my chickens:");
        // add 25 + 30 / 6  (will add 25 + 5)
        System.out.println("Hens " + (25.0 + 30.0 / 6));
        //The following will subtract 3 from 100
        System.out.println("Roosters " + (100.0 - 25.0 * 3.0 % 4));

        System.out.println("Now I will count the eggs:");
        //If the following is executed as written:
        //3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 it will compute 3 + 2 + 1 - 5 + 0 - 0 + 6 totaling 7
        //if 1 / 4 is calculated as a float 1.0 / 4 the total is 6.75
        System.out.println(3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2 - 1.0 / 4.0 + 6.0);

        System.out.println("Is it true that 3 + 2 < 5 - 7?");
        //This will print false because 5 is greater than -2
        System.out.println(3.0 + 2.0 < 5.0 - 7.0);
        //The numbers outside of the quotations will be evaluated before printing
        // ie (3 + 2) will print 5 and (5 - 7) will print -2
        System.out.println("What is 3 + 2? " + (3 + 2));
        System.out.println("What is 5 - 7? " + (5 - 7));

        System.out.println("Oh, that's why it's false.");

        System.out.println("How about some more.");
        //true
        System.out.println("Is it greater? " + (5 > -2));
        //true
        System.out.println("Is it greater or equal? " + (5 >= -2));
        //false
        System.out.println("Is it less or equal? " + (5 <= -2));
    }
}
