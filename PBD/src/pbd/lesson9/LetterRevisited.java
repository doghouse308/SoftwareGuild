/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.lesson9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class LetterRevisited {

    public static void main(String[] args) {
        final int WIDTH = 60;
        String address1 = "Paul Peterson";
        String address2 = "3652 Eakins Rd.";
        String address3 = "Cuyahoga Falls, OH 44223";
        try (PrintWriter out = new PrintWriter(new FileWriter("letter.txt"))) {
            out.println("+" + repeat("-", 58) + "+");
            out.println("|" + repeat(" ", 53) + "#### |");
            out.println("|" + repeat(" ", 53) + "#### |");
            out.println("|" + repeat(" ", 53) + "#### |");
            out.println("|" + repeat(" ", 58) + "|");
            out.println("|" + repeat(" ", 30) + address1 + repeat(" ", 28 - address1.length()) + "|");
            out.println("|" + repeat(" ", 30) + address2 + repeat(" ", 28 - address2.length()) + "|");
            out.println("|" + repeat(" ", 30) + address3 + repeat(" ", 28 - address3.length()) + "|");
            out.println("|" + repeat(" ", 58) + "|");
            out.println("+" + repeat("-", 58) + "+");
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(LetterRevisited.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}
