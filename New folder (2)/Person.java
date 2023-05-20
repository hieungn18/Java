/**
 Programer : Hieu Nguyen
 Assigment: PE9.11  Person class
 Date: July 6 2021
 Description: Person class demo.
 Implement a superclass Person. 
 Make two classes, Student and Instructor, that inherit from Person.
*/

public class Person 
{// Start of class
   // Instance variables
   //String name, and year.
   private String name;
   private int year;
   //Method
   //Contructor

   public Person(String n, int y)
   {
   this.name = n;
   this.year = y;
   }
   
   public String toString()
   {
   return "\nName: "+ name +" \nYear of Birth: "+year;      
     
   }//End of contructor
}//End of method