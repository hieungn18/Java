import java.util.Scanner;
/**
*
*
*
*
*/
public class CreditCardApr
{
   public static void main(String[]args)
   {
   
   Scanner in = new Scanner(System.in);
   System.out.print("\nEnter amount owed: ");
   double AmountOwed = in.nextDouble();
   
   
   System.out.print("\nApr: ");
   double AmountApr = in.nextDouble();
   
 
   
   double AprPercent = AmountApr / 100.0;
   
   double Payment =  AmountOwed * AprPercent;
   
   double MinimunPayment = Payment / 12;
   
 

  
   
   
   
   System.out.printf("\nroundOff:  $%.4f%n%n" ,MinimunPayment);
   }
 }  
   