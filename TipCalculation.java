import java.util.Scanner;
/*
 *TipCalculationRevised
 *
 *@HieuNguyen
 *version 6/28/2021
 */

public class TipCalculation
{
 public static void main(String[]args)
 {
   Scanner in = new Scanner(System.in);
   
   double amountOfBill, amountOfTips, percentageOfTip, tip_amount, bill_n_tip, tip_percentage;
 
   double satisfied;
   
   System.out.print("Enter the total amount of bill:$ ");
   amountOfBill = in.nextDouble();
   
   
   System.out.print("\nHow satisfied are you with us?: \n" +"\n1 = Totally Satisfied\n" +" \n2 = Satisfied\n" +  " \n3 = Disatisfied\n");
   
   System.out.print("\nEnter Your Level (1-3): ");
   satisfied = in.nextDouble();
         // Calculate the percentage of the tips base on sastified level of customers.  
     while (1> satisfied || satisfied >=4)
    {
    System.out.print("\nEnter Your Level (1-3): ");
   satisfied = in.nextDouble();  
   
    }     
     
    while( 1 == satisfied || satisfied <4)
    {
     if(satisfied ==1|| satisfied <2)
    {
       percentageOfTip= 0.2f;
                               
    }   
    else if (satisfied ==2||satisfied<3)
    {
       percentageOfTip= 0.15f;   
                           
    } 
    else 
    {
       percentageOfTip= 0.1f;
    }   
        // The method to calculate the amount of bills.
      tip_amount = percentageOfTip * amountOfBill;
       
      bill_n_tip = tip_amount + amountOfBill;
      
      tip_percentage = percentageOfTip*100;
          
      
       System.out.printf("\nAmount of Bill is: $%.2f \n" ,amountOfBill); // Enter amount of bill.
       
       System.out.println("\nSatisfaction level: "+(int) satisfied); //Print out you satisfied level.
       
        System.out.println("\nTip Percentage: "+(int)tip_percentage +"%"); // Print out the percentage of tip.
        
        System.out.printf("\nTip amount is:   $%.2f\n", tip_amount); // Print out the amount of tips with $ sign.
        
        System.out.printf("\nTotal Bill is:  $%.2f\n",bill_n_tip ); // Print out the amount of total bill with $ sign.
        break;
        }
        
       }  
                             
     }    
  
 
  