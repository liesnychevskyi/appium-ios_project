package appium_core.java_core.basic.com;

public class LogicalOperators 
{

	public static void main(String[] args) 
	{
		//  ||  -- OR  operator
		//  &&  -- AND operator
		int subject_1 = 30;
		int subject_2 = 60;
		
		if((subject_1 >= 35) && (subject_2 >= 35))
		{
			System.out.println("The condition is true");
		}
		else
			System.out.println("The conditio is false");
//==============================================================================//		

		if((subject_1 >= 35) || (subject_2 >= 35))
		{
			System.out.println("The condition is true");
		}
		else
			System.out.println("The conditio is false");

	}

}
