import java.util.Scanner;
/**
 *LoopsThatCompute
 *Loops
 *@HieuNguyen
 *Date 3/25/2021
 */

public class LoopsDemo
{
    public static void main(String[] args) 
    {
        int sumOfAllEven = 0, sumOfAllSquares = 0, sumOfTwoPowers = 0;
        for (int i = 2; i <= 100; i++) 
        {
            if (i % 2 == 0) 
            {
                sumOfAllEven += i;
            }
        }
        System.out.println("The sum of all even numbers between 2 and 100  : " + sumOfAllEven);

        for (int i = 1; i <= 100; i++) 
        {
            sumOfAllSquares += (i * i);
        }
        System.out.println("The sum of all squares between 1 and 100 (inclusive). : " + sumOfAllSquares);

        int c = 1;
        int d = 0;
        while(d <= 20) 
        {
            System.out.println("2^" + d + " = " + c);
            c *= 2;
            d++; 
                    
        }
        System.out.println("The power of 2 between 2 and 220 (inclusive). : ");

        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.printf("Enter a: ");
        a = in.nextInt();
        System.out.printf("Enter b: ");
        b = in.nextInt();
        int sumOfAllOdds = 0;
        for (int i = a; i <= b; i++) 
        {
            if (i%2==1) 
            {
                sumOfAllOdds += i;
            }
        }
        System.out.println("The sum of all odd numbers between " + a + " and " + b + " (inclusive), : " + sumOfAllOdds);

        System.out.print("Enter a number : ");
        int no =in.nextInt();
        int no2= no;
        int sumOfOddDegits = 0;
        while (no!=0) {
            int r = no % 10;
            if (r % 2 == 1) 
            {
                sumOfOddDegits += r;
            }
            no = no/10;
        }
        System.out.println("Sum of odd digits of " + no2 + "  : " + sumOfOddDegits);
    }
}