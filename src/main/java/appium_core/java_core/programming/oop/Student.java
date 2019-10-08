package appium_core.java_core.programming.oop;

public class Student 
{
	
	// Access level ====================================||
	//            Class    Package   Subclass   World
	// public      Yes        Yes       Yes      Yes
	// protected   Yes        Yes       Yes      No
	// private     Yes        No        No       No
	// no modifier Yes        Yes       No       No
	
	
	private int id;
	private String name;
	private int age;
	static int numberOfStudents = 0;
	
	Student()
	{
		numberOfStudents++;
	}
	public static int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
// --------------------------------//Encapsulation	
	public int getId()  
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	
}
