import java.util.Scanner;
/**
 *
 *
 *
 *
 */
public class NameAndInitials
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      
       String firstName;
       String middleName;
       String lastName;
       
       System.out.print("\nEnter your frist name: ");
       firstName = in.next();
       
       System.out.print("\nEnter your middle name: ");
       middleName = in.next();
       
       System.out.print("\nEnter your last name: ");
       lastName = in.next();
       
                                                    // Alternate way: String firstInitial = firstName.substring(0,1);
       char firstInitial = firstName.charAt(0);      
       char middleInitial = middleName.charAt(0);
       char lastInitial = lastName.charAt(0);
       
       System.out.println("\nName: " + firstName +" " + middleName +" "+ lastName);
       System.out.println("\nInitials: " + firstInitial + middleInitial + lastInitial);
       
       
   }       
}                 