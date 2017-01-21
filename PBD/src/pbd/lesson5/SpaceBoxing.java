
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class SpaceBoxing {

    static double weight;
    static int planet;
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        setWeight();
        getPlanet();
        outputResults(planet);
    }
    public static void setWeight() {
        System.out.print("Please enter your current earth weight:  ");
        weight = kb.nextInt();
    }
    public static double getWeight() {
        return weight;
    }
    public static int getPlanet() {
        boolean valid = false;
        while (!valid) {
            System.out.println("I have information for the following planets:");
            System.out.println("\t1. Venus\t2. Mars\t\t3. Jupiter");
            System.out.println("\t4. Saturn\t5. Uranus\t6. Neptune\n\n");
            System.out.println("Which planet are you visiting?  (1 - 6)");
            planet = kb.nextInt();
            if (planet < 1 || planet > 6) {
                System.out.println("I don't know where you want to go");
                System.out.println("Please select a valid planet (1 - 6)\n");
            }else valid = true;
        }

        return planet;
    }
    public static void outputResults(int planet) {
        String planetName;
        double relativeGravity;
        switch (planet) {
            case 1:
                planetName = "Venus";
                relativeGravity = .78;
                break;
            case 2:
                planetName = "Mars";
                relativeGravity = .39;
                break;
            case 3:
                planetName = "Jupiter";
                relativeGravity = 2.65;
                break;
            case 4:
                planetName = "Saturn";
                relativeGravity = 1.17;
                break;
            case 5:
                planetName = "Uranus";
                relativeGravity = 1.05;
                break;
            default:
                planetName = "Neptune";
                relativeGravity = 1.23;
        }
        System.out.println("On " + planetName + " you weigh "
                + (getWeight() * relativeGravity) + " pounds.");
    }
}