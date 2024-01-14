//Pre-Processor Declaration Section

import java.util.Scanner;
import java.io.*;

public class LibraryBooks
{
 public static void main (String [ ] args)
 {
  Scanner scan = new Scanner( System.in ); //scanner object

  BookShelf lotsaBooks = new BookShelf( );    //Instance of Class BookShelf
  int menuItem;                                           //User's menu selection
  String sure;                                               //User chance to not exit
  String title;                                                //Title of Book
  String author;                                           //Author of Book
  String type;                                              //Fiction or Non-Fiction
  String isbn;                                              //ISBN number of book
  String garbage;                                        //get rid of Enter Key press

  //get books from the external file
  lotsaBooks.fromFile();

  do
  {
         System.out.println ("\n\n\nSelect from the following:  \n");
         System.out.println ("1.  Add a Book\n");
         System.out.println ("2.  Display List of Books\n");
         System.out.println ("3.  Exit\n\n");

         menuItem = scan.nextInt( );//read menu selection
         garbage = scan.nextLine(); //get rid of Enter Key press

   if (menuItem == 1)
   {
         //Get a book
         System.out.println ("\nPlease enter the title of the book:  \n");
         title = scan.nextLine( );
         System.out.println ("\nPlease enter the author of the book:  \n");
         author = scan.nextLine( );
         System.out.println ("\nPlease enter Fiction or Non-Fiction\n");
         type = scan.nextLine( );
         System.out.println ("\nPlease enter the ISBN # of the book:  \n");
         isbn = scan.nextLine( );
         //add book to books
         lotsaBooks.addBook(title, author, type, isbn);
   }
   else if (menuItem == 2)
   {
         System.out.println (lotsaBooks);  //print list of books
   }

   else
   {
         //Determine if user changes mind
         System.out.println ("Are you sure you want to quit? Y/N:  \n");
         sure = scan.next( );
         if (sure.equals("n") || sure.equals("N"))  //We changed our mind....
               menuItem = 1;
         else
               menuItem = 3;  //Yes - we DO want to quit!!!
               lotsaBooks.toFile();
    }//end if

  }// end while
  while (menuItem != 3);  //while exit hasn't been selected

 }//end main

}//end class




