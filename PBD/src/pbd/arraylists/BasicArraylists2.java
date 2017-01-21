/*
Create an ArrayList of Integers. Fill up the list with ten random numbers, each 
from 1 to 100. Then display the contents of the ArrayList on the screen.

You must use a loop to fill up the list. However, you may display it the easy 
way (no loop needed) like so:
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class BasicArraylists2 {
    
    public static void main(String[] args) {
        
        Random r = new Random();
        ArrayList<Integer> basicList = new ArrayList();
        int num;
        int aSize = 10;
        
        for (int i = 0; i < aSize; i++){
            basicList.add(1 + r.nextInt(100));
        }
        
        System.out.println( "ArrayList: " + basicList );
    }
    
}
