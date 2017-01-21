
package pbd.lesson3;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class BMICalculator {

    public static void main(String[] args) {

        //declare variables
        double height, weight;
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
        System.out.printf("%nYour BMI is %.2f%n", weight / (height * height));
    }

}
