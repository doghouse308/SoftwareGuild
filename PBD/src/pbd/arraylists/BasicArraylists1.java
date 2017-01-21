/*
Create an ArrayList that can hold Integers. Add ten copies of the number -113 
to the ArrayList. Then display the contents of the ArrayList on the screen.

This time, you must use a loop, both to fill up the ArrayList and to display it.
Also, in the condition of your loop, you should not count up to a literal number. 
Instead you should use the size() of your ArrayList.
 */
package pbd.arraylists;

import java.util.ArrayList;

/**
 *
 * @author Paul Peterson
 */
public class BasicArraylists1 {
    
    public static void main(String[] args) {
        int aSize = 10;
        ArrayList<Integer> basicList = new ArrayList();
        
        for (int i = 0; i < aSize; i ++){
            basicList.add(i, -113);
        }
        for (int i = 0; i < basicList.size(); i ++){
            System.out.println("Slot " + i + " contains a " + basicList.get(i));
        }
    }
    
}
