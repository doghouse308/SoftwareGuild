/*
First, create a file in Notepad containing three integers separated by some 
whitespace. Save it as "3nums.txt" in the same folder as your code.

Then write a program that reads three integers from the file 3nums.txt and 
displays (on the screen) the total of the integers.
 */
package pbd.lesson9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class SummingThreeNumbersFromAFile {

    public static void main(String[] args) {
        int total = 0;


        try {
            Scanner sc = new Scanner(
                    new BufferedReader(new FileReader("3nums.txt")));
            // go through the file line by line
            while (sc.hasNextLine()) {
                String currentLine = sc.nextLine();
                int currentNum = Integer.parseInt(currentLine);
                total += currentNum;
                if (sc.hasNextLine()) {
                    System.out.print(currentNum + " + ");
                } else {
                    System.out.println(currentNum + " = " + total);
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimpleFileInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
