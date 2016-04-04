
import java.io.File;

import org.apache.commons.io.FileUtils;

public class CopyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//for windows x64
		try{   
			File srcJobs = new File("C:/PRACTICA/JMeterFunctionalTesting/JenkinsFiles/jobs");
			File destJobs = new File("C:/Program Files (x86)/Jenkins/jobs");
			FileUtils.copyDirectory(srcJobs, destJobs);
		}
		catch(Exception e){
			// if any error occurs
			e.printStackTrace();
		}

//		
//		//for windows x64
//		try{   
//			File srcDir = new File("C:/Demo/source");
//			File destDir = new File("C:/Demo/target");
//			FileUtils.copyDirectory(srcDir, destDir);  
//		}
//		catch(Exception e){
//			// if any error occurs
//			e.printStackTrace();
//		}
	}

}
