
public class Jmeter {

	public static void main(String[] args) {
		
		int []  FeatureID = {2925063,2911027,2939028};
		int ExpectedFeatureIDValue = 2925063;
		
	
		for (int i = 0;i<FeatureID.length;i++)
		{
	
			String val = Integer.toString(FeatureID[i]);
			if(val.contains(Integer.toString(ExpectedFeatureIDValue)))
			{
				System.out.println(FeatureID[i]);
			}
			
		}
		
	}
	

}
