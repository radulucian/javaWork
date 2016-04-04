import java.util.*;
  
class CopyOfArrayValuesChecker {
public static void main(String [] args) {
	
	List<String> list1 = new ArrayList<>();
	list1.add("ABC");

	List<String> list2 = new ArrayList<>();
	list2.add("2C0BF17717BBF93DE050007F0101DFAA");
	list2.add("2C0BF17717BBF93DE050007F0101DFAA");
	list2.add("2C0BF17717BBF93DE050007F0101DFAA");
	

    ArrayList<String> al3= new ArrayList<String>();
    for (String temp : list2)
        al3.add(list1.contains(temp) ? "Yes" : "No");
    System.out.println(al3);
		
	
	}
}