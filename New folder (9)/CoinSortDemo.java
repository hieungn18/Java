/**
 Programer : Hieu Nguyen
 Assigment: PE14.2   CoinSort  Demo
 Date: July 12 2021
 Description: CoinSort demo.
 Implement a Coin Sort. 
 Make two classes, Coin and SelectionSorter.
*/
import java.util.Arrays;

public class CoinSortDemo 
{
   public static void main(String[] args) 
   {
                
      Coin[] a = {  new Coin(0.05, "Nickel"),
                    new Coin(0.05, "Nickel"),     
                    new Coin(0.10, "Dime"),
                    new Coin(0.01, "Penny"),                                     
                    new Coin(0.25, "Quarter"),
                    new Coin(0.01, "Penny"),
                    new Coin(0.44, "Peso"),
                    new Coin(0.10, "Dime"),
                };// end of array.
      System.out.println("Coin Sort by Hieu Nguyen\n");
                
      System.out.println("Unsorted Coin");
      
      for(int i=0; i<a.length ; i++)
      {    
         System.out.print(a[i].toString()+" / ");
      }
      
      SelectionSorter.sort(a); 
      
      System.out.println("\n\nSorted Coin");
         
       
      for(int i=0; i<a.length ; i++)
      {
        
         System.out.print(a[i].toString()+" / ");
                
       }

   }//end of main method

}//end of class