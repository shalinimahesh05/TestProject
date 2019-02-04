package TextFileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TextFileReader {
	public static void main(String[] args)throws Throwable
	{
		File file = new File("C:\\Users\\mkumar\\Documents\\workspace\\ExternalFileReading\\bin\\TextFileReading\\TestData.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		
		String str;
		while((str = br.readLine())!= null)
		{
			System.out.println(str);
		}
		
	}

}
