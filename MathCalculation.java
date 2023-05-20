import java.util.Scanner;





public class MathCalculation
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
   
   System.out.format("\nSum:%4d", (int)sum);
   System.out.format("\nDiffernt:%4d" ,(int)different);
   System.out.format("\nProcduct:%4d" ,(int)product);
   System.out.format("\nAverage:%4.2f" ,average);
   System.out.format("\nDistance:%4d" ,(int)distance); 
   System.out.format("\nMaximum:%4d" ,(int)maximum);
   System.out.format("\nMinimum:%4d" ,(int)minimum);
   }
} 
   