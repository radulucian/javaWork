package phonebook;

import java.util.HashSet;
import java.util.Random;

public class Birthday {

	public static void main(String args[]) {

		HashSet hs = new HashSet();
		while (hs.size() < 30)
			{
				Random rand = new Random();
				int date = rand.nextInt(364);
				hs.add(date);
			}
		int size1 = hs.size();
		for (int j = 1; j <= 20; j++) {
			for (int i = 1; i <= 30; i++) {
				Random rand = new Random();
				int date = rand.nextInt(364);
				hs.add(date);
			}
		}
		int size2 = hs.size();
		double probability = (630 - size2) / 20;
		System.out.println(size1+" " +size2);
		System.out
				.println("The probability that any 2 people in a group of 30 have the same b-day is "
						+ probability + " %");
	}
}