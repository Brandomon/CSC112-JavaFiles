//********************************************************************
//  Program Name        : Kennel.java
//  Author              : Brandon LaPointe
//  Date                : 02/18/2021
//  Course/Section      : CSC 112
//  Program Description : Hard codes an instance of class Dog and
//                        gives the user a menu of options to either
//                        udpate the dog's name, update the dog's
//                        age, update the dog's breed, display the
//                        dog's name, display the dog's age, display
//                        the dog's breed, display the dog's age in
//                        human years, display the description of the
//                        dog, or exit the program.
//                        
//
//  Methods:
//  -------
//  main     : Driver program to test the external Class named Dog.
//  userMenu : Display a menu for the user to choose to either udpate
//             the dog's name, update the dog's age, update the dog's 
//             breed, display the dog's name, display the dog's age,
//             display the dog's breed, display the dog's age in human
//             years, display the description of the dog, or exit.
//********************************************************************

import java.util.Scanner;

public class Kennel
{

   public static void main (String[] args)
   {
      //Local Constants
      final int UPDATE_NAME = 1;          //User menu option to update the dog's name
      final int UPDATE_AGE = 2;           //User menu option to update the dog's age
      final int UPDATE_BREED = 3;         //User menu option to update the dog's breed
      final int DISPLAY_NAME = 4;         //User menu option to display the dog's name
      final int DISPLAY_AGE = 5;          //User menu option to display the dog's age
      final int DISPLAY_BREED = 6;        //User menu option to display the dog's breed
      final int DISPLAY_HUMAN_AGE = 7;    //User menu option to display the dog's age in human years
      final int DISPLAY_DESCRIPTION = 8;  //User menu option to display the dog's complete description
      final int EXIT = 9;                 //User menu option to exit the program      
      //Local Variables
      Dog dog;                            //Dog object created through hard-coding
      String breed;                       //String input for dog's breed
      String name;                        //String input for dog's name
      int age;                            //Integer input for dog's age
      String newBreed;                    //String input for dog's new breed within setBreed method
      String newName;                     //String input for dog's new name within setName method
      int peopleAge;                      //Dog's age converted into human years
      int choice;                         //Integer input by user for menu choice

      Scanner scan = new Scanner(System.in);
     
      //Instantiate an instance of Class Dog
      breed = "German Shepherd";
      name = "Lazslo";
      age = 6;
      dog = new Dog(breed, name, age);
      
      choice = userMenu();
      
      while (choice != EXIT)
      {
         if (choice == UPDATE_NAME)
         {
            System.out.print("Please enter the dog's new name : ");
            newName = scan.nextLine();
            dog.setName(newName);
         }
         else if (choice == UPDATE_AGE)
         {
            System.out.print("Please enter the dog's new age in years (whole number) : ");
            age = Integer.parseInt(scan.nextLine());
            dog.setAge(age);
         }
         else if (choice == UPDATE_BREED)
         {
            System.out.print("Please enter the dog's new breed : ");
            newBreed = scan.nextLine();
            dog.setBreed(newBreed);
         }
         else if (choice == DISPLAY_NAME)
         {
            name = dog.getName();
            System.out.print("Dog's name : " + name + "\n");
         }
         else if (choice == DISPLAY_AGE)
         {
            age = dog.getAge();
            System.out.print("Dog's age : " + age + " years old\n");
         }
         else if (choice == DISPLAY_BREED)
         {
            breed = dog.getBreed();
            System.out.print("Dog's breed : " + breed + "\n");
         }
         else if (choice == DISPLAY_HUMAN_AGE)
         {
            peopleAge = dog.personYears(age);
            System.out.print("The dog's age converted to human years is : " + peopleAge + " years old\n");
         }
         else if (choice == DISPLAY_DESCRIPTION)
         {
            System.out.print(dog + "\n");
         }
         choice = userMenu();
      }//end while
      
      
   }//end main
      
   //**********************************************************
	// Method Name	   : userMenu
	// Author         : Brandon LaPointe
	// Date           : 02/18/2021
	// Course/Section : CSC 112
	// Method Description:  This method will display a menu for
	//	 the user to choose to either udpate the dog's name,
   //  update the dog's age, update the dog's breed, display the
   //  dog's name, display the dog's age, display the dog's breed,
   //  display the dog's age in human years, display the 
   //  description of the dog, or exit the program.
	//
	// BEGIN UserMenu
	//	 Display the menu
	//	 Input user selection
	//	 Return user selection
	// END UserMenu
	//**********************************************************

	public static int userMenu()
	{
		//local constants

		//local variables
		int userSelection;			//User input of menu choice (1-7)
		Scanner scan = new Scanner(System.in);

		/*****************************************************/
      
      //Display the menu
		System.out.println ("\nPlease select one of the following:");
      System.out.println ("1.) Update the dog's name");
      System.out.println ("2.) Update the dog's age");
      System.out.println ("3.) Update the dog's breed");
      System.out.println ("4.) Display the dog's name");
      System.out.println ("5.) Display the dog's age");
      System.out.println ("6.) Display the dog's breed");
      System.out.println ("7.) Display the dog's age in human years");
      System.out.println ("8.) Display the dog's complete description");
      System.out.println ("9.) Exit" + "\n");
      
      //Input user selection
		userSelection = scan.nextInt();

      //Return user selection
		return userSelection;

	}//end userMenu
   
}//end AccountDriver