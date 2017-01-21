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
public class DumbCalculator {
    
    public static void main(String[] args) {
        
        //declare variables
        Scanner kb = new Scanner(System.in);
        double num1, num2, num3;
        
        //user input
        System.out.println("Dumb Calculator\n");
        System.out.print("What is your first number?  ");
        num1 = Double.parseDouble(kb.next());
        System.out.print("What is your second number?  ");
        num2 = Double.parseDouble(kb.next());
        System.out.print("What is your third number?  ");
        num3 = Double.parseDouble(kb.next());
        
        //display output
        System.out.printf("( %.2f + %.2f + %.2f ) / 2 is %.2f%n", num1, num2, num3, 
                (num1 + num2 + num3) /2);
        
    }
    
}
