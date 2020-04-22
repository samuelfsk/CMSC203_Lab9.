
public class CheckingAccount extends BankAccount {
	private static double FEE=0.15;
	
	public CheckingAccount(String name, double Amount) {
		super(name, Amount);
	    super.setAccountNumber(super.getAccountNumber()+"-10");
	}
	
	
	@Override
	public boolean withdraw(double amount) {
		double newAmount=amount+FEE;
		super.withdraw(newAmount);
		return true;
	}

}
