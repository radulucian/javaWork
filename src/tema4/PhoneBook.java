package tema4;

import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBook {

	private ArrayList<Contact> cList;
	
	public PhoneBook() {
		cList = new ArrayList<Contact>();
	}

	public void addContact(String lastN, String firstN, String homeAdd,
			String phoneNo) {
		Contact newCont = new Contact(lastN, firstN, homeAdd, phoneNo);
		cList.add(newCont);
	}

	public void displayAllContacts() {
		for (Contact contact : cList) {
			System.out.println(contact);
		}
	}

	public void searchContact(String searchedString) {
		int it = 1;
		StringBuilder showContacts = new StringBuilder();
		showContacts.append("\n"+"Following contact(s) matches your search:" + "\n");
		for (Contact contact : cList) {
			if (contact.getFirstName().equalsIgnoreCase(searchedString)
					|| contact.getLastName().equalsIgnoreCase(searchedString)
					|| contact.getPhoneNumber().contains(searchedString)) {
				showContacts.append("     "+(it++)+"."+" "+ contact.toString()+"\n");
			}

		}
		if (it > 1) {
			System.out.println(showContacts);
		} else {
			System.out
					.println("Sorry, no contact was found containing this information");
		}

	}

	public void deleteContact(String searchedString) {
		Iterator<Contact> it = cList.iterator();
		while (it.hasNext()) {
			Contact contact=it.next();
			if (contact.getFirstName().equalsIgnoreCase(searchedString)
					|| contact.getLastName().equalsIgnoreCase(searchedString)
					|| contact.getPhoneNumber().contains(searchedString)) {
							
				System.out.println("The contact with following details was removed: ");
				System.out.println(contact+"\n");
				it.remove();
				System.out.println("The remaining contacts are: ");
			}

		}

	}

	public static void main(String[] args) {
		PhoneBook myPhoneBook = new PhoneBook();
		myPhoneBook.addContact("popescu", "Ana", "Str.Sucevei, nr. 7, BT",
				"0745.344.345");
		myPhoneBook.addContact("popescu", "AnA", "Str.Sucevei, nr. 7, BTfdsfd",
				"0745.344.377");
		myPhoneBook.addContact("ANA", "delia", "Str.Sucevei, nr. 7, BT",
				"0745.399.345");
		myPhoneBook.addContact("stanila", "Anamaria", "Str.Sucevei, nr. 7, BT",
				"0745.344.345");
		myPhoneBook.addContact("ionescu", "ana", "Str.Sucevei, nr. 7, BT",
				"0745.378.345");
		
		myPhoneBook.displayAllContacts();
		myPhoneBook.searchContact("ana");
		myPhoneBook.searchContact("-399-");
		myPhoneBook.deleteContact("ionescu");
		myPhoneBook.displayAllContacts();

	}

}
