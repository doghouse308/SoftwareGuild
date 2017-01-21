/*
Summing Several Numbers from Any File

Create a few more files in Notepad containing some integers separated by some 
whitespace. Save them in your home directory as "4nums.txt", "5nums.txt",
"6nums.txt", etc.

Then write a program that asks the user which file to open. Then it should open 
that file, and read in and total up all the integers from that file.

You won't be able to store each number in its own variable anymore. Instead, 
you'll need to use a loop, and reuse the same variable over and over. You'll have to add up the numbers as you go.
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
public class SummingSeveralNumbersFromAnyFile {
    
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
