/**
 Programer : Hieu Nguyen
 Assigment: PE9.9  BankAccount
 Date: July 6 2021
 Description: Create BasicAccount subclass belong to BankAccount.
 */
public class BasicAccount extends BankAccount
{  //Start of class
   // Instance variables

   
  private int withdrawals;
   public BasicAccount()
   {
      withdrawals = 0;

   }  

//method withdraw holds with amount declared a double overDraftFee of a $30


   public void withdraw(double amount)
  {
      int overDraftFee =  -30;
      
      double balance = getBalance();

   if (  amount > balance || balance <= 0) // Check the amount in the balance and the amount that want to withdraw.
    {
        balance = balance -30;            // Fre apply to witdraw if the transaction is overdraft.
         
       System.out.println("\nYou have withdrawn the money more than your account has. An overdraft fee with $30 penalty has been added.");
      super.withdraw(amount - overDraftFee);
     }
    else
     {
        super.withdraw(amount);
      }// End of constructor
   }
}// End of class