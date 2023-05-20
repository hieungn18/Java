import java.util.Scanner;



public class ForLoopAndNestedLoops
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("We will find the test average using a For Loop");
      
      System.out.print("\nHow many test Score?: ");
      
      int test= in.nextInt();
      
      double total=0;
      
      for(int i = 0; i <test;i++)
      {
         System.out.print("Enter test " + (i+1) + " grade: ");
         double grade=in.nextDouble();
         total+=grade;
      }
      double average= total/test;
      
      System.out.printf("The average is %.1f\n", average);
      
      
      System.out.println("\nThe average rainfall using the nested loops");
      
      System.out.print("Enter the number of years: ");
      int years=in.nextInt();
      
      System.out.println(" Enter the rainfall in inches for each month");
      
      double monthRain=0;
      double totalRain=0;
      
      for(int i = 1; i<=years; i++)
      {
         for(int j=1;j<=12;j++)
         {
            System.out.print("Year " + i + " month " + j + ": ");
            monthRain= in.nextDouble();
            
            totalRain+= monthRain;
         }
      }
      
      double rainAverage=totalRain/(years*12);
      
      System.out.printf("Average of the rainfall is %.2f" , rainAverage);
      
   }
}
      