/*
Write a program that creates an ArrayList of Strings. Make up ten or more random
words (all lowercase) and put them in the ArrayList in any way you choose. 
Display them on the screen. Then, using the sort of your choice, arrange the 
words in alphabetical order and display them again.

Just like last time, you must put the sorting code in its own function.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Paul Peterson
 */
public class SortingAnArraylistOfStrings {

    public static void main(String[] args) {

        ArrayList<String> basicList = new ArrayList();

        basicList.add("ask");
        basicList.add("not");
        basicList.add("what");
        basicList.add("your");
        basicList.add("country");
        basicList.add("can");
        basicList.add("do");
        basicList.add("for");
        basicList.add("you");
        basicList.add("but");
        
        System.out.println("ArrayList before: " + basicList);
        Collections.sort(basicList);
        System.out.println("ArrayList after: " + basicList);

    }

}
