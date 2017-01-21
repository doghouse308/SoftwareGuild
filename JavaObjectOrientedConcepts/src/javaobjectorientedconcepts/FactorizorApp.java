/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjectorientedconcepts;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class FactorizorApp {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        Factorizor f = new Factorizor();
        
        int number = 0;
        
        System.out.print("Please enter an integer to factorize:  ");
        number = Integer.parseInt(kb.next());
        
        f.factorize(number);
    }
    
}
