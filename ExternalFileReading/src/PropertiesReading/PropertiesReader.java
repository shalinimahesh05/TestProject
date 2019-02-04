package PropertiesReading;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {
	
	public static void main(String[] args)throws Throwable
	{
		Properties prop = new Properties();
		
		File file = new File("C:\\Users\\mkumar\\Documents\\workspace\\ExternalFileReading\\src\\PropertiesReading\\ObjectRepo.properties");
		
		FileInputStream fs= new FileInputStream(file);
		
		prop.load(fs);
		
		System.out.println(prop.getProperty("Text_xpath"));
	}

}
