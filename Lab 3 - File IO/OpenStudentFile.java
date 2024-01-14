import java.io.*;
import java.util.*;

//  This program opens a file named Student.txt
//  and reads the data into existing variables
//  for name, student id number, and gpa.
//  The students are then concatenated and printed out.

public class OpenStudentFile
{
   public static void main(String args[])
   {//create new file method

          String inPutFile = "StudentList";     //file name
          String name;                          //Student's name
          String id;                            //Student's ID number
          String gpa;                           //Student's grade point average
          String student;                       //Concatenated student information
          String line;                          //one line read from file
          StringTokenizer inLine;               //tokenized string

      try
      {
        //open the input stream
        FileReader fRead = new FileReader(inPutFile);
        BufferedReader bRead = new BufferedReader (fRead);

        //get data
        //read in the first line of the file
        line = bRead.readLine();

        //while not yet at the end of the file
        while(line != null)
        {
             //parse the new line 1 word at a time
             inLine = new StringTokenizer(line);

             //get name and concatenate first and last
             name = inLine.nextToken();
             name += " " + inLine.nextToken();

             //get student ID number
             id = inLine.nextToken();
             
             //get grade point average
             gpa = inLine.nextToken();

             //add a comma and space
             student = name + ", " + id + ", " + gpa;

             //Print out full name
             System.out.println(student);

             //get the next word in the current line
             line = bRead.readLine();

         }//end while word

         //close the input file
          bRead.close ();

     }//end try

    catch(IOException exception)
    {
        System.out.println(exception.getMessage());        
    }//end catch

  }//end main

}//end class OpenStudentFile