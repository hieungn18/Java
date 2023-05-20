import java.util.Scanner;

public class SumofInputs
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);      
      int sum = 0;
      int input;
      System.out.print("Enter values, 0 to quit: ");
      while (true)
      {
         input = in.nextInt();
         if(input ==0)
         {
            break;
         }
         sum+=input;
         
      }
                System.out.println("Sum:"+ sum);

    }
      
}