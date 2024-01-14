//Pre-Processor Declaration Section

import java.util.*;
import java.io.*;

//********************************************************************
//  Class Name        : KennelDogs.java
//  Author            : Brandon LaPointe
//  Date              : 03/14/2021
//  Course/Section    : CSC 112
//  Class Description : Driver class for Dog.java and Kennel.java
//
//  Methods:
//  -------
//  Main   : Gathers list of dogs from external file and gives the user
//           a menu with options to add a dog, display the list of dogs,
//           or exit. Any dogs added will be saved to the file upon exit.
//********************************************************************

public class KennelDogs
{
   public static void main (String[] args)
   {
      final int CONVERT = 7;                       //Multiple for converting dog age to human age
      final int ADD = 1;                           //Menu option to add dog to list
      final int UPDATE = 2;                        //Menu option to update a dog within the list
      final int DISPLAY = 3;                       //Menu option to display all dogs in the list
      final int SORT = 4;                          //Menu option to sort the dogs in the list
      final int EXIT = 5;                          //Menu option to exit
      Kennel lotsaDogs = new Kennel();             //Instance of Class Kennel
      int menuItem;                                //User's menu selection
      int dogIndex;                                //User selection of dog by corresponding number
      int updateChoice;                            //User selection of update menu
      int sortChoice;                              //User selection for sorting the list of dogs
      String newBreed;                             //String input for dog's new breed within setBreed method
      String newName;                              //String input for dog's new name within setName method
      String sure;                                 //User chance to not exit
      String breed;                                //Breed of Dog
      String name;                                 //Name of Dog
      String age;                                  //Age of Dog
      String garbage;                              //Get rid of Enter Key press
      
      Scanner scan = new Scanner(System.in);       //Scanner object

      //get dog list from the external file
      lotsaDogs.fromFile();
   
      do
      {
         menuItem = lotsaDogs.userMenu(); 
         if (menuItem == ADD)
         {
            //Get dog info
            System.out.println ("\nPlease enter the breed of the dog:  \n");
            breed = scan.nextLine();
            System.out.println ("\nPlease enter the name of the dog:  \n");
            name = scan.nextLine();
            System.out.println ("\nPlease enter the age of the dog:  \n");
            age = scan.nextLine();
            
            //Add dog to dogs
            lotsaDogs.addDog(breed, name, age);
         }
         else if (menuItem == UPDATE)  //Update an item in the array
         {
            System.out.println(lotsaDogs);
            System.out.println("Select dog by entering the corresponding number:  \n");
            dogIndex = (scan.nextInt() - 1);
            if (dogIndex <= (lotsaDogs.numDogs-1))
            {
               System.out.println(lotsaDogs.dogKennel[dogIndex]);
               System.out.println("\nSelect what you would like to update:  \n");
               System.out.println("1: Breed");
               System.out.println("2: Name");
               System.out.println("3: Age");
               System.out.println("4: Exit");
               updateChoice = scan.nextInt();
               garbage = scan.nextLine();    //Get rid of Enter Key press
               while (updateChoice != 4)
               {
                  if (updateChoice == 1) //Update dog's breed
                  {
                     System.out.print("Please enter the dog's new breed : ");
                     newBreed = scan.nextLine();
                     lotsaDogs.dogKennel[dogIndex].setBreed(newBreed);
                     updateChoice = 4;
                  }
                  else if (updateChoice == 2) //Update dog's name
                  {
                     System.out.print("Please enter the dog's new name : ");
                     newName = scan.nextLine();
                     lotsaDogs.dogKennel[dogIndex].setBreed(newName);
                     updateChoice = 4;
                  }
                  else if (updateChoice == 3) //Update dog's age
                  {
                     System.out.print("Please enter the dog's new age : ");
                     age = scan.nextLine();
                     lotsaDogs.dogKennel[dogIndex].setBreed(age);
                     updateChoice = 4;
                  }
                  else //Input error message
                  {
                     System.out.println("The input number was not within the menu range.");
                     System.out.println("Select what you would like to update:  \n");
                     System.out.println("1: Breed");
                     System.out.println("2: Name");
                     System.out.println("3: Age");
                     updateChoice = scan.nextInt();
                     garbage = scan.nextLine();    //Get rid of Enter Key press
                  }
                  
               } //end while update choice != 4 (Line 79)
               
            } //end if dogIndex < numDogs (Line 69)            
            else
            {
               System.out.println("\nThe number entered was outside of the range of available dogs");
            }
                  
         } //end else if menuItem = UPDATE (Line 64)         
         else if (menuItem == DISPLAY)  //Print list of dogs
         {
            System.out.println(lotsaDogs);
         }         
         else if (menuItem == SORT)  //Sort list of dogs
         {
            System.out.println("Select how you want the list sorted:\n");
            System.out.println("1: Alphabetically by Name");
            System.out.println("2: Numerically by Age");
            System.out.println("3: Exit");
            sortChoice = scan.nextInt();
            garbage = scan.nextLine();    //Get rid of Enter Key press
            while (sortChoice != 3)
            {
               if (sortChoice == 1)
               {
                  lotsaDogs.selectionSortName(); 
                  sortChoice = 3;
                  System.out.println("\nSorting operation was successful");
               }
               else if (sortChoice == 2)
               {
                  lotsaDogs.selectionSortAge();
                  sortChoice = 3;
                  System.out.println("\nSorting operation was successful");
               }
               else
               {
                  System.out.println("\nThe input number was not within the menu range.\n");
                  System.out.println("Select how you want the list sorted:  \n");
                  System.out.println("1: Alphabetically by Name");
                  System.out.println("2: Numerically by Age");
                  System.out.println("3: Exit");
                  sortChoice = scan.nextInt();
                  garbage = scan.nextLine();    //Get rid of Enter Key press
               } //end if
               
            } //end while
            
         }   
         else if (menuItem == EXIT)  //Exit
         {
            //Determine if user changes mind
            System.out.println("Are you sure you want to quit? Y/N:  \n");
            sure = scan.next();
            garbage = scan.nextLine();    //Get rid of Enter Key press
            if (sure.equals("n") || sure.equals("N"))  //We changed our mind....
            {
               menuItem = 1;
            }
            else
            {
               menuItem = 5;  //Yes - we DO want to quit!!!
               lotsaDogs.toFile();
            }
         }
         else
         {
            System.out.println("\nThe input number was not within the menu range.");
         } //end if
   
      } //end while
      while (menuItem != 5);  //while exit hasn't been selected

   }//end main

}//end class
