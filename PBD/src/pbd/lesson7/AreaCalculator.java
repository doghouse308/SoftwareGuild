package pbd.lesson7;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class AreaCalculator {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        int selection = 0;

        System.out.println("Shape Area Calculator\n");

        while (selection != 5) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            System.out.println("\t1)  Triangle");
            System.out.println("\t2)  Rectangle");
            System.out.println("\t3)  Square");
            System.out.println("\t4)  Circle");
            System.out.println("\t5)  Quit");
            System.out.print("\nWhich Shape:  ");
            selection = Integer.parseInt(kb.next());
            
            switch (selection){
                case 1:
                    triangleArea();
                    break;
                case 2:
                    rectangleArea();
                    break;
                case 3:
                    squareArea();
                    break;
                case 4:
                    circleArea();
                    break;
                case 5:
                    System.out.println("\nGoodbye!");
                    break;
                default:
                    System.out.println("Invalid Entry");
                    break;
            }
        }
    }

    public static void triangleArea() {

        double base, height;
        System.out.println("");
        System.out.print("Base:  ");
        base = Double.parseDouble(kb.next());
        System.out.print("Height:  ");
        height = Double.parseDouble(kb.next());
        System.out.println("");
        System.out.println("The area of your triangle is:  " + (base * height) / 2);
        System.out.println("");
    }

    public static void rectangleArea() {

        double length, width;
        System.out.println("");
        System.out.print("Length:  ");
        length = Double.parseDouble(kb.next());
        System.out.print("Width:  ");
        width = Double.parseDouble(kb.next());
        System.out.println("");
        System.out.println("The area of your rectangle is:  " + (length * width));
        System.out.println("");
    }

    public static void squareArea() {

        double side;
        System.out.println("");
        System.out.print("Side:  ");
        side = Double.parseDouble(kb.next());
        System.out.println("");
        System.out.println("The area of your rectangle is:  " + (side * side));
        System.out.println("");
    }

    public static void circleArea() {

        double radius;
        System.out.println("");
        System.out.print("Radius:  ");
        radius = Double.parseDouble(kb.next());
        System.out.println("");
        System.out.println("The area of your rectangle is:  " + (Math.PI * Math.pow(radius, 2)));
        System.out.println("");
    }
}
