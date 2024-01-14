	//This class is the object - a unit of one.  The object is a book.

	//Make sure you name the file for this class:  Book
	public class Book
	{
      	private String title;          //title of book
      	private String author;         //author of book
      	private String type;           //fiction or non-fiction
      	private String isbn;           //ISBN number of book

      	public Book (String bookName, String authorName, String bookType, String ID)
      	//Constructor that will initialize the Book Data
      	{
          	//Assign data
          	title = bookName;
          	author = authorName;
          	type = bookType;
          	isbn = ID;

      	}// end constructor

      	public String toString ( )
      	//Display information about ONE book
      	//Make sure you keep the name of this method as "toString"
      	//The string created is not compatible for File I/O
      	{
          	String description;  //contains information about one book
          	description = title + ", " + author + ".  " + type + ".  ISBN #" + isbn + ".";
          	return description;
      	}//end toString

      	String getTitle()
      	{
		  	   return title;
   	  	}
   
   	  	String getAuthor()
   	  	{
   	  		return author;
   	  	}
   
   		String getType()
   		{
   		  	return type;
   	  	}
   
   	  	String getISBN()
   	  	{
   	  		return isbn ;
   	  	}
   
   	   void setTitle(String bookTitle)
   	   {
   	  	   title = bookTitle;
   	  	}
   
   	  	void setAuthor(String bookAuthor)
   	  	{
   	  	  	author = bookAuthor;
   	  	}
   
   	  	void setType(String bookType)
   	  	{
   	  		type = bookType;
   	  	}
   
   	  	void setISBN(String isbnNum)
   	  	{
   	  	  	isbn = isbnNum;
   	 	}
   }//end Book