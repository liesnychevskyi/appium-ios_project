package appium_core.java_core.static_keyworld;

public class StudentMain
{
    public static void main(String[] args)
    {
        Student kolia = new Student();
        Student tolia = new Student();
        Student valia = new Student();

        int res = Student.getNumOfStudents();
        System.out.println(res);
    }
}
