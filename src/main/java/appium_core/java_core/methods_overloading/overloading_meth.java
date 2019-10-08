package appium_core.java_core.methods_overloading;

public class overloading_meth
{

	public static void main(String[] args)
	{
		
		System.out.println(add(3,6));
		System.out.println(add(3.5, 3.7));
		System.out.println(add("Stan","Liesnychevskyi"));
	}
	
	public static int add(int a, int b)
	{
		return (a + b);
	}
	
	public static double add(double a, double b)
	{
		return (a + b);
	}
	
	public static String add(String a, String b)
	{
		return (a + b);
	}

}
