/*
Make a record to store information about a student, which should handle a name,
a grade classification, and an average.

Create an array of type Student with three slots. Read in values for the three 
students and print them out again.

You may not use a loop.
 */
package pbd.records;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
class Student {

    String name;
    int gradeLevel;
    double average;

}

public class LilDatabase {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Student[] students = new Student[3];

        students[0] = new Student();
        System.out.print("Enter the first student's name:  ");
        students[0].name = kb.next();
        System.out.print("Enter the first student's grade: ");
        students[0].gradeLevel = Integer.parseInt(kb.next());
        System.out.print("Enter the first student's average: ");
        students[0].average = Double.parseDouble(kb.next());
        System.out.println("");
        students[1] = new Student();
        System.out.print("Enter the second student's name:  ");
        students[1].name = kb.next();
        System.out.print("Enter the second student's grade: ");
        students[1].gradeLevel = Integer.parseInt(kb.next());
        System.out.print("Enter the second student's average: ");
        students[1].average = Double.parseDouble(kb.next());
        System.out.println("");
        students[2] = new Student();
        System.out.print("Enter the third student's name:  ");
        students[2].name = kb.next();
        System.out.print("Enter the third student's grade: ");
        students[2].gradeLevel = Integer.parseInt(kb.next());
        System.out.print("Enter the third student's average: ");
        students[2].average = Double.parseDouble(kb.next());
        System.out.println("");
        System.out.println("The names are:  " + students[0].name + " " + students[1].name
                + " " + students[2].name);
        System.out.println("The grades are: " + students[0].gradeLevel + " " + students[1].gradeLevel
                + " " + students[2].gradeLevel);
        System.out.println("The averages are: " + students[0].average + " " + students[1].average
                + " " + students[2].average);
        System.out.println("");
        System.out.println("The average for the three students is: " + ((students[0].average + students[1].average + students[2].average) / 3));

    }

}
