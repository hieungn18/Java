import java.util.Scanner;
/**
 *SeasonOfTheYearCalculator
 *Season
 *@HieuNguyen
 *Date 3/11/2021
 */

public class SeasonsOfTheYearCalculator
 {
   public static void main(String[] args) 
   {
       Scanner in = new Scanner(System.in);
       
       System.out.println("Enter month(1 to 12):");
       
       int month = in.nextInt();
       
       if(month <0 || month >12) 
       {
           System.out.println("Enter valid month b/w 1 to 12:");
         
            month = in.nextInt();
       }
       System.out.println("Enter day(1 to 31):");
       
       int day = in.nextInt();
       
       if(day <0 || day >31)
        {
           System.out.println("Enter valid day(1 to 31):");
         
           day = in.nextInt();
        }
       
       String Season = "";             

       
       if(month >= 1 && month <=3)        //If month is 1, 2 or 3, season = “Winter”
       
           Season = "Winter";

              else if(month >= 4 && month <=6) //Else if month is 4, 5 or 6, season = “Spring”

           Season = "Spring";

       
       else if(month >= 7 && month <=9)   //Else if month is 7, 8, or 9, season = “Summer”
         
           Season = "Summer";

       else if(month >= 10 && month <=12) //Else if month is 10, 11, or 12, season = “Fall”

           Season = "Fall";


       if(month % 3 == 0 && day >=21)     //If month is divisible by 3 and day is greater than or equal to 21
       {
           if("Winter".equals(Season))    //If season is winter, season equals “Spring”

               Season = "Spring";

           else if("Spring".equals(Season))//Else if season is spring, season equal “Summer”

               Season = "Summer";
               
           else if("Summer".equals(Season))// Else if season is summer, season equals “Fall”

               Season = "Fall";            //Else season equals winter

           else
               Season = "Winter";
       }
      
       System.out.println(" Season: "+Season);
   }
}