//This is a Driver program to test the external Class named Student
public class StudentDriver //BEGIN Class Definition
{
 //****************  Main Method*************************
 public static void main (String[] args)
 {
   //Data Definitions:

    //Instance Data
      String name;
      String id;
      String street;
      String city;
      String state;
      String zip;
      String major;

      //Executable Statements:

   //Initialize first Student
   name = "Fred Fergel";
   id = "0123";
   street = "123 Main Street";
   city = "Smalltown";
   state = "NY";
   zip = "12345";
   major = "Computer Science";

      //instantiate the Student object
   Student student1 = new Student(name, id, street, city, state, zip, major);

   //Test toString
   System.out.println("Student 1\n\n" + student1.toString());

   //Print a blank line
   System.out.println();
   
   //Add a course
   student1.addCourse("CSC 111", 4);
   student1.addCourse("CSC 112", 4);
   student1.addCourse("ENG 103", 3);
   student1.addCourse("CSC 109", 1);   
   student1.addCourse("PEH 101", 1);
   student1.addCourse("PHY 107", 1);
   student1.addCourse("ENG 211", 2);
   
   //Print schedule

   System.out.println("Student 1's Schedule:\n\n");

   student1.displaySchedule();   //call method

  }//end main
      
}//end StudentDriver