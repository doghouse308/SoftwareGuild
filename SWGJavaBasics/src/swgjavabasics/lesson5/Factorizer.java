/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swgjavabasics.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class Factorizer {

    public static void main(String[] args) {

        //variable declaration
        int number, factors = 0, sum = 0;
        boolean isPrime = true, isPerfect = false;

        Scanner kb = new Scanner(System.in);

        //user input
        do {
            System.out.print("Please enter an integer:  ");
            number = Integer.parseInt(kb.next());
            if (number < 1) {
                System.out.println("Please enter an integer greater than 1.");
            }
        } while (number < 1);

        System.out.printf("The factors of %d are:%n%n", number);
        for (int i = number; i > 1; i--) {
            if (number % i == 0) {
                System.out.println(number / i);
                factors++;
                sum += number / i;
            }
        }
        
        //display results
        System.out.println("");
        System.out.println(number + " has " + (factors - 1) + " factors other than 1");
        System.out.println("");
        if (factors > 1) {
            System.out.println(number + " is not prime.");
        } else {
            System.out.println(number + " is prime.");
        }
        System.out.println("");
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

}
