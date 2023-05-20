/**
 Programer : Hieu Nguyen
 Assigment: PE14.16   SortPersonDemo
 Date: July 12 2021
 Description: SortPersonName demo.
 Implement a PersonNameSort. 
 Make two classes, PersonDemo2 and Person.
*/
public class Person implements Comparable<Person> 
{//start of class
      // instance variables

    private String name;
      //constructor
    public Person(String aName) 
    {
        name = aName;
    }

    public String getName()
     {
        return name;
    }
     
    public int compareTo(Person a)//compare to the name
     {
     
        return name.compareTo(a.name);
    }//end of constructor  
}//end of class