/**
 Programer : Hieu Nguyen
 Assigment: PE9.11  Person class
 Date: July 6 2021
 Description: Person class demo.
 Implement a superclass Person. 
 Make two classes, Student and Instructor, that inherit from Person.
*/
import java.util.Scanner;

public class PersonDemo 
{// Start of class

   public static void main(String[] args)
    {//Start of main method
    
    //Create a person, a student, and an instructor demo program that create student subject.
      Person p = new Person(" Hieu Nguyen", 1995);
      Student s = new Student("Hieu Nguyen",1995, "Computer Science");
      Instructor i = new Instructor("Hieu Nguyen", 1995, 100000.00);
      
      System.out.println("Demo of Person class by Hieu Nguyen");
      //Display the result
      System.out.println("\nPerson"+p);     
      System.out.println("\nStudent"+s);      
      System.out.println("\nInstructor"+i);
   }//End of main
}//End of class