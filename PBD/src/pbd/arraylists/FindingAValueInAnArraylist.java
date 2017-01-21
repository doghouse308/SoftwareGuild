/*
Create an ArrayList that can hold Integers, and fill each slot with a different
random value from 1-50. Display those values on the screen, and then prompt the 
user for an integer. Search through the ArrayList, and if the item is present, 
say so. It is not necessary to display anything if the value was not found. If 
the item is in the ArrayList multiple times, it's okay if the program prints the
message more than once.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class FindingAValueInAnArraylist {
    
    public static void main(String[] args) {
                
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> basicList = new ArrayList();
        int search;
        int aSize = 10;
        
        for (int i = 0; i < aSize; i++){
            basicList.add(1 + r.nextInt(50));
        }
        
        System.out.println( "ArrayList: " + basicList );
        System.out.print("Value to find: ");
        search = Integer.parseInt(kb.next());
        
        for (Integer num : basicList) {
            if (num == search){
                System.out.println(search + " is in the ArrayList");
            }
        }
    
    }
    
}
