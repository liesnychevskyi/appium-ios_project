package appium_core.java_core.basic.com;

public class TryCatchTest 
{

	public static void main(String[] args) 
	{
		try 
		{
			int a = 100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("--------------------------------------------------------");

	}

}
