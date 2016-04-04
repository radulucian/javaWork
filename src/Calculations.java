
public class Calculations {

	public static void main(String[] args) {
		String message = "";
		double expected = 3790.6159472000004;
		double actual = 3790.6159472;
		int decimals = 13;
		
		double result = Math.pow(10, -decimals);
		
		System.out.println(result);
		
		if (Math.abs(expected - actual)<result)
		{
			  message = message + "NetEstimatedMaximumLoss not correct! \nExpected:\t" +expected +"\nActual:\t"+actual + "\n";

		}
		else
		{
			  message = "pass";
		}
		
		System.out.println(message);
	}

}
