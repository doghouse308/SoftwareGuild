
package pbd.arraylists;

import java.util.ArrayList;

/**
 * Create an ArrayList that can hold Integers. Add ten copies of the number -113 
 * to the ArrayList. Then display the contents of the ArrayList on the screen.
 * Do not use a loop. Also, do not use any variable for the index; you must use
 * literal numbers to refer to each slot.
 * 
 * @author Paul Peterson
 */
public class BasicArraylists0 {
    
    public static void main(String[] args) {
        ArrayList<Integer> basicList = new ArrayList();
        
        basicList.add(-113);
        basicList.add(-113);
        basicList.add(-113);
        basicList.add(-113);
        basicList.add(-113);
        basicList.add(-113);
        basicList.add(-113);
        basicList.add(-113);
        basicList.add(-113);
        basicList.add(-113);
        
        System.out.println("Slot 0 contains a " + basicList.get(0));
        System.out.println("Slot 1 contains a " + basicList.get(1));
        System.out.println("Slot 2 contains a " + basicList.get(2));
        System.out.println("Slot 3 contains a " + basicList.get(3));
        System.out.println("Slot 4 contains a " + basicList.get(4));
        System.out.println("Slot 5 contains a " + basicList.get(5));
        System.out.println("Slot 6 contains a " + basicList.get(6));
        System.out.println("Slot 7 contains a " + basicList.get(7));
        System.out.println("Slot 8 contains a " + basicList.get(8));
        System.out.println("Slot 9 contains a " + basicList.get(9));
        
    }
    
}
