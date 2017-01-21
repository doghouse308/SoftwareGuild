
package pbd.lesson5;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class Adventure1 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String choice;

        System.out.println("Welcome to the Adventure's cave");
        System.out.println("You are in front of the cave entrance. The entrance is North"
                + " and the trail to the Main Hall is South.");
        System.out.print("Pick direction (n or s):  ");
        choice = kb.next();
        if (choice.equalsIgnoreCase("n")) {
            System.out.println("You are in a wide cavern.");
            System.out.println("There are doors to the East and North.");
            System.out.print("Pick direction (e or n):  ");
            choice = kb.next();
            if (choice.equalsIgnoreCase("e")) {
                System.out.println("You are in a small chamber with barred windows "
                        + "on the south and north walls.\nThere is a small table with "
                        + "a book and leather flask.  A troll is hiding in the corner."
                        + "\nThere are steps leading up and down.");
                System.out.print("Pick direction (u or d):  ");
                choice = kb.next();
                if (choice.equalsIgnoreCase("u")) {
                    System.out.println("You are at the top of the tower.  You can see the "
                            + "trail back to the main hall.\nThere is a large"
                            + " lake to the west.");
                } else {
                    System.out.println("You are on a beach at the edge of a large"
                            + "lake.");
                }

            } else {
                System.out.println("You are in the dungeon.  A long corridor with"
                        + "locked cells on both walls.\nThe exit is to the south."
                        + "\nThe last two cells at the end of the corridor are slightly"
                        + "ajar.");
                System.out.print("Enter the cell on the left or right (l or r) ?  ");
                choice = kb.next();
                if (choice.equalsIgnoreCase("l")) {
                    System.out.println("You are in a small empty cell.  It looks"
                            + " like the previous resident escaped\n through a "
                            + "hole in the floor");
                } else {
                    System.out.println("You are in a small empty cell.  A crazy"
                            + " looking man sits on the edge of the bed playing "
                            + "with a large knife");
                }
            }

        } else {
            System.out.println("You are in the main hall.  The armory is to the "
                    + "left and the training ground is to the left");
            System.out.print("Pick direction (l or r):  ");
            choice = kb.next();
            if (choice.equalsIgnoreCase("l")) {
                System.out.println("You have endered the trading post.  The armory "
                        + "is to the west and a shop selling armor is to the east.");
                System.out.print("Pick direction (e or n):  ");
                choice = kb.next();
                if (choice.equalsIgnoreCase("w")) {
                    System.out.println("You are in a small shop with weapons stacked"
                            + " throughout the room and haning from the walls.");
                } else {
                    System.out.println("You have entered the armor shop.  The "
                            + "shop keeper looks at your armor with a scoul and \n"
                            + "says, \"How do you expect to survive your adventures"
                            + "dressed like that?\"");
                }
            } else {
                System.out.println("You have entered the training ground.\n"
                        + "A scouling warrior waits to the left selling weapons"
                        + " training.\nTo the right is an old scorcerer stirring "
                        + "a cauldron.  The sign over the door reads\n"
                        + "\"Voldemort's vexing potions\"");
                System.out.print("Pick direction (l or r):  ");
                choice = kb.next();
                if (choice.equalsIgnoreCase("l")) {
                    System.out.println("The burly warrior promptly pummels you.\n"
                            + "When you rocover he asks, \"Are you ready to begin "
                            + "your training?\"");
                } else {
                    System.out.println("As you cross the threshold, the scorcerer "
                            + "screams, \"How dare you interrupt me!!\" and you "
                            + "realize that you have been transformed into a toad.");
                }
            }
        }
    }

}
