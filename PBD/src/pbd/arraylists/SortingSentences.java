/*
Write a program that creates an ArrayList of Strings. Let the user type in a 
sentence using keyboard.nextLine(). Using String.split(), break up the sentence
into an array of Strings and then put those Strings into an ArrayList. Also, 
force all the Strings to lowercase.

Then, using the String ArrayList sorting function you already wrote, put the 
words in alphabetical order and print them out again.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class SortingSentences {
    
    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList();
        Scanner kb = new Scanner(System.in);
        String sentence;
        
        System.out.print("Enter a sentence:  ");
        sentence = kb.nextLine();
        
        for (String splitWord : sentence.split(" ")){
            words.add(splitWord.toLowerCase());
        }
        System.out.println("Sentence:  " + sentence);
        Collections.sort(words);
        System.out.println("Sorted:  " + words);
    }
}
