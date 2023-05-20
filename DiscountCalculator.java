import java.util.Scanner;  // Scanner class

/**
 *Discount Calculator for
 *video club Discount.
 *
 *@Hieu Nguyen
 *@version 2/24/2021
 */

public class DiscountCalculator 
{      
   public static void main(String[] args) 
   {
   
       int numberOfMovieRentals;       //The number of movie retanl
       int numberOfMemberReferrals;    // The number of new referral
       double discount;         
       int PERCENT=75;
       
       //Scanner object for keyword input.
       Scanner in = new Scanner(System.in);
        
       //The number for movie rentals
       System.out.print("Enter the number of movie rentals:");
       numberOfMovieRentals = in.nextInt();
       
       //The number for members referred
       System.out.print("Enter the number of members referred to the video club:");
       numberOfMemberReferrals = in.nextInt();
       
       //Calculate discount
       discount = numberOfMovieRentals + numberOfMemberReferrals;
       
       //Display the discount
       System.out.printf("The discount is equal to: %.2f percent",Math.min(discount,PERCENT));
      
   }
}