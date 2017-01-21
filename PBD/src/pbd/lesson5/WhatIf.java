/*
In this section, you're going to try to guess what you think the if statement is and what it does.

    What do you think the if does to the code under it? Put your answer in a comment in the code.
        The code under the if statement is executed if the if statement evaluates 
        to true
    What is the purpose of the curly braces in the if statement? Answer in a comment.
        The curly braces deliniate the code to execute when the if statement is true.
        The curly braces may be omitted if only 1 line of code is executed when
        the if statement evalates true
    Change the values of the variables so that neither message about cats is printed. 
*/
package pbd.lesson5;

/**
 *
 * @author Paul Peterson
 */
public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 20;
		int dogs = 15;

		if ( people < cats )
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}
