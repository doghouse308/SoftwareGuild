/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.lesson3;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class AskingQuestions {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int age;
        String heightFeet, heightInches;
        double weight;

        System.out.print("How old are you? ");
        age = kb.nextInt();
        System.out.print("How tall are you? (Feet) ");
        heightFeet = kb.next();
        System.out.print("How tall are you? (Inches) ");
        heightInches = kb.next();
        System.out.print("How much do you weigh? ");
        weight = kb.nextDouble();

        System.out.println("So you're " + age + " old, " + heightFeet
                + "' " + heightInches + "\" tall and " + weight + " heavy.");
    }
}
