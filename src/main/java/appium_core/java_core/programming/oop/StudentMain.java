package appium_core.java_core.programming.oop;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		Student student_1 = new Student(); //student_1  Mark -> object or instance
		Student student_2 = new Student();
		Student student_3 = new Student();
		Student student_4 = new Student();
		Student student_5 = new Student();
		
		System.out.println(Student.getNumberOfStudents());
		System.out.println(student_3.getNumberOfStudents());
		
	
		
		student_1.setId(240);
		student_1.setName("Ruthy");
		student_1.setAge(20);
		
		student_1.setId(100);
		student_1.setName("Mark");
		student_1.setAge(15);
	//---------------------------------------------------//	
	//	student_2.id = 2;
	//	student_2.name = "Tom";
	//	student_2.age = 16;
		
	//	System.out.println(student_1.name + " | " + student_1.age + " | " + student_1.id);
	//	System.out.println(student_2.name + " | " + student_2.age + " | " + student_2.id);
		
		

	}

}
