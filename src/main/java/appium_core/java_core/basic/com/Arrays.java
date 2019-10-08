package appium_core.java_core.basic.com;

public class Arrays
{

	public static void main(String[] args) 
	{
		int [] myintarray = {100,200,300,400,500,600,700,800,900,1000};
		int [] array = new int[111];
		int [] array_0 = {1, 2, 3};
		int [] array_1 = new int[] {4, 5, 6};
		
		//System.out.println(myintarray[0]);
		int index = 0;
		while(index < 5)
		{
			//System.out.println(myintarray[index]);
			index++;
		}
		
		for(int i = 0; i < myintarray.length; i++)
		{
			System.out.println("--->>>  " + myintarray[i]);
		}
		
		System.out.println("-----------------------------------------------------");
		
		for(int elem : myintarray)  // FOR EACH LOOP
		{
			System.out.println("--->>>  " + (elem));
		}
	}

}
