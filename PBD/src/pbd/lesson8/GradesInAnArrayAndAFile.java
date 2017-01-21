package pbd.lesson8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class GradesInAnArrayAndAFile {

    public static void main(String[] args) throws IOException {

        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        String fileName = "", name, grades = "";
        int [] grade = new int[5];
        
        System.out.print("Name (First Last):  ");
        name = kb.nextLine();
        System.out.print("File Name:  ");
        fileName = kb.nextLine();
        System.out.println("\nHere are your randomly-selected grades (hope you pass):\n");
        for (int i = 0; i < grade.length; i++){
            grade[i] = 1 + r.nextInt(100);
            System.out.printf("Grade %d:  %d%n", (i + 1), grade[i]);
            grades += grade[i] + "  ";
        }
        

        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
            out.println(name);
            out.println(grades);
            out.flush();
        }
    }
}
