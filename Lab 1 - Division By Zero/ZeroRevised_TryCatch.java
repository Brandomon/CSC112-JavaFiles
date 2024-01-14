//********************************************************************
//  ZeroRevised_TryCatch.java       Author: Pamela J. McCarthy
//
//-----------------------------------------------------------------
//  Deliberately divides by zero to produce an Arithmetic Exception.
//  Demonstrates set up of try/catch block to handle the exception.
//-----------------------------------------------------------------

//********************************************************************

import java.util.Scanner;

public class ZeroRevised_TryCatch
{

   public static void main (String[] args)
   {
      int numerator; 	      //initialize numerator
      int denominator; 	      //initialize illegal denominator
      double quotient;	      //initialize quotient
      boolean done = false;   //initialize while loop sentinel to false
      char again;             //user input to try again after invalid input

      Scanner scanner = new Scanner(System.in);
      
      while (!done)
      {
         try
         {
      	   //get numerator and denominator
         	System.out.print("Enter the numerator followed by <enter> key: ");
         	numerator = scanner.nextInt();
         	//enter a zero for the denominator at least once
         	System.out.print("Enter the denominator followed by <enter> key: ");
         	denominator = scanner.nextInt();         	
         	//perform division
         	quotient = numerator / denominator;
            //set done to true after possible exception
            done = true;
         	//print result of division
            System.out.println (numerator + " / " + denominator + " = " + quotient);
      
         }//end try
   
         catch (ArithmeticException problem)
         {
         	//handle division by zero exception
         	System.out.println ("You have attempted a division by zero.");
         	//Prompt to try again
         	System.out.println("Would you like to try again? (Y/N)");
            again = scanner.next().charAt(0);
            if (again == 'Y' || again == 'y')
            {
               done = false;
            }
            else if (again == 'N' || again == 'n')
            {
               done = true;
            }
            else
            {
               System.out.println ("The input was invalid, please input a \"Y\" or \"N\"...");
               again = scanner.next().charAt(0);
            }            
   
         }//end catch
         
      }//end while not done

   }//end main

}//end class