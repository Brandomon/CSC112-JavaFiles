//********************************************************************
// Class Name          : Bulb.java
// Author              : Brandon LaPointe
// Date                : 02/11/2021
// Course/Section      : CSC 112
// Program Description : This class will represent a lightbulb with 
//                       basic functions to turn on, turn off, and get
//                       the status of the lightbulb.
//
// Methods:
// -------
// Constructor : Initializes the instance data which represents a
//               lightbulb with basic functions to turn on, turn
//               off, and get status of the lightbulb.
// on          : Turns the light bulb on by setting the state of 
//               the light bulb to true.
// off         : Turns the light bulb off by setting the state of
//               the light bulb to false.
// status      : Identifies the current status of the light bulb by
//               returning a true or a false.
//********************************************************************

//Class Definition and Instance Data for Class Bulb:
import java.util.Random;

public class Bulb
{

   //Instance Data Section
   boolean state; //Represents current state of lightbulb
   
   //Methods
   
   //-----------------------------------------------------------------
   // This is the constructor.  It will initialize the state of the 
   // light bulb to false (Off).
   //-----------------------------------------------------------------   
   public Bulb()
   {
      off(); 
   }//end Constructor
   
   //-----------------------------------------------------------------
   // This constructor will initialize the state of the light bulb
   // state to the state of the passed in boolean parameter, if given.
   //----------------------------------------------------------------- 
   public Bulb(boolean lit)
   {
      state = lit;
   }//end Constructor
   
   //-----------------------------------------------------------------
   // Turns the light bulb on by setting the state of the light bulb
   // to true.
   //----------------------------------------------------------------- 
   public void on()
   {
      state = true;
   }//end on
   
   //-----------------------------------------------------------------
   // Turns the light bulb off by setting the state of the light bulb 
   // to false.
   //----------------------------------------------------------------- 
   public void off()
   {
      state = false;
   }//end off
   
   //-----------------------------------------------------------------
   // Identifies the current status of the light bulb by returning a 
   // true or a false.
   //----------------------------------------------------------------- 
   public boolean status()
   {
      return (state);
   }//end status
   
}//end class Bulb