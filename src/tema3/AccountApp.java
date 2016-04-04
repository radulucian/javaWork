package tema3;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount account1 = new CurrentAccount("JB's Personal Account", "111", 1000, true);
		SavingsAccount account2 = new SavingsAccount("John's Savings", "222", 4000, 3.7);
		SavingsAccount account3 = new SavingsAccount("Mary's Savings", "333", 5000, 4.1);

		AccountHolder owner = new AccountHolder();

		owner.setName("James Bond");
		owner.addAccount(account1);
		owner.addAccount(account2);
		owner.addAccount(account3);

		owner.print();

	}

}
