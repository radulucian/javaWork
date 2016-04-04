
public class IncrementVariantID {

	public static void main(String[] args) {
		
		String variantIdCategories = "[3,2,1,1,1,1,1,1,1,1,1,1,8,9]";
		
		String beautify = variantIdCategories.replace("[", "").replace("]", "");
			
		String[] array = beautify.split(",");
		String[] results = new String[array.length];
		
		for (int i=0; i < array.length - 1; i++) {
			results[i] = array[i+1];
			}
			
		results[array.length-1] = array[0];
		String message = "";
		for (int j=0; j < results.length; j++) { 
			message = message + "{\"abc\":" + results[j] + ",\"id\":"+ "\""+results[j]+"\"" + "},";
		} 
		
		message = message.substring(0, message.length()-1);
		System.out.println("["+message+"]");
		
		
		
		}

	}

