package pbd.lesson7;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class Keychains1 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int keychains = 0, selection = 0;

        System.out.println("Ye Olde Keychain Shoppe\n");
        while (selection != 4) {

            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove keychains from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout\n");
            System.out.print("Please enter your choice:  ");
            selection = Integer.parseInt(kb.next());
            if (selection < 1 || selection > 4) {
                System.out.println("\nPlease make a valid selection.\n");
            }
            
            switch (selection){
                case 1:
                    addKeychains();
                    break;
                case 2:
                    removeKeychains();
                    break;
                case 3:
                    viewOrder(keychains);
                    break;
                case 4:
                    checkout(keychains);
                    break;
                default:
                    System.out.println("Invalid Entry");
                    break;
            }
        }
    }

    public static int addKeychains() {
        int keychains = 0;
        System.out.println("Add Keychains...");
        return keychains;
    }

    public static int removeKeychains() {
        int keychains = 0;
        System.out.println("Remove Keychains...");
        return keychains;
    }
    
    public static void viewOrder(int keychains){
        System.out.println("Current Order...");
    }
    
    public static void checkout(int keychains){
        
        System.out.println("Checkout...");
    }
}
