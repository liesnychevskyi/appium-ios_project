package appium_core.java_core.static_keyworld;

public class Static_demo
{

	public static void main(String[] args)
	{
		// Static members belong to the class instead of a specific instance.
		
		Hello hello_0 = new Hello();
		Hello hello_1 = new Hello();
		Hello hello_2 = new Hello();
		
		hello_0.DoSomethingStatic("Hello Youtube");  // Not correct way of calling static method
		hello_1.DoSomethingElse("Right way of calling");  // Correct way of calling non static method
		Hello.DoSomethingStatic("Right wey of calling"); // Correct way of calling method
		Hello.age = 25;
		System.out.println("Hello age : " + Hello.age);
		Hello hello_3 = new Hello();
		hello_3.age = 36; // incorrect way
		System.out.println("Hello age : " + Hello.age);


	}

}
