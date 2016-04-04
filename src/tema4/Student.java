package tema4;

public class Student {

	private String lastName;
	private String firstName;
	private String homeAddress;
	private String phoneNumber;
	private String emailAddress;
	private double grade;
	private String specialization;

	public Student(String lastName, String firstName, String homeAddress,
			String phoneNumber, String emailAddress, double grade,
			String specialization) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
		this.setPhoneNumber(phoneNumber);
		this.setEmailAddress(emailAddress);
		this.setGrade(grade);
		this.setSpecialization(specialization);

	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {

		char dot = emailAddress.charAt(emailAddress.length() - 4);
		boolean status = false;
		if (emailAddress.contains("@")) {
			if (Character.isAlphabetic(emailAddress.charAt(0))) {
				if (dot == '.') {
					status = true;

				}

			}
		}

		if (status) {
			this.emailAddress = emailAddress;
		} else {
			System.out.println("Please insert a valid email address");
		}
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if (grade > 0.0 && grade <= 10.0) {
			this.grade = grade;
		} else {
			System.out
					.println("Please insert a valid grade between 0.0 and 10.0");
		}

	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		boolean status = false;
		String[] specializationArray = new String[5];
		specializationArray[0] = "Cibernetics";
		specializationArray[1] = "Mathematics";
		specializationArray[2] = "Informatics";
		specializationArray[3] = "Robotics";
		specializationArray[4] = "Alghoritms";
		for (String s : specializationArray)
			if (specialization.equalsIgnoreCase(s)) {
				status = true;
			}
		if (status) {
			this.specialization = specialization;
		} else {
			System.out
					.println("Please insert a valid specialization from following values: Cibernetics, Mathematics, Informatics, Robotics, Alghoritms");
		}
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
		return phoneNumber.substring(0, 4) + '-' + phoneNumber.substring(5, 8)
				+ '-' + phoneNumber.substring(9);
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
		sb.append("\n");
		sb.append("\t");
		sb.append("Email address: ");
		sb.append(emailAddress);
		sb.append("\n");
		sb.append("\t");
		sb.append("Last year grade: ");
		sb.append(grade + ", ");
		sb.append("Specialization: ");
		sb.append((specialization.toUpperCase()));
		return sb.toString();

	}

}
