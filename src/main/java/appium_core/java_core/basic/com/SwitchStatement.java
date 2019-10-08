package appium_core.java_core.basic.com;

public class SwitchStatement 
{

	public static void main(String[] args) 
	{
		int score = 20;
		
		// byte, short, int, char  -- we can use 
		
		switch (score)
		{
			case 90 :
				System.out.println("Very good");
				break;
			case 60 :
				System.out.println("Good");
				break;
			case 40 :
				System.out.println("Ok");
				break;
			case 20 :
				System.out.println("Bad");
				break;
			default :
				System.out.println("The condition is not defined");
		}

	}

}
