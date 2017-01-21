/*
Make a record to store information about a student, which should handle a name, 
a grade classification, and an average.

Create an array of type Student with three slots. Read in values for the three 
students and print them out again.

You must use a for loop.
 */
package pbd.records;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class LilDatabaseLoop {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Student[] students = new Student[3];
        double classTotal = 0;

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("Enter student " + (i + 1) + "'s name:  ");
            students[i].name = kb.next();
            System.out.print("Enter student " + (i + 1) + "'s grade: ");
            students[i].gradeLevel = Integer.parseInt(kb.next());
            System.out.print("Enter student " + (i + 1) + "s average: ");
            students[i].average = Double.parseDouble(kb.next());
            System.out.println("");
        }
        System.out.print("The names are:  ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].name + ", ");
        }
        System.out.println("");
        System.out.print("The grades are:  ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].gradeLevel + ", ");
        }
        System.out.println("");
        System.out.print("The averages are:  ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].average + ", ");
            classTotal += students[i].average;
        }
        System.out.println("");
        System.out.println("The class average is:  " + classTotal / students.length);
    }

}
