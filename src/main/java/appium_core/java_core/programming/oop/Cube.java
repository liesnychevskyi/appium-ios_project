package appium_core.java_core.programming.oop;

public class Cube 
{
	int length;
	int bredth;
	int height;
	
	Cube(int l, int b, int h) // Constructor overloading
	{
		length  = l;
		bredth = b;
		height = h;
		
		System.out.println("We are in overloading constructor");
	}
	
	Cube() // Constructor default
	{
		length  = 10;
		bredth = 20;
		height = 20;
		
		System.out.println("We are in default constructor");
	}
	
	public int getCubeVolume()
	{
		return (length * bredth * height);
	}
}
