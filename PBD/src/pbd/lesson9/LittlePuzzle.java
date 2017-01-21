/*
A Little Puzzle
Note: This Assignment is somewhat broken. Using Scanner, you can't read a single
character from a file.

Open a file specified by the user. This file will contain a bunch of characters.
You should read in each character from the file, one character at a time. 
Display every third character on the screen. Throw the other characters away.

There is a sample input file called puzzle.txt, containing a little message you 
can use to test your program.

For fun, the "thrown-away" characters might say something, too, in case you 
care to try to view them somehow.
 */
package pbd.lesson9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class LittlePuzzle {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String fileName = "";
        String thirdCharacters = "";
        String otherCharacters = "";
        File file = new File(fileName);
        do {
            System.out.print("Enter file name:  ");
            fileName = kb.next();
            file = new File(fileName);
            if (!file.exists()) {
                System.out.println("invalid file name");
            }
        } while (!file.exists());

        try {
            Scanner sc = new Scanner(
                    new BufferedReader(new FileReader(fileName)));
            // go through the file line by line
            while (sc.hasNext()) {
                String currentLine = sc.nextLine();
                for (int i = 0; i < currentLine.length(); i++) {
                    if ((i + 1) % 3 == 0) {
                        thirdCharacters += currentLine.charAt(i);
                    } else {
                        otherCharacters += currentLine.charAt(i);
                    }
                }
                System.out.println("\nThird Characters:");
                System.out.println(thirdCharacters);
                System.out.println("\nDiscarded Characters:");
                System.out.println(otherCharacters);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimpleFileInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
