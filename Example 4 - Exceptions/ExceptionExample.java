import java.util.Scanner;
import java.io.*;

public class ExceptionExample extends Exception
{
    public static void main (String[] args)
    {
         final int LOWER_LIMIT = 1;
         final int UPPER_LIMIT = 100;
         String value;
         int number;
         boolean done = false;
         Scanner scan = new Scanner( System.in );

         while (!done)
         {         
            try
            {
                System.out.println("Enter a number from 1 to 100.");
                value = scan.next( );
                number = Integer.parseInt(value);
                if (number < LOWER_LIMIT || number > UPPER_LIMIT )
                              throw new Exception ("Out of Range");
                done = true;
                System.out.println("The number you entered is:  " + number + ".");
            }//end try
   
            catch (NumberFormatException e)
            {
                System.out.println("Exception 1:  " + e.getMessage( ));
            }//end catch number format
   
            catch (Exception e)
            {
                System.out.println("Exception 2:  " + e.getMessage( ));
            }//end catch Exception
         }//end while not done

         System.out.println("Bye Bye");

     }//end main

}//end class