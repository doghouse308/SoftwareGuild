/*
Write a program that creates an ArrayList of Integers. Fill the ArrayList with 
random numbers from 10 to 99. Display the values in the ArrayList on the screen. 
Then using the sort of your choice, arrange the values from largest to smallest 
and display them again.

You must put the sorting code in its own function.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class SortingAnArraylist {

    public static void main(String[] args) {

        Random r = new Random();
        ArrayList<Integer> basicList = new ArrayList();
        int aSize = 10;

        for (int i = 0; i < aSize; i++) {
            basicList.add(1 + r.nextInt(100));
        }

        System.out.println("ArrayList before: " + basicList);
        Collections.sort(basicList);
        System.out.println("ArrayList after: " + basicList);

    }
}
