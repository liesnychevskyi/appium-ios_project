package appium_core.java_core.basic.com;

import java.util.LinkedList;

public class LinkedListTest
{

	public static void main(String[] args) 
	{
		LinkedList<String> name = new LinkedList<String>();
		name.add("Luda");
		name.add("Stan");
		name.add("Ura");
		name.add("Larisa");
		name.add("Irina");
		name.add("Vladislav");
		name.addLast("Denis");
		name.addFirst("Israel");
		name.descendingIterator();
		System.out.println(name.size());
		name.add(0, "Ludmila");
		name.set(8, "Good man");
		//name.clear();
		System.out.println(name.size());
		name.remove(0);
		for(String x : name)
			System.out.println(x);
			
		

	}

}
