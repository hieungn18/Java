/**
 Programer : Hieu Nguyen
 Assigment: PE20.3  ReverseFileLines
 Date: July 21 2021
 Description: 
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.*;
/*
Write a method that reverses all lines in a file. Read all lines, reverse each line, and write the result.
*/
public class ReverseFileLines
{
   public static void main(String[]args) throws IOException
   {
      String inFileName="";
      Scanner in = new Scanner (System.in);
      boolean success = false;   
      while(!success) 
      {
           try {
               System.out.printf("This program will ReverseFileLines by Hieu Nguyen\n");
               System.out.printf("\nPlease Enter the Filename for Input: ");  // Input the file name.
               inFileName = in.next();
               
               success = true;
               }
               catch ( Exception e)
               {
               System.out.println(e.getMessage());
            }
      //Declare a variable to store the reversed line
       String line= "";
         //Open the file for reading using the BufferedReader.

         BufferedReader br = new BufferedReader(new FileReader(new File(inFileName)));
         System.out.printf("\nBefore\n");
         while((line = br.readLine())!= null)
          {  
            
            for (int i=0; i > line.length();i++)
            {
                
                line += String.valueOf(line.charAt(i));
               
               }         
                //Display the original text.      
                System.out.println(line);
                }//End of for

            //Open the file again for reading using the BufferedReader.

            br = new BufferedReader(new FileReader(new File(inFileName)));

            System.out.printf("\nAfter\n");
            while((line = br.readLine())!= null)
            {
               //Declare a variable to store the reversed line
               String reversedLine = "";
            for (int  i = line.length() -1; i > -1; i--)
            {
                //The current character, convert it to string and append it to the variable "reversedLine"
                reversedLine += String.valueOf(line.charAt(i));
               
              }  
                //Display the reversed line.               
                System.out.println(reversedLine);
                }       
        }//End of for
        //Close reader
        in.close();
   }//End of main
}//End of class




       
      

      