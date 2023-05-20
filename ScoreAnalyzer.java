import java.util.Scanner;

/**
 * A class for analyzing scores
 * Ngoc Huong Xuan Nguyen
 * @version 1.0
 */
public class ScoreAnalyzer {
   
   /**
    * Prompt the user for a set of scores and returns an array of scores
    * @param scanner Scanner object to read user input 
    * @param numScores number of scores to be entered
    * @return array of scores entered by user
    */
   public static double[] userScores(Scanner scanner, int numScores) {
      double[] scores = new double[numScores]; // initialize an array to hold the scores
      
      // user input scores
      for (int i = 0; i < numScores; i++) {
         System.out.print("Enter a new score: ");
         double score = scanner.nextDouble();
         
         // while loop to validate scores are between 0 and 100
         while (score < 0 || score > 100) {
            System.out.print("Invalid. Enter a score: ");
            score = scanner.nextDouble();
         }
         
         scores[i] = score;
      }
      
      return scores; // return the array of scores
   }
   
   /**
    * This method calculates the average of an array of scores
    * 
    * @param scores array of scores
    * @return average of scores
    */
   public static double calculateAverage(double[] scores) {
      double sum = 0;
      
      for (int i = 0; i < scores.length; i++) {  
         sum += scores[i];
      }
      
      return sum / scores.length;
   }
     
   /** 
    * This method calculates the number of scores above or equal to the average
    * 
    * @param scores array of scores
    * @param average average of scores
    * @return number of scores above or equal to the average
    */
   public static int calculateNumAboveAverage(double[] scores, double average) {
      int numAboveAverage = 0;
      
      for (int i = 0; i < scores.length; i++) {
         if (scores[i] >= average) {
            numAboveAverage++;
         }
      }
      
      return numAboveAverage;
   }

   /** 
    * This method calculates the number of scores below the average
    * 
    * @param scores array of scores
    * @param average average of scores
    * @return number of scores below the average
    */
   public static int calculateNumBelowAverage(double[] scores, double average) {
      int numBelowAverage = 0;
      
      for (int i = 0; i < scores.length; i++) {
         if (scores[i] < average) {
            numBelowAverage++;
         }
      }
      
      return numBelowAverage;
   }
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    
      // user input number of scores
      System.out.print("How many scores to be entered?: ");
      int numScores = scanner.nextInt();
    
      // user input scores
      double[] scores = userScores(scanner, numScores);
    
      // calculate the average of scores
      double average = calculateAverage(scores);
      System.out.printf("The average is: %.2f\n", average);
    
      // calculate number of scores above or equal to the average
      int numAboveAverage = calculateNumAboveAverage(scores, average);
      System.out.printf("Number of scores above or equal to the average: " + numAboveAverage);
      }
      }
    
      //
