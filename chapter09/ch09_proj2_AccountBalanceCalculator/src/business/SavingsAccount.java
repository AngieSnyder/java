package business;

public class SavingsAccount extends Account {
	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	// User can't establish an account without a balance,
	// so we need a balance in the constructor. Also, we
	// have a business rule that states monthlyInterestRate
	// is 1%. We will not set the monthlyInterestPayment until
	// the end of the month in the App.
	public SavingsAccount(double balance) {
		setBalance(balance);
		this.monthlyInterestRate = .01;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}

	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	
	public void applyInterestPayment() {
		// determine what the monthly interest payment is
		double mip = balance * monthlyInterestRate;
		// set monthlyInterestPayment (mip)
		setMonthlyInterestRate(mip);
		// add mip to balance
		balance += mip;
	}
	
}
