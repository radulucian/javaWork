
public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 10, b = 0, c;
			c =  a / b;
		}
		catch (ArithmeticException e) {
			System.out.println("Error: " + e);
		}
 		
	}

}
