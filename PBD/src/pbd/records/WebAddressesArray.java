/*
Records are nice, but they're even better when used with an array or arraylist.

The code provided does the same as the previous assignment, but uses an array 
of records, instead of one variable for each record.
 */
package pbd.records;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
//class Address
//{
//	String street;
//	String city;
//	String state;
//	int zip;
//}
public class WebAddressesArray {

    public static void main(String[] args) throws Exception {
        URL addys = new URL("https://cs.leanderisd.org/txt/fake-addresses.txt");
        int num = 6;
        Address[] addybook = new Address[num];

        Scanner fin = new Scanner(addys.openStream());

        for (int i = 0; i < addybook.length; i++) {
            addybook[i] = new Address();
            addybook[i].street = fin.nextLine();
            addybook[i].city = fin.nextLine();
            addybook[i].state = fin.next();
            addybook[i].zip = fin.nextInt();
            fin.skip("\n");
        }
        fin.close();

        for (int i = 0; i < addybook.length; i++) {
            System.out.println((i + 1) + ". " + addybook[i].street + ", " + addybook[i].city + ", " + addybook[i].state + "  " + addybook[i].zip);
        }
    }
}
