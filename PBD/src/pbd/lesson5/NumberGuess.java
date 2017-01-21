/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class NumberGuess {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        int number, guess;
        
        number = r.nextInt(10) + 1;

        System.out.println("Guessing Game\n");
        System.out.print("Guess a number (1 - 10):  ");
        guess = Integer.parseInt(kb.next());
        System.out.println("");
        if (guess == number) {
            System.out.println("WINNER!!! I can't believe you guessed " + number + "!");
        } else {
            System.out.println("You lose!! The number was " + number + ".");
        }
    }
}
