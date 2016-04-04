import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Scan4Files {

	public static void main(String[] args) throws IOException {
	
		  File f = new File("D:\\LUCIAN_WORK\\DATA\\WP-CR\\jmeter-tests\\latest");

		    FilenameFilter textFilter = new FilenameFilter() {
		        public boolean accept(File dir, String name) {
		            return name.toLowerCase().endsWith(".jmx");
		        }
		    };
		    String name = "";
		    File[] files = f.listFiles(textFilter);
		    for (File file : files) {
		        if (file.isDirectory()) {
//		            System.out.print("directory:");
		        } else {
//		            System.out.print("     file:");
		        }
		        name = name + "," + file.getName();
		        
		    }
		    System.out.println(name);
		}
	
	}

