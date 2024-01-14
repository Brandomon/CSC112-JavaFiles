import java.util.Scanner;

public class RecoveringFromExceptionError
{

   public static void main (String[] args)
   {
      final int MAX = 10;
      String input;
      int integer;
      int count = 0;

      Scanner scan = new Scanner(System.in);
      
      //Prompt user for 10 integers
      System.out.print("Enter 10 seperate integers\n");
      
      while (count < MAX)
      {
         try
         {
         	//Prompt user for 10 integers
          	System.out.print("Enter an integer : ");
           	//Read each integer as a string
           	input = scan.nextLine();       	
           	//Use parseInt method to convert each string as it is entered into an integer
           	integer = Integer.parseInt(input);
            //Increment counter for while loop
            count++;
            
         }//end try
         
         catch (NumberFormatException problem)
         {
         	//handle division by zero exception
         	System.out.println ("You have entered a non-integer.");
         
         }//end catch
                  
      }//end while

   }//end main

}//end class RecoveringFromExceptionError