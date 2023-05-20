import java.util.Scanner;

public class Loopdemo3test
{
   public static void main(String[] args)
   {
   Scanner in= new Scanner(System.in);
      int i=0;
      int sum = 0;
      
      while (sum < 10)
      {
         i++;
         sum = sum + 1;
      }
      System.out.println(i);
   }
} 