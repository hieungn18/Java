/**
 Programer : Hieu Nguyen
 Assigment: PE9.11  Person class
 Date: July 6 2021
 Description: Person class demo.
 Implement a superclass Person. 
 Make two classes, Student and Instructor, that inherit from Person.
 *A student has a major.
*/
public class Student extends Person
{// Start of class
   //Instance variable.
   private String major;

   public Student(String n, int year, String m)
   {
      super(n, year);
      this.major = m;
   }
   public String toString()//toString method.
   {
      return super.toString()+" \nMajor: "+major; 
   }// End of constructor
}//End of class