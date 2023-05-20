import java.util.Scanner;
/*
 *TipCalculation
 *
 *@HieuNguyen
 *version 6/26/2021
 */


public class TipCalculationRevised
{
 public static void main(String[]args)
 {
   Scanner in = new Scanner(System.in);
   
   double amountOfBill, amountOfTips, percentageOfTip, sastified, tip_amount, bill_n_tip, tip_percentage, tip_cent, cents1, cents2, tip_total_amount;
 
   
   
   System.out.print("Enter the total amount of bill:$ ");
   amountOfBill = in.nextDouble();
   
   
   System.out.print("\nHow sastified are you with us?: \n" +"\n1 = Totally Sastified\n" +" \n2 = Sastified\n" +  " \n3 = Disastified\n");
     
   System.out.print("\nEnter Your Level (1-3): \n");
   sastified = in.nextInt();
   
         if(sastified ==1)
   {
       percentageOfTip= 0.2f;
    
                       
    }   
    else if (sastified ==2)
    {
       percentageOfTip= 0.15f;
    
    } 
    else 
    {
       percentageOfTip= 0.1f;
    
     }      // end of if statement
     
     // same calculations/output apply to all satisfaction levels - no need to duplicate code
           tip_amount = percentageOfTip * amountOfBill;
       
      bill_n_tip = tip_amount + amountOfBill;
      
      tip_percentage = percentageOfTip*100;
      
      tip_cent = (int) Math.round (tip_amount * 100);
      
      cents1 = tip_cent % 100;
      
      tip_total_amount = (int) Math.round(bill_n_tip*100);
      
      cents2 = tip_total_amount %100;
      
      
       System.out.printf("\nAmount of Bill is: $%.2f \n", amountOfBill);  // change to printf for fixed floating point number
       
       System.out.println("\nSatisfaction level: "+(int)sastified);
       
        System.out.println("\nTip Percentage: "+(int)tip_percentage +"%");
        
        System.out.println("\nTip amount is:   $"+(int) Math.floor(tip_amount)+ " dollars and "+ (int)cents1 + " cents." );
        
        System.out.printf("\nTotal Bill is:  $%.2f", bill_n_tip ); // changed to printf

    }
   
}