//This is a Driver program to test the external Class named Coin

public class FlipCoin //BEGIN Class Definition
{
 //****************  Main Method*************************
 public static void main (String[] args)
 {
     //Data Definitions:
     final int NUM_FLIPS = 1000;
     int heads = 0, tails = 0;

     Coin myCoin = new Coin();  // instantiate the Coin object

     //Executable Statements:

     //Test flip
     myCoin.flip();
     //Test toString
     System.out.println("The result of the coin toss was:  " + myCoin.toString());

     //Print a blank line
     System.out.println();

     //Test isHeads
     for (int count=1; count <= NUM_FLIPS; count++)
     {
        myCoin.flip();

        if (myCoin.isHeads())
           heads++;
        else
           tails++;
     }//end for

     System.out.println ("The number flips: " + NUM_FLIPS);
     System.out.println ("The number of heads: " + heads);
     System.out.println ("The number of tails: " + tails);
 }//end main
}//end FlipCoin