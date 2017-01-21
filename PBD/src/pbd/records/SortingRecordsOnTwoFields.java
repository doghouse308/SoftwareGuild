/*
Sorting Records on Two Fields

Make a record to store information about a student's grades. It should contain 
fields for:

    the student, which is identified by a three-digit integer for their 
    "student id number"
    the grade number, which is an integer (1-6)
    the grade, which is a floating-point value (0.0 through 100.0)
    the corresponding letter grade, which should be a String 

I have provided a file filled with grade information. You should create an array 
of records with 30 slots. Read the contents of the file into the array of records.

    gb.txt

Then, rearrange the array so that grades are sorted by grade number within 
student and display the sorted contents.
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
public class SortingRecordsOnTwoFields {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String fileName = "";
        File file = new File(fileName);
        int count = 0;
        Student2[] student = new Student2[30];
        Car[] car = new Car[5];
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
                temp = currentLine.split(" ");
                student[count]
                        = new Student2(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Double.parseDouble(temp[2]), temp[3]);
                count++;
            }
            System.out.println("Reading data from " + fileName + ".\n");
            sortArrayInt(student, "grade");
            sortArrayInt(student, "id");
            System.out.println("Data Sorted");
            System.out.println("\nHere are the sorted grades");
            for (Student2 student1 : student) {
                System.out.println("\t" + student1.getStudentId() + " " 
                        + student1.getGradeNumber() + " " + student1.getGrade()
                        + " " + student1.getLetterGrade());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SortingRecordsOnTwoFields.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static Student2[] sortArrayInt(Student2[] student, String search) {
        Student2 temp = new Student2();
        // Swap the values around to put them ascending order.
        for (int i = 0; i < student.length; i++) {
            for (int j = i + 1; j < student.length; j++) {
                switch (search) {
                    case "grade":
                        if (student[j].getGradeNumber() < student[i].getGradeNumber()) {
                            // swap the values in two slots
                            temp = student[i];
                            student[i] = student[j];
                            student[j] = temp;
                        }
                    case "id":
                        if (student[j].getStudentId()< student[i].getStudentId()) {
                            // swap the values in two slots
                            temp = student[i];
                            student[i] = student[j];
                            student[j] = temp;
                        }
                }
            }
        }
        return student;
    }
}
