/*
Storing Data in a File

Make a record to store information about a car. It should contain fields for:

    the make, which is a string
    the model, which is a string
    the year, which is an integer
    the license-plate number, which is a string 

Create an array of type Car with five slots. Have the user type in values to 
fill up the array.

Ask the user for the name of a file, and then open that file and output all the 
data from the array to that file.

Use Notepad or some other text editor to confirm that the data is correctly in 
the file. Be careful to only put data in the file, and not labels.
 */
package pbd.records;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pbd.lesson9.LetterRevisited;

/**
 *
 * @author Paul Peterson
 */
public class StoringDataInAFile {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String make;
        String model;
        String plate;
        String fileName;
        int year;

        Car[] car = new Car[5];

        for (int i = 0; i < car.length; i++) {
            System.out.println("Car " + (i + 1));
            System.out.print("\tMake:  ");
            make = kb.next();
            System.out.print("\tModel:  ");
            model = kb.next();
            System.out.print("\tYear:  ");
            year = Integer.parseInt(kb.next());
            System.out.print("\tLicense:  ");
            plate = kb.next();
            car[i] = new Car(make, model, year, plate);
        }

        System.out.print("Enter file name to save data:  ");
        fileName = kb.next();
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
            for (Car car1 : car) {
                out.println(car1.encode(car1));
            }
            out.flush();
            System.out.println("Data Saved");
        } catch (IOException ex) {
            Logger.getLogger(StoringDataInAFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
