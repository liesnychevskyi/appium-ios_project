package appium_core.java_core.recursion;

public class recursion_factorial
{
	/// N! = N * (N - 1) * (N - 2) * ...
	/// 5! = 5 * 4 * 3 * 2 * 1         - factorial of (5)

	public  static int factorial(int N)
	{
		if(N <= 1)
		return 1;
		else return(N * factorial(N - 1));
	}
	/////////////////////////////////////////
	public static int fibonachi(int N)
	{
		if (N == 0) return 0;
		if (N == 1) return 1;
		return  fibonachi(N -1) + fibonachi(N -2);
	}


	public static void main(String[] args) 
	{
		System.out.println("Factorial is :" + factorial(5));
		System.out.println("Fibonachi is : " + fibonachi(5));
	}


}
