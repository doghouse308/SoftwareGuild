package pbd.arraylists;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
Write a program that creates an ArrayList which can hold Integers. Fill the 
ArrayList with random numbers from 1 to 100. Display the values in the ArrayList
on the screen. Then use a linear search to find the largest value in the 
ArrayList, and display that value. */
/**
 *
 * @author Paul Peterson
 */
public class GettingTheLargestValueInAnArraylist {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> basicList = new ArrayList();
        int search;
        int max = 0;
        int aSize = 10;

        for (int i = 0; i < aSize; i++) {
            basicList.add(1 + r.nextInt(100));
        }

        System.out.println("ArrayList: " + basicList);

        for (int i = 0; i < basicList.size(); i++) {
            if (basicList.get(i) > max) {
                max = basicList.get(i);
            }
        }
        System.out.println("The largest value is: " + max);
    }

}
