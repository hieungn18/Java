/**
 Programer : Hieu Nguyen
 Assigment: PE8.2 Tally Counter
 Date: July 1 2021
 Description: TallyCounter demo.
 
 	Create an appropriate Constructor in the class
	Include a limit instance variable
	Include a setLimit method.  Display limit that was set.
	The limit is set with a call:   
public void setLimit (int maximum)
	If the count was clicked more often than the limit, simulate an alarm by printing out a message “Limit exceeded”.
	Include an admitPerson method.  Display current count.
	Include javaDoc comments for all methods

 */ 
public class Counter
{//Start of class
   // Instance variables
  private int value;
  
  private int maximum;
 // Get the count for counter
  public void count()
   {
       value++;
   }
   //Set the limit for the counter
  public void setLimit(int maximum)   
   {
     if ( value  > maximum) 
      {
      System.out.println("Limit exceeded"); // if the number > than the limit. It will print out limit exceeded.
      } 
      else 
      {
          value++; //Otherwise, It will add up until reach the limit.
      }
   }
   /** Get the amount of admit person
   @return value
   */
   public void reset()
   {
      value =0;
   }
  public int admitPerson()
  {
   return value;
  }     
}// End of class

    
  