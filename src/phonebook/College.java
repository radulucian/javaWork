package phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class College {

	HashMap<String, Student> college = new HashMap<String, Student>();

	public void addStudent(String lastName, String firstName,
			String homeAddress, String phoneNumber, String emailAddress,
			double grade, String specialization, String CNP) {

		Student newStudent = new Student(lastName, firstName, homeAddress,
				phoneNumber, emailAddress, grade, specialization);

		boolean status = true;
		if (CNP.length() == 13) {
			for (int i = 0; i < CNP.length(); i++) {
				if (!(Character.isDigit(CNP.charAt(i)))) {
					status = false;
				}
			}
		} else {
			status = false;
		}

		if (status == true) {
			college.put(CNP, newStudent);
		} else
			System.out.println("Please insert a valid CNP");
	}

	public void displayAllStudents() {
		Iterator<String> keySetIterator = college.keySet().iterator();

		while (keySetIterator.hasNext()) {
			String key = keySetIterator.next();
			System.out.println("Student CNP: " + key + "\n"
					+ "Student detail: " + college.get(key) + "\n");
		}
	}

	public void searchStudent(String searchedCNP) {
		if (college.containsKey(searchedCNP)) {
			Student searchedStudent = college.get(searchedCNP);
			System.out.println("The student with searched CNP: " + searchedCNP
					+ " has following details: \n" + searchedStudent.toString()
					+ "\n");
		} else {
			System.out
					.println("The student with searched CNP does not exists in our College");
		}
	}

	public void deleteStudent(String searchedCNP) {

		Iterator<Map.Entry<String, Student>> iter = college.entrySet()
				.iterator();
		while (iter.hasNext()) {
			Map.Entry<String, Student> entry = iter.next();
			if (searchedCNP.equalsIgnoreCase(entry.getKey())) {
				Student searchedStudent = entry.getValue();
				System.out
						.println("Following student will be deleted with searched CNP "
								+ entry.getKey()
								+ "\n"
								+ searchedStudent.toString() + "\n");
				iter.remove();
			}
		}

	}

	public void averageGrade(String searchedSpecialization) {
		Iterator<Map.Entry<String, Student>> iter = college.entrySet()
				.iterator();
		double i = 0;
		double sum = 0;
		while (iter.hasNext()) {
			Map.Entry<String, Student> entry = iter.next();
			if (searchedSpecialization.equalsIgnoreCase(entry.getValue()
					.getSpecialization())) {
				i++;
				sum += entry.getValue().getGrade();
			}
		}
		double average = sum / i;
		System.out.println("The average grade for specialization "+searchedSpecialization+" is " +average);

	}

	public static void main(String[] args) {
		College myCollege = new College();
		myCollege.addStudent("popescu", "Ana", "Str.Sucevei, nr. 7, BT",
				"0745.344.345", "rares.tuuu@gmail.com", 7.5, "Cibernetics",
				"1881111008888");
		myCollege.addStudent("popescu", "AnA", "Str.Sucevei, nr. 7, BTfdsfd",
				"0745.344.377", "rares.tuuu@gmail.com", 9.5, "Alghoritms",
				"2881111077888");
		myCollege.addStudent("ANA", "delia", "Str.Sucevei, nr. 7, BT",
				"0745.399.345", "rares.tuuu@gmail.com", 8.5, "Cibernetics",
				"2881116608888");
		myCollege.addStudent("stanila", "Anamaria", "Str.Sucevei, nr. 7, BT",
				"0745.344.345", "rares.tuuu@gmail.com", 5.5, "Cibernetics",
				"1881151008888");
		myCollege.addStudent("ionescu", "ana", "Str.Sucevei, nr. 7, BT",
				"0745.378.345", "rares.tuuu@gmail.com", 6.5, "Alghoritms",
				"2881661008888");
		myCollege.addStudent("popescu", "Ana", "Str.Sucevei, nr. 7, BT",
				"0745.344.345", "rares.tuuu@gmail.com", 5.5, "Mathematics",
				"1881111008880");
		myCollege.addStudent("popescu", "AnA", "Str.Sucevei, nr. 7, BTfdsfd",
				"0745.344.377", "rares.tuuu@gmail.com", 9.5, "Mathematics",
				"2881111077880");
		myCollege.addStudent("ANA", "delia", "Str.Sucevei, nr. 7, BT",
				"0745.399.345", "rares.tuuu@gmail.com", 7.5, "Alghoritms",
				"2881116608880");
		myCollege.addStudent("stanila", "Anamaria", "Str.Sucevei, nr. 7, BT",
				"0745.344.345", "rares.tuuu@gmail.com", 8.5, "Mathematics",
				"1881151008880");
		myCollege.addStudent("ionescu", "ana", "Str.Sucevei, nr. 7, BT",
				"0745.378.345", "rares.tuuu@gmail.com", 6.5, "Mathematics",
				"2881661008880");
		myCollege.addStudent("popescu", "Ana", "Str.Sucevei, nr. 7, BT",
				"0745.344.345", "rares.tuuu@gmail.com", 5.5, "Alghoritms",
				"1881111008885");
		myCollege.addStudent("popescu", "AnA", "Str.Sucevei, nr. 7, BTfdsfd",
				"0745.344.377", "rares.tuuu@gmail.com", 9.5, "Informatics",
				"2881111077885");
		myCollege.addStudent("ANA", "delia", "Str.Sucevei, nr. 7, BT",
				"0745.399.345", "rares.tuuu@gmail.com", 7.5, "Informatics",
				"2881116608885");
		myCollege.addStudent("stanila", "Anamaria", "Str.Sucevei, nr. 7, BT",
				"0745.344.345", "rares.tuuu@gmail.com", 8.5, "Informatics",
				"1881151008885");
		myCollege.addStudent("ionescu", "ana", "Str.Sucevei, nr. 7, BT",
				"0745.378.345", "rares.tuuu@gmail.com", 6.5, "Informatics",
				"2881661008885");
		myCollege.addStudent("popescu", "Ana", "Str.Sucevei, nr. 7, BT",
				"0745.344.345", "rares.tuuu@gmail.com", 5.5, "Robotics",
				"1881111008883");
		myCollege.addStudent("popescu", "AnA", "Str.Sucevei, nr. 7, BTfdsfd",
				"0745.344.377", "rares.tuuu@gmail.com", 9.5, "Robotics",
				"2881111077883");
		myCollege.addStudent("ANA", "delia", "Str.Sucevei, nr. 7, BT",
				"0745.399.345", "rares.tuuu@gmail.com", 7.5, "Robotics",
				"2881116608883");
		myCollege.addStudent("stanila", "Anamaria", "Str.Sucevei, nr. 7, BT",
				"0745.344.345", "rares.tuuu@gmail.com", 8.5, "Robotics",
				"1881151008883");
		myCollege.addStudent("ionescu", "ana", "Str.Sucevei, nr. 7, BT",
				"0745.378.345", "rares.tuuu@gmail.com", 6.5, "Alghoritms",
				"2881661008883");

		myCollege.displayAllStudents();
		myCollege.searchStudent("1881151008885");
		myCollege.deleteStudent("2881661008883");
		myCollege.averageGrade("Robotics");

	}

}
