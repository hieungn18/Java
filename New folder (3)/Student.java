
/**
 Programer : Hieu Nguyen
 Assigment: PE8.7  Student class
 Date: July 1 2021
 Description: Student class demo.
  
   1.	Implement a class Student 
   2.	For this exercise, a Student has a name, a total quiz score, and the number of quizzes taken 
   3.	Supply an appropriate Constructor that receives and initializes a name 
   4.	Create methods getName(), addQuiz(int score), getTotalScore(), and getAverageScore():  include Javadoc comments for each method
*/
public class Student
{ // Start of class
  //Instance variables
      // a Student has a name, a total quiz score, and the number of quizzes taken.
 private String name;
 private int totalQuizScore;
 private int numberOfQuizzes;
  // Method
      //	Supply an appropriate Constructor that receives and initializes a name .
 public Student(String name)
 {
   this.name = name;
   totalQuizScore = 0;
   numberOfQuizzes = 0;   
 } // end of constructor
 
 //	Create methods getName(), addQuiz(int score), getTotalScore(), and getAverageScore()
 
 /**
   Get the student name.
   @return the Student name
   */
  public String getName()
  {
   return name;
  }
 /**
   Add one quiz to the student score
   @param the score of quiz.
  */  
  public void addQuiz(int score)
  {
   totalQuizScore = totalQuizScore + score;
   numberOfQuizzes++;
  }  
 /**
   get the student totalScore
   */ 
  public int getTotalScore()
  {
   return totalQuizScore;
  }
  /**
   get the averageScore of student
   */
  public int getAverageScore()
  {
   return  totalQuizScore / numberOfQuizzes;
  }
     
}// End of class 
