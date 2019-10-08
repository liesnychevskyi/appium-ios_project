package appium_core.java_core.basic.com;

public class MyClass_1 
{

	public static void main(String[] args) 
	{
		StaticMethods method = new StaticMethods();
		
		System.out.println(method.doMethingElse("something"));  // static | right way
		System.out.println(method.doMething("full gas"));  // no static   | not right way
		method.doMethingElse("full");
		StaticMethods.doMething("go"); // if method is [public static] we can call it by NAME OF CLASS
		StaticMethods.doMething("no"); // right way if static
		
		FinalMining fin = new FinalMining();
		//fin.number = 4;
		

	}

}
