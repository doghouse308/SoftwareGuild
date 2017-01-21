/*
Reading What You Wrote

Again, make a record to store information about a car. It should contain fields for:

    the make, which is a String
    the model, which is a String
    the year, which is an integer
    the license-plate number, which is a String 

Create an array of type Car with five slots. (So far, this is the same as the 
previous assignment.)

Ask the user for the name of a file, and then open that file and read all the
data from that file into the array.

Finally, display the values in the array.
 */
package pbd.records;

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
public class ReadingWhatYouWrote {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String fileName = "";
        File file = new File(fileName);
        int count = 0;
        Car[] car = new Car[5];
        String[] temp = new String[2];
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
                car[count] = new Car(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3]);
                count++;
            }
            System.out.println("Reading data from " + fileName + ".\n");
            count = 1;
            for (Car car1 : car) {
                System.out.println("Car " + count);
                System.out.println("\tMake:  " + car1.getMake());
                System.out.println("\tModel:  " + car1.getModel());
                System.out.println("\tYear:  " + car1.getYear());
                System.out.println("\tLicense:  " + car1.getLicensePlate());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadingWhatYouWrote.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
