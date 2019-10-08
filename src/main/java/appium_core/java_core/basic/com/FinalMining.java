package appium_core.java_core.basic.com;

public class FinalMining
{
	// FINAL VARIABLE can only be initialized once
	// FINAL CLASS cannot be sub classed
	// FIAL METHOD cannot be overridden by sub classes
	
	public final int number = 0;

	
		
		public static int retInt()
		{
			int a = 100;
			try
			{
				//System.exit(1); exit from the programm
				//a = 100/0;
				return a;
			}
			catch(Exception e)
			{
				System.out.println("Catch called");
				System.out.println(e);
				return a;
			}
			finally
			{
				a = 5000;
				
				System.out.println("Finally called");
				return a;
			}
			
		}
		
public static void main(String[] args)
{
	System.out.println(retInt());
}

}

