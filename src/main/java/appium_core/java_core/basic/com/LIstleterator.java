package appium_core.java_core.basic.com;

import java.util.ArrayList;
import java.util.ListIterator;

public class LIstleterator
{
	// public boolean hasNext();  -- it returns a boolean true or false
	// public Object next();
	// public boolean hasPrevios();
	// public Object previous();

	public static void main(String[] args) 
	{
		ArrayList <String> names = new ArrayList<String>();
		names.add("Mark");
		names.add("Tom");
		names.add("Klark");
		names.add("Jack");
		names.add("Roni");
		names.add("Jefre");
		
		ListIterator<String> iterator = names.listIterator();
		while(iterator.hasNext()) // It checks if the Arraylist has next value it printed the value. 
			System.out.println(iterator.next());
		System.out.println("---------------------------------------------");
		
		while(iterator.hasPrevious())  //Printing reverse
			System.out.println(iterator.previous());

	}

}
