package appium_core.java_core.basic.com;

import java.util.ArrayList;

public class ArrayLists 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> mylist = new ArrayList<Integer>(5);
		
		mylist.add(100);
		mylist.add(1000);
		mylist.add(10000);
		mylist.add(100000);
		mylist.add(1000000);
		mylist.add(2000);
		
		for (Integer x : mylist)
			System.out.println(x);
		
		System.out.println("size of Array List : " + mylist.size());
		
		mylist.remove(4);
		
		for (Integer x : mylist)
			System.out.println(x);
		
		System.out.println("size of Array List : " + mylist.size());
		
		System.out.println("Hash code is : " + mylist.hashCode());
		
		for (Integer x : mylist)
			System.out.println(x);
		
		System.out.println("size of Array List : " + mylist.size());
		

	}

}
