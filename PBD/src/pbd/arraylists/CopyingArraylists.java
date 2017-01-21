/*
Write a program that creates an ArrayList of Integers. It should put ten random 
numbers from 1 to 100 in the ArrayList. It should copy all the elements of that
ArrayList into another ArrayList of the same size. Then display the contents of
both ArrayLists in any way you like.

    Create an ArrayList of Integers
    Fill the ArrayList with ten random numbers (1-100)
    Copy each value from the ArrayList into another ArrayList of the same capacity
    Change the last value in the first ArrayList to a -7
    Display the contents of both ArrayLists 
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class CopyingArraylists {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> original = new ArrayList();
        ArrayList<Integer> clone = new ArrayList();
        int num;
        int aSize = 10;

        for (int i = 0; i < aSize; i++) {
            original.add(1 + r.nextInt(100));
        }
        
        clone = (ArrayList<Integer>) original.clone();

        original.remove(original.size() - 1);
        original.add(-7);
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }

}
