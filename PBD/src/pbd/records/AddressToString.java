/*
If you want, you can add a toString() method to a record. The function should 
return a String showing how the record should be printed. Using a toString() 
method makes printing records much easier.

Assignments turned in without these things will receive half credit or less.

    What happens if the function is renamed from toString() to something else? 
    Answer in a comment, then change it back.
    The toString() method given does not display the state field. 
    Fix it so that it does. 
 */
package pbd.records;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
class Address
{
	String street;
	String city;
	String state;
	int zip;
        
        //if the tsString method is renamed, the print statement on line 60 will
        //print the hash value of the object
        @Override
	public String toString()
	{
		return (this.street + ", " + this.city + ",  " + this.state + " " + this.zip);
	}
}

public class AddressToString
{
	public static void main(String[] args) throws Exception
	{
		URL addys = new URL("https://cs.leanderisd.org/txt/fake-addresses.txt");

		Address[] addybook = new Address[5];

		Scanner fin = new Scanner( addys.openStream() );

		for ( int i=0; i<5; i++ )
		{
			addybook[i] = new Address();
			addybook[i].street = fin.nextLine();
			addybook[i].city   = fin.nextLine();
			addybook[i].state  = fin.next();
			addybook[i].zip    = fin.nextInt();
			fin.skip("\n");
		}
		fin.close();
		
		for ( int i=0; i<5; i++ )
		{
			System.out.println( (i+1) + ". " + addybook[i] );
		}
	}
}
