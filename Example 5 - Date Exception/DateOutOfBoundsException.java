public class DateOutOfBoundsException extends Exception
{
    //This constructor creates an exception without a message
    public DateOutOfBoundsException()
    {   
        super();//Defaults to Java's message
    }
    
    //This constructor creates an exception with a message
    public DateOutOfBoundsException(String message)
    {   
        super(message);//Print our customized message
    }
    
}//end DateOutOfBoundsException