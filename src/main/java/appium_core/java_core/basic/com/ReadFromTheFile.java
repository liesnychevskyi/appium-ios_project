package appium_core.java_core.basic.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTheFile 
{

	public static void main(String[] args) 
	{
		BufferedReader br = null;
		
		try
		{
			br = new BufferedReader(new FileReader("C:\\Users\\liesn\\eclipse-workspace\\JavaTutorial\\readfrom.txt"));
			//br = new BufferedReader(new FileReader("Text_file.txt"));
			String line;
			
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				br.close();
			} 
			catch (IOException e)
			{
				
				e.printStackTrace();
			}
		}
	}
//	C:\Users\liesn\eclipse-workspace\JavaTutorial\Text_file.txt
}
