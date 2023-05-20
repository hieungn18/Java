/**
 Programer : Hieu Nguyen
 Assigment: PE8.7  Student class
 Date: July 1 2021
 Description: Student class demo.
 */ 
import java.util.Scanner;
/*
   5.	Create a StudentDemo program that creates a Student object
   6.	Call the addQuiz method 2 or more times
   7.	Then call the getName, getTotalScore and getAverageScore methods, displaying the results
   8.	Capture the output with a prtScn and save in a word file
   9.	Submit the *.java source code files and the Word document only to the Assignment folder for Chapter 8.  Do not submit the *.class files.
   10.	Don’t forget to include a block comment header at the start of your program with:  Programmer, Assignment (i.e. PEx.x), Date, Description
*/
public class StudentDemo
{// start of class
   public static void main(String[]args)
   {//start of main method
      System.out.println("Demo of Student class by Hieu Nguyen\n");
   
   // Create a StudentDemo program that creates a Student object
      Student student1 = new Student("Bob Jones");
   // Call the addQuiz method 2 or more times   
      student1.addQuiz(90);
      student1.addQuiz(100);
      student1.addQuiz(97);
      student1.addQuiz(95);
   // Then call the getName, getTotalScore and getAverageScore methods, displaying the results   
      System.out.println("Student name: " + student1.getName());
      System.out.println("Student Total Score: " + student1.getTotalScore());
      System.out.println("Average Score: " + student1.getAverageScore());     
   }// end main
}// end class   
      