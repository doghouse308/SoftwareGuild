/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swgjavabasics.lesson3;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class WindowMaster {

    public static void main(String[] args) {

        //declare variables
        float height, width, areaOfWindow, cost, perimeterOfWondow;
        String stringHeight, stringWidth;

        //initialize Scanner
        Scanner kb = new Scanner(System.in);

        //get input from user
        System.out.print("Please enter the window height:  ");
        stringHeight = kb.nextLine();
        System.out.print("Please enter the window width:  ");
        stringWidth = kb.nextLine();
        
        //convert String variables to float
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        //calculate area of window
        areaOfWindow = height * width;
        
        //calculate perimeter of window
        perimeterOfWondow = 2 * (height + width);
        
        //calculate total cost
        cost = ((3.5f * areaOfWindow) + (2.25f * perimeterOfWondow));
        
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWondow);
        System.out.println("Total Cost = " + cost);
    }
}
