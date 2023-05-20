/**
 Programer : Hieu Nguyen
 Assigment: PE19.11  PalindromePairs
 Date: July 19 2021
 Description: 
 */
import java.util.stream.IntStream;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
/*Write a program that reads an integer n and then prints all squares of the integers from 1 to n that are palindromes 
(that is, their decimal representation equals its reverse). Use IntStream.range, map, and filter.
*/
public class PalindromePairs
{ 
   public static void main(String args[]) 
    {// constructor
     System.out.println(" Palindrome Pairs by Hieu Nguyen");
  
     Scanner in =new Scanner(System.in);
     //Ask for the value of n  
     System.out.printf("\nEnter The Value Of n: ");
     int n = in.nextInt();
     
    // range of intstream include 1 
    IntStream stream = IntStream.range(1, n + 1);
    
    //find the square
    IntStream square = stream.map(k -> (int)(Math.pow(k, 2)));
    
    //the reverse of number
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
     //display the result
      System.out.printf("\nPalindrome Pairs is: " + Arrays.toString(square.toArray()));
 
  }//end of main
 }//end of class
    
