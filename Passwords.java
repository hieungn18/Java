import java.util.Scanner;

public class Passwords
 {
  

  
   public static boolean isValid(String password)
    {
       
       if(password.length() < 8) 
       {
          
           return false;
       }
      
       boolean hasDigit = false;
       boolean hasUpper = false;
       boolean hasLower = false;
      
       for(int i=0; i < password.length(); i++) 
       {
          char ch = password.charAt(i);
         if( Character.isDigit(ch)) 
        {
          hasDigit = true;
        }
       else if (Character.isUpperCase(ch))
        {
        hasUpper = true;
        } 
       else if (Character.isLowerCase(ch))
        {
        hasLower = true;
        }
      }
         if (!hasDigit )
        {
          System.out.print("You need a digit number"); 
       }
       if (!hasUpper)
        {
          System.out.print("You need a UpperCase Letter");
       }
       if (!hasLower) 
       {
           System.out.print("You need a LowerCase Letter");
       }
      
       return hasDigit && hasUpper && hasLower;
   }

public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       while(true) 
       {
           System.out.print("Enter your password: ");
           String password = in.next();
           System.out.print("Re-enter your password: ");
           String confirmPassword = in.next();
          
           if (!password.equals(confirmPassword))
            {
               System.out.println("The passwords don't match. Re-enter your passwords.");
           }
           else if (isValid(password)) 
           {
               System.out.println("This password is valid. Done!");
               break;
           } 
           else 
           {                
           System.out.println("\nThe password is not valid");
           }
       }    
   }
}