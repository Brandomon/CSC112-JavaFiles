import java.util.Scanner;

public class UseSafeDate
{
    public static void main(String[] args) throws DateOutOfBoundsException
    {
        int theMonth;
        int theDay;
        int theYear;
        boolean DateOK = false;  //Assume that the date entered is not correct

        Scanner scan = new Scanner(System.in);  //instantiate an instance of Scanner class
        SafeDate theDate;  //instantiate an object of SafeDate

        System.out.println("Please enter the month:  ");
        theMonth = scan.nextInt();

        System.out.println("Please enter the day:  ");
        theDay = scan.nextInt();

        System.out.println("Please enter the year:  ");
        theYear = scan.nextInt();

        try
        {
            //determine if the date entered is correct
            theDate = new SafeDate(theMonth, theDay, theYear);
            //if we've made it this far then the date is correct
            DateOK = true;  //trip flag to true since the date is correct
            System.out.println(theDate + " is a safe date.");
        }//end try

        catch(DateOutOfBoundsException problem)
        {
                System.out.println(problem.getMessage() + "\n");
        }//end catch

    }//end main
}//end UseSafeDate