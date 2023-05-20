/**
 Programer : Hieu Nguyen
 Assigment: PE14.2   CoinSort  Demo
 Date: July 12 2021
 Description: CoinSort demo.
 Implement a Coin Sort. 
 Make two classes, Coin and SelectionSorter.
*/
public class SelectionSorter 
{
   public static void sort(Coin[]a)
      {
       for (int i = 0; i < a.length; i++) 
       {
         int minPos = minimumPosition(a,i);
         
         swap(a, minPos, i);
         
         }
         }
       
   /**
      Finds the smallest element in a tail range of the array.
      @param a the array to sort
      @param from the first position in a to compare
      @return the position of the smallest element in the
      range a[from] . . . a[a.length - 1]
   */    
   private static int minimumPosition(Coin[]a, int from)
   {
      int minPos = from;
      
      for( int i = from +1; i< a.length; i++)
      {
         if ( a[i].getValue() < a[minPos].getValue()) {minPos = i;}
         }
          return minPos;           
       }//end of minimumposition.
   /**
      Swaps two entries of an array.
      @param a the array
      @param i the first position to swap
      @param j the second position to swap
   */    
        public static void swap(Coin[] a, int i, int j)
         {
            Coin temp = a[i];
            a[i] = a[j];
            a[j] = temp;
       }
 
}
