import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * ReverseFiles
 * @Hieu Nguyen
 * @version 4/22/2021
 *
 */

public class ReverseFiles 
{

        public static void main(String[] args) 
        {
                Scanner in=new Scanner(System.in);
                // A while loop that runs while the boolean value is false

                boolean valid=false;
                String filename=null;
                String outFileName=null;
                while(!valid)
                {
                        try
                        {
                                System.out.print("Please enter the file name for input:");
                                filename=in.nextLine();
                                ArrayList<String> lines=readFile(filename);
                                System.out.print("\nPlease enter the file name for output:");
                                outFileName=in.nextLine();
                                writeInReverse(outFileName, lines);
                                valid=true;
                                
                        }
                        catch(FileNotFoundException ex)
                        {
                                System.out.println("File not found.");
                        }
                        catch(NoSuchElementException ex)
                        {
                                
                        }
                        catch(IOException ex)
                        {
                                
                        }
                }
        }
        
         // Param filename
         // Return ArrayList<String>
         // Throws IOException 
        public static ArrayList<String> readFile(String fileName) throws IOException
        {

                Scanner in=new Scanner(new File(fileName));
                ArrayList<String> lines=readLinesOfArray(in);

                return lines;


        }
                public static ArrayList<String> readLinesOfArray(Scanner in)
        {
                ArrayList<String> lines=new ArrayList<String>();

                while(in.hasNext())
                {
                        lines.add(in.nextLine());
                }

                in.close();
                return lines;
        }
                public static void writeInReverse(String filename,ArrayList<String> lines)
        {

                PrintWriter pw;
                try {
                        pw = new PrintWriter(new File(filename));


                        for(int i=lines.size()-1;i>=0;i--)
                        {
                                pw.println(lines.get(i));
                        }
                        
                        pw.close();     
                } 
                catch (FileNotFoundException e) 
                {
                        System.out.println("File cannot be opened for writing.");
                }
        }
}
