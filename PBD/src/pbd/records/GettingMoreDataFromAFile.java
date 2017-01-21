/*
Getting More Data from a File

Using Notepad or the text editor of your choice, create a text file containing
five names and five ages. Save this file in your home directory.

Make a record to store information about a person. It should contain fields for:

    a single name, which is a String, and
    an age, which is an integer 

Create an array of type Person with five slots.

Ask the user for the name of a file to open, and open that file and read in five
names and ages from the file.

Display the contents of the array using a loop.
 */
package pbd.records;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pbd.lesson9.Person;
import pbd.lesson9.SimpleFileInput;

/**
 *
 * @author Paul Peterson
 */
public class GettingMoreDataFromAFile {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String fileName = "";
        File file = new File(fileName);
        int count = 0;
        Person[] person = new Person[5];
        String [] temp = new String[2];
        String currentLine = "";
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
                currentLine = sc.nextLine();
                temp = currentLine.split("::");
                person[count] = new Person(temp[0], Integer.parseInt(temp[1]));
                count++;
            }
            System.out.println("Reading data from " + fileName + ".\n");
            for (Person person1 : person) {
                System.out.printf("%s is %d.%n", person1.getName(), person1.getAge());                
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimpleFileInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
