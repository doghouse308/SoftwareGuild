package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class BMICategories {

    public static void main(String[] args) {

        //declare variables
        double height, weight, bmi;
        int feet, inches;
        Scanner kb = new Scanner(System.in);

        //collect user data
        /*  
        //basic assignment
        System.out.print("Your height in m:  ");
        height = Double.parseDouble(kb.next());
        System.out.print("Your weight in kg:  ");
        weight = Double.parseDouble(kb.next());
        
        //bonus 1
        System.out.print("Your height in inches:  ");
        height = Double.parseDouble(kb.next()) * .0254;
        System.out.print("Your weight in pounds:  ");
        weight = Double.parseDouble(kb.next()) / 2.2;
         */
        //bonus 2
        System.out.print("Your height in feet:  ");
        feet = Integer.parseInt(kb.next());
        System.out.print("Your height in inches:  ");
        inches = Integer.parseInt(kb.next());
        height = ((feet * 12) + inches) * .0254;
        System.out.print("Your weight in pounds:  ");
        weight = Double.parseDouble(kb.next()) / 2.2;

        //display output
        bmi = weight / (height * height);
        System.out.printf("%nYour BMI is %.1f%n", weight / (height * height));
        
        if (bmi < 15.0) {
            System.out.println("BMI Category:  very severly underweight");
        } else if (bmi >= 15.0 && bmi <= 16.0) {
            System.out.println("BMI Category:  severely underweight");
        } else if (bmi >= 16.1 && bmi <= 18.4) {
            System.out.println("BMI Category:  underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("BMI Category:  normal weight");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("BMI Category:  overweight");
        } else if (bmi >= 30.0 && bmi <= 34.9) {
            System.out.println("BMI Category:  moderately obese");
        } else if (bmi >= 35.0 && bmi <= 39.9) {
            System.out.println("BMI Category:  severely obese");
        } else {
            System.out.println("BMI Category:  morbidly obese");
        }
    }
}
