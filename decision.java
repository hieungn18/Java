import java.util.Scanner;

public class decision
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter your age: ");
      
      int age = in.nextInt();
      
      if(age>=20)
      {
         System.out.print("You can go to the party");
         
      }
      else if(age>14 && age <20)
      {
        System.out.print("You can stay until 10 p.m");
      }
      else
      {
         System.out.print("You cannot go to the party");
      }
    }
 }      