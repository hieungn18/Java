/**
 Programer : Hieu Nguyen
 Assigment: PE15.10  ParksingSpace
 Date: July 12 2021
 Description: 
 */
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

public class DrivewayDemo
{

   public static void main(String[] args)
   {
      Driveway testDrive = new Driveway();
      Scanner in = new Scanner(System.in);
      System.out.printf("Parking Space by Hieu Nguyen\n");
      System.out.println("\nEnter Your License Plate Number ");
      
      while ( in.hasNextInt())
      {
         int license = in.nextInt();
         if ( license > 0 )// add
         {
            testDrive.add(license);
         }
         else if (license < 0 )//remove
         {
            testDrive.remove(-1*license);
         }
         else
         {
            return; //done
         }
      } // end of while
 }// end of main method
}// end of demo program  