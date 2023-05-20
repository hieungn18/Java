import java.util.Scanner;
/**
 *
 *
 *
 *
 */
 public class CookiesCalories
 {
   public static void main(String[]args)
   
   {
   
      Scanner in = new Scanner(System.in);
      
      System.out.print("\nEnter cookies per bag: ");
       
      int COOKIES_PER_BAG = in.nextInt();
      
      System.out.print("\nEnter serving per bag: ");
      
      
      int SERVING_PER_BAG = in.nextInt();
      
      System.out.print("\nEnter calories per bag: ");
      
      int CALORIES_PER_SERVING = in.nextInt();
            
      
      int cookiesEaten;       // De int cookiesEaten o day thi o duoi k can de int nua, neu k de o day thi o duoi dai de int.( cookiesEaten va totalCalories)
      
      
      int COOKIES_PER_SERVING = COOKIES_PER_BAG / SERVING_PER_BAG;
      
      int CALORIES_PER_COOKIES = CALORIES_PER_SERVING / COOKIES_PER_SERVING;
      
     
      
      System.out.print("\nEnter the  number of cookies eaten: ");
      
      cookiesEaten = in.nextInt(); /// Day ne
      
      int totalCalories = cookiesEaten * CALORIES_PER_COOKIES;
      
      System.out.printf("\nNumber of total calories consumed: %,d\n", totalCalories);
    }
}      