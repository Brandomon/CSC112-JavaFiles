//********************************************************************
//  Class Name        : Dog.java
//  Author            : Brandon LaPointe
//  Date              : 02/18/2021
//  Course/Section    : CSC 112
//  Class Description : Represents the information given of a single
//                      dog.
//
//  Methods:
//  -------
//  Constructor : Initializes the breed, name, and age of each object
//                (dog) instantiated of class Dog.
//  setBreed    : Updates the dog’s breed. 
//  getBreed    : Allows user to view the breed of the dog.
//  setName     : Updates the dog’s name.
//  getName     : Allows user to view the name of the dog.
//  setAge      : Updates the dog’s age.
//  getAge      : Allows user to view the age of the dog.
//  personYears : Computes the age of the dog in people years.
//  toString    : Creates a one-line description of the dog using the 
//                dog's breed, name, age, and age in people years.
//********************************************************************

//Class Definition and Instance Data for Class Dog:

public class Dog
{

   //Instance Data Section
   //Class Constants
   public final int CONVERT = 7; //Multiple to calculate dog's age in human years
   //Class Variables   
   private String dogBreed;      //Dog's breed, hard coded or set by user
   private String dogName;       //Dog's name, hard coded or set by user
   private int dogAge;           //Dog's age, hard coded or set by user
   private int peopleAge;         //Dog's age in human years
   public String description;    //Dog's complete description
   
   //Methods
   
   //-----------------------------------------------------------------
	// Method Name	       : Constructor
	// Author             : Brandon LaPointe
	// Date               : 02/18/2021
	// Course/Section     : CSC 112
	// Method Description : This constructor will initialize the breed,
   //                      name, and age of a dog when the Dog Class 
   //                      is instantiated.
	//
	// BEGIN Constructor
	//	   Initialize instance data for Class Dog
	// END Constructor
   //-----------------------------------------------------------------   
   public Dog(String breed, String name, int age)
   {
      dogBreed = breed;
      dogName = name;
      dogAge = age;      
   }//end Constructor
   
   //-----------------------------------------------------------------
	// Method Name	       : setBreed
	// Author             : Brandon LaPointe
	// Date               : 02/18/2021
	// Course/Section     : CSC 112
	// Method Description : This method will allow the user to update 
   //                      the dog's breed. This will initialize the
   //                      dog's breed if the user wants to change it. 
	//
	// BEGIN setBreed
	//	   Dog name equals breed
	// END setBreed
   //----------------------------------------------------------------- 
   public void setBreed(String newBreed)
   {
      dogBreed = newBreed;
   }//end setBreed
   
   //-----------------------------------------------------------------
	// Method Name	       : getBreed
	// Author             : Brandon LaPointe
	// Date               : 02/18/2021
	// Course/Section     : CSC 112
	// Method Description : This method will allow the user to view the
   //                      breed of the dog. This will return the dog's
   //                      current breed through the method name.
	//
	// BEGIN getBreed
	//	   Return dog breed
	// END getBreed
   //----------------------------------------------------------------- 
   public String getBreed()
   {
      return (dogBreed);      
   }//end setBreed
   
   //-----------------------------------------------------------------
	// Method Name	       : setName
	// Author             : Brandon LaPointe
	// Date               : 02/18/2021
	// Course/Section     : CSC 112
	// Method Description : This method will allow the user to update 
   //                      the dog’s name. This will initialize the 
   //                      dog's name if the user wants to change it. 
	//
	// BEGIN setName
	//	   Dog name equals name
	// END setName
   //----------------------------------------------------------------- 
   public void setName(String newName)
   {
      dogName = newName;
   }//end setName
      
   //-----------------------------------------------------------------
	// Method Name	       : getName
	// Author             : Brandon LaPointe
	// Date               : 02/18/2021
	// Course/Section     : CSC 112
	// Method Description : This method will allow the user to view the
   //                      name of the dog. This will return the dog's
   //                      current name through the method name.
	//
	// BEGIN getName
	//	   Return dog name
	// END getName
   //----------------------------------------------------------------- 
   public String getName()
   {
      return (dogName);      
   }//end getName
      
   //-----------------------------------------------------------------
	// Method Name	       : setAge
	// Author             : Brandon LaPointe
	// Date               : 02/18/2021
	// Course/Section     : CSC 112
	// Method Description : This method will allow the user to update
   //                      the dog’s age. This will initialize the dog's
   //                      age should the user want to change it.
	//
	// BEGIN setAge
	//	   Dog age equals age
	// END setAge
   //----------------------------------------------------------------- 
   public void setAge(int age)
   {
      dogAge = age;
      peopleAge = age * CONVERT;      
   }//end setAge
         
   //-----------------------------------------------------------------
	// Method Name	       : getAge
	// Author             : Brandon LaPointe
	// Date               : 02/18/2021
	// Course/Section     : CSC 112
	// Method Description : This method will allow the user to view the
   //                      age of the dog. This will return the dog's 
   //                      current age through the method name.
	//
	// BEGIN getAge
	//	   Return dog age
	// END getAge
   //----------------------------------------------------------------- 
   public int getAge()
   {
      return (dogAge);      
   }//end getAge
         
   //-----------------------------------------------------------------
	// Method Name	       : personYears
	// Author             : Brandon LaPointe
	// Date               : 02/18/2021
	// Course/Section     : CSC 112
	// Method Description : This method will computes the age of the dog
   //                      in people years. This will return the dog's 
   //                      age in people years through the method name.
	//
	// BEGIN personYears
	//	   Convert dog age to people age
	//	   return people age
	// END personYears
   //----------------------------------------------------------------- 
   public int personYears(int age)
   {
      peopleAge = age * CONVERT;
      return (peopleAge);      
   }//end personYears   
   
   //-----------------------------------------------------------------
	// Method Name	       : toString
	// Author             : Brandon LaPointe
	// Date               : 02/18/2021
	// Course/Section     : CSC 112
	// Method Description : This method will create a one-line description
   //                      of the dog using the dog's breed, name, age, 
   //                      and age in people years. This will return a 
   //                      description of the dog through the method name.
	//
	// BEGIN toString
	//	   Description equals formatted dog's name, breed, age, and human age
   //    Return description
	// END toString
   //----------------------------------------------------------------- 
   public String toString()
   {
      peopleAge = dogAge * CONVERT;
      description = ("Dog's Name      : " + dogName + "\n" +
                     "Dog's Breed     : " + dogBreed + "\n" +
                     "Dog's Age       : " + dogAge + "\n" +
                     "Dog's Human Age : " + peopleAge);
      return (description);
   }//end toString
      
}//end class Dog