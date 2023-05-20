import java.util.Scanner;

/**
 *
 *
 *
 *
 */
public class TestAverage
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      
      double test1;
      double test2;
      double test3;
      double average;
      
      System.out.print("Enter test 1 score: ");
      test1 = in.nextDouble();
      
      System.out.print("Enter test 2 score: ");
      test2 = in.nextDouble();
      
      System.out.print("Enter test 3 score: ");
      test3 = in.nextDouble();
      
      average = (test1 + test2 + test3) / 3.0;
      
      System.out.printf("\nTest 1 score: %3.1f\n",test1);      // de \n dang truoc de cach hang
      System.out.printf("Test 2 score: %3.1f\n",test2);
      System.out.printf("Test 3 score: %3.1f\n",test3);
      System.out.printf("\nTest Average: %3.1f\n",average);    // de \n dang truoc de cach hang
    }     
}      