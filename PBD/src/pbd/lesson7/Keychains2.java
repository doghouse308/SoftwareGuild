package pbd.lesson7;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class Keychains2 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        final int PRICE = 10;
        final double SALES_TAX = .0825;
        final int BASE_SHIPPING = 5;
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

            switch (selection) {
                case 1:
                    keychains = addKeychains(keychains);
                    break;
                case 2:
                    keychains = removeKeychains(keychains);
                    break;
                case 3:
                    viewOrder(keychains, PRICE, SALES_TAX, BASE_SHIPPING);
                    break;
                case 4:
                    checkout(keychains, PRICE, SALES_TAX, BASE_SHIPPING);
                    break;
                default:
                    System.out.println("Invalid Entry");
                    break;
            }
        }
    }

    public static int addKeychains(int quantity) {
        int keychains = -1;
        while (keychains < 0) {
            System.out.printf("%nYou have %d keychains.  How many to add?  ", quantity);
            keychains = Integer.parseInt(kb.next());
            if (keychains < 0) {
                System.out.println("Please enter a number greater than 0.");
            }
        }
        keychains += quantity;
        System.out.printf("You now have %d keychains.%n%n", keychains);
        return keychains;
    }

    public static int removeKeychains(int quantity) {
        int remKeychains = -1;
        while (remKeychains < 0) {
            System.out.printf("%nYou have %d keychains.  How many to remove?  ", quantity);
            remKeychains = Integer.parseInt(kb.next());
            if (remKeychains < 0) {
                System.out.println("Please enter a number greater than 0.");
            }
        }
        int keychains = quantity - remKeychains;
        System.out.printf("You now have %d keychains.%n%n", keychains);
        return keychains;
    }

    public static void viewOrder(int keychains, int price, double tax, int shipping) {
        double salesTax = keychains * price * tax;
        int shippingCost = shipping + keychains;
        double total = (keychains * price) + salesTax + shippingCost;
        System.out.printf("%nYou have %d keychains.%n", keychains);
        System.out.printf("Keychains cost $%d each.%n", price);
        System.out.printf("Sales Tax $%.2f each.%n", salesTax);
        System.out.printf("Shipping $%d each.%n", shippingCost);
        System.out.printf("Total Cost is $%.2f.%n%n", total);
    }

    public static void checkout(int keychains, int price, double tax, int shipping) {
        String name;
        double salesTax = keychains * price * tax;
        int shippingCost = shipping + keychains;
        double total = (keychains * price) + salesTax + shippingCost;
        System.out.print("What is your name?  ");
        name = kb.next();
        System.out.printf("%nYou have %d keychains.%n", keychains);
        System.out.printf("Keychains cost $%d each.%n", price);
        System.out.printf("Sales Tax $%.2f each.%n", salesTax);
        System.out.printf("Shipping $%d each.%n", shippingCost);
        System.out.printf("Total Cost is $%.2f.%n%n", total);
        System.out.printf("Thank you for your order, %s.%n", name);
    }
}
