
/*
Sorting an ArrayList of Records

Make a record to store information about a car. (This should seem familiar.) 
It should contain fields for:

    the make (String)
    the model (String)
    the year (int)
    the license-plate number (String) 

Create an ArrayList of Car objects.

Ask the user for the name of a file, and then open that file and read all that 
data from that file into the ArrayList.

Finally, sort the ArrayList of cars by year and print them out. 
(Note: Printing them the "easy" way won't work unless you've added a toString()
method to the Car object.)
 */
package pbd.arraylists;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pbd.records.Car;
import pbd.records.ReadingWhatYouWrote;

/**
 *
 * @author Paul Peterson
 */
public class SortingAnArraylistOfRecords {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String fileName = "";
        File file = new File(fileName);
        int count = 1;
        ArrayList<Car> car = new ArrayList<>();
        Car c = new Car();
//        Car[] car = new Car[5];
        String[] temp = new String[4];
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
                c = new Car(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3]);
                car.add(c);
            }
            sortArrayInt(car);
            System.out.println("Reading data from " + fileName + ".\n");
            for (Car car1 : car) {
                System.out.println("Car " + count);
                System.out.println("\tMake:  " + car1.getMake());
                System.out.println("\tModel:  " + car1.getModel());
                System.out.println("\tYear:  " + car1.getYear());
                System.out.println("\tLicense:  " + car1.getLicensePlate());
                count++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadingWhatYouWrote.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static ArrayList<Car> sortArrayInt(ArrayList<Car> car) {
        Car temp = new Car();
        // Swap the values around to put them ascending order.
        for (int i = 0; i < car.size(); i++) {
            for (int j = i + 1; j < car.size(); j++) {
                if (car.get(j).getYear() < car.get(i).getYear()) {
                    // swap the values in two slots
                    temp = car.get(i);
                    //car.remove(i);
                    car.set(i, car.get(j));
                    //car.remove(j);
                    car.set(j, temp);
                }
            }
        }
        return car;
    }

}
