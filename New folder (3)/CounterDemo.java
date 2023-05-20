/**
 Programer : Hieu Nguyen
 Assigment: PE8.2 Tally Counter
 Date: July 1 2021
 Description: TallyCounter demo.
 */ 

import java.util.Scanner;
/*
  	Display an intro message explaining what the program does and name of the programmer 
   Create an object of type TallyCounter 
	Call the setLimit method
	Admit several people until the limit is exceeded
	
*/

public class CounterDemo
{// Start of class
   public static void main(String[]args)
   {//Start of main method
   
      System.out.println("Demo of Tally Counter by Hieu Nguyen\n");
      // Create a CounterDemo program that creates a counter object
      Counter counter1 = new Counter();              
      // The number of people admitted.       
      counter1.count();
      counter1.count();
      counter1.count();
      counter1.count();
      
      System.out.println("Amount of People: " + counter1.admitPerson());
      // Set the limit for the counter
      counter1.setLimit(3);
      
      }//end main
} //end class