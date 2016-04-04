import java.util.Arrays;

public class Combination {
  
	public static String[][] vec = 
		{
			{"0MB", "50MB", "75MB", "100MB", "150MB", "200MB", "250MB", "300MB", "350MB", "400MB", "450MB", "500MB", "750MB", "1000MB", "1700MB", "2000MB"}, 
			{"500RETEA", "1000RETEA", "1500RETEA", "2000RETEA", "2500RETEA", "3000RETEA", "NEL_RETEA"}, 
			{"0NAT", "30NAT", "60NAT", "90NAT", "110NAT", "130NAT", "160NAT", "200NAT", "250NAT", "300NAT"}
		};
	
	public static void main(String[] args) {		
	  recursive_vector_printer(0, "");

	}

	public static void recursive_vector_printer(int d, String str) {
	  if (d == vec.length) {
		System.out.println(str.substring(0, str.length()-1));
		return;
	  }
	  for (int k = 0; k < vec[d].length; k++) {
		recursive_vector_printer(d + 1, str + vec[d][k] + ",");
	  }
	  return;
	}

}