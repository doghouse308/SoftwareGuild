
package pbd.lesson7;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class Refresher {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        String name;
        int max;
        
        System.out.print("What is your name?  ");
        name = kb.next();
        max = determineMax(name);
        printName(name, max);
        
        
    }
    
    public static int determineMax(String name){
        if (name.equalsIgnoreCase("Mitchell")) {
            return 5;
        } else {
            return 10;
        }
    }
    
    public static void printName(String name, int max){
        System.out.println("");
        for (int i = 0; i < max; i++){
            System.out.println(name);
        }
    }
    
}
