package appium_core.java_core.create_text_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class create_txt_file 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("Text_file.txt");
		
		if(!file.exists())  // we check if file already exist
		{
			
			try
			{
				file.createNewFile();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		PrintWriter pw = new PrintWriter(file);
		pw.println("This is my file content");
		pw.println(100000);
		pw.close();
		System.out.println("Done!!!");

	}

}
