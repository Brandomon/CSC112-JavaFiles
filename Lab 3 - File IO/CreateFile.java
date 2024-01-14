// This program prompts the User to enter 6 student names along
// with the corresponding sudent ID number and GPA for each student.
// The names are then stored into a new file named by the User

import java.io.*;

public class CreateFile
{
   public static void main(String args[])
   {//create new file method

       //Class Constants
       final int MAX = 6;     //Maximum number of students to be inserted   
       //Class Variables
       String outPutFile;     //file name
       String name;           //student's whole name
       String idNum;          //student's ID number
       String gpa;            //student's grade point average
       String outLine;        //single line being sent as output
       int count = 0;         //counter for while loop
          
      try
      {
            //get file name
            System.out.println("Please enter File Name");
            outPutFile = Keyboard.readString();

            //open the output stream
            FileWriter fileWrite = new FileWriter(outPutFile);
            BufferedWriter buffWrite = new BufferedWriter (fileWrite);
            PrintWriter outFile = new PrintWriter (buffWrite);

            //get data
            while (count < MAX)
            {
               //get name
               System.out.println("Please enter student's whole name (\"First Last\")");
               name = Keyboard.readString();
                
               //get student ID
               System.out.println("Please enter student's ID number");
               idNum = Keyboard.readString();
               
               //get student GPA 
               System.out.println("Please enter student's GPA");
               gpa = Keyboard.readString();

               //Create output line
               //concatenate name with space
               outLine = name + " " + idNum + " " + gpa;

               //write name on it's own line to file
               outFile.print(outLine);  //this sends the line to the file
               outFile.println();   //IMPORTANT - adds a line feed so you can start a new line

               //empty string for next line
               outLine = "";
               count++;

            }//end while

            //flush and close the output file
            buffWrite.flush ();
            buffWrite.close ();

         }//end try

        catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }//end catch

  }//end main

}//end class CreateFile