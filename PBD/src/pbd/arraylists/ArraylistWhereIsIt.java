/*
Create an ArrayList that can hold Integers, and fill each slot with a different 
random value from 1-50. Display those values on the screen, and then prompt the 
user for an integer. Search through the ArrayList, and if the item is present, 
give the slot number where it is located. If the value is not in the ArrayList, 
display a single message saying so. If the value is present more than once, you 
may either display the message as many times as necessary, or display a single
message giving the last slot number in which it appeared.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class ArraylistWhereIsIt {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> basicList = new ArrayList();
        ArrayList<Integer> count = new ArrayList();
        int search;
        int aSize = 10;

        for (int i = 0; i < aSize; i++) {
            basicList.add(1 + r.nextInt(50));
        }

        System.out.println("ArrayList: " + basicList);
        System.out.print("Value to find: ");
        search = Integer.parseInt(kb.next());

        for (int i = 0; i < basicList.size(); i++) {
            if (basicList.get(i) == search) {
                count.add(i);
            }
        }
        if (count.size() > 0) {
            for (int i = 0; i < count.size(); i++) {
                System.out.println(search + " is in the ArrayList in slot " + count.get(i));
            }
        } else {
            System.out.println(search + " is not in the ArrayList");
        }

    }
}
