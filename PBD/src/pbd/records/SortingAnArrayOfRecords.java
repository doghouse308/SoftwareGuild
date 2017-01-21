/*
Sorting an Array of Records

Repeat the previous assignment. However, once you've read in the car data from 
the file, then sort the array of cars by year. Then, print it out (now sorted).
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
public class SortingAnArrayOfRecords {

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
            sortArrayInt(car);
            count = 1;
            for (Car car1 : car) {
                System.out.println("Car " + count);
                System.out.println("\tMake:  " + car1.getMake());
                System.out.println("\tModel:  " + car1.getModel());
                System.out.println("\tYear:  " + car1.getYear());
                System.out.println("\tLicense:  " + car1.getLicensePlate());
                count++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SortingAnArrayOfRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static Car[] sortArrayInt(Car[] car) {
        Car temp = new Car();
        // Swap the values around to put them ascending order.
        for (int i = 0; i < car.length; i++)
        {
            for (int j = i + 1; j < car.length; j++)
            {
                if (car[j].getYear() < car[i].getYear()) {
                    // swap the values in two slots
                    temp = car[i];
                    car[i] = car[j];
                    car[j] = temp;
                }
            }
        }
        return car;
    }

}
