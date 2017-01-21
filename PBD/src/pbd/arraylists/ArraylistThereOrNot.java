/*
Create an ArrayList of Integers, and fill each slot with a different random 
value from 1-50. Display those values on the screen, and then prompt the user 
for an integer. Search through the ArrayList, and if the item is present, say 
so. If the value is not in the ArrayList, display a single message saying so. 
Just like the previous assignment, if the value is present more than once, you 
may display the message as many times as necessary.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class ArraylistThereOrNot {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> basicList = new ArrayList();
        int search;
        int count = 0;
        int aSize = 10;

        for (int i = 0; i < aSize; i++) {
            basicList.add(1 + r.nextInt(50));
        }

        System.out.println("ArrayList: " + basicList);
        System.out.print("Value to find: ");
        search = Integer.parseInt(kb.next());

        for (Integer num : basicList) {
            if (num == search) {
                count ++;
            }
        }
        if (count > 0){
            System.out.println(search + " is in the ArrayList");
        } else {
            System.out.println(search + " is not in the ArrayList");
        }

    }
}
