/**
 Programer : Hieu Nguyen
 Assigment: PE20.9   CreateNewDirectories
 Date: July 21 2021
 Description: 
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateNewDirectories
{
   public static void main(String[]args)
   {
    try
      {
       Scanner in = new Scanner(System.in);
       System.out.println("This program will CreateNewDirectories by Hieu Nguyen");
       System.out.print("\nEnter the full path of the life->");
       String infile = in.next();
       createFilePath(Paths.get(infile));
       }
      catch(IOException e)
      {
         System.out.println("Error: " + e );
      }  
   }
   
   public static void createFilePath(Path path) throws IOException
   {
      Path parent = path.getParent().toAbsolutePath();
      Path current = parent.getRoot();
      for(Path p : parent)
      {
         current = current.resolve(p);
         
         if(!Files.exists(current))
         {
            Files.createDirectory(current);
         }
         Files.createFile(path);
      }//End of for
   }// End of main
}//End of class
 
      