package appium_core.java_core.basic.com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest
{

	public static void main(String[] args)
	{
		HashSet<String> name = new HashSet<String>(); // it contains just unique value
		
		name.add("Stan");
		name.add("Stan");
		name.add("Stan");
		name.add("Stan");
		name.add("Tom");
		name.add("Rocky");
		name.add("July");
		name.add("Piter");
		
		System.out.println(name.size());
		//name.remove("Rocky");
		//name.clear();
		Iterator<String> itr = name.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		

	}

}
