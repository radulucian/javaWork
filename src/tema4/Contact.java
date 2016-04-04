package tema4;

public class Contact {

	private String lastName;
	private String firstName;
	private String homeAddress;
	private String phoneNumber;

	public Contact(String lastName, String firstName, String homeAddress,
			String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
		this.setPhoneNumber(phoneNumber);
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
		return phoneNumber.substring(0, 4) + '-'
				+ phoneNumber.substring(5, 8) + '-' + phoneNumber.substring(9);
	}

	public void setPhoneNumber(String phoneNumber) {
		boolean status = true;
		if (phoneNumber.length() == 12) {
			for (int i = 0; i < phoneNumber.length(); i++) {
				if ((i == 4 || i == 8) && phoneNumber.charAt(i) != '.') {
					status = false;
				} else if (((i != 4 && i != 8) && !(Character
						.isDigit(phoneNumber.charAt(i))))) {
					status = false;
				}
			}
		} else {
			status = false;
		}

		if (status == true) {
			this.phoneNumber = phoneNumber;
		} else
			System.out.println("Please insert a valid phone number");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.firstName.toUpperCase());
		sb.append(" ");
		String upperLastname = Character.toUpperCase(lastName.charAt(0))
				+ lastName.substring(1).toLowerCase();
		sb.append(upperLastname);
		sb.append(" +4");
		sb.append(getPhoneNumber());
		sb.append("\n");
		sb.append("\t");
		sb.append("Address: ");
		sb.append(homeAddress);
		return sb.toString();

	}

}
