import java.io.*;
import java.util.*;

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
//  Methods:
//  -------
//  constructor  : Initializes the breed, name, and age of a dog when the
//               Dog Class is instantiated.
//  addDog       : Adds a dog to the array called dogKennel
//  increaseSize : Moves all the dogs to a temporary kennel, double the size
//               of the original kennel, and then moves the dogs back into 
//               the larger, original kennel.
//  toString     : This method will format all the data within the dogKennel
//               and return it as a string called report.
//  userMenu     : Display a menu for the user to choose to either udpate
//               the dog's name, update the dog's age, update the dog's 
//               breed, display the dog's name, display the dog's age,
//               display the dog's breed, display the dog's age in human
//               years, display the description of the dog, or exit.
//  toFile       : Takes the information from each dog within the kennel
//               and writes it to a file called dogs.txt where it
//               can be later accessed.
//  fromFile     : Reads the information saved to the file dogs.txt and 
//               creates an array of dogs, called dogKennel, from the
//               file information.
//********************************************************************

public class Kennel
{
   //Local Constants
   final int UPDATE_NAME = 1;                      //user menu option to update the dog's name
   final int UPDATE_AGE = 2;                       //user menu option to update the dog's age
   final int UPDATE_BREED = 3;                     //user menu option to update the dog's breed
   final int DISPLAY_NAME = 4;                     //user menu option to display the dog's name
   final int DISPLAY_AGE = 5;                      //user menu option to display the dog's age
   final int DISPLAY_BREED = 6;                    //user menu option to display the dog's breed
   final int DISPLAY_HUMAN_AGE = 7;                //user menu option to display the dog's age in human years
   final int DISPLAY_DESCRIPTION = 8;              //user menu option to display the dog's complete description
   final int EXIT = 9;                             //user menu option to exit the program
   private final int MAX_DOGS = 20;                //size of the dog kennel
   //Local Variables
   String breed;                                   //string input for dog's breed
   String name;                                    //string input for dog's name
   String age;                                     //string input for dog's age
   String newBreed;                                //string input for dog's new breed within setBreed method
   String newName;                                 //string input for dog's new name within setName method
   int peopleAge;                                  //dog's age converted into human years
   int choice;                                     //integer input by user for menu choice
   private Dog dogKennel[ ]= new Dog [MAX_DOGS];   //dogKennel array
   private int numDogs;                            //number of dogs
   int dogNum;                                     //dog counter for toString method

   Scanner scan = new Scanner(System.in);
      
   //-----------------------------------------------------------------
   // Method Name	       : Constructor
   // Author             : Brandon LaPointe
   // Date               : 03/02/2021
   // Course/Section     : CSC 112
   // Method Description : This constructor will initialize the breed,
   //                      name, and age of a dog when the Dog Class 
   //                      is instantiated.
   //
   // BEGIN Constructor
   //	   Initialize instance data for Class Dog
   // END Constructor
   //-----------------------------------------------------------------   
   public Kennel()
   {
      numDogs = 0;                     //start with an empty kennel    
   }//end Constructor
   
   //-----------------------------------------------------------------
   // Method Name	       : addDog
   // Author             : Brandon LaPointe
   // Date               : 03/03/2021
   // Course/Section     : CSC 112
   // Method Description : This method will add a dog to the array dogKennel
   //
   // BEGIN addDog
   //	   Add dog to the dogKennel array
   //       If dogKennel is already full create a bigger kennel
   //       Add information of new dog to dogKennel
   // END addDog
   //----------------------------------------------------------------- 
   
   public void addDog(String breed, String name, String age)
   //add a dog to the dogKennel (the array)
   {
      if (numDogs == dogKennel.length) //if dogKennel is full
      increaseSize();                  //create a bigger dogKennel

      //add information on new dog to dogKennel
      dogKennel[numDogs] = new Dog (breed, name, age);
      numDogs ++;                      //increment number of dogs

   }//end addDog
   
   //**********************************************************
	// Method Name	   : increaseSize
	// Author         : Brandon LaPointe
	// Date           : 03/03/2021
	// Course/Section : CSC 112
	// Method Description:  This method will move all the dogs to
   //                      a temporary kennel, double the size of
   //                      the original kennel, and then move the
   //                      dogs back into the larger kennel.
	//
	// BEGIN increaseSize
	//	   Create larger temporary dogKennel
	//	   Move dogs over to new dogKennel
   //    Place dogs back into larger dogKennel
	// END increaseSize
   //**********************************************************

   private void increaseSize()
   
   //builds a larger dogKennel if needed
   {
      //create a temporary dogKennel twice as big
      Dog[] tempKennel = new Dog[dogKennel.length * 2];

      //move dogs over to the new dogKennel
      for (int count = 0; count < dogKennel.length; count++)
         tempKennel[count] = dogKennel[count];

      //Place dogs back into the larger dogKennel
      dogKennel = tempKennel;

   }//end increaseSize
   
   //**********************************************************
	// Method Name	   : toString
	// Author         : Brandon LaPointe
	// Date           : 03/03/2021
	// Course/Section : CSC 112
	// Method Description:  This method will format all the data
   //                      within the dogKennel and return it
   //                      as report.
	//
	// BEGIN toString
	//	   Format dogKennel information into report
   //    Return report
	// END toString
   //**********************************************************
   
   public String toString( )
   
   //Print out all dogs in dogKennel
   {
      //Title of Report
      String report = "Dog Kennel\n\n";

      //How many dogs in dogKennel
      report += "Number of Dogs in Kennel: " + numDogs + "\n\n";

      for (dogNum = 0; dogNum < numDogs; dogNum++)
      {
         //Call string method in Dog to print out one dog at a time
         report += dogKennel[dogNum].toString() + "\n\n";
      }
      return report;  //return list to print

   }//end toString
      
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
   
   //-----------------------------------------------------------------
	// Method Name	       : toFile
	// Author             : Brandon LaPointe
	// Date               : 03/03/2021
	// Course/Section     : CSC 112
	// Method Description : This method will take the information from
   //                      each dog within the kennel and write it to
   //                      a file called dogs.txt where it can be
   //                      later accessed.
	//
	// BEGIN toFile
   //    Try
	//	      Set file name
   //       Set line output to empty string
   //       Instantiate FileWriter, BufferedWriter, and PrintWriter
   //       For each dog within the array of dogKennel
   //          Output information on dog to outLine
   //          Write new line to file
   //       Flush and close the output file
   //    End Try
   //    Catch IO Exception
   //       Output getMessage
   //    End catch    
	// END toFile
   //----------------------------------------------------------------- 
   
   public void toFile()
   {
	  try
      {
         String outPutFile = "dogs.txt";     //file name
         String outLine = "";                //line of data being sent to file
         FileWriter fileWrite = new FileWriter(outPutFile);
         BufferedWriter buffWrite = new BufferedWriter (fileWrite);
         PrintWriter outFile = new PrintWriter (buffWrite);
         for (int dogNum = 0; dogNum < numDogs; dogNum++)
    		{
			   outLine = outLine + dogKennel[dogNum].getBreed() + "," + dogKennel[dogNum].getName() + "," + dogKennel[dogNum].getAge();
            //write line to file
		      outFile.print(outLine);
            outFile.println();
            outLine = "";
			}//end file
 		   //flush and close the output file
         buffWrite.flush ();
         buffWrite.close ();
      }//end try

		catch(IOException exception)
		{
   	   System.out.println(exception.getMessage());
      }//end catch

   }//end toFile
   
   //-----------------------------------------------------------------
	// Method Name	       : fromFile
	// Author             : Brandon LaPointe
	// Date               : 03/03/2021
	// Course/Section     : CSC 112
	// Method Description : This method will read the information saved
   //                      to the file dogs.txt and create an array of
   //                      dogs from the information called dogKennel.
	//
	// BEGIN fromFile
   //    Try
	//	      Set file name
   //       Set input line to empty string
   //       Open input stream
   //       Buffer input stream one line at a time
   //       Get data from file
   //       Close the input file
   //       Return description
   //    End try
   //    Catch IO Exception
   //       Output getMessage
   //    End catch       
	// END fromFile
   //----------------------------------------------------------------- 

   public void fromFile()
   {
     try
     {
	     String inPutFile = "dogs.txt";	   //file name
	     String line = "";				      //line of data read from file
	     StringTokenizer inLine;           //tokenized string
        //open the input stream
        FileReader fRead = new FileReader(inPutFile);
        //buffer input stream one line at a time
        BufferedReader bRead = new BufferedReader (fRead);
        //Fields of Object Dog
        String breed;
        String name;
        String age;

        //Get data from file
        
        //read in the first line of the file
        line = bRead.readLine();

        while(line != null)
        {
		     //parse the new line using the comma as the delimiter
           inLine = new StringTokenizer(line, ",");

           //extract the breed
           breed = inLine.nextToken();

           //extract the name
           name = inLine.nextToken();

           //extract the age
           age = inLine.nextToken();

           //create a new dog
           dogKennel[numDogs] = new Dog (breed, name, age);

           //get the next line in the external file
           line = bRead.readLine();

           //increment number of dogs
           numDogs = numDogs + 1;

        }//end while line not null

        //close the input file
        bRead.close ();

     }//end try

     catch(IOException exception)
     {
        System.out.println(exception.getMessage());
     }//end catch

	}//end fromFile
   
}//end AccountDriver