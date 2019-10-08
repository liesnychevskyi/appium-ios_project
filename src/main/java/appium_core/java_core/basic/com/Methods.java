package appium_core.java_core.basic.com;

public class Methods 
{

	public static void main(String[] args)
	{
		myFirstMethod();
		sayHelloWorld("Stan");
		int res = addFunction(100,10);
		int result = res * 2;
		System.out.println(result);
	}

	public static void myFirstMethod()
	{
		System.out.println("Hello World !!!");
	}
	// Parameter passing
	public static void sayHelloWorld(String name)
	{
		System.out.println("Hello " + name);
	}

	public static int addFunction(int a, int b)
	{
		return (a + b);
		//return a + b;
	}


}
