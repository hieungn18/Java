/**
 Programer : Hieu Nguyen
 Assigment: PE15.10  ParksingSpace
 Date: July 12 2021
 Description: 
 */
import java.util.Stack;
import java.util.Scanner;
/*  E15.10
The driveway is a “Last-In, First-Out” stack. 
Of course, when a car owner retrieves a vehicle that wasn’t the last one in, 
the cars blocking it must temporarily move to the street so that the requested vehicle can leave. 
Write a program that models this behavior, using one stack for the driveway and one stack for the street. 
Use integers as license plate numbers. 
Positivenumbers add a car, Negativenumbers remove a car, Zerostops the simulation. 
Print out the stack after each operation is complete
Begin program with an explanation to user of what program does and how it operates.
*/


public class Driveway{

   // Instance variable
   private Stack<Integer> driveway;
   private Stack<Integer> street;
   // Constructor
   public Driveway()
   {
      driveway = new Stack<>();
      street = new Stack<>();
   }  // end of constructor
      
   public void add(int license)
   {
      if(!driveway.contains(license))
      {
         driveway.push(license);
         print();
       }  
       else
       {
       System.out.println("That car is already in the driveway");
       }
     }  // end of add method
     // Print out stack after each operation is complete
    public void print()
    {
      System.out.println("In Driveway starting at first in: ");
      for( int i = 0; i< driveway.size();i++)
      {
         System.out.println(driveway.get(i).toString());
       } 
       System.out.println("On Street starting at first in: ");
      for( int i = 0; i< street.size();i++)
      {
         System.out.println(street.get(i).toString());
       }  
    }//end of print method
    public void remove(int license)
    {
      if(driveway.contains(license))
      { 
         int currentPlate = driveway.pop();
         if(currentPlate == license)
         {print();}
         while ( currentPlate != license)
         {
            street.push(currentPlate);
            print();
            currentPlate = driveway.pop(); // take another car off the stack
          }
         while ( street.size() > 0)
         {
           currentPlate = street.pop();
           driveway.push(currentPlate);
           print(); 
        } 
       }
       else 
       {
         System.out.println("That car is not in the driveway");
        }//end of remove method
      }
}//end of class