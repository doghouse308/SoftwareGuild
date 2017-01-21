/*
Modify the version of WindowMaster completed in class so that it prompts the 
user for the cost of the glass and the cost of the trim. Add code so that it
also prints out these material costs.
 */
package swgjavabasics.lesson3;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class WindowMaster2 {

    public static void main(String[] args) {

        //initialize Scanner
        Scanner kb = new Scanner(System.in);

        //declare variables
        float height, width, areaOfWindow, trimCost, glassCost, totalCost,
                perimeterOfWindow;

        //get input from user
        System.out.print("Please enter the window height:  ");
        height = Float.parseFloat(kb.nextLine());
        System.out.print("Please enter the window width:  ");
        width = Float.parseFloat(kb.nextLine());
        System.out.print("Please enter the trim cost per foot:  ");
        trimCost = Float.parseFloat(kb.nextLine());
        System.out.print("Please enter the glass cost per square foot:  ");
        glassCost = Float.parseFloat(kb.nextLine());

        //calculate area of window
        areaOfWindow = height * width;

        //calculate perimeter of window
        perimeterOfWindow = 2 * (height + width);

        //calculate total cost
        totalCost = ((areaOfWindow * glassCost) + (perimeterOfWindow * trimCost));

        System.out.printf("Window height = %.2f%n", height);
        System.out.printf("Window width = %.2f%n", width);
        System.out.printf("Window perimeter = %.2f%n", perimeterOfWindow);
        System.out.printf("Window area = %.2f%n", areaOfWindow);
        System.out.printf("Trim Cost per foot = $%.2f%n", trimCost);
        System.out.printf("Glass Cost square per foot = $%.2f%n", glassCost);
        System.out.printf("Total Cost = $%.2f%n", totalCost);
    }
}
