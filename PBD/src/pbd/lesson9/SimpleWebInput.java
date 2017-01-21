/*
Simple Web Input

In Java, reading text from a web page isn't much more difficult than reading 
from a text file! Download the following code and get it to compile.

What You Should Do on Your Own

Assignments turned in without these things will receive half credit or less.

    The code provided only reads a single line from the URL given, but 
    mitchellis.txt contains two lines. Add in code to read in and display the second 
    line as well.
    Once that works, change the URL to read text from a different web location. 
 */
package pbd.lesson9;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class SimpleWebInput {

    public static void main(String[] args) throws Exception {
        URL mcool = new URL("https://cs.leanderisd.org/mitchellis.txt");
        String one;
        try (Scanner webIn = new Scanner(mcool.openStream())) {
            while (webIn.hasNext()) {
                String currentLine = webIn.nextLine();
                System.out.println(currentLine);
            }
        }
    }
}
