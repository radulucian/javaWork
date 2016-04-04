package tema3;

public class MainAccount implements Printable {

	private String description;
	private String IBAN;
	private int balance;

	public MainAccount(String description, String IBAN, int balance) {
		this.balance = balance;
		this.description = description;
		this.IBAN = IBAN;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void print() {
		System.out.println("Account No: " + IBAN);
		System.out.println("Account Desc: " + description);
		System.out.println("Account Balance: " + balance);
	}

}
