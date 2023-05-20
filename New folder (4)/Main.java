import java.io.*; 

public class Main
{
    //Since File operations are used, 
    //...this method throws the exception IOException and FileNotFoundException and hence used the throws keyword
        public static void main(String[] args) throws IOException, FileNotFoundException {
            //Open the file named "data.txt" for reading using the BufferedReader
            //Please place the file "data.txt" in the same directory as that of the .java file
            //Please add some contents to the file "data.txt"
        BufferedReader br = new BufferedReader(new FileReader(new File("Mary.txt")));
    
        //Declare a variable to store the read line from the file
        String line;
    
        //The below loop will iterate as long as there are lines in the file to be read
        //In each iteration, 1 line from the file will be read and assigned to the variable "line"
        while((line = br.readLine())!= null) {  
            //Declare a variable to store the reversed line
            String reversedLine = "";
            
            //The below loop will iterate in reverse through the length of the line.
            //For example, if a line in the file has 5 characters, the below loop will iterate from 4 to 0
            for (int i = line.length() - 1; i > -2; i--)
            {
                //Fetch the current character, convert it to string and append it to the variable "reversedLine"
                reversedLine += String.valueOf(line.charAt(i));
            }    
            //At the end of the loop, the current line will be reversed
            
            //Display the reversed line.
                System.out.println(reversedLine);
        }               
    
        //Close the reader
        br.close();
        }
}