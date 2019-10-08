package appium_core.java_core.basic.com;

public class Recursion 
{
	/// 5! = 5 x 4 x 3 x 2 x 1   -- factorial of number 5

	public static void main(String[] args) 
	{
		System.out.println(factorial(5));

	}
//-------------------------------------------------------------// Recursion	
	public static int factorial(int N)
	{
		if(N <= 1)
			return 1;
		else return (N * factorial(N - 1));
	}
	
	

}
