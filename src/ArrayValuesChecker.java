import java.util.*;
  
class ArrayValuesChecker {
public static void main(String [] args) {
	
	List<String> list1 = new ArrayList<>();
	list1.add("2C0BF17717BBF93DE050007F0101DFAA");
	list1.add("2C0BF17717BBF93DE050007F0101DFAAC1");
	list1.add("2C0BF17717BBF93DE050007F0101DFAAC6");
	list1.add("2C0BF17717BBF93DE050007F0101DFAA");
	list1.add("d3b485c0-961d-4eb6-895a-3670594d30e6");
	list1.add("2C0BF17717BBF93DE050007F0101DFAAC4");

	List<String> list2 = new ArrayList<>();
	list2.add("xxx2C0BF17717BBF93DE050007F0101DFAA");
	list2.add("2C0BF17717BBF93DE050007F0101DFAA");
	list2.add("2C0BF17717BBF93DE050007F0101DFAA");
	

    ArrayList<String> results = new ArrayList<String>();
    for (String temp : list2) {
    	if (!list1.contains(temp)){
    		results.add(temp);
    	}
    }
    
    System.out.println(results);
    
    
    
    }
}

		
	

