import java.util.Scanner;


public class WhileLoops
{

   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter a positive nonzero number: ");
      int max= in.nextInt();
      
      while(max<1)
               
      {
         System.out.print("Invalid.Enter a valid number: ");
         max=in.nextInt();
        
        
      }
      
      int num=0;
      int total=0;
      
      while(num<=max)
      {
         total+=num;
         num++;
      }
           
      
      System.out.print(" The sum of all integer from 1 to " + max + " is " + total);
   }
}