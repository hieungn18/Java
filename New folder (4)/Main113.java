import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Main11
{
   public static void main(String[]args) throws IOException, FileNotFoundException
   {
      String inFileName="";
      Scanner in = new Scanner (System.in);
      boolean success = false;
       while(!success) {
           try {
               System.out.print("Please enter the filename for input: ");
               inFileName = in.next();
               success = true;
               }catch ( Exception e){
               System.out.println(e.getMessage());
            }
         }
         String line;
       // Bên em thì bỏ cái src đi

       BufferedReader br = new BufferedReader(new FileReader(new File("src/"+inFileName)));
       // Sai ở chổ này. readLine works with BufferReader, not with Scanner
         while((line = br.readLine())!= null)
         {  
            //Declare a variable to store the reversed line
            String reversedLine = "";
            
            //The below loop will iterate in reverse through the length of the line.
            //For example, if a line in the file has 5 characters, the below loop will iterate from 4 to 0
            for (int i = line.length() - 1; i > -1; i--)
            {
                //Fetch the current character, convert it to string and append it to the variable "reversedLine"
                reversedLine += String.valueOf(line.charAt(i));
            }    
            //At the end of the loop, the current line will be reversed
            
            //Display the reversed line.
                System.out.println(reversedLine);
        }               
    
        //Close the reader
        in.close();
        }
}
      

      