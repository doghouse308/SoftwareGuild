/*
Make a record to store information about a student, which should handle a name,
a grade classification, and an average.

Create three variables of type Student. Read in values for the three students 
and print them out again.

Give the average for all three students.

Do not use an array, and do not use any loops.
 */
package pbd.records;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class BasicRecords {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String student1, student2, student3;
        int gradeLevel1, gradeLevel2, gradeLevel3;
        double average1, average2, average3;

        System.out.print("Enter the first student's name:  ");
        student1 = kb.next();
        System.out.print("Enter the first student's grade: ");
        gradeLevel1 = Integer.parseInt(kb.next());
        System.out.print("Enter the first student's average: ");
        average1 = Double.parseDouble(kb.next());

        System.out.print("Enter the second student's name:  ");
        student2 = kb.next();
        System.out.print("Enter the second student's grade: ");
        gradeLevel2 = Integer.parseInt(kb.next());
        System.out.print("Enter the second student's average: ");
        average2 = Double.parseDouble(kb.next());
        System.out.print("Enter the third student's name:  ");
        student3 = kb.next();
        System.out.print("Enter the third student's grade: ");
        gradeLevel3 = Integer.parseInt(kb.next());
        System.out.print("Enter the third student's average: ");
        average3 = Double.parseDouble(kb.next());

        System.out.println("The names are:  " + student1 + " " + student2
                + " " + student3);
        System.out.println("The grades are: " + gradeLevel1 + " " + gradeLevel2
                + " " + gradeLevel3);
        System.out.println("The averages are: " + average1 + " " + average2
                + " " + average3);
        System.out.println("");
        System.out.println("The average for the three students is: " + ((average1 + average2 + average3) / 3));
    }
    /*
     Esteban Dave Michelle
12 10 11
79.3 91 98.6
     */

}
