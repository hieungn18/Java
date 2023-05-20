import java.util.Scanner;

public class decision1
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter your score(1-20): ");
      
      int Score = in.nextInt();
      
      int tastyPoint=1;
      
      if(Score>=10)
      {
         if (Score>=15)
         {
            tastyPoint=2;
         }
      }
      else
      {
         tastyPoint=0;
      }
      System.out.print("Tasty Point: "+tastyPoint);
   }
}
             