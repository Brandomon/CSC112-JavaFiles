//Pre-Processor Declaration Section

import java.util.Scanner;
import java.io.*;

//********************************************************************
//  Class Name        : KennelDogs.java
//  Author            : Brandon LaPointe
//  Date              : 02/28/2021
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
      Kennel lotsaDogs = new Kennel();             //Instance of Class Kennel
      int menuItem;                                //User's menu selection
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
         System.out.println ("\n\n\nSelect from the following:  \n");
         System.out.println ("1.  Add a Dog\n");
         System.out.println ("2.  Display List of Dogs\n");
         System.out.println ("3.  Exit\n\n");
   
         menuItem = scan.nextInt();    //Read menu selection
         garbage = scan.nextLine();    //Get rid of Enter Key press
   
         if (menuItem == 1)
         {
            //Get dog info
            System.out.println ("\nPlease enter the breed of the dog:  \n");
            breed = scan.nextLine();
            System.out.println ("\nPlease enter the name of the dog:  \n");
            name = scan.nextLine();
            System.out.println ("\nPlease enter the age of the dog:  \n");
            age = scan.nextLine();
            
            //add dog to dogs
            lotsaDogs.addDog(breed, name, age);
         }
         else if (menuItem == 2)
         {
            System.out.println(lotsaDogs);  //print list of dogs
         }
   
         else
         {
            //Determine if user changes mind
            System.out.println("Are you sure you want to quit? Y/N:  \n");
            sure = scan.next();
            if (sure.equals("n") || sure.equals("N"))  //We changed our mind....
            {
               menuItem = 1;
            }
            else
            {
               menuItem = 3;  //Yes - we DO want to quit!!!
               lotsaDogs.toFile();
            }
            
         }//end if
   
      }// end while
      while (menuItem != 3);  //while exit hasn't been selected

   }//end main

}//end class
