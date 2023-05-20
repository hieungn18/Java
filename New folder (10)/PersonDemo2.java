/**
 Programer : Hieu Nguyen
 Assigment: PE14.16   SortPersonDemo
 Date: July 12 2021
 Description: SortPersonName demo.
 Implement a PersonNameSort. 
 Make two classes, PersonDemo2 and Person.
*/
import java.util.Scanner;



public class PersonDemo2 
{

    public static void main(String[] args) 
    {    // Get infor of 10 persons.
        System.out.println("\nPerson Sort by Hieu Nguyen"); 
        System.out.println("\nEnter The Names of 10 Persons");    
        Scanner in = new Scanner(System.in);
        Person[] a = new Person[10];
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print("\nEnter name of person " + (i+1) + ": ");
            a[i] = new Person(in.nextLine());
        }
         Person first = a[0];
         Person last = a[0];
        for (int i = 0; i < a.length; i++) //compare the name.
        {
            if (a[i].compareTo(first) < 0) 
            {
            first = a[i];
            }
            else if (a[i].compareTo(last) > 0) 
            {
            last = a[i];
            }
        }   
        System.out.println("\nThe Name of First person is: " + first.getName());
        System.out.println("\nThe Name of Last person is: " + last.getName());

        
    }//end of main method
}//end of class