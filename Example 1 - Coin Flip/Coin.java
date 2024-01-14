//Class Definition and Instance Data for Class Coin:
import java.util.Random;

public class Coin
{
   private final int HEADS = 1;  //Constant representing heads
   private final int TAILS = 2;  //Constant representing tails
   private int face;             //integer representing the face value of the coin
   String faceName;              //string representing the face value of the coin

   //Create Constructor:
   //-------------------------------------------------------
   //  This constructor is empty.
   //-------------------------------------------------------

   public Coin ( )
   {
       //this is empty
   }//end Coin constructor

   //Flip the Coin Method:
   //-------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
      //    BEGIN flip
   //       face value of coin = random number between 1 and 2 typecast as integer
   //    END flip
   //-------------------------------------------------------

   public void flip ( )
   {
      face = (int) (Math.random() * 2);  //return an integer between 1 and 2
   }//end flip

   //Method to Return true if result of toss is Heads:
   //-------------------------------------------------------
   //Returns true if the current face of the coin is heads.
      //BEGIN isHeads
   //    return truth value of face == HEADS  
   //END isHeads
   //-------------------------------------------------------

   public boolean isHeads ()
   {
      return (face == HEADS);  //return truth value of face equal to 1
   }//end isHeads

   //Method to Return face value of tossed coin as string:
   //-------------------------------------------------------
   //  Returns the current face of the coin as a string.
      //  BEGIN toString
   //     IF faceValue == HEADS THEN
   //          faceName = “Heads”
   //     ELSE
   //          faceName = “Tails”
   //     END IF
   //     return faceName
   //  END toString
   //-------------------------------------------------------

   public String toString()
   {

      if (face == HEADS)      //if face equals 1
         faceName = "Heads";  //set string to "Heads"
      else                    //else
         faceName = "Tails";  //set string to "Tails"

      return faceName;        //return string
   }//end toString
}//end Coin

