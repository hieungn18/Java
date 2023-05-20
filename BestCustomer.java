import java.util.*;
/**
 *Who is the best Customer
 *
 *@Hieu Nguyen
 *@version 4/14/2021
 */

public class BestCustomer{                                       
        public static void main(String[] args)
        {          
                
                Scanner in = new Scanner(System.in);                      
                System.out.println("You will be prompted for purchase price\nThis program will determine who is the best customer\n");  
                double price;                 
                String name;
                ArrayList<Double> sales = new ArrayList<>();                      // Two array list for sales and customers
                ArrayList<String> customers = new ArrayList<>();
                
                while(true)
                 {                                                                // An infinite loop which ends when user enters 0 in the price
                        System.out.println("Enter the price(0 to end):");        // Input the price
                        price = in.nextDouble();                                 // Store the price 
                        if (price==0)                                            // If price equals 0 break the loop.
                                break;
                        sales.add(price);
                        System.out.println("Customer's last name:");            //  Store the last name of customer
                        name = in.next();
                        customers.add(name);
                
                }
                
                System.out.println("Price\tCustomer");                     //  Print all the customers 
                for(int i=0;i<sales.size();i++)
                        System.out.println(sales.get(i)+"\t"+customers.get(i));
                
                name = nameOfBestCustomer(sales,customers);               // call the method nameOfBestCustomer 
                
                if (name!=null)                                               // If name is not null print the best customer name
                        System.out.println("\n\nBest customer's name "+name+"-");
                else                                                       // Otherwise there are no customers to display
                        System.out.println("No customers to display");
                
                
                
                
        }
        
        
        public static String nameOfBestCustomer(ArrayList<Double>sales, ArrayList<String>customers) //  Returns the best customer name
         {        
                if (sales.size()==0)                                    // if size is 0 means no customer so return null value. 
                        return null;
                int bestNum = 0;                                      
                for(int i=1;i<sales.size();i++) 
                {
                        if (sales.get(bestNum)<sales.get(i))
                                bestNum = i;  
                }
                
                return customers.get(bestNum);                         //  Return the customer's name;
                
        }
}