import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ReverseFile {
   public static void main(String[] args) {
       String inFilename, outFilename;
       Scanner keybd = new Scanner(System.in);
       boolean success = false;
       ArrayList<String> lines;

       while(!success) {
           try {
               System.out.print("Please enter the filename for input: ");
               inFilename = keybd.next();
               lines = readFile(inFilename);
               System.out.print("Please enter the filename for output: ");
               outFilename = keybd.next();
               writeInReverse(outFilename, lines);
               success = true;
           } catch (Exception e) {
               System.out.println(e.getMessage());
           }
       }

   }

   public static ArrayList<String> readFile(String filename) throws FileNotFoundException{
       Scanner in = new Scanner(new File(filename));
       return readLinesOfArray(in);
   }

   public static ArrayList<String> readLinesOfArray(Scanner in){
       ArrayList<String> lines = new ArrayList<String>();
       while(in.hasNextLine()) {
           lines.add(in.nextLine());
       }
       in.close();
       return lines;
   }

   public static void writeInReverse(String filename, ArrayList<String> lines) throws FileNotFoundException{
       PrintWriter out = new PrintWriter(new File(filename));
       for(int i = lines.size()-1; i >-1; i--) {
           out.println(lines.get(i));
       }
       out.close();
       System.out.println("Please refresh project and check output file " + filename);
   }
}