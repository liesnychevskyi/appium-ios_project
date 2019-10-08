package appium_core.java_core.inharitance.com;

public class MainMethod
{

	public static void main(String[] args) 
	{
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		
		rectangle.set_values(10, 20);
		triangle.set_values(10, 20);
		
		System.out.println("Area of rectangle is = " + rectangle.area());
		System.out.println("Area of triangle is = " + triangle.area());

	}

}
