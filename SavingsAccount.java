
public class SavingsAccount extends BankAccount{
      private double rate =0.025; 
      private int savingsNumber;
      private String accountNumber;
      
      public SavingsAccount(String name, double Amount) {
  		super(name, Amount);
  		accountNumber=super.getAccountNumber()+"-"+savingsNumber;
  	}
      
      public void postInterest() {
    	  double intrest =0;
    	  intrest= (super.getBalance()*rate)/12;
    	  super.deposit(intrest);
      }
      
      @Override
      public String getAccountNumber() {
    	  return accountNumber;
      }
      
      public SavingsAccount(SavingsAccount oldAccount, double amount) {
    	  super(oldAccount,amount);
    	  savingsNumber++;
    	  accountNumber=super.getAccountNumber()+"-"+savingsNumber;
      }
      
      
}

