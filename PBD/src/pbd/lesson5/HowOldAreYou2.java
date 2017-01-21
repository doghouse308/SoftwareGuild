/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class HowOldAreYou2 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //declare variables
        String name;
        int age;

        //get user input
        System.out.print("Hi, what is your name?  ");
        name = kb.nextLine();
        System.out.print("Hi " + name + ".  How old are you? ");
        age = Integer.parseInt(kb.next());
        //display results
        if (age < 16) {
            System.out.println("You can't drive.");
        } else if (age < 18) {
            System.out.println("You can't vote.");
        } else if (age < 25) {
            System.out.println("You can't rent a car.");
        } else if (age >= 25) {
            System.out.println("You can do anything that's legal.");
        }

    }
}
