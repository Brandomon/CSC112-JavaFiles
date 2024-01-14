import java.io.*;

//********************************************************************
//  Class Name        : CompareFiles.java
//  Author            : Brandon LaPointe
//  Date              : 02/25/2021
//  Course/Section    : CSC 112
//  Class Description : Compares two text files for equality and prints
//                      out any lines that are different along with the
//                      corresponding line number.
//
//********************************************************************

//Class Definition and Instance Data

public class CompareFiles
{
   public static void main(String args[])
   {
      //Class Constants

      //Class Variables   
      String file1 = "File1.txt";   //file path for file1
      String file2 = "File2.txt";   //file path for file2
      String line1 = null;          //file1 line to compare to line2
      String line2 = null;          //file2 line to compare to line1
      int lineCount = 1;            //count to indicate which line difference occurs on
      boolean isEqual = true;       //flag to indicate if line comparison is equal or not
         
      try
      {
         //open the input stream for file1 & file2
         FileReader fRead = new FileReader(file1);
         BufferedReader bRead = new BufferedReader(fRead);
         FileReader fRead2 = new FileReader(file2);
         BufferedReader bRead2 = new BufferedReader(fRead2);
 
         //read in the first line of the first and second file
         line1 = bRead.readLine();
         line2 = bRead2.readLine();

         //while not yet at the end of the first or second file
         while(line1 != null || line2 != null)
         {
            //compare the two lines
            if(!line1.equalsIgnoreCase(line2))
            {
               isEqual = false;
               System.out.println("Difference at line " + lineCount + " :");
               System.out.println("File1 : " + line1);
               System.out.println("File2 : " + line2);
               System.out.println();
            }
            
            //read in the next lines to continue comparison
            line1 = bRead.readLine();
            line2 = bRead2.readLine();
            
            //increment line count to correspond with lines being read
            lineCount++;

         }//end while
         
         //display message if both files are the same
         if (isEqual == true)
         {
            System.out.println("Both files are the same.");
         }
         //close the input files
         bRead.close ();
         bRead2.close ();

      }//end try

      catch(IOException exception)
      {
         System.out.println(exception.getMessage());
      }//end catch

   }//end main
      
}//end class CompareFiles