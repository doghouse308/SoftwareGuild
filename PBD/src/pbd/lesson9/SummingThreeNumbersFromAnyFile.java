/*
Summing Three Numbers from Any File

Create several more files in Notepad containing three integers separated by some
whitespace. Save them in your home directory as "3nums1.txt", "3nums2.txt", 
"3nums3.txt", etc.

Then write a program that asks the user which file to open. Then it should open
that file, and read the three integers from the file. It should then display 
(on the screen) the total of the integers.
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
public class SummingThreeNumbersFromAnyFile {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int total = 0;
        String fileName = "";
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
