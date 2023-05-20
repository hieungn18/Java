import java.util.Scanner;

/**
   This program simulates a bank with checking and savings accounts.
*/
public class AccountDemo
{
   public static void main(String[] args)
   {
      // Create accounts

      final int ACCOUNTS_SIZE = 10;
      BankAccount[] accounts = new BankAccount[ACCOUNTS_SIZE];
      for (int i = 0; i < accounts.length / 2; i++)
      {      
         accounts[i] = new CheckingAccount();
         accounts[i] = new BasicAccount();
      }
      
      for (int i = accounts.length / 2; i < accounts.length; i++)
      {      
         SavingsAccount account = new SavingsAccount();
         account.setInterestRate(0.75);
         accounts[i] = account;
      }

      // Execute commands

      Scanner in = new Scanner(System.in);
      boolean done = false;
      while (!done)
      {
      
         System.out.println("\nDemo of Basic Bank Account Subclass by Hieu Nguyen\n");
         System.out.print("\nD)eposit  W)ithdraw  M)onth end  Q)uit: "); 
         String input = in.next();
         if (input.equals("D") || input.equals("W")) // Deposit or withdrawal
         {
             
             
            System.out.print("\nEnter account number:  ");
            int num = in.nextInt();
            System.out.println("\nCurrent Balance:$ " + accounts[num].getBalance());
            
            System.out.printf("\nEnter amount of Deposit/Withdraw:$ ");
            double amount = in.nextDouble();

            if (input.equals("D")) { accounts[num].deposit(amount); }
            else { accounts[num].withdraw(amount); }
            
            System.out.println("\nBalance:$ " + accounts[num].getBalance());
            
         }
         else if (input.equals("M")) // Month end processing
         {
            for (int n = 0; n < accounts.length; n++)
            {
               accounts[n].monthEnd();
               System.out.println(n + " " + accounts[n].getBalance());
            }
         }
         else if (input.equals("Q"))
         {
            done = true;
         }
      }
   }
}