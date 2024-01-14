public class Student
{
   //Instance Data
   String studentName;
   String studentID;
   String streetAddress;
   String city;
   String state;
   String zipCode;
   String major;

   int totalCredits;
   int courseNumber = 0;  //start out with no courses
     
   final int SIZE = 10;
   final int MAX_COURSES = 6;
   final int MAX_CREDITS = 18;
   String [ ] schedule = new String [SIZE];

   //Create Constructor:   
   //Initializes the student data at instantiation time.   
   //-------------------------------------------------------   
   //  Sets up the student's information.   
   //-------------------------------------------------------
   
   public Student (String name, String id, String address, String cityName, String stateName, String zip, String area )
   {
     studentName = name;
     studentID = id;
     streetAddress = address;
     city = cityName;
     state = stateName;
     zipCode = zip;
     major = area;
   }//end Student Constructor
   
   //Method to determine if maximum allowed credits have been exceeded
   //-------------------------------------------------------
   //  Returns true if total credits does not exceed 18.
   //-------------------------------------------------------

   private boolean checkCredits(int numCredits)

   {

      if (numCredits + totalCredits < MAX_CREDITS)  //make sure max credits not exceeded

      {

           return true;

      }

      else

      {

           return false;

      }//end numCredits

   }//checkCredits
      
   //Method to add a course to the student’s schedule
   //-------------------------------------------------------
   //  Adds a course to the array if total credits does not exceed 18.
   //-------------------------------------------------------

   public void addCourse(String course, int numCredits)

   {

       if (courseNumber < SIZE)  //make sure array is not full

       {

            if (checkCredits(numCredits) == true) //if we’re under 18 credits

            {

               //add course

               schedule [courseNumber] = course + ":\t\t" + numCredits + "\tCredits\n";

               //increment number of credits

               totalCredits = totalCredits + numCredits;

               //increment number of courses

               if (courseNumber < MAX_COURSES)

                    courseNumber = courseNumber + 1;

            }

            else  //oops – can’t do more than 18 credits

            {

               System.out.println("You have exceeded the maximum allowed credits.");

            }//end checkCredits

         }

         else  //oops – can’t do more than 6 courses

         {

               System.out.println("You have exceeded 6 courses.");

         }//end courseNumber

   }//addCourse
          
   //Method to display the schedule
   //-------------------------------------------------------
   //  Will only print out the courses added to the array.
   //-------------------------------------------------------

   public void displaySchedule( )

   {

       for (int index = 0; index < courseNumber; index++)

       {

           System.out.println(schedule[index] + "\n");

       }//end for

   }//end display schedule

   //  Method to Return student information as string:   
   //-------------------------------------------------------   
   //  Returns the student information as a formatted string.   
   //-------------------------------------------------------
   
   public String toString()
   {
     String studentInfo;

     studentInfo = "Name:\t\t\t\t" + studentName + "\n" + "ID:\t\t\t\t" + studentID + "\n" + "Address:\t\t\t" + streetAddress
           + "\n" + "City:\t\t\t\t" + city + "\n" + "State:\t\t\t" + state + "\n" + "Zip Code:\t\t" + zipCode
           + "\n" + "Major:\t\t\t" + major + "\n";

     return studentInfo;
   }// end toString

   }//end class Student