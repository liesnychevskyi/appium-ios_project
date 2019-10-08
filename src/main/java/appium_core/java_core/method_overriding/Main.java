package appium_core.java_core.method_overriding;

public class Main 
{

	public static void main(String[] args) 
	{
		//Bank bank_1 = new Bank();
		Bank bank = new Bank_2();
		
		//System.out.println(bank_1.getSomeValue());
		System.out.println(bank.getSomeValue());

	}

}
