import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// class named Project6

public class Project6 {
  
//   main method or tester method

   public static void main(String[] args) throws IOException {
      
//       create object of Scanner class
      
       Scanner s= new Scanner(System.in);

//       boolean flag value is false
      
       boolean flag = false;
         
//       while till flag value is false
         
       while(! flag) {
             
//           using try block
             
           try {
                 
//               take input as filename from user
                 
               System.out.print("\nPlease Enter the file name for Input : ");
                 
               String inputfile = s.next();
                 
               ArrayList<String> list = readfile(inputfile);
                 
               System.out.print("\nPlease Enter the file name for Output : ");
                 
               String outputfile = s.next();
                 
               writeinreverse(list, outputfile);
                 
//               if all having alright then put the flag value as true
                 
               flag = true;
                 
           }
             
//           catch FileNotFoundException exceptoin
             
           catch (FileNotFoundException e) {

           System.out.println("Error! File not found!");
           }
             
       }
      

   }
  
  
//   method that read file

   public static ArrayList<String> readfile(String filename) throws FileNotFoundException {
      
  
//       create object of Scanner class
      
       // pass the path to the file as a parameter
       File file = new File("Z:\\CSC1301\\Chapter 6\\Work on Java" + filename);
   Scanner sc = new Scanner(file);
  
//   create arraylist
  
   ArrayList<String> list = new ArrayList<String> ();
      
//   use try block
  
   try {
      
//       call method readlinesofarray that read file and store it into list
      
       list = readlinesofarray(sc, list);
      
   }
  
//   close Scanner in finally block
  
   finally
   {
   sc.close();
   }
  
   return list;
  
   }
  
  
//   read file and store in list and return this list
  
   public static ArrayList<String> readlinesofarray(Scanner sc, ArrayList<String> list){
      
//       using while loop read file
      
       while( sc.hasNext() )
   {
         
       list.add(sc.nextLine());
      
   }
      
       sc.close();
      
       return list;
      
      
   }
      
  
// method that write file
  
   public static void writeinreverse(ArrayList<String> list, String filename) throws IOException {
      
//       create object of FileWriter class
      
       FileWriter writer ;
      
       try {
          
           // pass the path to the file as a parameter

           writer = new FileWriter("Z:\\CSC1301\\Chapter 6\\Work on Java" + filename);
          
//           another try block
          
           try {
              
               int j=1;
              
//               using loop write the data into file
              
               for (int i = list.size()-1; i >=0 ; i--) {
                     
           writer.write(j+". "+list.get(i) + "\n");
           j++;
           }
           }
          
           finally {
              
               writer.close();
           }
      
          
       } catch (IOException e) {
          
           e.printStackTrace();
       }
      

   }
  
  
   }