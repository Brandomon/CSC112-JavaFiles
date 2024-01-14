//********************************************************************
//  BulbDriver.java  Java Foundations
//  Author         : Brandon LaPointe
//  Date           : 02/11/2021
//  Course/Section : CSC 112
//  Program Description:  This driver will test the methods within the
//       external Class named Bulb.
//********************************************************************

//This is a Driver program to test the external Class named Bulb
import java.util.Scanner;

public class BulbDriver //BEGIN Class Definition
{
 //****************  Main Method*************************
 public static void main (String[] args)
 {
    //Data Definitions:

    //Instance Data
    final int ON = 1;
    final int OFF = 2;
    final int STATUS = 3;
    final int EXIT = 4;
    boolean state;    //State of lightbulb as true or false
    int choice;       //User menu choice of 1-4
    Scanner scan = new Scanner(System.in);    

    //Executable Statements:

    //instantiate the Bulb object
    Bulb lightBulb1 = new Bulb();

    //Call Menu for Bulb
    choice = userMenu();
 
    //While loop for menu options input by user
    while (choice != EXIT)
    {
        if (choice == ON)
        {
             lightBulb1.on();
             System.out.println ("\n*Click*");
             System.out.print ("\n");
        }
        else if (choice == OFF)
        {
             lightBulb1.off();
             System.out.println ("\n*Click*");
             System.out.print ("\n");
        }
        else if (choice == STATUS)
        {             
             if (lightBulb1.status() == true)
             {
             System.out.println ("\nThe lightbulb is currently on.\n");
             }
             else
             {
             System.out.println ("\nThe lightbulb is currently off.\n");
             }
        }
        else
        {
             System.out.println ("\nThe input number is not within the menu limits. Please try again...\n");
        }
        choice = userMenu();         
     }


  }//end main
  
  /**********************************************************
	* Method Name	  : userMenu
	* Author         : Brandon LaPointe
	* Date           : 02/03/2021
	* Course/Section : CSC 112
	* Program Description:  This method will display a menu for
	*	 the user to choose to either turn the bulb on, off, check
   *   status of the bulb, or exit.
	*
	* BEGIN UserMenu
	*	 Display the menu
	*	 Input user selection
	*	 Return user selection
	* END UserMenu
	**********************************************************/

	public static int userMenu()
	{
		//local constants

		//local variables
		int userSelection;			//User input of menu choice (1-4)
		Scanner scan = new Scanner(System.in);

		/*****************************************************/
      
      //Display the menu
		System.out.println ("Please select one of the following:");
      System.out.println ("1.) Turn the light bulb on");
      System.out.println ("2.) Turn the light bulb off");
      System.out.println ("3.) Display status of the bulb");
      System.out.println ("4.) Exit");

      //Input user selection
		userSelection = scan.nextInt();

      //Return user selection
		return userSelection;

	}//end userMenu

  
}//end BulbDriver