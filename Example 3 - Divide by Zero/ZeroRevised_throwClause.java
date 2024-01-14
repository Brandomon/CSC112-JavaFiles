//********************************************************************
//  ZeroRevised_throwClause.java       Author: Pamela J. McCarthy
//
//-----------------------------------------------------------------
//  Deliberately divides by zero to produce an Arithmetic Exception.
//  Demonstrates set up of the throws clause to handle the exception.
//-----------------------------------------------------------------

//********************************************************************

import java.util.Scanner;

public class ZeroRevised_throwClause
{

   public static void main (String[] args) throws ArithmeticException
   {
	  int numerator; 	//initialize numerator
	  int denominator; 	//initialize illegal denominator
	  double quotient;	//initialize quotient

	  Scanner scanner = new Scanner(System.in);

		//get numerator and denominator
		System.out.print("Enter the numerator followed by <enter> key: ");
		numerator = scanner.nextInt();
		//enter a zero for the denominator at least once
		System.out.print("Enter the denominator followed by <enter> key: ");
		denominator = scanner.nextInt();

		//Declare exception with user defined message
		ArithmeticException problem = new ArithmeticException();

		//attempt division
		if (denominator == 0) //if illegal denominator
		{
			//handle division by zero exception
			System.out.println ("You have attempted a division by zero.");

			//throw division by zero exception
			throw problem;
		}
		else
		{
			quotient = numerator / denominator;

			//print result of division
			System.out.println (numerator + " / " + denominator + " = " + quotient);
		}// end if

   }//end main



}//end class