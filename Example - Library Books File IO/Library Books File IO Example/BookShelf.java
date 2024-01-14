import java.io.*;
import java.util.*;

public class BookShelf
{
//Be sure you name the file for this Class:  BookShelf

//Instance data
 private final int MAX_BOOKS = 25;                 //size of bookCase
 private Book bookCase[ ]= new Book [MAX_BOOKS];   //bookCase array
 private int numBooks;                             //number of Books

 public BookShelf ( )
 //Constructor initializing instance data
 {
       numBooks = 0;        //start out with empty bookCase
 }//end constructor

 public void addBook( String title, String author, String type, String isbn)
 //add a book to the bookcase (the array)
 {
       if (numBooks == bookCase.length) //if bookCase is full
               increaseSize ( );   //create a bigger bookCase

       //add information on new book to bookCase
       bookCase[numBooks] = new Book (title, author, type, isbn);
       numBooks ++;   //increment number of books

 }//end addBook

 private void increaseSize ( )
 //build a larger bookCase if needed
 {
       //create a temporary bookCase twice as big
       Book [ ] tempCase = new Book[bookCase.length * 2];

       //move books over to new bookCase
       for (int count = 0; count < bookCase.length; count++)
             tempCase[count] = bookCase[count];

       //Place books back into larger bookCase
       bookCase = tempCase;

 }//end increaseSize

 public String toString( )
//Make sure you keep the name of this method as "toString"
//Print out all books in Bookcase
 {
       //Title of Report
       String report = "Library Books\n\n";

       //How many books in BookCase
       report += "Number of Books in Library:  " + numBooks + "\n\n";

       for (int bookNum = 0; bookNum < numBooks; bookNum++)
       {
               //Call string method in Book to print out one book at a time
               report += bookCase [bookNum].toString( ) + "\n";
	}
       return report;  //return list to print

 }//end toString

 public void toFile()
 {
	  try
      {
            String outPutFile = "books.txt";                //file name
            FileWriter fileWrite = new FileWriter(outPutFile);
            BufferedWriter buffWrite = new BufferedWriter (fileWrite);
            PrintWriter outFile = new PrintWriter (buffWrite);
            String outLine = "";
            for (int bookNum = 0; bookNum < numBooks; bookNum++)
       		{
				outLine = outLine + bookCase [bookNum].getTitle( ) + "," + bookCase [bookNum].getAuthor( ) + "," + bookCase [bookNum].getType( ) + "," + bookCase [bookNum].getISBN( );
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

 public void fromFile()
 {
	        try
	        {
	  			String inPutFile = "books.txt";	//file name
	  			String line = "";				//line of data read from file
	  			StringTokenizer inLine;            //tokenized string
	          	//open the input stream
	          	FileReader fRead = new FileReader(inPutFile);
	          	//buffer input stream one line at a time
	          	BufferedReader bRead = new BufferedReader (fRead);
	          	//Fields of Object Book
	          	String title;
	          	String author;
	          	String type;
	          	String isbn;

	          	//Get data from file

	         	//read in the first line of the file
	          	line = bRead.readLine();

	          	while(line != null)
	          	{
					//parse the new line using the comma as the delimiter
	               	inLine = new StringTokenizer(line, ",");

	               	//extract the title
	                title = inLine.nextToken();

	               	//extract the author
	                author = inLine.nextToken();

	               	//extract the type
	               	type = inLine.nextToken();

	  				//extract the isbn
	                isbn = inLine.nextToken();

	            	//create a new book
	            	bookCase[numBooks] = new Book (title, author, type, isbn);

	             	//get the next line in the external file
	              	line = bRead.readLine();

	             	//increment number of books
	               	numBooks = numBooks + 1;

	           }//end while line not null

	           //close the input file
	            bRead.close ();

	       }//end try

	      catch(IOException exception)
	      {
	          System.out.println(exception.getMessage());
    	  }//end catch

	}//end fromFile
}//end BookShelf





