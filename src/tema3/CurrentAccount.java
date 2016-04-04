package tema3;

public class CurrentAccount extends MainAccount {

	private boolean overdraft;

	public CurrentAccount(String description, String IBAN, int balance,	boolean overdraft) {
		super(description, IBAN, balance);
		setOverdraft(overdraft);
	}
	
	public boolean isOverdraft() {
		return overdraft;
	}

	public void setOverdraft(boolean overdraft) {
		this.overdraft = overdraft;
	}

	public void print() {
		super.print();
		System.out.println("Overdraft Enabled: " + overdraft);
		System.out.println();
	}
}
