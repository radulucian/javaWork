package tema3;

public class SavingsAccount extends MainAccount {

	private double interestRate;

	public SavingsAccount(String description, String IBAN, int balance, double interestRate) {
		super(description, IBAN, balance);
		setInterestRate(interestRate);
	}


	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void print() {
		super.print();
		System.out.println("Interest rate: " + interestRate);
		System.out.println();
	}

}
