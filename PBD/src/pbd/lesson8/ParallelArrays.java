package pbd.lesson8;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class ParallelArrays {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String[] name = {"Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks"};
        double[] grade = {99.5, 78.5, 95.6, 96.8, 82.7};
        int[] id = {123456, 813225, 823669, 307760, 827131};
        int value, location;

        System.out.println("Values:");
        displayArrays(name, grade, id);
        System.out.print("\nID number to find:  ");
        value = Integer.parseInt(kb.next());
        location = isInArray(id, value);
        if (location != -1){
            displayResults(name, grade, id, location);
        } else {
            System.out.printf("ID %d is not in the array.%n", value);            
        }
    }

    public static int isInArray(int[] n, int value) {
        for (int i = 0; i < n.length; i++) {
            if (value == n[i]) {
                return i;
            }
        }
        return -1;
    }
    
    public static void displayArrays(String[] name, double [] grade, int [] id){
        
        for (int i = 0; i < name.length; i++){
            System.out.println("\t" + name[i] + " " + grade[i] + " " + id[i]);
        }
    }
    
    public static void displayResults(String[] name, double [] grade, int [] id, int loc){
        System.out.println("\nFound in slot " + loc);
        System.out.println("\tName:  " + name[loc]);  
        System.out.println("\tAverage:  " + grade[loc]);  
        System.out.println("\tName:  " + name[loc]);  
        
    }

}
