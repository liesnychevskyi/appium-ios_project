package appium_core.java_core.basic.com;

import java.util.Scanner;

public class UserInput 
{
//===================================================================// Numbers
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Allows us to read from user input
		System.out.println("Enter some number : ");
		int userInputNumber = scan.nextInt();
		System.out.println("The entered value is : ");
		System.out.println(userInputNumber);
//===================================================================// 
		
		Scanner scan_1 = new Scanner(System.in); // Allows us to read from user input
		System.out.println("Enter some decimal number : ");
		double userInputNumber_1 = scan_1.nextDouble();
		System.out.println("The entered value is : ");
		System.out.println(userInputNumber_1);
//===================================================================//	
		Scanner scan_2= new Scanner(System.in); // Allows us to read from user input
		System.out.println("Enter some text : ");
		String userInputText = scan_2.nextLine();
		System.out.println("The entered text is : ");
		System.out.println(userInputText);
	}

	
}
