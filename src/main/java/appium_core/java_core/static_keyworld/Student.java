package appium_core.java_core.static_keyworld;

public class Student
{
    String name;
    int age;
    static int numOfStudents = 0;

    Student()
    {
        numOfStudents++;
    }
    //========================//
    public static int getNumOfStudents()
    {
        return numOfStudents;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    //=====================//
}
