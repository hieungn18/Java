import java.util.Scanner;
/**
 *MathCalculation
 *
 *
 *@Hieu Nguyen
 *@version 6/25/2021
 */

public class MathCalculation2
{
   public static void main(String[]args)
   {
   
   float firstInteger;
   float secondInteger;
   double average =2d;
   float sum,different,product,distance,maximum,minimum;
   
   
   Scanner in = new Scanner(System.in);
   
   System.out.print("Enter the the 1st integer: ");
   firstInteger = in.nextInt();
   
   System.out.print("Enter the 2nd integer: ");
   secondInteger = in.nextInt();
   
    sum= firstInteger + secondInteger;
    different = secondInteger - firstInteger;
    product = firstInteger*secondInteger;
    average = (firstInteger + secondInteger)/2;
    distance = Math.abs( secondInteger - firstInteger);
    maximum = Math.max ( firstInteger, secondInteger);
    minimum = Math.min ( firstInteger, secondInteger);
    
   String num1 = "Sum"; 
   String num2 = "Different"; 
   String num3 = "Product"; 
   String num4 = "Average"; 
   String num5 = "Distance"; 
   String num6 = "Maximum"; 
   String num7 = "Minimum"; 
   
   System.out.printf("\n%-15s %2s %n", num1, (int)sum);
   System.out.printf("%-15s %2s %n", num2, (int)different);
   System.out.printf("%-14s %2s %n", num3, (int)product);
   System.out.printf("%-15s %2.2f %n", num4, average);
   System.out.printf("%-15s %2s %n", num5, (int)distance);
   System.out.printf("%-15s %2s %n", num6, (int)maximum);
   System.out.printf("%-15s %2s %n", num7, (int)minimum);
  }
}  






         
