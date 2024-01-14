//This is a Driver program to test the external Class named Account
import java.util.Scanner;
import java.text.DecimalFormat;

public class AccountDriver //BEGIN Class Definition
{
   //****************  Main Method  ****************//
   public static void main (String[] args)
   {
     //Local Constants
     final int DEPOSIT = 1;
     final int WITHDRAWAL = 2;
     final int RETURN_BAL = 3;
     final int RETURN_BAL_INT = 4;
     final int RETURN_ACCT_NUM = 5;
     final int RETURN_ALL = 6;
     final int EXIT = 7;
     final double FEE = 3.00;
     //Local Variables
     String customerName;     //Name of customer in account
     long acctNum;            //Account number linked to account
     double initBal;          //Initial balance of account
     Account user;            //Account object created through user   
     int accountIn;           //User input for account number
     int choice = 0;          //User input of menu option
     double amount;           //User input of amount
     double balance;          //Balance of account
     Scanner scan = new Scanner(System.in);
     DecimalFormat fmt = new DecimalFormat("0.00");
     
     //Instantiate a single hard-coded instance of Class Account
     customerName = "Firsty Lasty";
     acctNum = 1;
     initBal = 0.00;
     user = new Account(customerName, acctNum, initBal);

     //Prompt user for their account number
     System.out.print ("Enter the account number: ");
     accountIn = scan.nextInt();
     
     //Display error message if the account number does not exist
     while (accountIn != acctNum)
     {
         System.out.println ("The account number entered does not exist" + "\n");
         System.out.print ("Enter the account number: ");
         accountIn = scan.nextInt();
     }
     
     //Display the menu if the account number is valid
     if (accountIn == acctNum)
     {
         System.out.print ("\n");
         choice = userMenu();
     }
     
     //While loop for menu options input by user
     while (choice != EXIT)
     {
         if (choice == DEPOSIT)
         {
             System.out.println ("Enter the amount to be deposited : ");
             amount = scan.nextDouble();
             balance = user.deposit(amount);
             System.out.print ("\n");
         }
         else if (choice == WITHDRAWAL)
         {
             System.out.println ("Enter the amount to be taken out : ");
             amount = scan.nextDouble();
             balance = user.withdraw(amount, FEE);
             System.out.print ("\n");
         }
         else if (choice == RETURN_BAL)
         {
             balance = user.getBalance();
             System.out.println ("Current Balance: $" + fmt.format(balance) + "\n");
         }
         else if (choice == RETURN_BAL_INT)
         {
             balance = user.addInterest();
             System.out.println ("Balance after Interest: $" + fmt.format(balance) + "\n");
         }
         else if (choice == RETURN_ACCT_NUM)
         {
             System.out.println ("Account Number : " + acctNum + "\n");
         }
         else if (choice == RETURN_ALL)
         {
             System.out.println(user + "\n");
         }
         else
         {
             System.out.println ("The input number is not within the menu limits. Please try again...\n");
         }
         choice = userMenu();         
     }
     
 }//end main
 
   /**********************************************************
	* Method Name	  : userMenu
	* Author         : Brandon LaPointe
	* Date           : 02/03/2021
	* Course/Section : CSC 112
	* Program Description:  This method will display a menu for
	*	 the user to choose to either deposit, withdrawal, return
   *   balance, return balance with interest, return account
   *   number, return all account information, or exit.
	*
	* BEGIN UserMenu
	*	 Display the menu
	*	 Input user selection
	*	 Return user selection
	* END UserMenu
	**********************************************************/

	public static int userMenu()
	{
		//local constants

		//local variables
		int userSelection;			//User input of menu choice (1-7)
		Scanner scan = new Scanner(System.in);

		/*****************************************************/
      
      //Display the menu
		System.out.println ("Please select one of the following:");
      System.out.println ("1.) Deposit");
      System.out.println ("2.) Withdrawal");
      System.out.println ("3.) Return Balance");
      System.out.println ("4.) Return Balance with Interest");
      System.out.println ("5.) Return Account Number");
      System.out.println ("6.) Return all Account Information");
      System.out.println ("7.) Exit" + "\n");
      
      //Input user selection
		userSelection = scan.nextInt();

      //Return user selection
		return userSelection;

	}//end userMenu
   
}//end AccountDriver