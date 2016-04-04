package agenda;

public class Contact {

	private String lastName;
	private String firstName;
	private String homeAddress;
	private String phoneNumber;

	

	public Contact(String lastName, String firstName, String homeAddress,String phoneNumber) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.homeAddress = homeAddress;
		this.phoneNumber = phoneNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

}
