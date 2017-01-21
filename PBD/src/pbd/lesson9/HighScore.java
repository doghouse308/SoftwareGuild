package pbd.lesson9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pbd.lesson9.LetterRevisited.repeat;

/**
 *
 * @author Paul Peterson
 */
public class HighScore {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("You got a high score!\n");
        System.out.print("Please enter your score:  ");
        int score = Integer.parseInt(kb.next());
        System.out.print("Please enter your Name:  ");
        String name = kb.next();
        try (PrintWriter out = new PrintWriter(new FileWriter("score.txt"))) {
            out.println(name + ", "  + score);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(LetterRevisited.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
