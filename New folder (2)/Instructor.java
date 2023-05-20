/**
 Programer : Hieu Nguyen
 Assigment: PE9.11  Person class
 Date: July 6 2021
 Description: Person class demo.
 Implement a superclass Person. 
 Make two classes, Student and Instructor, that inherit from Person.
  * An instructor has a salary.
*/
public class Instructor extends Person
{//Start of class
   //Instance variable
   private double salary;

   public Instructor(String n, int year, double s)
   {
      super(n, year);
      this.salary = s;
   }
   public String toString() //toString method
   {
      return super.toString()+String.format("\nSalary: $%,.2f\n",salary);
   }//End of constructor
}//End of class