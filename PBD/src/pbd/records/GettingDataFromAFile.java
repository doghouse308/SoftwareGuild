
/*
Getting Data from a File

Make a record to store information about a dog. It should contain fields for:

    a breed, which is a String,
    an age, which is an integer, and
    a weight, which is a double 

Using Notepad or the text editor of your choice, create a text file containing 
six pieces of information. Save this file in your home directory.

Create two Dog objects (not in an array).

Ask the user for the name of a file to open, and open that file and read in a 
breed, age, weight, and breed, age, weight from the file.

Display the values you read in.
 */
package pbd.records;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pbd.lesson9.SimpleFileInput;

/**
 *
 * @author Paul Peterson
 */
public class GettingDataFromAFile {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String fileName = "";
        File file = new File(fileName);
        String[] dogs = new String[6];
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
            }
            System.out.println("Reading data from dogs.txt\n");
            dogs = currentLine.split("::");
            Dog dog1 = new Dog(dogs[0], Integer.parseInt(dogs[1]), Double.parseDouble(dogs[2]));
            Dog dog2 = new Dog(dogs[3], Integer.parseInt(dogs[4]), Double.parseDouble(dogs[5]));
            System.out.printf("First dog:  %s, %d, %.1f%n", dog1.getBreed(), dog1.getAge(), dog1.getWeight());
            System.out.printf("Second dog:  %s, %d, %.1f%n", dog2.getBreed(), dog2.getAge(), dog2.getWeight());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimpleFileInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
