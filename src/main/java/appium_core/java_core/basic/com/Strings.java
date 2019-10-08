package appium_core.java_core.basic.com;

public class Strings 
{

	public static void main(String[] args) 
	{
		String str = "Hello World !!!";
		String str_1 = "Hello" + " World !!!";
		System.out.println(str_1.replace('H', 'S'));
		System.out.println(str_1.indexOf('H'));
		String lowerCase = str.toLowerCase(); 
		String upperCase = str.toUpperCase(); 
		System.out.println(str);
		System.out.println(lowerCase);
		System.out.println(upperCase);
		int length = str.length();
		System.out.println(length);
	}

}
