/**
 Programer : Hieu Nguyen
 Assigment: PE15.13  Time Large File
 Date: July 12 2021
 Description: 
 */
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.util.HashSet;
import java.util.TreeSet;
import java.io.*;
import java.io.BufferedReader;

/*
   
Begin program with explanation to user of what program does.

Insert all words from a large file (such as the novel “War and
Peace”, into a Hash Set and a Tree Set.

Time the results.

List the timings. Which data structure is more efficient?
*/

public class TimeLargeFileReader
{
   public static void main(String[]args)throws IOException
   {
   String file ="war-and-peace.txt"; // Open the file 
   BufferedReader in = new BufferedReader(new FileReader(file));
   // create hashset and treesett
   HashSet<String> hashSet = new HashSet<>();
   TreeSet<String> treeSet = new TreeSet<>();
   String curLine;
   
   
   // create the stop watch object
   StopWatch stopWatch = new StopWatch();      
   stopWatch.start();
   
   while((curLine =in.readLine())!=null)
   {

            // split the sentence 
            String[] i = curLine.split(" ");

            // store the words in hash set
            for(String str: i)
                treeSet.add(str);
        }
        
        stopWatch.stop();

        // printing the time elapsed
        System.out.printf("\nLargeFileTimer by Hieu Nguyen.\n");
        System.out.printf("\nThe difference between Hash Set and Tree Set in elapsed time:\n");
        System.out.println("\nTime elapsed of Tree set is: "+ stopWatch.getElapsedTime());
         long tree_value=stopWatch.getElapsedTime();
         
        // opening file again
         in = new BufferedReader(new FileReader(new File(file)));     
        stopWatch.reset();      
        stopWatch.start();

        // reading the file line by line
        while((curLine=in.readLine())!=null)
        {

            // split the sentence 
            String[] i = curLine.split(" ");

            // store the words in tree set
            for(String str: i)
                hashSet.add(str);
        }
       
        stopWatch.stop();
        // printing the time elapsed
        System.out.println("\nTime elapsed of Hash set is: "+ stopWatch.getElapsedTime()); 
        
        long hash_value=stopWatch.getElapsedTime();
         
        returnValue(tree_value,hash_value);
        }
        
        public static void returnValue(long a, long b)
        {
        String methodName="";
        String str1="Tree";
        String str2="Hash";
        if(minValue(a,b)==a)
        {
            System.out.print("\nThe "+str1+" method is more efficient, and time elapsed is "+a);
        }
        else {
            System.out.print("\nThe "+str2+" method is more efficient, and time elapsed is "+b);
        }
        }
                  
        public static long  minValue(long treeSet , long hashSet) // compare for efficency of two method.
        {
         long minimum = 0;
         if (treeSet<hashSet)
         {
            minimum = treeSet;
          }
          else
          {
          minimum = hashSet;
          }
          return minimum;   
    }//end of main method   
      
}//end of program