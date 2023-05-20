import java.util.Scanner;

public class TimeReader
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      if (in.hasNextInt())
      {
         int hour = in.nextInt();
          if (hour>=1 && hour<=12)
         {
            String suffix = in.next();
            if (suffix.equals("am") || suffix.equals("pm"))
            {
              if(suffix.equals("pm"))
              {
                        hour+= 12;
                        hour = hour % 24;
              }

               System.out.println(hour);
            }
            else 
            {
               System.out.println("Error: The suffix must be am or pm.");
            }
         }
         else 
         {
            System.out.println("Error: The hour must be between 1 and 12.");
         }
      }
      else 
      {
         System.out.println("Error: Not an integer.");
      }
   }
}