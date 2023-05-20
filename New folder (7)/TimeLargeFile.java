
import java.util.HashSet;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TimeLargeFile 
{
    public static void main(String[] args) throws IOException
    {

        // opening the file war-and-peace.txt
        BufferedReader read = new BufferedReader(new FileReader(new File("war-and-peace.txt")));

        // creating a hash set and tree set
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        String curLine;

        // creating stopwatch object
        StopWatch stopWatch = new StopWatch();

        // starting the stopwatch
        stopWatch.start();

        // reading the file line by line
        while((curLine =read.readLine())!=null){

            // split the sentence and put into an array
            String[] arr = curLine.split(" ");

            // store the words in hash set
            for(String str: arr)
                hashSet.add(str);
        }
        // stop the stopwatch
        stopWatch.stop();

        // printing the time elapsed
        System.out.println("Time elapsed when hash set is used: "+ stopWatch.getElapsedTime());

        // opening file again
         read = new BufferedReader(new FileReader(new File("war-and-peace.txt")));

        // resetting the stopwatch
        stopWatch.reset();

        // starting the stopwatch
        stopWatch.start();

        // reading the file line by line
        while((curLine=read.readLine())!=null){

            // split the sentence and put into an array
            String[] arr = curLine.split(" ");

            // store the words in tree set
            for(String str: arr)
                treeSet.add(str);
        }

        // stop the stopwatch
        stopWatch.stop();

        // printing the time elapsed
        System.out.println("Time elapsed when tree set is used: "+ stopWatch.getElapsedTime());


        read.close();
    }

}
