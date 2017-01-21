/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.lesson9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class SimpleFileInput {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(
                    new BufferedReader(new FileReader("name.txt")));
        // go through the file line by line
            while (sc.hasNextLine()) {
                String currentLine = sc.nextLine();
                System.out.println(currentLine);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimpleFileInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
