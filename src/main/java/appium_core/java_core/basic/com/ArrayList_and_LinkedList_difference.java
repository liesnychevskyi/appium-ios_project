package appium_core.java_core.basic.com;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_and_LinkedList_difference 
{
	static long n = (long) 1E7;

	public static void main(String[] args) 
	{
		ArrayList arrayList = new ArrayList();
		long milis = System.currentTimeMillis();
		for(int i = 0; i < n; i++)
		{
			arrayList.add(i);
		}
		System.out.println("Insert Array List takes : " + (System.currentTimeMillis() - milis) + " ms");
		
//==============================================================================//
		
		//addition
		LinkedList linkedList = new LinkedList();  // LinkedList faster than ArrayList
		milis = System.currentTimeMillis();
		for(int i = 0; i < n; i++)
		{
			linkedList.add(i);
		}
		System.out.println("Insert Linked List takes : " + (System.currentTimeMillis() - milis) + " ms");

		// removing
		milis = System.currentTimeMillis();
		linkedList.remove(0);
		System.out.println("Deleting front LinkedList takes : " + (System.currentTimeMillis() - milis) + " ms");
		
		milis = System.currentTimeMillis();
		arrayList.remove(0);
		System.out.println("Deleting front ArrayList takes : " + (System.currentTimeMillis() - milis) + " ms");
		
		//get from front, mid, end
		milis = System.currentTimeMillis();
		linkedList.get((int)n/2);
		System.out.println("Deleting front LinkedList takes : " + (System.currentTimeMillis() - milis) + " ms");
		
		
		milis = System.currentTimeMillis();
		arrayList.get((int)n/2);
		System.out.println("Deleting front ArrayList takes : " + (System.currentTimeMillis() - milis) + " ms");
		
		
	}

}
