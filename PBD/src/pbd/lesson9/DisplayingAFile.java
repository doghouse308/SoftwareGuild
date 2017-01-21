/*
Displaying a File

Ask the user for the name of a file to open. Open that file, and display the
entire contents of the file on the screen.

You must do this a line at a time using nextLine() and a loop that checks hasNext().
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
public class DisplayingAFile {
    
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
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
            while (sc.hasNext()) {
                String currentLine = sc.nextLine();
                System.out.println(currentLine);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimpleFileInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
