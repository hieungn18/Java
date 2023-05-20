import java.util.Scanner; //Scanner class
/**
 * PasswordValidation
 *
 *@HieuNguyen
 *@version 4/1/2021
 *
 */



public class PasswordValidation
{

   
   public static boolean isValid(String password)
   {
       //Check for the length.
       if(password.length()<8)
       {
            return false;
       }
       
       boolean isDigit = false;
       boolean isUpperCase = false;
       boolean isLowerCase = false;

      
       //For upper and lower case characters
       
       int upper=0, lower=0;
       
       for(int i=0; i<password.length(); i++)
       {
            if(Character.isUpperCase(password.charAt(i)))
            {
                upper++;
            }
            else if(Character.isLowerCase(password.charAt(i)))
            {
                lower++;
            }
       }
       //If any case not found
       
       if(upper==0 || lower==0)
       {
            return false;
       }
      
       //Check for digit
       int digit=0;
       
       for(int i=0; i<password.length(); i++)
       {
            if(Character.isDigit(password.charAt(i)))
            {
                digit++;
            }
       }
       //If no digit found
       if (digit==0)
       {
            return false;
       }
      
       //Otherwise return true.
         return true;
   }
  
    
   public static void main(String[] args) 
   {
        //Scanner to read input
        
       Scanner in =new Scanner(System.in);
       
      
       
       while(true)
       {
            // Password
            System.out.print("Enter password: ");
            String password1=in.next();
            
            // Confirm password      
            
            System.out.print("Confirm password: ");
            String password2=in.next();
            
            //If passwords not matched 
            
            if (password1.compareTo(password2)!=0)
            
            {
               System.out.println("The passwords do not match");
            }   
            
            else if(password1.compareTo(password2)!=0 || !isValid(password1))
            {
                System.out.println("The password is not valid");
            }
            else
            {
                System.out.println("Your Password is valid");
                break;
                
            }
       }
   }
}