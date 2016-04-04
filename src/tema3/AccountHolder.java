package tema3;

import java.util.ArrayList;
import java.util.List;

public class AccountHolder {
	private String name;
	List<MainAccount> list = new ArrayList<MainAccount>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MainAccount> getList() {
		return list;
	}

	public void addAccount(CurrentAccount account) {
		list.add(account);
	}
	
	public void addAccount(SavingsAccount account) {
		list.add(account);
	}

	public void print ()
	{
		System.out.println("Name: " + name);
		System.out.println();
		for (MainAccount account : list) account.print();
	}
	
}
