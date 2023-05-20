import java.util.stream.IntStream;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
public class PalindromePairs
{ 


public static void main(String args[]) 
  {
     System.out.println(" Palindrome Paris by Hieu Nguyen");
  
     Scanner in =new Scanner(System.in);
       
     System.out.printf("\nEnter The Value Of n: ");
     int n = in.nextInt();
     
      
    IntStream stream = IntStream.range(1, n + 1);
    
    
    IntStream square = stream.map(k -> (int)(Math.pow(k, 2)));
    
    
    square = square.filter(k -> 
    { 
    int i = k; 
    
    int reverse = 0;
    
      while(i != 0) 
      {
    
    int digit = i % 10;
   
    reverse = reverse * 10 + digit;

        i /= 10;
    }
      return (reverse == k);
    }
  );                                         
     
   System.out.printf("\nPalindrome Pairs is: " + Arrays.toString(square.toArray()));
 
  }
 }
    
