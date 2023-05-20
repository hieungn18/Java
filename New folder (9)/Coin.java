/**
 Programer : Hieu Nguyen
 Assigment: PE14.2   CoinSort  Demo
 Date: July 12 2021
 Description: CoinSort demo.
 Implement a Coin Sort. 
 Make two classes, Coin and SelectionSorter.
*/
public class Coin
{  //Instance Variable
    private double value;
    private String name;
   // Constructor
   public Coin(double aValue, String aName)
   {//initaialize instance variable
      value = aValue;
      name = aName;
   }
   public String getName()
   {
      return name;
   }
   public double getValue()
   {
      return value;
   }

   public String toString()
   {
   
   return "[Name: " + name +  ", Value: " + value + "] ";
   }//end of contructor
}//end of Coin class