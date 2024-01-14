//********************************************************************
// Program Name   : Lights.java
// Author         : Brandon LaPointe
// Date           : 02/11/2021
// Course/Section : CSC 112
// Program Description:  This driver will test the methods within the
//      external Class named Bulb starting with a used lightbulb set
//      to 998 out of 1000 uses. After 1000 cycles, the lightbulb will
//      break and will require replacement with a new lightbulb with
//      0 out of 1000 uses.
//
// Methods:
// ----------
// main - Driver program to test the external Class named Bulb
// userMenu - display a menu for the user to choose to either turn the 
//            bulb on, off, check status of the bulb, or exit
//********************************************************************

//This is a Driver program to test the external Class named Bulb
import java.util.Scanner;

public class Lights //BEGIN Class Definition
{
 //****************  Main Method  ****************//
 public static void main (String[] args)
 {
    //Data Definitions:

    //Instance Data
    
    //Local Constants
    final int ON = 1;          //On option for user menu interface
    final int OFF = 2;         //Off option for user menu interface
    final int STATUS = 3;      //Status option for user menu interface
    final int EXIT = 4;        //Exit option for user menu interface
    final int BLOWN = 1000;    //Set point for count to indicate a blown bulb
    final int USED_BULB = 998; //Starting state of first bulb to show 
    
    //Local Variables
    boolean state;    //State of lightbulb as true or false
    int choice;       //User menu choice of 1-4
    int count;        //Count of lightbulb turning on
    String replace;   //String input to replace blown bulb
    Scanner scan = new Scanner(System.in);    

    //Executable Statements:

    //instantiate the Bulb object
    Bulb lightBulb1 = new Bulb();
    count = USED_BULB;  //Sets first bulb to a used bulb at 998/1000 cycles

    //Call Menu for Bulb
    choice = userMenu();
 
    //While loop for menu options input by user
    while (choice != EXIT)
    {
        if (choice == ON)
        {
             count++;
             if (count < BLOWN)
             {
                lightBulb1.on();
                System.out.println ("\nThe lightbulb has been turned on\n");
             }
             else if (count == BLOWN)
             {
                lightBulb1.on();
                System.out.println ("\nThe lightbulb has been turned on but flickers slightly\n");
             }
             else
             {
                System.out.println ("\nThe lightbulb has blown from being turned on over 1000 times!\n" +
                                    "Enter \"replace\" to switch out the lightbulb!\n");
                replace = scan.nextLine();
                while (!replace.equals("replace"))
                {
                   System.out.print ("\nEnter \"replace\" to switch out the lightbulb!\n");
                   replace = scan.nextLine();
                }
                System.out.print ("\nThe lightbulb has been replaced!\n\n");
                count = 0;    //Replaces with a brand new bulb at 0/1000 cycles
             }
             
        }
        else if (choice == OFF)
        {
             lightBulb1.off();
             System.out.println ("\nThe lightbulb has been turned off\n");
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

  
}//end Lights