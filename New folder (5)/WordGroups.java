/**
 Programer : Hieu Nguyen
 Assigment: PE19.15  GroupPrintWord
 Date: July 19 2021
 Description: 
 */
import java.util.Scanner;
import java.util.stream.Stream;;
import java.util.stream.Collectors;
import java.util.TreeMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;

public class WordGroups
{
   public static void main(String[]args)throws IOException
   {
      System.out.println("This will count the words in test.txt by Hieu Nguyen");
      String filename = "test.txt";
      Map<Integer,Long> result = new TreeMap<>();
      try ( Scanner in = new Scanner(new File(filename)))
      {
         List<String> wordsList = new ArrayList<>();
         while(in.hasNext())
         {
            wordsList.add(in.next());
         }
         
         Stream<String>words = wordsList.stream();
         result = words.collect( 
                                 Collectors.groupingBy(
                                 w->w.length(),
                                 Collectors.counting()));
                                 }
         System.out.println("\nWord counts in: " + filename);
         System.out.println(result);
      }// end of main
   }//end of class