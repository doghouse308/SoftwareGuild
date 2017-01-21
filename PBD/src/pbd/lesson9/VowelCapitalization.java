/*
Vowel Capitalization

Open a file specified by the user. Read in each line from the file, one at a 
time. Then use charAt() and a loop to process that line one character at a time.

If the character is a consonant, simply display it as-is on the screen. If the 
character is a lower-case vowel (a,e,i,o,u), display it as a CAPITAL LETTER 
instead. This is going to take some if statements.

You can try the sample input file vowels.txt to see what your program does. 
You could also test it on any other file you like.
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
public class VowelCapitalization {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String fileName = "";
        String outputLine = "";
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
            while (sc.hasNextLine()) {
                String currentLine = sc.nextLine();
                for (int i = 0; i < currentLine.length(); i++) {
                    if ((Character.toString(currentLine.charAt(i))).equalsIgnoreCase("a")
                            || (Character.toString(currentLine.charAt(i))).equalsIgnoreCase("e") 
                            || (Character.toString(currentLine.charAt(i))).equalsIgnoreCase("i")
                            || (Character.toString(currentLine.charAt(i))).equalsIgnoreCase("o")
                            || (Character.toString(currentLine.charAt(i))).equalsIgnoreCase("u")){
                        outputLine += Character.toString(currentLine.charAt(i)).toUpperCase();
                    } else {
                        outputLine += Character.toString(currentLine.charAt(i));
                    }
                }
                System.out.println(outputLine);
                outputLine = "";
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimpleFileInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
