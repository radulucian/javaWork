import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) throws Exception {
		String myVal = readPropretiesFromFile("test.properties", "favoriteSoda");
		System.out.println(myVal);
	}
	
	public static String readPropretiesFromFile(String filename, String parameter) throws Exception {
		
		String value = null;
		try {
			
			File file = new File(filename);
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();

			Enumeration<Object> enuKeys = properties.keys();
			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				
				if (key.equals(parameter)) {
					value = properties.getProperty(key);
					System.out.println(key + ": " + value);
					break;
				}
			
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}
}