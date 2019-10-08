package appium_core.java_core.polimorfism.com;

public class MainBank
{

	public static void main(String[] args)
	{
		// Polymorphism is - ability an two objects to have different form //
		//You can point
		Bank master = new Bank();
		Bank def = new Bank_DEF();
		Bank abc = new Bank_ABC();
		Bank xyz = new Bank_XYZ();
		Bank_ABC abc_ = new Bank_ABC();

		System.out.println(abc_.getInterestRate());

//		System.out.println(master.getInterestRate());
//		System.out.println(def.getInterestRate());
//		System.out.println(abc.getInterestRate());
//		System.out.println(xyz.getInterestRate());

	}

}
